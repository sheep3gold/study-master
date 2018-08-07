package design.singleton;

/**
 * 双重校验锁，只有在创建实例时进行同步锁，保证多线程问题，相比懒汉模式，性能提高
 *       
 * @author xianglong.zhang@hand-china.com 
 * @version 1.0
 * @date 2018/6/25 15:31
 */
public class DoubleCheckingLocked {
    private volatile static DoubleCheckingLocked singleton;

    private DoubleCheckingLocked(){}

    public DoubleCheckingLocked getSingleton(){
        if(singleton==null){
            synchronized (DoubleCheckingLocked.class){
                if(singleton==null){
                    singleton=new DoubleCheckingLocked();
                }
            }
        }
        return singleton;
    }
}
