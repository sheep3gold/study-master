package design.decorator;

/**
 * Created by ALEX on 2018/8/6.
 */
public class Meat extends Food {
    private Food basicFood;

    public Meat(String foodName) {
        super(foodName);
    }

    public Meat(Food basicFood){
        this.basicFood=basicFood;
    }

    @Override
    public String getFoodAll(){
        return basicFood.getFoodAll()+"+"+this.getFoodName();
    }
}
