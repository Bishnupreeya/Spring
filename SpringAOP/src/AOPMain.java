import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ShapeService;

public class AOPMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
		ShapeService bean=(ShapeService) context.getBean("shapeService",ShapeService.class);
		bean.getCircle().setName("test circle");
		//System.out.println(bean.getCircle().getName());
		
		//System.out.print(bean.toString());
	}

}
