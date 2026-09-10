package astanait.edu.kz;

public class RangeHeroBuilder extends AbstractHeroBuilder{

    private static final String REJECTED_ATTACK_RANGE = "Close";

    public RangeHeroBuilder(){
        this.weaponType = "Ranged";
    }

    @Override
    protected void validate(){
        super.validate();
        if(mana < 0){
            throw new IllegalStateException("The hero's mana can't be less than 0");
        }
    }
}
