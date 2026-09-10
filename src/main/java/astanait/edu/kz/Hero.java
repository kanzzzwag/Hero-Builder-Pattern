package astanait.edu.kz;

public final class Hero {
    private final String name;
    private final double hp;
    private final double mana;
    private final int damage;
    private final int agility;
    private final AbstractHeroBuilder.WeaponType weaponType;
    private final AbstractHeroBuilder.AttackRange attackRange;
    private final boolean canHeal;

    //constructor

    Hero(AbstractHeroBuilder builder) {
        this.name = builder.name;
        this.hp = builder.hp;
        this.mana = builder.mana;
        this.damage = builder.damage;
        this.agility = builder.agility;
        this.weaponType = builder.weaponType;
        this.attackRange = builder.attackRange;
        this.canHeal = builder.canHeal;
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

    public AbstractHeroBuilder.WeaponType getWeaponType() {
        return weaponType;
    }

    public AbstractHeroBuilder.AttackRange getAttackRange() {
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
