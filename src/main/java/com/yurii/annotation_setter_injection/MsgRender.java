package com.yurii.annotation_setter_injection;

public interface MsgRender {
    public void render();
    public void setMsgProvider(MsgProvider provider);
    public MsgProvider getMsgProvider();
}
