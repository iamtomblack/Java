public class Animal {
    public Animal() {
    }
    public Animal(String strSkin) {
        skin = strSkin;
    }
    public boolean live = true;
    public String skin = "";

    public void eat() {
        System.out.println("动物需要吃食物");
    }
    public void move() {
        System.out.println("动物会运动");
    }
}
