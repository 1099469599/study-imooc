package com.myimooc.guice.spring.service.greeting;

import javax.inject.Inject;

import com.google.inject.servlet.RequestScoped;
import com.myimooc.guice.spring.service.MyApplet;
import com.myimooc.guice.spring.service.impl.WebDestination;

/**
 * @title 处理类
 * @describe 处理Greeting相关请求
 * @author zc
 * @version 1.0 2017-10-15
 */
@RequestScoped
public class GreetingHandler {
	
	private final RequestParams param;
	private final WebDestination destination;
	private final MyApplet applet;
	
	@Inject
	public GreetingHandler(
			RequestParams param, 
			WebDestination destination, 
			MyApplet applet) {
		super();
		this.param = param;
		this.destination = destination;
		this.applet = applet;
	}

	public String getByName(String name) {
		param.setGreetingName(name);
		applet.run();
		return destination.getResult();
	}
}
