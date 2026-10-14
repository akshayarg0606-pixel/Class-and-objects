class circle{
    int radius;
    double pi=3.14;

    double area(int radius){
        double area =pi *(radius*radius);
        return area;
    }
    public static void main(String[] args) {
        circle c1 =new circle();
       
        System.out.println( c1.area(4));
    }
}