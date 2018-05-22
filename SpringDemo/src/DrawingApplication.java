import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		//FactoryBean
		//Triangle tr=new Triangle();
		
		context = new ClassPathXmlApplicationContext("spring.xml");
		//Triangle triangle=(Triangle)context.getBean("triangle");
		//Circle circle=(Circle)context.getBean("circle");
		Shape shape=(Shape)context.getBean("triangle");
		/*context = new ClassPathXmlApplicationContext("spring1.xml");
		Triangles triangle=(Triangles)context.getBean("triangles");*/
		shape.draw();

	}

}
