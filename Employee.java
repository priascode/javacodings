class Employee
{
int id;
String name;
float salary;
Employee(int i,String n,float s)
{
id = i;
name = n;
salary = s;
}
void display()
{
System.out.println(id +""+name+""+salary);
}
}
public class TestEmployee
{
public static void main(String args[])
{
Employee e1 = new Employee(123,"moni",10000);
Employee e2 = new Employee(234,"Sai",12000);
e1.display();
e2.display();
}
}