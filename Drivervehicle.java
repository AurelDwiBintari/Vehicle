import java.util.Scanner;

public class Drivervehicle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Jumlah roda : ");
        String numWheels=in.nextLine();
        System.out.println("Masukkan harga : ");
        double price=in.nextInt();

        System.out.println("Pilih 1.Car atau 2.Bicyle? :");
        int pilihan = in.nextInt();

        if(pilihan == 1){
            System.out.println("Masukkan Jumlah pintu :");
            int numDoors=in.nextInt();
            System.out.println("Masukkan electric atau tidak :");
            boolean isElectric=in.nextBoolean();
            System.out.println("Masukan Tipe atap : ");
            String rooftype=in.nextLine();
            in.nextLine();

            Car c = new Car(numDoors,isElectric,price,numWheels);
            Convertible r = new Convertible(rooftype);
            c.print();
            r.print();

    }else if (pilihan == 2){
            System.out.println("Masukkan Tipe sepeda : ");
            String biketype=in.nextLine();
            Bicyle b = new Bicyle();
            b.print();
    }
         System.out.println("Diskon? 1.ya 2.tidak : ");
         int DIskon=in.nextInt();

         if (DIskon == 1){
            System.out.println("Berapa persen : ");
            int persen = in.nextInt();
            System.out.println("Masukkan harga Awal : ");
            int hargaAwal = in.nextInt();
        for (int i = 1; i < args.length; i--) {
            System.out.println("Masukan Diskon :");
            DIskon = in.nextInt();
        }
        DIskon = hargaAwal-persen;
        System.out.println("HargaAwal"+hargaAwal);
        System.out.println("Diskon"+DIskon);

        in.nextLine();
   }else if (DIskon ==2 ){
        System.out.println();
   }
}
}
