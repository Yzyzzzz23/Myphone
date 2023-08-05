package impl;
import dao.PlayWiring;
import entity.Handset;

public class CommonHandset extends Handset implements PlayWiring{
    public CommonHandset(String brand,String type) {
        super(brand, type);
    }
    @Override
    public void play(String content) {
        System.out.println("正在播放音乐《"+content+"》~~~");
    }
    @Override
    public void sendInfo() {
        System.out.println("发送文字信息~~~");
    }
    @Override
    public void call() {
        System.out.println("开始语音通话~~~");
    }

}
