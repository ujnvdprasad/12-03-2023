import java.util.*;
public class Functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static int calcSum(int a,int b){
        return a+b;
    }
    public static int calcProd(int c,int d){
        return c*d;
    }
    public static int calcFact(int e){
        int fact =1;
        for(int a=e;a>=1;a--){
            fact=fact*a;
        }
        return fact;
    }
    // public static void checkprimeornot(int f){
    //     if(f%1==0&&f%f==0&&f%2==1&&f%3==1&&f%5==1&&f%7==1&&f%9==1){
    //         System.out.println("prime");
    //     }else{
    //         System.out.println("not a prime");
    //     }
    //     return ;
    // }
    public static void printaverage(int h,int i,int j){
        System.out.println((h+i+j)/3);
        return;
    }
    public static int printsumodd(int k){
        int sumodd =0;
        for(int l=1;l<=k;l++){
            if(l%2==1){
                sumodd=sumodd+l;
            }
        }
        return sumodd;
    }
    public static void printgreater(int m,int n){
        if(m<n){
            System.out.println(n);
        }else{
            System.out.println(m);
        }
        return;
    }
    public static void printcircumference(double rad){
        double circumference =2*1*3.14*rad;
        System.out.println(circumference);
        return;
    }
    public static void printeligibility(int age){
        if(age>18){
            System.out.println("eligible to vote");
        }else{
                System.out.println("not eligible to vote");
            }
        return;
    }
    public static boolean isElligible(int ages) {
        if(ages > 18) {
        return true;
        }
        return false;
        }
    public static void main(String arg[]){
        Scanner ab =new Scanner(System.in);
        String name =ab.nextLine();
        printMyName(name);
        Scanner bc =new Scanner(System.in);
        int a = bc.nextInt();
        int b = bc.nextInt();
        System.out.println(calcSum(a,b));
        Scanner cd =new Scanner(System.in);
        int c = cd.nextInt();
        int d = cd.nextInt();
        System.out.println(calcProd(c,d));
        Scanner de =new Scanner(System.in);
        int e = de.nextInt();
        System.out.println(calcFact(e));
        // int f = de.nextInt();
        // checkprimeornot(f);
        Scanner ef =new Scanner(System.in);
        int h=ef.nextInt();
        int i=ef.nextInt();
        int j=ef.nextInt();
        printaverage(h, i, j);
        Scanner fg = new Scanner(System.in);
        int k=fg.nextInt();
        System.out.println(printsumodd(k));
        Scanner gh = new Scanner(System.in);
        int m=gh.nextInt();
        int n=gh.nextInt();
        printgreater(m, n);
        Scanner ij=new Scanner(System.in);
        double rad =ij.nextDouble();
        printcircumference(rad);
        Scanner jk =new Scanner(System.in);
        int age = jk.nextInt();
        printeligibility(age);
        Scanner kl = new Scanner(System.in);
        int ages = kl.nextInt();
        System.out.println(isElligible(ages));
        // do {
            
        // } while(true);
        int positive=0;
        int negative=0;
        int zeroes =0;
        System.out.println("enter 1 to start & 0 to stop :");
        Scanner lm =new Scanner(System.in);
        int input = lm.nextInt();
        while(input==1){
            System.out.println("enter number : ");
            int num =lm.nextInt();
            if(num>0){
                positive++;
            }else if(num<0){
                negative++;
            }else{
                zeroes++;
            }
            System.out.println("enter 1 to start & 0 to stop :");
            input =lm.nextInt();
        }
        System.out.println("positives : "+ positive);
        System.out.println("negatives : "+ negative);
        System.out.println("zeroes : "+ zeroes);
        Scanner mn=new Scanner(System.in);
        int o=mn.nextInt();
        int p=mn.nextInt();
        int result =1;
        for(int q=1;q<=p;q++){
            result=result*o;
        }
        System.out.println("o to the power p is : "+ result);
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while(n1 != n2){
            if(n1>n2){
                n1 = n1 - n2;
            }else{
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);
        Scanner no = new Scanner(System.in);
        int number1 =no.nextInt();
        int number2 =no.nextInt();
        while(number1!=number2){
            if(number1>number2){
                number1=number1-number2;
            }else{
                number2=number2-number1;
            }
            System.out.println("cd of the number1 & number2 : " +number1);
            System.out.println("cd of the number1 & number2 : " +number2);
        }
        System.out.println("Gcd of the number1 & number2 : " +number1);
        System.out.println("Gcd of the number1 & number2 : " +number2);
    }
}

