class employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("my id is: " + id);
        System.out.println("my name is: " + name);
    }

    public int getSalary(){
        return salary;
    }
}

public class oop{
    public static void main(String[] args) {

        employee obj = new employee();
        employee obj1 = new employee();
        obj.id = 50;
        obj.name = "akshay";
        obj.salary = 10000;

        obj1.id = 100;
        obj1.name = "akshay1";
        obj1.salary = 11000;
//        System.out.println(obj.id);
        obj.printdetails();
        System.out.println("salary is: " + obj.getSalary());


        obj1.printdetails();
        System.out.println("salary is: " + obj1.getSalary());

        obj.getSalary();




    }
}