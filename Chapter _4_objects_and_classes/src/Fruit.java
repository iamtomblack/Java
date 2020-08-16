public class Fruit {
    public String color = "绿色";//定义颜色成员变量公共变量
    //public static String flavor;//申明静态变量
    //public final boolean STATE = true;//声明**变量**STATE并赋值

    //定义种植成员方法
    //public void plant() {
    //    System.out.println("果树正在种植......");
    //}

    //定义生长成员方法
    //public void grow() {
    //    System.out.println("果树正在生长......");
    //    final boolean STATE;
    //}

    //定义收获的成员方法
    public void harvest() {
        String color = "红色";
        System.out.println("水果是"+color+"的！");
        System.out.println("水果原来是："+this.color+"的！");
    }
}
