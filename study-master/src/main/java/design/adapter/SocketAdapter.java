package design.adapter;

/**
 * Created by ALEX on 2018/8/6.
 */
public class SocketAdapter extends ThreeHoleSocketImpl implements TwoHoleSocket {
    @Override
    public void useTwoHoleSocket() {
        useThreeHoleSocket();
    }
}
