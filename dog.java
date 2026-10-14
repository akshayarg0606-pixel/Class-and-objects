class dog{
    String name;
    String breed;

    public dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
   // void setname(String name){
       // this.name=name;

    //}
    //void setbreed(String breed){
        //this.breed=breed;
    //}

    public static void main(String[] args) {
        dog d1 = new dog("blackyy","streetdog");
      
        //d1.setname("TOMMY");
        //d1.setbreed("labrador");
        
        System.out.println(d1.name);
        System.out.println(d1.breed);
       

    }

}