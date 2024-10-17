public class Convertible extends Vehicle {
    private String roofType;

    public String roofType(){
        return this.roofType;
    }
    public void setroofype(String roofType){
        this.roofType = roofType;
    }


    public Convertible(){
        super();
        roofType = "";
    }
        public Convertible(String roofType){
            this.roofType = roofType;
        }
    
        public void print(){
            System.out.println("rooftype : "+roofType);
            
        }

}

