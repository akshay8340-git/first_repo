//
//
//class Circle{
//    private double radius;
//    private double area;
//
//    public void setRadius(double r){
//        if(r > 0){
//            this.radius = r;
//        }
//        else{
//            System.out.println("the radius must be positive");
//            this.radius = 0;
//        }
//    }
//    public double getRadius(){
//        return radius;
//    }
//
//    public double calculateArea(){
//       return Math.PI * radius * radius;
//    }
//}
//

import java.sql.SQLOutput;

class student{
    private String name;
    private int age;

    public void setName(String n){            //setter for name
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age1){
        if(age1 > 0){
            this.age = age1;
        }
        else{
            System.out.println("u r not born");
        }

    }

    public int getAge(){
        return age;
    }

}



class car{
    private String brand;
    private String model;
    private int year;


    public void setBrand(String br){
        this.brand = br;
    }

    public String getBrand(){
        return brand;
    }
    public void setModel(String md){
        this.model = md;
    }
    public String getModel(){
        return model;
    }

    public void setYear(int yr) {
        if (yr > 2010) {
            this.year = yr;
        } else {
            System.out.println("the car is very old");
        }
    }
    public int getYear(){
        return year;
    }
}

public class access_modifier {
    public static void main(String[] args) {
//
//
//        Circle cc = new Circle();
//
//        cc.setRadius(10);
//
//        System.out.println(cc.getRadius());
//        System.out.println(cc.calculateArea());
//
//        cc.setRadius(-10);
//
//        System.out.println(cc.getRadius());
//        System.out.println(cc.calculateArea());
//


        student st = new student();
        st.setName("akshay");
        st.setAge(21);

        System.out.println("age: " + st.getAge());

        st.setAge(-4);



        car cr = new car();

        cr.setBrand("hyundai");
        cr.setModel("aura");
        cr.setYear(2013);

        System.out.println(cr.getYear());
    }
}
//
//
//





