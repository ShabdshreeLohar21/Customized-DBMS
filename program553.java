import java.util.*;

class Employee
{
    public int Eno;
    public String Ename;
    public int Eage;
    public String Eaddress;
    public int Esalary;

    public static int Counter;

    static //static block akdach run hoto
    {
        Counter = 1;
    }
    public Employee(String B,int C, String D,int E)
    {
        Eno = Counter++;
        Ename = B;
        Eage  = C;
        Eaddress = D;
        Esalary = E;
    }

    public void DisplayInformation()
    {
        System.out.println("Employee no : "+Eno+"Name : "+Ename+"Address"+Eaddress+"Age"+Eage+"Salary"+Esalary);
    }
}

class MarvellousDBMS
{
    public LinkedList<Employee>lobj;

    public MarvellousDBMS()
    {
        System.out.println("Marvellous DBMS started successfully...");
        lobj = new LinkedList<Employee>();
    }

    protected void finalize()
    {
        System.out.println("Deallocaing all resources of marvellous DBMS...");
        lobj.clear();
        lobj = null;
    }

    //insert into table employee values(1,"SHREE",20."Huapri",150000)
    public void InsertIntoTable(String name,int age,String address, int salary)
    {
        Employee eobj = new Employee(name,age,address,salary);
        lobj.addLast(eobj);
        System.out.println("Record inserted successfully into the table");
    }
}
class program553
{
    public static void main(String Arg[])
    {
        MarvellousDBMS mobj = new MarvellousDBMS();

        mobj.InsertIntoTable("Sagar",27,"Pune",25000);
        mobj.InsertIntoTable("Amit",28,"Mumbai",5000);


        mobj = null;
        System.gc();
    }
}