package com.iqmsoft.websocket.producer;

public class ProducerBootstrap {

    public static void main(String[] args) throws Exception {

        new Thread(new Producer()).start();

    }
}
