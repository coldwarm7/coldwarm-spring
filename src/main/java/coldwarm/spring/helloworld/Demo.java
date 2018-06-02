package coldwarm.spring.helloworld;

/**
 * Create by coldwarm on 2018/6/2.
 */

public class Demo {
    private HelloWorld helloWorld;

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void add(){
        System.out.println("jimu");

        helloWorld.getMessage();
    }


    //    private String name ;
//
//    //构造参数
//    public Demo(String name) {
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//
//    public void getMessage(){
//        System.out.println(name);
//    }

}
