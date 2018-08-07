package dao;

/**
 * Created by ALEX on 2018/8/3.
 */
public class Car implements Driver {

    @Override
    public void driverInRoad() {
        System.out.println("正在开车");
    }
}
