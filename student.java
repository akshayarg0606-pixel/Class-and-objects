








import java.util.ArrayList;
class student{
    String name;
    char grade;
    String course;
    static ArrayList<student> courses=new ArrayList<>();
    public student(String name,char grade,String course){
        this.name=name;
        this.grade=grade;
        this.course=course;
    }
    static void addcourse(student coursee){
        courses.add(coursee);
        System.out.println(coursee.course);
        }
    static void removecourse(student coursee){
        courses.remove(coursee);
        System.out.println(coursee.course);

    }
    public static void main(String[] args){
        student s=new student("RAGU",'A',"java");
          student s2=new student("RAGU",'A',"c++");
        s.addcourse(s);
        s2.removecourse(s2);
    }
}