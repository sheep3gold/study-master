package design.observer;

/**
 * Created by ALEX on 2018/8/6.
 */
public class ZhangSan implements Person {
    String name="张三";
    @Override
    public void getMessage(String s) {
        System.out.println(name+"收到信息："+s);
    }
}
