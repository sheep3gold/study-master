package design.decorator;

/**
 * Created by ALEX on 2018/8/6.
 */
public class Food {
    private String foodName;

    public Food() {
    }

    public Food(String foodName){
        this.foodName=foodName;
    }

    public void setFoodName(String foodName){
        this.foodName=foodName;
    }

    public String getFoodName(){
        return foodName;
    }
    public String getFoodAll(){
        return foodName;
    }
}
