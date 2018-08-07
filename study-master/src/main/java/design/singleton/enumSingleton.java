package design.singleton;

/**
 * 枚举实现单例，优点：解决其他四种方法都不能解决的接口序列化问题，并且枚举类本身就是线程安全的，可以说是完美
 *
 * @author xianglong.zhang@hand-china.com
 * @version 1.0
 * @date 2018/6/25 15:40
 */
public enum enumSingleton {
    INSTANCE;
}
