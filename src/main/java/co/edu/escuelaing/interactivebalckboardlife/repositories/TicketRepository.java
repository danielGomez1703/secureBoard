/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.interactivebalckboardlife.repositories;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author danip
 */

@Component
public class TicketRepository {

    //private static TicketRepository _instance = new TicketRepository();
    
    @Autowired
    private StringRedisTemplate template;
    // inject the template as ListOperations
    @Resource(name = "stringRedisTemplate")
    private ListOperations<String, String> listTickets;

    //private final List<String> listTickets;
    private int ticketnumber;

    public TicketRepository() {
        this.ticketnumber = 0;
    }


    public synchronized Integer getTick() {
        Integer ticketValue = ticketnumber++;
        listTickets.leftPush("ticketStore",ticketValue.toString());
        return ticketValue;
    }

    public boolean checkTicket(String tick) {
        //System.out.println(listTickets.toString() + tick);
        //System.out.println(listTickets.contains(tick));
        boolean isValid = listTickets.remove("ticketStore",0,tick)> 0l;

        return isValid;
    }

}
