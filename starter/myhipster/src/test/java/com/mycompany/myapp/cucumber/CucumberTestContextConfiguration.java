package com.mycompany.myapp.cucumber;

import com.mycompany.myapp.MyhispterApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = MyhispterApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
