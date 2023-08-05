package entity;

public abstract class Handset {
    private String brand;
    private String type;//构造方法
    //无参方法
    public Handset() {}
    //带参方法
    public Handset(String brand,String type) {
        this.brand=brand;
        this.type=type;
    }
    //手机的自白
    public void info() {
        System.out.println("这是一款型号为"+type+"的"+brand+"手机~~~");
    }
    //发送信息
    public void sendInfo() {
        System.out.println("发送文字信息~~~");
    }
    //打电话
    public void call() {
        System.out.println("正在打电话~~~");
    }
}
