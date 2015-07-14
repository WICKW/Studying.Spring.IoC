package com.yurii.annotationusing;

import org.springframework.stereotype.Service;

@Service("msgProvider")
public class HelloWorldMsgProvider implements MsgProvider {
    public String getMsg() {
        return "Hello WORLD_";
    }
}
