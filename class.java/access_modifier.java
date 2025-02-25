

class Circle{

    double radius;
    double area;

    public void setRadius(double radius){
        if(radius > 0){
           this.radius = radius;
           calculateArea();
        }
        else{
            System.out.println("radius must be postive");
        }
    }

    public double getRadius(){
        return radius;
    }

    public void calculateArea(){
        this.area = 3.14f * radius * radius;
    }

    public double getArea(){
        return area;
    }

}

public class access_modifier {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.setRadius(5.0);
        System.out.println(c.getArea());

    }
}



