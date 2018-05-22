package AwareInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("spring2.xml");
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();

	}

}
