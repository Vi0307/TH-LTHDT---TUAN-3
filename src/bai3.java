import java.util.Scanner;
public class bai3 {
    static Scanner sc;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        System.out.println("Nhap so thu nhat:");
            double a=sc.nextDouble();
        System.out.println("Nhap so thu hai:");
            double b=sc.nextDouble();
        System.out.println("Nhap so thu ba:");
            double c=sc.nextDouble();
        double D=b*b - 4*a*c;
        if(D>0){
            double x1=(-b+Math.sqrt(D))/(2*a);
            double x2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("Phuong trinh co hai nghiem:"+x1+"va"+x2);
        }
        else if(D==0){
            double x=-b/(2*a);
            System.out.println("Phuong trinh co 1 nghiem duy nhat:"+x);
        }
        else{
            System.out.println("Phuong trinh vo nghiem");
            }
    }
}
