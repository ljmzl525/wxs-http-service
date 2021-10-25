package io.transwarp.cn.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import io.transwarp.cn.WxsHttpApp;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = WxsHttpApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
