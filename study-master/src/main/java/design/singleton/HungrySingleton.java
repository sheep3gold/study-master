package design.singleton;

/**
 * 饿汉单例，优点：基于classloder避免多线程问题，缺点：一台机器有多个classloder或者集群架构不适用 
 *       
 * @author xianglong.zhang@hand-china.com 
 * @version 1.0
 * @date 2018/6/25 14:19
 */
public class HungrySingleton {
    /**
     * 类加载时直接实例化 
     *       
     * @author xianglong.zhang@hand-china.com 
     * @version 1.0
     * @date 2018/6/25 10:43
     */
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     * 无参构造私有化 
     *       
     * @author xianglong.zhang@hand-china.com 
     * @version 1.0
     * @date 2018/6/25 10:44
     */
    private HungrySingleton(){}
    
    /**
     * 公有获取实例
     *
     * @param 
     * @return Singleton.HungrySingleton
     * @author xianglong.zhang@hand-china.com
     * @name getHungrySingleton
     * @date 2018/6/25 10:45
     * @version 1.0
     */
    public HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}
