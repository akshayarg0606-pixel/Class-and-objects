class employee{
    String name;
    String jobtitle;
    static int salary;

    employee(String name,String jobtitle,int salary)
    {
        this.name=name;
        this.jobtitle=jobtitle;
        this.salary=salary;
    }

    static int calculatesalary(int bonus){
        return salary +bonus;
       

    }
    static int updatesalary(int newsalary){
        return salary=newsalary;
       
    }
 public static void main(String[] args) {
        employee e1 =new employee("PRAVEEN","DEVELOPER",20000);

       
        System.out.println( calculatesalary(5000));
        System.out.println(updatesalary(50000));
        
    }
    }


