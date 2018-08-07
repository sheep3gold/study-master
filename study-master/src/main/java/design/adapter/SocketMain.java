package design.adapter;

/**
 * Created by ALEX on 2018/8/6.
 */
public class SocketMain {
    public static void main(String[] args) {
        TwoHoleSocket twoHoleSocket=new SocketAdapter();
        twoHoleSocket.useTwoHoleSocket();
    }
}
