package fer.day15.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/12/7 11:20
 **/

public class Person {
    private String name;

    public void run() {
        // 定义循环，执行10次
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "-->" + i);
        }
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
