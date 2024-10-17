public class Bicyle extends Vehicle {
    String Biketype;

    public String getBiketype(){
        return this.Biketype;
    }
    public void setBiketype(String Biketype){
        this.Biketype = Biketype;
    }

    public Bicyle(){
        super();
        Biketype = "";
    }
    public Bicyle(String Biketype){
        this.Biketype = Biketype;
    }

    public void print(){
        System.out.println("Biketype : "+Biketype);
    
    }

   
}
