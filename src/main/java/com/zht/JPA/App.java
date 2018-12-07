package com.zht.JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;*/

/**
 * Hello world!
 *
 */
//@EnableJpaRepositories
@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	SpringApplication.run(App.class, args);
    }
}
