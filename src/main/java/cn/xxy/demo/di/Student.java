package cn.xxy.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by xuxiaoyu on 2019/4/9.
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

//    @Required(注：该注解以弃用)
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

//    @Required
//    @Autowired(required = false)
    public void setAge(int age) {
        this.age = age;
    }
}
