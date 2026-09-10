package astanait.edu.kz;

public interface HeroBuilder {
    HeroBuilder setName(String name);

    HeroBuilder setHp(double hp);

    HeroBuilder setMana(double mana);

    HeroBuilder setDamage(int damage);

    HeroBuilder setAgility(int agility);

    HeroBuilder setCanHeal(boolean canHeal);

    Hero build();
}
