package service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {
    public String getmessage(int score){
        String msg="";
        if(score>=95){
            msg="你的人品真是极品了..你就是上帝吧..";
        }else if(score>=80){
            msg="你的人品真好..做好事应该是你的信仰吧..";
        }else if(score >= 65){
            msg="你的人品还行..应该是个五好青年..";
        }else if(score >= 45){
            msg="你的人品比较普通..那就继续普通下去吧..";
        }else if(score >= 30){
            msg="你的人品有点小低哦..去当个雷锋吧..";
        }else{
            msg="你的人品有点差..今天还是别出门了..";
        }
        return msg;
    }
}
