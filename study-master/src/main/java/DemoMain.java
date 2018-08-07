import dao.People;
import dao.Student;

/**
 * Created by ALEX on 2018/8/3.
 */
public class DemoMain {

    public static void main(String[] args) {
        // 基本数据类型
        int i=0;
        short i1=0;
        long i2=0;
        float f1= (float) 1.3;
        double do1= 1.3;
        byte by='2';
        boolean boo=true;
        char ch='r';

        // 包装类型
        Long long1=1L;

        String str="123";

        str="456";
        StringBuilder sb = new StringBuilder("123");
        sb.append("345");
        StringBuffer sbf=new StringBuffer("789");

        Object obj = sb;

        Class cla=sb.getClass();

        People p=new People();

        Student stu=new Student();
        stu.setName("张三");

        System.out.println(stu.getName());

        if(1==1){

        }



        for(int j=0;j<10;j++){

        }

        while(true){
            break;
        }


    }
}
