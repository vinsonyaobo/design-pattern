package pers.yaobo.designpattern.decorator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/18 14:09
 * @description 具体装饰类1
 */
public class ConcreteDecorator1 extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象1的操作");
    }

    private void addedBehavior() {
        System.out.println("具体装饰对象1的额外行为，以区别装饰对象2");
    }
}
