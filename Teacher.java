class Teacher
{
int rollno;
String name;
void insertrecord(int r,String s)
{
rollno = r;
name= s;
}
void DisplayInfo()
{
System.out.println(rollno +" "+ name);
}
public static void main(String[] args)
{
Teacher t1 =new Teacher();
Teacher t2 = new Teacher();
t1.insertrecord(333,"mary");
t2.insertrecord(223,"madu");
t1.DisplayInfo();
t2.DisplayInfo();
}
}