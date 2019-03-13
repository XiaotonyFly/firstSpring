package cn.xxy.demo;

/**
 * Created by xuxiaoyu on 2019/3/13.
 */
public class HelloWorld {
    private String message;
    private String messageParent;

    public void init() {
        System.out.println("bean 初始化");
    }

    public void destroy() {
        System.out.println("bean 销毁");
    }

    public String getMessage() {
        System.out.println("You message: " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageParent() {
        System.out.println(messageParent);
        return messageParent;
    }

    public void setMessageParent(String messageParent) {
        this.messageParent = messageParent;
    }
}
