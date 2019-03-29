package cn.xxy.demo.di;

/**
 * Created by xuxiaoyu on 2019/3/15.
 */
public class Car {

    private Engine engine;
    private Wheel wheel;
    private DiJavaCollection d;

    /*public Car(Double price) {
        System.out.println(price);
    }*/

    /*public Car(Engine engine) {
        System.out.println("My car ...");
        this.engine = engine;
    }*/

    /*public Car(Wheel wheel) {
        this.wheel = wheel;
    }*/

    /*public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }*/
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
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void aa() {
        engine.getAnEngine();
    }
}
