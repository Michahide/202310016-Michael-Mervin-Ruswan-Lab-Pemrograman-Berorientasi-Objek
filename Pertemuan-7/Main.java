import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import module.Character;
import module.Mage;
import module.Swordsman;

public class Main {
    public static void main(String[] args) {
        Main ut = new Main();
        System.out.println("=== Ragnarok ===");
        Scanner myObj = new Scanner (System.in); //scripting library input
        Character c = new Character();
        c.char_info();
        List <Character> listCharacter = new ArrayList<Character>();
        System.out.println();

        //Looping stat
        for (int i = 0; i < 3; i++) {
            System.out.println("Stat character set "+(i+1));
            System.out.print("INT: ");
            String statINT = myObj.nextLine();
            int statINT2 = Integer.parseInt(statINT);
            c.setStat_INT(statINT2);
            
            System.out.print("STR: ");
            String statSTR = myObj.nextLine();
            int statSTR2 = Integer.parseInt(statSTR);
            c.setStat_STR(statSTR2);

            System.out.print("DEX: ");
            String statDEX = myObj.nextLine();
            int statDEX2 = Integer.parseInt(statDEX);
            c.setStat_DEX(statDEX2);

            System.out.print("HP: ");
            String statHP = myObj.nextLine();
            int statHP2 = Integer.parseInt(statHP);
            c.setStat_HP(statHP2);

            System.out.print("SP: ");
            String statSP = myObj.nextLine();
            int statSP2 = Integer.parseInt(statSP);
            c.setStat_SP(statSP2);
            
            System.out.println();
            System.out.println("=============");

            listCharacter.add(c);
        }

        System.out.println("==== Mencetak hasil Stat Set ====");

        for (Character character : listCharacter) {
            System.out.println("INT: " + c.getStat_INT());
            System.out.println("STR: " + c.getStat_STR());
            System.out.println("DEX: " + c.getStat_DEX());
            System.out.println("HP: " + c.getStat_HP());
            System.out.println("SP: " + c.getStat_SP());
            System.out.println("===========================");
        }

        System.out.println("\n\n==== Selected Job: Mage ====");
        List <Mage> listMage = new ArrayList<Mage>();

        //Looping stat
        for (int i = 0; i < 3; i++) {
            Mage m = new Mage();
            System.out.println("Stat booster, rune and skill set "+(i+1));
            System.out.print("INT Boost: ");
            String Int_boost = myObj.nextLine();
            int Int_boost2 = Integer.parseInt(Int_boost);
            m.setINT_boost(Int_boost2);

            System.out.print("SP Boost: ");
            String SP_boost = myObj.nextLine();
            int SP_boost2 = Integer.parseInt(SP_boost);
            m.setSP_boost(SP_boost2);

            System.out.print("Skill: ");
            String MageSkill = myObj.nextLine();
            m.setMageSkill(MageSkill);

            System.out.print("Rune: ");
            String MageRune = myObj.nextLine();
            m.setMageRune(MageRune);

            System.out.println();
            System.out.println("=============");

            listMage.add(m);
        }

        System.out.println("==== Mencetak hasil Stat Booster, Skill, dan Rune Mage====");

        for (Mage m : listMage) {
            System.out.println("INT Boost: " + m.getINT_boost());
            System.out.println("SP Boost: " + m.getSP_boost());
            System.out.println("Skill: " + m.getMageSkill());
            System.out.println("Rune: " + m.getMageRune());
            System.out.println("===========================");
        }


        //Swordsman
        System.out.println("\n\n==== Selected Job: Swordsman ====");
        List <Swordsman> listSwordsman = new ArrayList<Swordsman>();

        //Looping stat
        for (int i = 0; i < 3; i++) {
            Swordsman s = new Swordsman();
            System.out.println("Stat booster, rune and skill set "+(i+1));
            System.out.print("STR Boost: ");
            String STR_boost = myObj.nextLine();
            int STR_boost2 = Integer.parseInt(STR_boost);
            s.setSTR_boost(STR_boost2);

            System.out.print("HP Boost: ");
            String HP_boost = myObj.nextLine();
            int HP_boost2 = Integer.parseInt(HP_boost);
            s.setHP_boost(HP_boost2);

            System.out.print("Skill: ");
            String SwordsmanSkill = myObj.nextLine();
            s.setSwordsmanSkill(SwordsmanSkill);

            System.out.print("Rune: ");
            String SwordsmanRune = myObj.nextLine();
            s.setSwordsmanRune(SwordsmanRune);

            System.out.println();
            System.out.println("=============");

            listSwordsman.add(s);
        }

        System.out.println("==== Mencetak hasil Stat Booster, Skill, dan Rune Swordsman====");

        for (Swordsman s : listSwordsman) {
            System.out.println("STR Boost: " + s.getSTR_boost());
            System.out.println("HP Boost: " + s.getHP_boost());
            System.out.println("Skill: " + s.getSwordsmanSkill());
            System.out.println("Rune: " + s.getSwordsmanRune());
            System.out.println("===========================");
        }
    }
}

