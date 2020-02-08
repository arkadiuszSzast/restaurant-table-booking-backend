package com.szastarek.restauranttablebooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication(exclude = WebMvcAutoConfiguration.class)
public class RestaurantTableBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantTableBookingApplication.class, args);
    }

}
