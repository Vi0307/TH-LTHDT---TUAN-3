import java.util.Scanner;
public class bai4 {
    static Scanner sc;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat:");
            double a=sc.nextDouble();
        System.out.println("Nhap vao so thu hai:");
            double b=sc.nextDouble();
        System.out.println("Nhap vao so thu ba:");
            double c=sc.nextDouble();
        double min=a;
        if(min>b){
            min=b;
        }
        if(min>c){
            min=c;
        }
        System.out.println("So nho nhat la: "+min);
    }
}
