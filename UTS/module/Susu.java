package module;

public class Susu {
    public String Rasa;
    public double Kalsium;
    public String Kadaluwarsa;
    public double Harga;

    public void setRasa(String Rasa_param) {
        this.Rasa = Rasa_param;
    }

    public void setKalsium(double Kalsium_param) {
        this.Kalsium = Kalsium_param;
    }

    public void setKadaluwarsa(String Kadaluwarsa_param) {
        this.Kadaluwarsa = Kadaluwarsa_param;
    }

    public void setHarga(double Harga_param) {
        this.Harga = Harga_param;
    }

    public String getRasa(){
        return this.Rasa;
    }

    public double getKalsium(){
        return this.Kalsium;
    }

    public String getKadaluwarsa(){
        return this.Kadaluwarsa;
    }

    public double getHarga(){
        return this.Harga;
    }
}
