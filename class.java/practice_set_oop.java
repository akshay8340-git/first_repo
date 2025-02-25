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
        }



}
