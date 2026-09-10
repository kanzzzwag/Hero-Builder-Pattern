package astanait.edu.kz;

public class Hero {
    private final String name;
    private final double hp;
    private final double mana;
    private final int damage;
    private final int agility;
    private final String weaponType;
    private final String attackRange;
    private final boolean canHeal;

    //constructor

    public Hero(String name, double hp, double mana, int damage, int agility, String weaponType, String attackRange, boolean canHeal) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.damage = damage;
        this.agility = agility;
        this.weaponType = weaponType;
        this.attackRange = attackRange;
        this.canHeal = canHeal;
    }

    //getters

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getMana() {
        return mana;
    }

    public int getDamage() {
        return damage;
    }

    public int getAgility() {
        return agility;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getAttackRange() {
        return attackRange;
    }

    public boolean isCanHeal() {
        return canHeal;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                ", damage=" + damage +
                ", agility=" + agility +
                ", weaponType='" + weaponType + '\'' +
                ", attackRange='" + attackRange + '\'' +
                ", canHeal=" + canHeal +
                '}';
    }
}
