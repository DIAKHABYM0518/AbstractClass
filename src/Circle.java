// If a class inherit an abstract class then the subclass/base class must have to provide definition of the
// inherited abstract method
public class Circle extends Shape {

   double radius;

   Circle(){
       this.color = "";
       this.radius = 0;
   }

    Circle(String color, double radius){
       super(color);
       this.radius = radius;
    }

    @Override
    public void calculateArea() {
      double area = 3.1415 * this.radius * this.radius;
      System.out.println(area);
    }
}
