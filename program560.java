import java.util.*;

class Employee {
    public int Eno;
    public String Ename;
    public int Eage;
    public String Eaddress;
    public int Esalary;

    public static int Counter;

    static {
        Counter = 1;
    }

    public Employee(String B, int C, String D, int E) {
        Eno = Counter++;
        Ename = B;
        Eage = C;
        Eaddress = D;
        Esalary = E;
    }

    public void DisplayInformation() {
        System.out.println(Eno + "\t" + Ename + "\t" + Eaddress + "\t" + Eage + "\t" + Esalary);
    }
}

class MarvellousDBMS {
    public LinkedList<Employee> lobj;

    public MarvellousDBMS() {
        System.out.println("Marvellous DBMS started successfully...");
        lobj = new LinkedList<Employee>();
    }

    protected void finalize() {
        System.out.println("Deallocating all resources of Marvellous DBMS...");
        lobj.clear();
        lobj = null;
    }

    public void InsertIntoTable(String name, int age, String address, int salary) {
        Employee eobj = new Employee(name, age, address, salary);
        lobj.addLast(eobj);
        System.out.println("Record inserted successfully into the table");
    }

    public void SelectStartFrom() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("No \t Name \t Address \t Age \t Salary ");
        System.out.println("-------------------------------------------------------------------------");
        for (Employee eref : lobj) {
            eref.DisplayInformation();
        }
    }

    public void SelectSpecific(int id) {
        for (Employee eref : lobj) {
            if (eref.Eno == id) {
                eref.DisplayInformation();
                return;
            }
        }
        System.out.println("Record not found!");
    }

    public void SelectSpecific(String str) {
        for (Employee eref : lobj) {
            if (str.equals(eref.Ename)) {
                eref.DisplayInformation();
                return;
            }
        }
        System.out.println("Record not found!");
    }

    public void DeleteData(int no) {
        int index = 0;
        boolean bFlag = false;

        for (Employee eref : lobj) {
            if (eref.Eno == no) {
                bFlag = true;
                break;
            }
            index++;
        }

        if (!bFlag) {
            System.out.println("Unable to remove element as it is not in the database");
        } else {
            lobj.remove(index);
            System.out.println("Record removed successfully.");
        }
    }

    public void AggregateCount() {
        System.out.println("Number of records in the Employee table: " + lobj.size());
    }
}

class program560
{
    public static void main(String Arg[]) {
        MarvellousDBMS mobj = new MarvellousDBMS();

        mobj.InsertIntoTable("Sagar", 27, "Pune", 25000);
        mobj.InsertIntoTable("Amitc", 28, "Mumbai", 5000);
        mobj.InsertIntoTable("Prats", 25, "Kagal", 45000);
        mobj.InsertIntoTable("Gauri", 29, "Satara", 120000);

        mobj.AggregateCount();

        mobj = null;
        System.gc();
    }
}
