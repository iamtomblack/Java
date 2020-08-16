package com.wgh;

public class Farm {
    public static void main(String[] args) {
        System.out.println("调用Apple类的harvest方法的结果：");
        Fruit apple = new Apple();
        apple.harvest();
        System.out.println("调用Orange类的harvest方法的结果：");
        Fruit orange = new Orange();
        orange.harvest();
    }
}
