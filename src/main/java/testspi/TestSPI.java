package testspi;

import java.util.ServiceLoader;

/**
 * @author weiguoyuan 2019/5/6
 */
public class TestSPI {
    public static void main(String[] args){
        ServiceLoader<Dog> loaders = ServiceLoader.load(Dog.class);
        for (Dog d : loaders){
            d.sleep();
        }
    }
}
