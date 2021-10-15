public class Handphone {

    public int layar = 5;
    public int camera = 20;
    public String batre= ""+500;


public static void main(String args[]){
    Handphone handphone = new Handphone();
    menelpon();
    berfoto(handphone.camera);
    double hasil;
    hasil = berfoto(handphone.camera);
    System.out.println("Kualitas foto hp ini adalah "+hasil+" megapixel");
    hasil=(engine(handphone.camera,Integer.parseInt(handphone.batre)));
    System.out.println("Kekuatan engine nya sebesar "+hasil+" megavolt");        
}


    public static void menelpon(){ // tipe data ini hanya bisa menampilkan keseliruhan statement dan argumen 
        Handphone handphone = new Handphone();
        System.out.println("Sedang menelpon dengan layar hp ke "+ handphone.layar );            
    }


    public static int berfoto(int x){ // seting fungsi tipe data int
        Handphone handphone = new Handphone();
        handphone.camera = x * 6;
        return handphone.camera;
    }


    public static double engine(int x, int y){
        Handphone handphone = new Handphone();
        handphone.camera = x;
        handphone.batre = ""+y;
        return Integer.parseInt(handphone.batre)  / handphone.camera ;
    }
}