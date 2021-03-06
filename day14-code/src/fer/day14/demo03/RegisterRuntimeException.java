package fer.day14.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/12/5 18:04
 **/
public class RegisterRuntimeException extends RuntimeException{

    // 添加一个空参数的构造方法
    public RegisterRuntimeException() {
    }

    /*
       添加一个带异常信息的构造方法
       查看源码发现，所有的异常类都会有一个带异常信息的构造方法，方法内部会调用父类带异常信息的构造方法，让父类来处理这个异常信息
    */
    public RegisterRuntimeException(String message) {
            super(message);
        }
}
