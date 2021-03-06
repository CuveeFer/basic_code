package fer.day15.demo06;

/**
 * @author: Alivin Fer
 * @date: 2020/12/13 20:12
 **/

/*
    创建多线程程序的第二种方式：实现 Runnable 接口
    java.lang.Runnable
        Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。类必须定义一个称为 run 的无参数方法。
    java.lang.Thread 类的构造方法
        Thread(Runnable target)    分配新的 Thread 对象
        Thread(Runnable target, String name)  分配新的 Thread 对象
    实现步骤：
        1. 创建一个 Runnable 接口的实现类
        2. 在实现类中重写 Runnable 接口的 Run 方法，设置线程任务
        3. 创建一个 Runnable 接口的实现类对象
        4. 创建 Thread 类对象，构造方法中传递 Runnable 接口的实现类对象
        5. 调用 Thread 类中的 start 方法，开启新的线程执行 run 方法
 */

public class Demo01Runnable {
    public static void main(String[] args) {
        // 3. 创建一个 Runnable 实现类对象
        RunnableImpl run = new RunnableImpl();
        // 4. 创建 Thread 对象，构造方法中传递 Runnable 接口的实现类对象
        Thread t = new Thread(run);
        // 5. 调用Thread 类中的 start 方法，开启新的线程执行 run 方法
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
