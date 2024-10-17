public class Vehicle {
    private int numWheels;
    private int price;

    public int getnumWheels(){
        return this.numWheels;
    }
    public void setBiketype(int numWheels){
        this.numWheels = numWheels;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price= price;
    }
    public Vehicle(){
        super();
        numWheels = 0;
        price = 0;

    }
   
    public Vehicle(int numWheels,double price){
        System.out.println("numWheels ;"+numWheels);
        System.out.println("price ;"+price);
    }
}
