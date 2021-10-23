package module;

public class Character {
    //attribute
    public String Name = "Michahide";
    public String Guild = "RedBlood";
    public int Zeny = 1000000;
    public int INT;
    public int STR;
    public int DEX;
    public int HP;
    public int SP;

    //method
    public void char_info() {
        System.out.println("=== CHARACTER INFO ===");
        System.out.println("Name: " + Name);
        System.out.println("Guild: " + Guild);
        System.out.println("Zeny: "+ Zeny);
    }

    public void setStat_INT(int statINT2) {
        this.INT = statINT2;
    }

    public void setStat_STR(int statSTR2) {
        this.STR = statSTR2;
    }

    public void setStat_DEX(int statDEX2) {
        this.DEX = statDEX2;
    }

    public void setStat_HP(int statHP2) {
        this.HP = statHP2;
    }

    public void setStat_SP(int statSP2) {
        this.SP = statSP2;
    }

    public int getStat_INT() {
        return this.INT;
    }

    public int getStat_STR() {
        return this.STR;
    }

    public int getStat_DEX() {
        return this.DEX;
    }

    public int getStat_HP() {
        return this.HP;
    }

    public int getStat_SP() {
        return this.SP;
    }
}
