package astanait.edu.kz;

public class Main {
    public static void main(String[] args){
        HeroDirector director = new HeroDirector();

        //reusable configs

        Hero assasinHero = director.buildAssasinHero(new MeleeHeroBuilder());
        System.out.println("Assassin Hero: " + assasinHero);

        Hero healerHero = director.buildHealerHero(new RangeHeroBuilder());
        System.out.println("Healer Hero: " + healerHero);

        Hero tankHero = director.buildTankHero(new MeleeHeroBuilder());
        System.out.println("Tank Hero: " + tankHero);

        Hero shooterHero = director.buildShooterHero(new RangeHeroBuilder());
        System.out.println("Shooter Hero: " + shooterHero);

        //custom hero

        Hero customInitiatorHero = new MeleeHeroBuilder()
                .setName("Barathrum")
                .setHp(1000)
                .setMana(650)
                .setDamage(450)
                .setAgility(35)
                .build();
        System.out.println("Custom Initiator Hero: " + customInitiatorHero);

        //validation test

        try{
            new MeleeHeroBuilder()
                    .setName("Creep")
                    .setHp(300) //hp less than 1000 on melee hero
                    .setMana(9999999)
                    .setDamage(99999999)
                    .setAgility(9999999)
                    .build();
        } catch (IllegalStateException e){
            System.out.println("Validation caught and invalid build: " + e.getMessage());
        }
    }
}
