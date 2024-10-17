
public class Car extends Vehicle {
    private int numDoors;
    private boolean isElectric;

    public int getnumDoors(){
        return this.numDoors;
    }
    public void setnumDoors(int numDoors){
        this.numDoors = numDoors;
    }
    public boolean getisElectric(){
        return this.isElectric;
    }
    public void setisElectric(boolean isElectric){
        this.isElectric = isElectric;
    }

    public Car(){
        super();
        numDoors = 0;
        isElectric = (true);

    }
    public Car(int jumlahPintu,boolean isElectric, double price, String numWheels){
        this.numDoors = jumlahPintu;
    }

    public void print(){
        System.out.println("numDoors : "+numDoors);
        System.out.println("isElectric;"+isElectric);
    }
   

    }

