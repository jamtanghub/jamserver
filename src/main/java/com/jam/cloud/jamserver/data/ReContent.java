package com.jam.cloud.jamserver.data;

import lombok.Data;

import java.io.Serializable;
import java.util.concurrent.RecursiveAction;

@Data
public class ReContent implements Serializable {
    private String uid;
    private boolean status;
    private int code;
    private Object content;
    private Object msg;
    private String debug;
    private String rediect;


    public static ReContent succ(){
        ReContent re = new ReContent();
        re.setCode(200);
        re.setStatus(true);
        re.setMsg("请求成功");
        return re;
    }

    public static ReContent fail(){
        ReContent re = new ReContent();
        re.setCode(500);
        re.setStatus(false);
        re.setMsg("请求失败");
        return re;
    }
}
