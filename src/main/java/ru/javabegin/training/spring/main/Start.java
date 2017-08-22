package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.impls.pool.T1000Pool;
import ru.javabegin.training.spring.impls.robot.ModelT1000;
import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotConveyor;
import ru.javabegin.training.spring.interfaces.RobotPool;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

		T1000Pool t1000Pool = context.getBean("t1000Pool", T1000Pool.class);

		t1000Pool.beginShow();


	}
}
