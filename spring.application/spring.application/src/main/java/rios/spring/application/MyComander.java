package rios.spring.application;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class MyComander implements Runnable{

	public static void main(String[] args) throws Exception {

        SpringApplication.run(MyComander.class, args);
		
    }

    //access command line arguments
//    @Override
//    public void run(String... args) throws Exception {
//	
//        //do something
//		
//    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}