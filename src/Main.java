import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        //q1
//        Scanner scanner=new Scanner(System.in);
//       String name=scanner.nextLine();
//        String id=scanner.nextLine();
//        User user=new User(id,name);
//        System.out.println(user);



        //q2
//        boolean flag = false;
//        int bigMatrix[][] = new int[40][40];
//        int smallMatrix[][] = new int[10][10];
//        for (int i = 0; i < bigMatrix.length / 2; i++) {
//            for (int j = 0; j < bigMatrix.length / 2; j++) {
//                bigMatrix[i][j] = i + j + 1;
//            }
//        }
//        for (int i = 0; i < smallMatrix.length / 2; i++) {
//            for (int j = 0; j < smallMatrix.length / 2; j++) {
//                smallMatrix[i][j] = i + j + 1;
//            }
//        }
//
//        for (int i = 0; i < bigMatrix.length - smallMatrix.length + 1; i++) {
//            for (int j = 0; j < bigMatrix[0].length - smallMatrix[0].length + 1; j++) {
//                if (bigMatrix[i][j] == smallMatrix[0][0]) {
//                    flag = true;
//                    for (int x = 0; x < smallMatrix.length; x++) {
//                        for (int y = 0; y < smallMatrix[0].length; y++) {
//                            if (bigMatrix[i + x][j + y] != smallMatrix[x][y]) {
//                                flag = false;
//                                break;
//                            }
//                        }
//                    }
//                    if (flag) {
//                        return;
//                    }
//                }
//            }
//        }


//        //q3
//        Scanner scanner=new Scanner(System.in);
//        int a=scanner.nextInt();
//        ArrayList<Thread>threads=new ArrayList<>();
//            Thread thread1=new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName()+" "+ (a-2));
//                }
//            });
//        threads.add(thread1);
//        Thread thread2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName()+" "+ (a+2));
//            }
//        });
//        threads.add(thread2);
//        Thread thread3=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName()+" "+( a*2));
//            }
//        });
//        threads.add(thread3);
//        Thread thread4=new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                System.out.println(Thread.currentThread().getName()+" "+( a/2));
//            }
//        });
//        threads.add(thread4);
//        for (Thread t:threads) {
//            t.start();
//        }
//        for (Thread t:threads) {
//            try {
//                t.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(Thread.currentThread().getName()+" "+  "finnish");


//        //q4
//        Scanner scanner=new Scanner(System.in);
//        double n=scanner.nextDouble();
//        double x=scanner.nextDouble();
//        double tempN=n;
//        double tempx=x;
//        double  sum=0;
//        for (int i = 0; i < n; i++) {
//            tempN=factorial(tempN);
//            for (int j = 0; j < x; j++) {
//                tempx=Math.pow(tempx,2);
//            }
//            if (i%2==0)
//                sum+=tempx/tempN;
//            else
//                sum-=tempx/tempN;
//            }
//        System.out.println(sum);
//        }
//    public static double factorial(double n){
//        if (n <= 1){
//            return 1;
//        }
//        return n * factorial(n-1);
//    }
       }

}

