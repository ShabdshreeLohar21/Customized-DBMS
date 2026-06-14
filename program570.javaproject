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
                return;
            }
        }
        System.out.println("Record not found.");
    }

    public void SelectSpecific(String str) {
        for (Employee eref : lobj) {
            if (str.equals(eref.Ename)) {
                eref.DisplayInforation();
                return;
            }
        }
        System.out.println("Record not found.");
    }

    public void DeleteData(int no) {
        Iterator<Employee> it = lobj.iterator();
        while (it.hasNext()) {
            Employee eref = it.next();
            if (eref.Eno == no) {
                it.remove();
                System.out.println("Record deleted successfully.");
                return;
            }
        }
        System.out.println("Record not found.");
    }

    public void DeleteData(String str) {
        Iterator<Employee> it = lobj.iterator();
        while (it.hasNext()) {
            Employee eref = it.next();
            if (str.equals(eref.Ename)) {
                it.remove();
                System.out.println("Record deleted successfully.");
                return;
            }
        }
        System.out.println("Record not found.");
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
        System.out.println("Average salary in the Employee table: " + (iSum / lobj.size()));
    }

    public void AggregateMax() {
        int iMax = Integer.MIN_VALUE;
        for (Employee eref : lobj) {
            if (eref.Esalary > iMax) {
                iMax = eref.Esalary;
            }
        }
        System.out.println("Maximum salary in the Employee table: " + iMax);
    }

    public void AggregateMin() {
        int iMin = Integer.MAX_VALUE;
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

class program570 {
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Welcome to Marvellous DBMS");

        MarvellousDBMS mobj = new MarvellousDBMS();

        int iOption = 0;

        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Please select your option based on your requirement");
            System.out.println("1: Insert new record in the table");
            System.out.println("2: Display all records from the table");
            System.out.println("3: Display specific record from the table with ID");
            System.out.println("4: Display specific record from the table with Name");
            System.out.println("5: Delete the record from table with Name");
            System.out.println("6: Count number of records from the table");
            System.out.println("7: Summation of all salaries");
            System.out.println("8: Average of all salaries");
            System.out.println("9: Maximum salary");
            System.out.println("10: Minimum salary");
            System.out.println("11: Update the existing record");
            System.out.println("12: Delete the table");
            System.out.println("13: Terminate the Marvellous DBMS");
            System.out.println("-----------------------------------------------------");
            iOption = sobj.nextInt();

            switch (iOption) {
                case 1:
                    System.out.println("Enter the name of employee:");
                    String name = sobj.next();
                    System.out.println("Enter the age of employee:");
                    int age = sobj.nextInt();
                    System.out.println("Enter the salary of employee:");
                    int salary = sobj.nextInt();
                    System.out.println("Enter the address of employee:");
                    String address = sobj.next();
                    mobj.InsertIntoTable(name, age, address, salary);
                    break;

                case 2:
                    mobj.SelectStarFrom();
                    break;

                case 3:
                    System.out.println("Enter the employee ID:");
                    int id = sobj.nextInt();
                    mobj.SelectSpecific(id);
                    break;

                case 4:
                    System.out.println("Enter the employee name:");
                    name = sobj.next();
                    mobj.SelectSpecific(name);
                    break;

                case 5:
                    System.out.println("Enter the employee name to delete:");
                    name = sobj.next();
                    mobj.DeleteData(name);
                    break;

                case 6:
                    mobj.AggregateCount();
                    break;

                case 7:
                    mobj.AggregateSum();
                    break;

                case 8:
                    mobj.AggregateAvg();
                    break;

                case 9:
                    mobj.AggregateMax();
                    break;

                case 10:
                    mobj.AggregateMin();
                    break;

                case 11:
                    System.out.println("Enter the employee ID to update:");
                    id = sobj.nextInt();
                    System.out.println("Enter the new address:");
                    address = sobj.next();
                    mobj.UpdateRecord(id, address);
                    break;

                case 12:
                    mobj = null;
                    System.gc();
                    System.out.println("Database deleted successfully.");
                    break;

                case 13:
                    System.out.println("Thank you for using Marvellous DBMS.");
                    sobj.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
