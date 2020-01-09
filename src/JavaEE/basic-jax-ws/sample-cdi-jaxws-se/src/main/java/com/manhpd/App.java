package com.manhpd;

import com.manhpd.service.SimpleEvent;
import com.manhpd.service.StartupService;
import com.manhpd.soap_api.WsReceiver;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.xml.ws.Endpoint;


public class App {
    public static void main(String[] args) {
        WsReceiver receiver = new WsReceiver();
        Endpoint service = Endpoint.publish("http://localhost:9901/wsreceiver", receiver);

        SeContainerInitializer initializer = SeContainerInitializer.newInstance();

        // disable discovery and register bean classes manually
        SeContainer container = initializer.initialize();
        container.getBeanManager().fireEvent(new SimpleEvent());
    }
}