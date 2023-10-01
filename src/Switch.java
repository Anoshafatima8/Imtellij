import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age:");
Scanner sc=new Scanner(System.in) ;
age = sc.nextInt();
switch(age){
    case 18:
        System.out.println("You are going to be an adult");
        break;
    case 25:
        System.out.println("You are going to join a job");
        break;
    case 60:
        System.out.println("You are going to retire");
        break;
    default:
        System.out.println("Enjoy your life");

}

/*if (age>56){
    System.out.println("You are experienced");
}
else if (age>46){
    System.out.println("You are semi-experienced");
}
else{
    System.out.println("You are not experienced");
}*/
    }
}
