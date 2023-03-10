/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.windo.windobelajarspringdasar;

import data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author ASUS
 */
@Configuration
public class BeanNameConfiguration {
    
    @Primary
    @Bean(name = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }
    
    @Bean(name = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}
