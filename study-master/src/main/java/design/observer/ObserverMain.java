package design.observer;

/**
 * Created by ALEX on 2018/8/6.
 */
public class ObserverMain {
    public static void main(String[] args) {
        Supermarket supermarket=new Supermarket();
        ZhangSan zhangsan=new ZhangSan();
        LiSi lisi=new LiSi();
        supermarket.personRegister(zhangsan);
        supermarket.personRegister(lisi);
        supermarket.sendMessage("超市今天大减价啦！");

        supermarket.unPersonRegister(lisi);
        supermarket.sendMessage("超市明天也大减价！");
    }
}
