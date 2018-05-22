import java.util.List;

public class Triangle implements Shape{
	
	/*private String type;
	
	public Triangle(String type){
		this.type=type;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw(){
		System.out.println(getType()+" Triangle drawn");
	}*/
	
	private List<Point> points;	
	
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	private Point pointX;
	private Point pointY;
	private Point pointZ;
	
	
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
		
		//List
		/*for (Point point: points){
			System.out.println("point = ("+point.getX() +" , "+point.getY()+" )");
		}*/
	}
}
