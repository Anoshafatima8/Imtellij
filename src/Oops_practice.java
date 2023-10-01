class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is"+ id);
        System.out.println("My name is"+ name);
    }
}
public class Oops_practice {
    public static void main(String[] args) {
        System.out.println("This is our first custom class");
        Employee Harry=new Employee();
        Employee Jhon=new Employee();

        Harry.id=12;
        Harry.name="codewithharry";
        Jhon.id=17;
        Jhon.name="Jhon Singh";

        Harry.printDetails();
        Jhon.printDetails();
    }
}
