package astanait.edu.kz;

public class RangeHeroBuilder extends AbstractHeroBuilder{

    public RangeHeroBuilder(){
        this.weaponType = WeaponType.RANGED;
    }

    public RangeHeroBuilder setAttackRange(AttackRange range){
        if(range == AttackRange.CLOSE){
            throw new IllegalStateException("Ranged hero's attack range can't be close");}
        this.attackRange = range;
        return this;
    }
}
