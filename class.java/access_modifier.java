

class Circle{
    double radius;
    double area;

    public void setRadius(double r){
        if(r > 0){
            this.radius = r;
        }
        else{
            System.out.println("the radius must be positive");
        }
    }
    public double getRadius(){
        return radius;
    }

    public double calculateArea(){
       return Math.PI * radius * radius;
    }
}

public class access_modifier {
    public static void main(String[] args) {


        Circle cc = new Circle();

        cc.setRadius(10);

        System.out.println(cc.getRadius());
        System.out.println(cc.calculateArea());

    }
}



