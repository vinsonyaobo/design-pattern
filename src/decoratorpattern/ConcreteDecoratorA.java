package decoratorpattern;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/18 14:09
 * @description 具体装饰对象A
 */
public class ConcreteDecoratorA extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象A的操作");
    }

    private void addedBehavior() {
        System.out.println("具体装饰对象A的额外行为，以区别B");
    }
}
