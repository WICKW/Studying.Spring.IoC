package com.yurii.aplicationcontext;

public class StandartOutMsgRenderer implements MsgRender {

    private MsgProvider msgProvider = null;

    public void render() {
        if(msgProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:"
                    + StandartOutMsgRenderer.class.getName());
        }
        System.out.println(msgProvider.getMsg());
    }

    public void setMsgProvider(MsgProvider provider) {
        this.msgProvider = provider;
    }

    public MsgProvider getMsgProvider() {
        return this.msgProvider;
    }
}
