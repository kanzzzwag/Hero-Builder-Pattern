package astanait.edu.kz;

public class MeleeHeroBuilder extends AbstractHeroBuilder {

    public MeleeHeroBuilder(){
        this.canHeal = false;
        this.attackRange = AttackRange.CLOSE;
        this.weaponType = WeaponType.MELEE;
    }

    @Override
    protected void validate(){
        super.validate();
        if(hp < 1000){
            throw new IllegalStateException("Melee Hero can't have less than 1000 hp!");
        }
    }

}
