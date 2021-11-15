package code;


/**
 * ClassName: HelloWorld
 * Package: code
 * Description:
 * Date: 2021/11/15 18:03
 * Author:1220024221.njupt.edu.cn
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(sayHello("张三"));
    }

    public  static  String sayHello(String s){
       return "hello "+s;
    }
}
