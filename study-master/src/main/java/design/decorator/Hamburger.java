package design.decorator;

/**
 * Created by ALEX on 2018/8/6.
 */
public class Hamburger {
    public static void main(String[] args) {
        Food food=new Food("面包");
        Meat meat=new Meat(food);
        meat.setFoodName("培根");
        Vegetable vegetable=new Vegetable(meat);
        vegetable.setFoodName("生菜");
        Flavor flavor=new Flavor(vegetable);
        flavor.setFoodName("黑胡椒");

        System.out.println("我的汉堡由"+flavor.getFoodAll()+"组成");
    }
}
