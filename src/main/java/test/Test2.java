package test;

import java.util.Arrays;

/**
 * @author yzhao
 * @date 2022-05-2022/5/15
 */
public class Test2 {
    //私有化构造器
    private Test2() {

    }

//懒汉
    private static Test2 test = null;

    public static Test2 getInstance() {
        synchronized (Test2.class) {
            if (test == null) {
                test = new Test2();
            }
            return test;
        }
    }

    public static void main(String[] args) {
        String[] strs = {"ab","ac","bc"};

        System.out.println(Arrays.toString(strs));
    }
}
