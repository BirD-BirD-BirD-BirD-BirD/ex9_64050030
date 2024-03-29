import java.util.ArrayList;
import java.util.List;
//64050030 Kitipum Nornua
public class App {

	public static void main(String[] args) {
		
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(5.5, 200, 100));
		shapes.add(new Triangle(4,5, 500, 1000));
		shapes.add(new Rectangle(6,8, 400, 720));
		
		VectorVisitor vector = new VectorVisitor();

		for(Shape shape : shapes){
			shape.accept(vector);
		}

		System.out.println("--------------");

		RasterVisitor raster = new RasterVisitor();

		for(Shape shape : shapes){
			shape.accept(raster);
		}
	}
}
