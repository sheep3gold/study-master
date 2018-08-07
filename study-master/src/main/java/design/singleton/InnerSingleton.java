package design.singleton;

/**
 * 内部类实现单例，同样使用classloader实现单例，避免多线程问题，优点：将实例化交给内部类去实现，只有显示地调用get方法时，才会去初始化实例，达到lazy loading
 *       
 * @author xianglong.zhang@hand-china.com 
 * @version 1.0
 * @date 2018/6/25 15:25
 */
public class InnerSingleton {
    /**
     * 静态内部类初始化单例
     *
     * @author xianglong.zhang@hand-china.com
     * @version 1.0
     * @date 2018/6/25 15:20
     */
    private static class SingletonHolder {
        private static final InnerSingleton innerSingleton=new InnerSingleton();
    }

    /*
     * 无参构造私有化
     *
     * @author xianglong.zhang@hand-china.com
     * @version 1.0
     * @date 2018/6/25 15:21
     */
    private InnerSingleton(){}

    /**
     * 返回内部类的实例
     *
     * @param
     * @return design.singleton.InnerSingleton
     * @author xianglong.zhang@hand-china.com
     * @name getInnerSingleton
     * @date 2018/6/25 15:22
     * @version 1.0
     */
    public static final InnerSingleton getInnerSingleton(){
        return SingletonHolder.innerSingleton;
    }
}
