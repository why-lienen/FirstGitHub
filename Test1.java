package duoxiancheng.lianxi;

public class Test1 {
    public static void main(String[] args) {
//        MyThread myThread=new MyThread();
//        MyThread myThread2=new MyThread();
//        myThread.start();
//        myThread2.start();
        Runnable runnable=new MyThread2();
        Thread thread=new Thread(runnable,"111");
        Thread thread2=new Thread(runnable);
        thread.start();
        thread2.start();
    }
}
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            if(i==1){
                Thread.yield();
            }
        }
    }
}