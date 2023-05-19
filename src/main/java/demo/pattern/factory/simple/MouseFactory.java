package demo.pattern.factory.simple;

import demo.pattern.factory.entity.DellMouse;
import demo.pattern.factory.entity.HpMouse;
import demo.pattern.factory.entity.LenovoMouse;
import demo.pattern.factory.entity.Mouse;

/**
 * 简单工厂实现：
 *
 * 生产mouse的工厂，有个create的方法，根据穿入的参数不同，
 * 可以生产DellMouse、HpMouse、LenovoMouse三种mouse
 *
 * 这四个工厂都继承了接口mouse的sayHi方法，相当于抽象处他们都可以做的事儿
 *
 * 优点：
 * 1、创建不同mouse的细节可以被隐藏在工厂类里，
 * 外人只需要关注传入什么参数获得什么样的mouse即可
 * 不需要知道不同的参数是如何创建不同的mouse的
 *
 * 缺点：
 * 如果有太多的参数对应太多的mouse，就要写很多代码，臃肿
 */
public class MouseFactory {
    public static Mouse  createMouse(int type){
        switch (type) {
            case 0: return new DellMouse();
            case 1: return new HpMouse();
            case 2: return new LenovoMouse();
            default: return new DellMouse();
        }
    }

    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse(1);
        mouse.sayHi();
    }
}
