package com.gmail.madkiev;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.gmail.madkiev.service.PhoneBookService;
@ComponentScan(basePackages = "com.gmail.madkiev")
@SpringBootApplication
public class Application {
    public static void main(String [] args){

        @Bean
                protected PhoneBookService phoneBookService(){
         return new PhoneBookServiceImpl;
        }
    }
}
