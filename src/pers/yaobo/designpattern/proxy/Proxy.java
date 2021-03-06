package pers.yaobo.designpattern.proxy;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 8:19
 * @description 代理类
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
