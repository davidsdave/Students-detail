import java.util.Scanner; 
 public class Student
{
public static void main(String[]args)
{
  Scanner input = new Scanner(System.in);
  String name;
  int age;
  System.out.print("Your name:");
  name = input.nextLine();

  System.out.print("your age: ");
  age = input.nextInt();
  
  System.out.println("Student name:"+name);
  System.out.println("Students age:"+age);

}
}