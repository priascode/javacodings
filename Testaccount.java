class Account
{
int acc_no;
String name;
float amount;
void insertrecord(int a,String n,float amt)
{
acc_no = a;
name = n;
amount = amt;
}
void deposit(float amt)
{
amount = amount + amt;
System.out.println(amt +"Deposit");
}
void withdraw(float amt)
{
if(amount<amt)
{
System.out.println("Insufficient balance");
}
else
{
amount = amount-amt;
System.out.println(amt +"withdrawn");
}
}
void checkbalance()
{
System.out.println("Balance is"+ amount);
}
void display()
{
System.out.println(acc_no+" "+name+" "+amount);
}
}
class Testaccount
{
public static void main(String[] args)
{
Account a1 = new Account();
a1.insertrecord(1234,"riya",100);
a1.display();
a1.deposit(400);
a1.checkbalance();
a1.withdraw(300);
a1.checkbalance();
}
}