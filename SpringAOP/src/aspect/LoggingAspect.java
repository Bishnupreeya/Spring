package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint){
		//System.out.println("Advice run: all mehod called!");
		System.out.println(joinPoint.toString());
	}
	
	@Before("allCircleMethods()")
	public void secondAdvice(){
		//System.out.println("Second Advice run: Set mehod called!");	
	}
	
	@Before("args(name)")
	public void stringArgMethod(String name){
		System.out.println("A method takes string arg has been called.."+name);
	}
	
	@After("allCircleMethods()")
	public void secondAdviced(){
	//	System.out.println("Second Advice run: Set mehod called----!");	
	}
	//if error this will not execute 
	//@AfterReturning("args(name)")
	
	//will display msg
	//@AfterThrowing("args(name)")
	
	@Around("allSetters()")
	public void myAroundAdvice(ProceedingJoinPoint proceedJointPoint)
	{
		try {
			System.out.println("Before advice");
			proceedJointPoint.proceed();
			System.out.println("After advice");
		} catch (Throwable e) {
			System.out.println("error occured!");
			
		}
		System.out.println("After finally");
	}
	@Pointcut("execution(* set*(..))")
	public void allSetters(){}
	
	
	@Pointcut("within(model.*)")
	public void allCircleMethods(){}
	
	//@Pointcut(args())
}
