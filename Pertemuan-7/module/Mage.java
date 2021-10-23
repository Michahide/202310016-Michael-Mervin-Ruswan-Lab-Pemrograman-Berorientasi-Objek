package module;


public class Mage extends Character {
    public int INT_boost;
    public int SP_boost;
    public String MageSkill;
    public String MageRune;

    public void setMageSkill(String MageSkillparam){
        this.MageSkill = MageSkillparam;
    }

    public void setMageRune(String MageRuneparam){
        this.MageRune = MageRuneparam;
    }

    public void setINT_boost(int INT_boostparam){
        this.INT_boost = INT_boostparam;
    }

    public void setSP_boost(int SP_boostparam){
        this.SP_boost = SP_boostparam;
    }

    public String getMageSkill(){
        return this.MageSkill;
    }

    public String getMageRune(){
        return this.MageRune;
    }

    public int getINT_boost(){
        return this.INT_boost;
    }

    public int getSP_boost(){
        return this.SP_boost;
    }

    
}

