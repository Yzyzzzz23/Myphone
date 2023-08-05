package test;
import impl.AptitudeHandset;
import impl.CommonHandset;

public class testPhone {
    public static void main(String[] args) {
        CommonHandset comm=new CommonHandset("索尼爱立信", "G502c");
        comm.info();
        comm.play("热血");
        comm.sendInfo();
        comm.call();
        System.out.println();
        AptitudeHandset apt=new AptitudeHandset("I9100", "HTC");
        apt.info();
        apt.netWorkConn();
        apt.play("小时代");
        apt.takePictures();
        apt.sendInfo();
        apt.call();}
}
