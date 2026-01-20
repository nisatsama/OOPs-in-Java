  //Wrie a Java program to craete  parent class(Shapes)and three child classes (Circle,Rectangle,Square) alongwith two methods (Area() and perimeter()).Using object and the concept of overriding.Compute area and perimeter.
  package third;

  public class Shapes {
  
    void area(){
      System.out.println("Area");
    }
    void perimeter(){
      System.out.println("Perimeter");
    }
    public static void main(String[] args) {
      
    Shapes s;
    s = new Circle(7);
    s.area();
    s.perimeter();

    s = new Rectangle(5,8);
    s.area();
    s.perimeter();

    s = new Square(6);
    s.area();
    s.perimeter();
    }
    
  }
  class Circle extends Shapes{

    double radius;
    Circle(double r){
      radius = r;
    }
    void area(){
      System.out.println("Area of Circle: "+(3.14*radius*radius));
    }
    void perimeter(){
      System.out.println("Perimeter of Circle: "+(2*3.14*radius));
    }
  }
  class Rectangle extends Shapes{
  int length,breadth;
  Rectangle(int l,int b){
    length = l;
    breadth = b;
  }
  void area(){
    System.out.println("Area of Rectangle: "+(length*breadth));
  }
  void perimeter(){
    System.out.println("Perimeter of Rectangle: "+(2*(length+breadth)));
  }
  }
  class Square extends Shapes{
  int side;
  Square(int s){
    side = s;
  }
  void area(){
    System.out.println("Area of Square: "+(side*side));
  }
  void perimeter(){
    System.out.println("Perimeter of Square: "+(4*side));
  }
  }

