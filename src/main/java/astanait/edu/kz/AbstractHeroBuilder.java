package astanait.edu.kz;

abstract class AbstractHeroBuilder implements HeroBuilder {

    enum WeaponType {MELEE, RANGED};
    enum AttackRange {CLOSE, MID, FAR};

    protected String name;
    protected double hp;
    protected double mana;
    protected int damage;
    protected int agility;
    protected boolean canHeal;
    protected WeaponType weaponType;
    protected AttackRange attackRange;

    //setters

    @Override
    public HeroBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public HeroBuilder setHp(double hp) {
        this.hp = hp;
        return this;
    }

    @Override
    public HeroBuilder setMana(double mana) {
        this.mana = mana;
        return this;
    }

    @Override
    public HeroBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    @Override
    public HeroBuilder setAgility(int agility) {
        this.agility = agility;
        return this;
    }

    @Override
    public HeroBuilder setCanHeal(boolean canHeal) {
        this.canHeal = canHeal;
        return this;
    }

    @Override
    public final Hero build() {
        return new Hero(this);
    }

    //validations
    protected void validate(){
        if(name == null || name.isBlank()){
            throw new IllegalStateException("The hero's name must exist!");
        }
        if(hp <= 0){
           throw new IllegalStateException("The hero's hp must be greater than 0!");
        }
    }

}
