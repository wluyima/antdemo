package com.amiyul;

import org.apache.commons.lang.StringUtils;
import com.amiyul.messaging.MessageService;

public class Helloworld {

    public String sayHello() {
        return new MessageService().getMessage(StringUtils.trim("World"));
    }
    
}