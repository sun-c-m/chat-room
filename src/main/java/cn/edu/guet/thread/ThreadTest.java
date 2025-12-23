package cn.edu.guet.thread;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        //写要实现的内容
        System.out.println(Thread.currentThread().getName()+"线程启动了");
    }
}