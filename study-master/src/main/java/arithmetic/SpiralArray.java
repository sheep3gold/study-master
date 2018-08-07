package arithmetic;

/**
 * 螺旋打印N阶矩阵
 *
 * @author xianglong.zhang@hand-china.com
 * @version 1.0
 * @date 2018/7/30 16:56
 */
public class SpiralArray {

    public static void main(String[] args) {

        // 生成矩阵
        // 阶数
        int rank=300;
        // 定义数组
        int[][] array=new int[rank][rank];
        // 实际横坐标
        int x=0;
        // 实际纵坐标
        int y=0;
        // 横向偏移量
        int xMove =1;
        // 纵向偏移量
        int yMove =0;
        // 当前方向偏移总量，随着循环递减
        int maxMove=rank;
        int maxValue=rank;

        // 循环塞值
        for(int index=1;index<=rank*rank;index++){
            // 赋值
            array[y][x]=index;

            // 执行到尾部改变偏移方向
            if(index==maxValue){
                // 执行到尾部改变方向
                if(xMove!=0){
                    // 当前是横向
                    // 纵向设为横向
                    yMove=xMove;
                    // 横向设为0
                    xMove=0;
                    // 横向变纵向时，减一最大偏移量
                    maxMove--;
                } else {
                    xMove=-yMove;
                    yMove=0;
                }
                // 改变偏移最大值
                maxValue+=maxMove;
            }
            // 位置改变
            x+=xMove;
            y+=yMove;
        }

        // 打印数组
        for(int i=0;i<rank;i++){
            String line="";
            for(int j=0;j<rank;j++){
                line+=String.valueOf(array[i][j]);
                if(array[i][j]<10){
                    line+="    ";
                }else if(array[i][j]<100){
                    line+="   ";
                }else if(array[i][j]<1000){
                    line+="  ";
                }else {
                    line+=" ";
                }
            }
            System.out.println(line);
        }

    }

}
