package fer.day02.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/10/9 19:22
 **/

/*
数组：一种容器，可以同时存放多个数据值

数组的特点：
1. 数组是一种引用数据类型
2. 数组当中的多个数据，类型必须统一
3. 数组的长度在程序运行期间不可改变

数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值

两种常见的初始化方式：
1. 动态初始化（指定长度）：在创建数据的时候，直接指定数组当中的数据元素个数
2. 静态初始化（指定内容）：在创建数组的时候，不直接指定数据个数多少，而是直接将具体的数据内容进行指定

动态初始化数组的格式：
数据类型[] 数组名称 = new 数据类型[数组长度];
 */
public class Demo01Array {
    public static void main(String[] args) {
        // 创建一个数组，存放 100 个 int 型数据
        int[] arrayA = new int[100];

        // 创建一个数组，存放 10 个 double 型数据
        double[] arrayB = new double[10];

        // 创建一个数组，存放 5 个字符串
        String[] arrayC = new String[5];

    }
}
