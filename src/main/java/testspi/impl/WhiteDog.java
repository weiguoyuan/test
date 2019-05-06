package testspi.impl;


import testspi.Dog;

/**
 * @author weiguoyuan 2019/5/6
 */
public class WhiteDog implements Dog {
    @Override
    public void sleep() {
        System.out.println("white dog sleep");
    }
}
