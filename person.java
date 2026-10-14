class person{
    String name;
    int age;

    person(String name,int age){
        this.name=name;
        this.age=age;
    }


public static void main(String [] args){
    person p1= new person("akshaya",19);
    person p2= new person("Shyam",20);
    System.out.println(p1.name);
    System.out.println(p1.age);
    System.out.println(p2.name);
    System.out.println(p2.age);
}}