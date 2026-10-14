class airplane{
    int flight_num;
    int departure_time;
    int arrival_time;
    String status;
    int delay;
    airplane(int flight_num,int departure_time,int arrival_time,String status,int delay){
        this.flight_num=flight_num;
        this.departure_time=departure_time;
        this.arrival_time=arrival_time;
        this.status=status;
        this.delay=delay;
    }
     void checkflightstatus(){
        System.out.println(status);
    }
     void checkdelay(){
        if(delay>0){
             System.out.println(delay);
        }
        else{
            System.out.println("ON TIME");
        }
       
    }

    public static void main(String[] args) {
        airplane a=new airplane(101,900,1200,"delay",5);
        a.checkflightstatus();
        a.checkdelay();

    }
    }