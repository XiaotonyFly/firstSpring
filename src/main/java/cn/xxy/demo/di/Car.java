package cn.xxy.demo.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xuxiaoyu on 2019/3/15.
 */
public class Car {

//    @Autowired
    private Engine engine;
//    private Wheel wheel;
//    private DiJavaCollection d;

    /*public Car(Double price) {
        System.out.println(price);
    }*/

    /*public Car() {
        System.out.println("mmmmm");
    }*/

    @Autowired
    public Car(Engine engine) {
        System.out.println("My car ...");
        this.engine = engine;
    }

    /*public Car(Wheel wheel) {
        this.wheel = wheel;
    }*/

    /*public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }
    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        System.out.println("set wheel");
        this.wheel = wheel;
    }

    public void setWheel1(DiJavaCollection dd) {
        System.out.println("set wheel111");
        this.d = dd;
    }*/

    /*public Engine getEngine() {
        return engine;
    }*/

//    @Autowired
    /*public void setEngine(Engine engine) {
        System.out.println("engine");
        this.engine = engine;
    }*/

    public void aa() {
        engine.getAnEngine();
    }
}
