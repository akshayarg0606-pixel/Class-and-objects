class traffic{
    String colour;
    int duration;
    public traffic(String colour,int duration){
        this.colour=colour;
        this.duration=duration;

    }
    void changecolour(String newcolour){
        colour=newcolour;
    }
    boolean isred(){
        return colour.equals("red");
    }
    boolean isgreen(){
        return colour.equals("green");
    }
public static void main(String[] args) {
    traffic t1=new traffic("red",30);
  
    System.out.println(t1.colour);
    System.out.println(t1.duration);

    System.out.println(t1.isred());
    System.out.println(t1.isgreen());
    t1.changecolour("green");
    System.out.println("After changing......");
    System.out.println(t1.colour);
    System.out.println(t1.isred());
    System.out.println(t1.isgreen());
}
}