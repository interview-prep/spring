package com.org.interview.sandeep.samples.di;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
import java.util.logging.Logger;

/**
 * Created by SMALA on 10/8/2015.
 */
public class TypeChatMessage implements MessageService, InitializingBean, DisposableBean {
    // private static final Logger logger = (Logger) LoggerFactory.getLogger(TypeChatMessage.class);
    private static final Logger log = Logger.getLogger("TypeChatMessage.class");
    private String messageOne;
    private String messageTwo;

    @Autowired
    private Set<String> messages;

    public TypeChatMessage(String msg1, String msg2) {
        this.messageOne = msg1;
        this.messageTwo = msg2;
//        messages = new ArrayList<String>();
    }

    @Override
    public String getMessageOne() {
        return messageOne + "||" + messageTwo;
    }

    public void setMessages(Set<String> messages) {
        this.messages = messages;
    }

    @Override
    public Set<String> getMessages() {
        return messages;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("InitializingBean.afterPropertiesSet : " + this.getClass());
    }

    public void create() {
        log.info("create : " + this.getClass());
    }

    @Override
    public void destroy() throws Exception {
        log.info("DisposableBean.destroy : " + this.getClass());
    }

    public void destroyUserDefined() {
        log.info("destroy : " + this.getClass());
    }

}
