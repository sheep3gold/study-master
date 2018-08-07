package design.singleton;

/**
 * 懒汉单例，当获取实例时才会检查并创建实例，优点：lazy loading，缺点：效率低
 *       
 * @author xianglong.zhang@hand-china.com 
 * @version 1.0
 * @date 2018/6/25 10:39
 */
public class LazySingleton {

    /**
     * 声明静态全局变量
     *
     * @author xianglong.zhang@hand-china.com
     * @version 1.0
     * @date 2018/6/25 10:23
     */
    private static LazySingleton LazySingleton;

    /**
     * 将无参构造声明为私有方法，禁止通过无参构造创建实例
     *
     * @author xianglong.zhang@hand-china.com
     * @version 1.0
     * @date 2018/6/25 10:24
     */
    private LazySingleton(){}

    /**
     * 获取单例，利用synchronized解决多线程问题，效率低
     *
     * @param 
     * @return Singleton.LazySingleton
     * @author xianglong.zhang@hand-china.com
     * @name getLazySingleton
     * @date 2018/6/25 10:27
     * @version 1.0
     */
    public static synchronized LazySingleton getLazySingleton(){
        if(LazySingleton ==null){
            LazySingleton =new LazySingleton();
        }
        return LazySingleton;
    }
}
