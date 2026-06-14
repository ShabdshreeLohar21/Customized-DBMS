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

    public void DisplayInforation() {
        System.out.println(Eno + "\t" + Ename + "\t" + Eaddress + "\t\t  " + Eage + "\t" + Esalary);
    }
}

class MarvellousDBMS {
    public LinkedList<Employee> lobj;

    public MarvellousDBMS() {
        System.out.println("Marvellous DBMS started successfully..");
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

    public void SelectStarFrom() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("No\t Name \t Address \t Age \t Salary ");
        System.out.println("----------------------------------------------------------------");
        for (Employee eref : lobj) {
            eref.DisplayInforation();
        }
        System.out.println("----------------------------------------------------------------");
    }

    public void SelectSpecific(int id) {
        for (Employee eref : lobj) {
            if (eref.Eno == id) {
                eref.DisplayInforation();
                break;
            }
        }
    }

    public void SelectSpecific(String str) {
        for (Employee eref : lobj) {
            if (str.equals(eref.Ename)) {
                eref.DisplayInforation();
                break;
            }
        }
    }

    public void DeleteData(int no) {
        boolean bFlag = false;

        Iterator<Employee> itr = lobj.iterator();
        while (itr.hasNext()) {
            Employee eref = itr.next();
            if (eref.Eno == no) {
                itr.remove();
                bFlag = true;
                break;
            }
        }

        if (!bFlag) {
            System.out.println("Unable to remove the element as it is not present in the database");
        }
    }

    public void DeleteData(String str) {
        boolean bFlag = false;

        Iterator<Employee> itr = lobj.iterator();
        while (itr.hasNext()) {
            Employee eref = itr.next();
            if (str.equals(eref.Ename)) {
                itr.remove();
                bFlag = true;
                break;
            }
        }

        if (!bFlag) {
            System.out.println("Unable to remove the element as it is not present in the database");
        }
    }

    public void AggregateCount() {
        System.out.println("Number of records in the Employee table: " + lobj.size());
    }

    public void AggregateSum() {
        int iSum = 0;

        for (Employee eref : lobj) {
            iSum += eref.Esalary;
        }

        System.out.println("Summation of salaries in the Employee table: " + iSum);
    }

    public void AggregateAvg() {
        int iSum = 0;

        for (Employee eref : lobj) {
            iSum += eref.Esalary;
        }

        System.out.println("Average of salaries in the Employee table: " + (iSum / lobj.size()));
    }

    public void AggregateMax() {
        int iMax = lobj.get(0).Esalary;

        for (Employee eref : lobj) {
            if (eref.Esalary > iMax) {
                iMax = eref.Esalary;
            }
        }

        System.out.println("Maximum salary in the Employee table: " + iMax);
    }

    public void AggregateMin() {
        int iMin = lobj.get(0).Esalary;

        for (Employee eref : lobj) {
            if (eref.Esalary < iMin) {
                iMin = eref.Esalary;
            }
        }

        System.out.println("Minimum salary in the Employee table: " + iMin);
    }

    public void UpdateRecord(int no, String address) {
        for (Employee eref : lobj) {
            if (eref.Eno == no) {
                eref.Eaddress = address;
                System.out.println("Record updated successfully.");
                return;
            }
        }
        System.out.println("Record not found.");
    }
}

class program568 {
    public static void main(String Arg[])
    {
        System.out.println("Welcome to the Marvellous DBMS");

        MarvellousDBMS mobj = new MarvellousDBMS();

        System.out.println("Please select your option based on your requirment");

        while(true)
        {
            System.out.println("1 : Insert new recors in the table");
            System.out.println("2 : Display all records from the table");
            System.out.println("3 : Display specific record the table with ID");
            System.out.println("4 : Display specific record from the table with Name");
            System.out.println("5 : Delete the record drom the table with Name");
            System.out.println("6 : Count the number of Records from the table");
            System.out.println("7 : Summation of all records salary");
            System.out.println("8 : Average of all records salary");
            System.out.println("9 : Maximum of all records salary");
            System.out.println("10 : Minimum of all records salary");
            System.out.println("11 : Update the existing record");
            System.out.println("12 : Delete the table");
            System.out.println("13 : Terminate the Marvellous DBMS");

            System.out.println("----------------------------------------------------------------------");

        }
    }
}
