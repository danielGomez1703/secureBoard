/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.interactivebalckboardlife.configurator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//importorg.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;



@Configuration
@PropertySource("application.properties")
public class RedisConfig {

    @Value("${redis.bbcache.hostname}")
    private String redisHostName;
    @Value("${redis.bbcache.port}")
    private int redisPort;

    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration rc = (new RedisStandaloneConfiguration(redisHostName, redisPort));
        rc.setPassword("8y2qyz8h9RwcPx7VoVWiZMYdDmNE1aTt");
        LettuceConnectionFactory connectionFactory
                = new LettuceConnectionFactory(rc);    
        return connectionFactory;
    }
}
