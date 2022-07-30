package test;

/**
 * @author yzhao
 * @date 2022-05-2022/5/15
 */
public class Test {
    //私有化构造器
    private Test(){

    }
//饿汉
    private static Test test = new Test();

    public static Test getInstance(){
        synchronized (Test.class){
            if(test == null){
                test = new Test();
            }
            return test;
        }
    }
}
