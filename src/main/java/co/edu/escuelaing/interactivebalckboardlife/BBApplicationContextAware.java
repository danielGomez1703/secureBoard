/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.interactivebalckboardlife;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author danip
 */
@Component
@Lazy(false)
public class BBApplicationContextAware implements ApplicationContextAware {

    private static ApplicationContext APPLICATION_CONTEXT;

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        APPLICATION_CONTEXT = ac;
    }
    
    public static ApplicationContext getApplicationContext(){
        return  APPLICATION_CONTEXT;
    }

}
