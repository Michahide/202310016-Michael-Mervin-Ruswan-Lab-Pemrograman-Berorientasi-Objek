package module;

public class Swordsman extends Character {
    public int STR_boost;
    public int HP_boost;
    public String SwordsmanSkill;
    public String SwordsmanRune;

    public void setSwordsmanSkill(String SwordsmanSkillparam){
        this.SwordsmanSkill = SwordsmanSkillparam;
    }

    public void setSwordsmanRune(String SwordsmanRuneparam){
        this.SwordsmanRune = SwordsmanRuneparam;
    }

    public void setSTR_boost(int STR_boostparam){
        this.STR_boost = STR_boostparam;
    }

    public void setHP_boost(int HP_boostparam){
        this.HP_boost = HP_boostparam;
    }

    public String getSwordsmanSkill(){
        return this.SwordsmanSkill;
    }

    public String getSwordsmanRune(){
        return this.SwordsmanRune;
    }

    public int getSTR_boost(){
        return this.STR_boost;
    }

    public int getHP_boost(){
        return this.HP_boost;
    }
}
