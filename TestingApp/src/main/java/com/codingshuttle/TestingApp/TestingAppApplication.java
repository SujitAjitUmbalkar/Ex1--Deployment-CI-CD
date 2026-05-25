package com.codingshuttle.TestingApp;

import com.codingshuttle.TestingApp.services.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class TestingAppApplication implements CommandLineRunner
{
    private final DataService dataService;

    @Value("${my.variable}")
    private String myVariable;

	public static void main(String[] args) {
		SpringApplication.run(TestingAppApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception
    {
        System.out.println("myVariable is " + myVariable);

        System.out.println("The Data is : "+ dataService.getData());
    }
}

// through IDE
// currnt file -> edit conf -> app -> env variables -> SPRING_PROFILES_ACTIVE=de