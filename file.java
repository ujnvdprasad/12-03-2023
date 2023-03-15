import java.util.Scanner;

class MainClass{
    public static void main(String ary[]){
        System.out.println("Hello World");
        System.out.print("Hello World\n");
        System.out.print("Hello World");
        System.out.println();
        int a=45;
        int b=15;
        int sum=a+b;
        int diff=b-a;
        int prod=a*b;
        int div=b/a;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(div);
        Scanner ab=new Scanner(System.in);
        String c=ab.next();
        Scanner bb=new Scanner(System.in);
        String d=bb.nextLine();
        System.out.println(c);
        System.out.println(d);
        Scanner bc=new Scanner(System.in);
        int e=bc.nextInt();
        int f=bc.nextInt();
        int add=e+f;
        System.out.println(add);
        for(int g=1;g<=10;g++){
        System.out.println("Hello World");
        }
        int g=1;
        while(g<=10){
        System.out.println("Hello");
        g++;
        }
        int h=1;
        do{
        System.out.println("World");
        h++;
        }while(h<=10);
        Scanner cd=new Scanner(System.in);
        int age=cd.nextInt();
        if(age>18){
        System.out.println("Adult");
        }else{
        System.out.println("Not a Adult");
        }
        Scanner de=new Scanner(System.in);
        int ages=de.nextInt();
        if(ages<18){
        System.out.println("Kid");
        }
        else if(ages>=18&&ages<=25){
        System.out.println("Teen");
        }
        else{
        System.out.println("Adult");
        }
        for(int i=0;i<=10;i++){
        System.out.println(i);
        }
        Scanner ef=new Scanner(System.in);
        int i=ef.nextInt();
        for(int j=1;j<=i;j++){
        System.out.println(j);
        }
        int sumn=0;
        for(int j=1;j<=i;j++){
            sumn+=j;
        }
        System.out.println(sumn);
        Scanner fg=new Scanner(System.in);
        int k=fg.nextInt();
        for(int j=1;j<=10;j++){
            System.out.println(k*j);
        }
//         int l=4;
//         int m=5;
//         for(int n=1;n<=l;n++){
//             for(int o=1;o<=m;o++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         int n=4;
//         int o=5;
//         for(int p=1;p<=n;p++){
//             for(int q=1;q<=o;q++){
//                 if(p==1||q==1||p==n||q==o){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         int p=4;
//         for(int q=1;q<=p;q++){
//             for(int r=1;r<=q;r++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         int q=4;
//         for(int r=q;r>=1;r--){
//             for(int s=r;s>=1;s--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         int r=4;
//         for(int s=1;s<=r;s++){
//             for(int t=1;t<=r-s;t++){
//                 System.out.print(" ");
//             }
//             for(int t=1;t<=s;t++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         int s=5;
//         for(int t=1;t<=s;t++){
//             for(int u=1;u<=t;u++){
//                 System.out.print(u);
//             }
//             System.out.println();
//         }
//         for(int t=1;t<=s;t++){
//             for(int u=1;u<=s-t;u++){
//                 System.out.print(" ");
//             }
//             for(int u=1;u<=t;u++){
//                 System.out.print(u);
//             }
//             System.out.println();
            int l=4,m=5;
            for(int n=1;n<=l;n++){
                for(int o=1;o<=m;o++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int n=1;n<=l;n++){
                for(int o=1;o<=m;o++){
                    if(n==1||o==1||n==l||o==m){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            int n=4;
            for(int o=1;o<=n;o++){
                for(int p=1;p<=o;p++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int o=n;o>=1;o--){
                for(int p=o;p>=1;p--){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int o=1;o<=n;o++){
                for(int p=1;p<=n-o;p++){
                    System.out.print(" ");
                }
                for(int p=1;p<=o;p++){
                    System.out.print("*");
                }
                System.out.println();
            }
            int o=5;
            for(int p=1;p<=o;p++){
                for(int q=1;q<=p;q++){
                    System.out.print(q);
                }
                System.out.println();
            }
            for(int p=1;p<=o;p++){
                for(int q=1;q<=o-p+1;q++){
                    System.out.print(q);
                }
                System.out.println();
            }
            for(int p=o;p>=1;p--){
                for(int q=p;q>=1;q--){
                    System.out.print(q);
                }
                System.out.println();
            }
            int number=1;
            for(int p=1;p<=o;p++){
                for(int q=1;q<=p;q++){
                    System.out.print(number+" ");
                    number++;
                }
                System.out.println();
            }
            for(int p=1;p<=o;p++){
                for(int q=1;q<=p;q++){
                    int sumpq=p+q;
                    if(sumpq%2==0){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
    }
