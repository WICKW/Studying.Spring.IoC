package com.yurii.constructor_injection;

public class ConfigurableMsgProvider implements MsgProvider {
    private String msg;

    public ConfigurableMsgProvider(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
