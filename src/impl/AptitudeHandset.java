package impl;
import dao.Network;
import dao.PlayWiring;
import dao.TheakePictures;
import entity.Handset;

public class AptitudeHandset extends Handset implements Network,PlayWiring,TheakePictures{

    public AptitudeHandset(String brand,String type) {
        super(brand, type);
    }
    @Override
    public void takePictures() {
        System.out.println("咔嚓。。。拍照成功~~~");
    }
    @Override
    public void play(String content) {
        System.out.println("正在播放视频《"+content+"》~~~~");
    }
    @Override
    public void netWorkConn() {
        System.out.println("已经启动移动网络~~~");
    }
    @Override
    public void sendInfo() {
        System.out.println("正在发送带图片与文字的信息~~~");
    }
    @Override
    public void call() {
        System.out.println("开始视频通话~~~");
    }
}
