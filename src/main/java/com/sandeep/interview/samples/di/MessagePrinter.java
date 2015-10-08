package com.sandeep.interview.samples.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by SMALA on 10/8/2015.
 */

public class MessagePrinter {


    final private MessageService service;

    // Autowire with wire byName and wire byType. It will try by type if found that will init. else it will try by name.
    // If multiple bean id's with same class then we need to use qualifier.
    @Autowired
//    @Qualifier("chatMessage") // this annotation is required when we have Ambiguous bean ids.
    private TypeChatMessage chatMessage;

    @Autowired
//    @Qualifier("chatMessage")
    // this annotation is required when we have Ambiguous bean ids.
    private TypeChatMessage chatMessageOne;

    /**
     * @Qualifier will decide bean wiring by name. This will avoid the conflict of bean creation by Name.
     * 'chatMessage' and 'chatMessageOne' will give same hashcode if it is tied with "chatMessage" bean and scope is singletone
     * 'chatMessage' and 'chatMessageOne' will give different hashcode if it is tied with "chatMessage" bean and scope is prototype!
     * prototype create different object for different injections
     */

    // @Resource :  is not applicable because it is autowire by name only.
    // @Qualifier(value = "chatMessage")  : is not applicable because it is autowire by name only. It should be added with dependency object
    @Autowired
    public MessagePrinter(@Qualifier("printMessage") MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessageOne());
        System.out.println(this.chatMessage.getMessageOne());
        System.out.println(chatMessage.hashCode());
        chatMessage = null;
        System.out.println(chatMessageOne.hashCode());
    }
}
