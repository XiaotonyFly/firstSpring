package cn.xxy.demo;

/**
 * Created by xuxiaoyu on 2019/3/13.
 */
public class HelloWorld {
    private String message;

    public String getMessage() {
        System.out.println("You message: " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
