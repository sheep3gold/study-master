package design.decorator;

/**
 * Created by ALEX on 2018/8/6.
 */
public class Flavor extends Food {
    private Food basicFood;

    public Flavor(Food basicFood){
        this.basicFood=basicFood;
    }

    @Override
    public String getFoodAll(){
        return basicFood.getFoodAll()+"+"+this.getFoodName();
    }
}
