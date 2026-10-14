class rectangle{
    int width;
    int length;

    int area(int width,int length)
    {
        int area=width*length;
        return area;
    }
    int perimeter(int length,int width){
        int perimeter=2*(length+width);
        return perimeter;
    }
    public static void main(String[] args) {
        rectangle r1=new rectangle();
       
    
        System.out.println( r1.area(4,10));
        System.out.println(    r1.perimeter(10,4));
    }
}