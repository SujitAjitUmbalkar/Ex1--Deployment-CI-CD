package com.codingshuttle.TestingApp.services.Impl;

import com.codingshuttle.TestingApp.services.DataService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// to envoke this bean
// ./mvnw spring-boot:run "-Dspring-boot.run.profiles=prod"   -> run this cmnd in cmd
@Service
@Profile("prod")
public class DataServiceImplProd  implements DataService
{
        @Override
        public String getData()
        {
            return "Prod Data ";
        }
}
