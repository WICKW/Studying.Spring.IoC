package com.yurii.annotation_setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("msgRenderer")
public class StandartOutMsgRenderer implements MsgRender {

    private MsgProvider msgProvider = null;

    public void render() {
        if(msgProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:"
                    + StandartOutMsgRenderer.class.getName());
        }
        System.out.println(msgProvider.getMsg());
    }

    @Autowired
    public void setMsgProvider(MsgProvider provider) {
        this.msgProvider = provider;
    }

    public MsgProvider getMsgProvider() {
        return this.msgProvider;
    }
}
