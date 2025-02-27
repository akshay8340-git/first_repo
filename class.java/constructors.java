

class employee2{

    private String name;
    private int id;
    private int salary;

    public employee2(){         // constructor of the employee2 class
        name = "akshay";
        id = 1;
        salary = 1000;
    }

    public employee2(String myname){  //  constructor overloading (same name but argument are different)
        name = myname;
    }

    public void setName(String nm){
        this.name = nm;
    }

    public String getName(){
        return name;
    }

    public void setid(int id1){
        this.id = id1;
    }

    public int getId(){
        return id;
    }

    public void setSalary(int sal){
        this.salary = sal;
    }

    public int getsalary(){
        return salary;
    }

}


public class constructors {

    public static void main(String[] args) {

        employee2 emp2 = new employee2("akshay101");

        System.out.println("id: " + emp2.getId());

        System.out.println("name: " + emp2.getName());

        int salary = emp2.getsalary();
        System.out.println("salary: " + salary);


    }
}
