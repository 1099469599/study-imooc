package com.myimooc.java.design.pattern.strategy;


import com.myimooc.java.design.pattern.strategy.impl.FlyWithWin;

/**
 * @title 策略模式
 * @describe 绿脖子的鸭子
 * @author zc
 * @version 1.0 2017-08-31
 */
public class MallardDuck extends AbstractDuck {
	
	public MallardDuck() {
		super();
		super.setFlyingStrategy(new FlyWithWin());
	}
	
	@Override
	public void display() {
		System.out.println("我的脖子是绿色的");
	}
}
