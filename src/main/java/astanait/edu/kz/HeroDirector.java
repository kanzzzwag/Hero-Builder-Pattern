package astanait.edu.kz;

public class HeroDirector {

    public Hero buildAssasinHero(HeroBuilder builder){
        return builder
                .setName("Phantom")
                .setHp(1200)
                .setMana(400)
                .setDamage(250)
                .setAgility(60)
                .build();
    }

    public Hero buildHealerHero(HeroBuilder builder){
        builder
                .setName("Nun")
                .setHp(550)
                .setMana(1150)
                .setDamage(50)
                .setAgility(20)
                .setCanHeal(true);
        ((RangeHeroBuilder) builder).setAttackRange(AbstractHeroBuilder.AttackRange.FAR);

        return builder.build();
    }

    public Hero buildTankHero(HeroBuilder builder){
        return builder
                .setName("Pudge")
                .setHp(2500)
                .setMana(650)
                .setDamage(100)
                .setAgility(15)
                .build();
    }

    public Hero buildShooterHero(HeroBuilder builder){
        builder
                .setName("Agent 47")
                .setHp(800)
                .setMana(800)
                .setDamage(200)
                .setAgility(55)
                .setCanHeal(false);
        ((RangeHeroBuilder) builder).setAttackRange(AbstractHeroBuilder.AttackRange.MID);

        return builder.build();
    }
}
