package com.yurii.annotationusing;

public interface MsgRender {
    public void render();
    public void setMsgProvider(MsgProvider provider);
    public MsgProvider getMsgProvider();
}
