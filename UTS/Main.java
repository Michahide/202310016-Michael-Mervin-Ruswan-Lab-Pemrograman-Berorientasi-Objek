import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import module.Ultra;
import module.Cimory;


public class Main {
    public static Scanner myObj = new Scanner(System.in);
    private String[] MenuList = {"Menginput Product","Melihat Product"};
    private String[] MyProduct = {"Ultra","Cimory"};
    private List<Ultra> listUltra  = new ArrayList<Ultra>();
    private List<Cimory> listCimory  = new ArrayList<Cimory>();

    public static void main(String[] args) {
        Main m = new Main();
        m.InputMenu();
    }


    public void InputMenu() {
        
        int menu;
        
        System.out.println("\n\n--PROGRAM PENJUALAN SUSU TOKO. XYZ--");
        System.out.println("Pilih menu:\n");
        int i=1;
        for (String mu : this.MenuList) {
            System.out.println(i+". "+mu);
            i++;
        }
        System.out.print("Masukan pilihan menu:");
        String inputMenu = myObj.nextLine();
        menu = Integer.parseInt(inputMenu);

        switch (menu) {
            case 1:
                try {     
                    this.InputMenuProduct();               
                } catch (Exception e) {
                    System.out.println("Failed error input menu produk");
                    System.out.println("Error: "+e.getMessage());
                }   
                break;
            case 2:
                this.ShowMenuProduct();
                break;
        
            default:
            System.out.println("Pilihan tidak terdaftar");
                break;
        }
    }

    public void InputMenuProduct(){
        System.out.println("\n-------------------");
        System.out.println("Input Product");
        System.out.println("-------------------\n");
        System.out.println("Pilih Produk:");
        int i=1;
        for (String p : MyProduct) {
            System.out.println(i+". "+p);
            i++;
        }
        System.out.print("Masukan pilihan:");
        int product;
        String inputProduct = myObj.nextLine();
        product = Integer.parseInt(inputProduct);
        switch (product) {
            case 1:                
                try {
                    listUltra = this.InputUltra();         
                    this.InputMenu();               
                } catch (Exception e) {
                    System.out.println("Failed error input produk Ultra");
                    System.out.println("Error: "+e.getMessage());
                }    
            
                break;
            case 2:
                try {
                    listCimory = this.InputCimory();         
                    this.InputMenu();               
                } catch (Exception e) {
                    System.out.println("Failed error input produk Cimory");
                    System.out.println("Error: "+e.getMessage());
                }    

                break;
        
            default:
                break;
        }
    }


    public List InputUltra() {
        System.out.println("\n===Input Ultra===");
        System.out.print("Masukan jumlah data yang dimasukan:");
        int jmlData= Integer.parseInt(myObj.nextLine());
        for (int i = 0; i < jmlData; i++) {
            Ultra s = new Ultra();
            System.out.println("#data ke-"+(i+1)+":");
            System.out.print("Rasa = ");
            String Rasa = myObj.nextLine();            
            s.setRasa(Rasa);
            
            System.out.print("Kalsium = ");
            Double kalsium = Double.parseDouble(myObj.nextLine());            
            s.setKalsium(kalsium);

            System.out.print("Kadaluwarsa = ");
            String Kadaluwarsa = myObj.nextLine();            
            s.setKadaluwarsa(Kadaluwarsa);

            System.out.print("Harga = ");
            Double Harga = Double.parseDouble(myObj.nextLine());            
            s.setHarga(Harga);
            
            System.out.print("Zinc = ");
            double Zinc = Double.parseDouble(myObj.nextLine());            
            s.setZinc(Zinc);

            System.out.print("Vitamin = ");
            double vitamin = Double.parseDouble(myObj.nextLine());            
            s.setVitamin(vitamin);

            System.out.println("---------------------------");
            this.listUltra.add(s);
        }
        System.out.println("\n");
        return this.listUltra;
        
    }


    public List InputCimory() {
        System.out.println("\n===Input Cimory===");
        System.out.print("Masukan jumlah data yang dimasukan:");
        int jmlData= Integer.parseInt(myObj.nextLine());
        for (int i = 0; i < jmlData; i++) {
            Cimory s = new Cimory();
            System.out.println("#data ke-"+(i+1)+":");
            System.out.print("Rasa = ");
            String Rasa = myObj.nextLine();            
            s.setRasa(Rasa);
            
            System.out.print("Kalsium = ");
            Double kalsium = Double.parseDouble(myObj.nextLine());            
            s.setKalsium(kalsium);

            System.out.print("Kadaluwarsa = ");
            String Kadaluwarsa = myObj.nextLine();            
            s.setKadaluwarsa(Kadaluwarsa);

            System.out.print("Harga = ");
            Double Harga = Double.parseDouble(myObj.nextLine());            
            s.setHarga(Harga);
            
            System.out.print("Magnesium = ");
            double Magnesium = Double.parseDouble(myObj.nextLine());            
            s.setMagnesium(Magnesium);

            System.out.print("Zat Besi = ");
            Double zatBesi = Double.parseDouble(myObj.nextLine());            
            s.setZatBesi(zatBesi);

            System.out.println("---------------------------");
            this.listCimory.add(s);
        }
        System.out.println("\n");
        return this.listCimory;
        
    }

    public void ShowMenuProduct(){
        System.out.println("===== List Ultra =====");
        for (Ultra s : this.listUltra) {
            System.out.println("Rasa = "+ s.getRasa() );
            System.out.println("Kalsium = "+ s.getKalsium() );
            System.out.println("Kadaluwarsa = "+ s.getKadaluwarsa() );
            System.out.println("Harga = "+ s.getHarga() );
            System.out.println("Zinc = "+ s.getZinc() );
            System.out.println("Vitamin = "+ s.getVitamin() );
            System.out.println("========================");
        }
        System.out.println();
        System.out.println("===== List Cimory =====");
        for (Cimory s : this.listCimory) {
            System.out.println("Rasa = "+ s.getRasa() );
            System.out.println("Kalsium = "+ s.getKalsium() );
            System.out.println("Kadaluwarsa = "+ s.getKadaluwarsa() );
            System.out.println("Harga = "+ s.getHarga() );
            System.out.println("Magnesium = "+ s.getMagnesium() );
            System.out.println("Zat Besi = "+ s.getZatBesi() );
            System.out.println("========================");
        }
    }    
    
}
