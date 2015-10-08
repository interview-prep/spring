package com.sandeep.interview.samples.di;

/**
 * Created by SMALA on 10/8/2015.
 */
public class TypeChatMessage implements MessageService {

    private String messageOne;
    private String messageTwo;

    public TypeChatMessage(String msg1, String msg2) {
        this.messageOne = msg1;
        this.messageTwo = msg2;
    }

    @Override
    public String getMessageOne() {
        return messageOne + "||" + messageTwo;
    }
}
