package com.mycompany.myapp.cucumber;

import com.mycompany.myapp.BackendspringbootApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = BackendspringbootApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
