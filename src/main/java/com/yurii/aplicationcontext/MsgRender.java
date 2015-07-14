package com.yurii.aplicationcontext;

public interface MsgRender {
    public void render();
    public void setMsgProvider(MsgProvider provider);
    public MsgProvider getMsgProvider();
}
