







import java.time.LocalDate;
import java.time.Period;
class employee2{
    String name;
    int salary;
    LocalDate hiredate;

    public employee2(String name,int salary,LocalDate hiredate){
        this.name=name;
        this.salary=salary;
        this.hiredate=hiredate;
    }
    public int CalculateService(){
        LocalDate currentdate = LocalDate.now();
        Period period = Period.between(hiredate,currentdate);
        return period.getYears();
    }
    public static void main(String[] args) {
        employee2 e = new employee2("Ram",20000,LocalDate.of(2026,6,6));
       System.out.println( e.CalculateService());
    }

}