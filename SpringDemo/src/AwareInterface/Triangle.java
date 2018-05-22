package AwareInterface;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware{
	
	private Point pointX;
	private Point pointY;
	private Point pointZ;
	ApplicationContext context=null;
	
	public Point getPointX() {
		return pointX;
	}

	public void setPointX(Point pointX) {
		this.pointX = pointX;
	}

	public Point getPointY() {
		return pointY;
	}

	public void setPointY(Point pointY) {
		this.pointY = pointY;
	}

	public Point getPointZ() {
		return pointZ;
	}

	public void setPointZ(Point pointZ) {
		this.pointZ = pointZ;
	}

	public void draw(){
		System.out.println("Point X: ("+getPointX().getX()+" , "+getPointX().getY()+" )");
		System.out.println("Point Y: ("+getPointY().getX()+" , "+getPointY().getY()+" )");
		System.out.println("Point Z: ("+getPointZ().getX()+" , "+getPointZ().getY()+" )");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		System.out.println(context.getDisplayName().toString());
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean name is : "+name);
		
	}
}
