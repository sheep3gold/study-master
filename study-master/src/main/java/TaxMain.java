import java.util.Scanner;

/**
 * Created by ALEX on 2018/8/4.
 */
public class TaxMain {
    public static void main(String[] args)throws Exception{
        System.out.println("请输入工资：");
        Scanner scanner=new Scanner(System.in);
        double mySalary=Double.parseDouble(scanner.nextLine());
        double myTax=getTax(mySalary-3500);
        System.out.println("所需缴纳的税费为："+myTax);
    }

    private static double getTax(double salary){
        double tax=0;
        int taxLevel=1;
        while(salary>0){
            if(taxLevel==1){
                tax+= (salary>1500?1500:salary)*0.03;//45
                salary-=1500;
            }else if(taxLevel==2){
                tax+= (salary>3000?3000:salary)*0.1;//300
                salary-=3000;
            }else if(taxLevel==3){
                tax+= (salary>4500?4500:salary)*0.2;//900
                salary-=4500;
            }else if(taxLevel==4){
                tax+= (salary>26000?26000:salary)*0.25;//6500
                salary-=26000;
            }else if(taxLevel==5){
                tax+= (salary>20000?20000:salary)*0.30;//6000
                salary-=20000;
            }else if(taxLevel==6){
                tax+= (salary>25000?25000:salary)*0.35;//8750
                salary-=25000;
            }else{
                tax+= salary*0.45;//2925
                salary=0;
            }
            taxLevel++;
        }
        return tax;
    }
}
