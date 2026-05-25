package com.codingshuttle.TestingApp;

import com.codingshuttle.TestingApp.services.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class TestingAppApplication implements CommandLineRunner
{
    private final DataService dataService;

	public static void main(String[] args) {
		SpringApplication.run(TestingAppApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception
    {
        System.out.println("The Data is : "+ dataService.getData());
    }
}


// via maven
//mvn spring-boot:run -Dspring-boot.run.profiles=prod

//via jar file
// java -jar app.jar --spring.profiles.active=dev

// via env variables
// set SPRING_PROFILES_ACTIVE=dev
// java -jar app.jar

// through IDE
// currnt file -> edit conf -> app -> env variables -> SPRING_PROFILES_ACTIVE=dev