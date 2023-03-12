class MainClass{
    public static void main(String ary[]){
        int a =5;
        for(int b=1;b<=a;b++){
            for(int c=1;c<=a;c++){
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=a;c++){
                if(b==1||b==a||c==1||c==a){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=b;c++){
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            for(int c=1;c<=b;c++){
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
        for(int b=a;b>=1;b--){
            for(int c=b;c>=1;c--){
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
        for(int b=a;b>=1;b--){
            for(int c=a-b;c>=1;c--){
                System.out.print(" ");
            }
            for(int c=b;c>=1;c--){
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=b;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            for(int c=b;c>=1;c--){
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=a-b+1;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println();
        int number=1;
        for(int b=1;b<=a;b++){
            for(int c=1;c<=b;c++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=b;c++){
                int sum =b+c;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            for(int c=1;c<=a;c++){
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            for(int c=1;c<=b;c++){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            for(int c=b;c>=1;c--){
                System.out.print(c);
            }
            for(int c=2;c<=b;c++){
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=b;c++){
                System.out.print("x");
            }
            for(int c=1;c<=2*(a-b);c++){
                System.out.print(" ");
            }
            for(int c=1;c<=b;c++){
                System.out.print("x");
            }
            System.out.println();
        }
        for(int b=a;b>=1;b--){
            for(int c=1;c<=b;c++){
                System.out.print("x");
            }
            for(int c=1;c<=2*(a-b);c++){
                System.out.print(" ");
            }
            for(int c=1;c<=b;c++){
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            for(int c=1;c<=2*b-1;c++){
                System.out.print("x");
            }
            System.out.println();
        }
        for(int b=a;b>=1;b--){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            for(int c=1;c<=2*(a-b);c++){
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=b;c++){
                if(c==1||c==b){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            for(int c=1;c<=2*(a-b);c++){
                System.out.print(" ");
            }
            for(int c=1;c<=b;c++){
                if(c==1||c==b){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
        for(int b=a;b>=1;b--){
            for(int c=1;c<=b;c++){
                if(c==1||c==b){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            for(int c=1;c<=2*(a-b);c++){
                System.out.print(" ");
            }
            for(int c=1;c<=b;c++){
                if(c==1||c==b){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            for(int c=1;c<=a;c++){
                if(c==1||c==a||b==1||b==a){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int b=0;b<=a;b++){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            int num =1;
            for(int c=0;c<=b;c++){
                System.out.print(num+" ");
                num=num*(b-c)/(c+1);
            }
            System.out.println();
        }
        System.out.println();
        for(int b=0;b<=a;b++){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            int n=1;
            for(int c=0;c<=b;c++){
                System.out.print(n+" ");
                n=n*(b-c)/(c+1);
            }
            System.out.println();
        }
        for(int b=1;b<=a;b++){
            for(int c=1;c<=a-b;c++){
                System.out.print(" ");
            }
            for(int c=1;c<=b;c++){
                System.out.print(b);
            }
            System.out.println();
        }
        System.out.println();
        for(int b=1;b<=a;b++){
            for(int c=1;c<=b-1;c++){
                System.out.print(" ");
            }
            for(int c=a-b+1;c>=1;c--){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
