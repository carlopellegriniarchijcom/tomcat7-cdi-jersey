/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.archij.tomcat7.cdi.jersey;

import javax.inject.Inject;

/**
 *
 * @author pellegrini
 */
public class InjectedBean {
    
    @Inject
    DelegateBean delegateBean;
    
    public String sayHello(){
        return "Hello CDI";
    }
    
    public String sayHelloDelegate(){
        return delegateBean.sayHello();
    }
}
