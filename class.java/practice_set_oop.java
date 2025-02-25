class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}

class cellphone {
    public void ring(){
        System.out.println("ringing");
    }
    public void vibrate(){
        System.out.println("vibrate");
    }
}

class square{
    public int area(int a){
        return a * a;
    }

    public int peri(int b){
        return b * 4;
    }
}

class rectangle{
    int length;
    int breadth;
    public int area1(){
        return length * breadth;
    }
    public int peri1(){
        return 2 * length + 2 * breadth;
    }
}

class tom{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("running towards the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
}

//class circle{
//    float f1;
//    public float area2(float f){
//        return 3.14f * f * f;
//    }
//    public float peri2(){
//        return 2 * 3.14f * f1;
//    }
//}

public class practice_set_oop {
    public static void main(String[] args) {

        System.out.println("hello");

        Employee1 emp = new Employee1();

        emp.salary = 10000;
        emp.setName("akshay bandenavaru");
        System.out.println(emp.getSalary());
        emp.getName();
        System.out.println(emp.getName());

        cellphone cp = new cellphone();
        cp.ring();

        cp.vibrate();

        square sq = new square();
        int area = sq.area(4);
        System.out.println("area : " + area);

        int peri = sq.peri(5);
        System.out.println("peri: " + peri);


        rectangle ra = new rectangle();
        ra.length = 5;
        ra.breadth = 10;
        int area1 = ra.area1();
        System.out.println("area1 : " + area1);
        System.out.println("peri1: " + ra.peri1());


        tom p1 = new tom();
        p1.fire();
        p1.hit();
        p1.run();


//        circle c = new circle();
//        float areacircle = c.area2(5);
//        System.out.println("area of circle: " + areacircle);
//
//
//        c.f1 = 5;
//        float periofcircle = c.peri2();
//        System.out.println("perimeter of circle: " + periofcircle);

        }



}
