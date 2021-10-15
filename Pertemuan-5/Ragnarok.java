class Character {
    //attribute
    public String Name = "Michahide";
    public String Guild = "RedBlood";
    public int Zeny = 1000000;
    public int INT = 45;
    public int STR = 32;
    public int DEX = 40;
    public int HP = 20000;
    public int SP = 15000;

    //method
    public void char_info() {
        System.out.println("=== CHARACTER INFO ===");
        System.out.println("Name: " + Name);
        System.out.println("Guild: " + Guild);
        System.out.println("Zeny: "+ Zeny);
    }

    public int stat_INT() {
        return this.INT;
    }

    public int stat_STR() {
        return this.STR;
    }

    public int stat_DEX() {
        return this.DEX;
    }

    public int stat_HP() {
        return this.HP;
    }

    public int stat_SP() {
        return this.SP;
    }
}


class Mage extends Character {
    public int INT_boost = 12;
    public int SP_boost = 5000;

    public void MageSkill(){
        System.out.println("=== Skill ===");
        System.out.println("Fireball");
        System.out.println("Frost Nova");
        System.out.println("Heaven's Drive");
    }

    public void MageRune(){
        System.out.println("=== Rune ===");
        System.out.println("Fire Pillar Attack");
        System.out.println("Meteor Storm");
        System.out.println("Spell Crit");
    }
}

class Swordsman extends Character {
    public int STR_boost = 12;
    public int HP_boost = 5000;

    public void SwordsmanSkill(){
        System.out.println("=== Skill ===");
        System.out.println("Lord's Aura");
        System.out.println("Aura Blade");
        System.out.println("Bash");
    }

    public void SwordsmanRune(){
        System.out.println("=== Rune ===");
        System.out.println("Sword Mastery - Empower");
        System.out.println("Ignore Def");
        System.out.println("Bash - Empower");
    }
}

public class Ragnarok {
    public static void main(String[] args) {
        Character c = new Character();
        System.out.println("=== Character in Ragnarok ===");
        c.char_info();
        System.out.println("=== Stats ===");
        int stat_INT = c.stat_INT();
        int stat_STR = c.stat_STR();
        int stat_DEX = c.stat_DEX();
        int stat_HP = c.stat_HP();
        int stat_SP = c.stat_SP();
        System.out.println("INT: " + stat_INT);
        System.out.println("STR: " + stat_STR);
        System.out.println("DEX: " + stat_DEX);
        System.out.println("HP: " + stat_HP);
        System.out.println("SP: " + stat_SP);
        System.out.println();
        System.out.println("=========================");
        System.out.println();

        Mage m = new Mage();
        System.out.println("======= Job: Mage =======");
        m.char_info();
        System.out.println("=== Stats ===");
        System.out.println("INT: " + stat_INT + " (+" + m.INT_boost + "from INT Boost)");
        System.out.println("STR: " + stat_STR);
        System.out.println("DEX: " + stat_DEX);
        System.out.println("HP: " + stat_HP);
        System.out.println("SP: " + stat_SP + " (+" + m.SP_boost + "from SP Boost)");
        m.MageSkill();
        m.MageRune();
        System.out.println();
        System.out.println("========================");
        System.out.println();

        Swordsman s = new Swordsman();
        System.out.println("=== Job: Swordsman ===");
        s.char_info();
        System.out.println("=== Stats ===");
        System.out.println("INT: " + stat_INT);
        System.out.println("STR: " + stat_STR + " (+" + s.STR_boost + "from STR Boost)");
        System.out.println("DEX: " + stat_DEX);
        System.out.println("HP: " + stat_HP + " (+" + s.HP_boost + "from HP Boost)");
        System.out.println("SP: " + stat_SP);
        s.SwordsmanSkill();
        s.SwordsmanRune();



        

    }
}
