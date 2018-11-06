package com.zhzhd.test;

import com.zhzhd.client.RPCClient;
import com.zhzhd.service.Service;
import com.zhzhd.service.impl.ServiceCenter;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 *@author zhangzhendong1
 *@date 2018/11/6
 *@package com.zhzhd.test
 *@describe
 **/
public class RPCTest {
    public static void main(String[] args) throws IOException {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Service serviceService = new ServiceCenter(8088);
                    serviceService.register(HelloService.class, HelloServiceImpl.class);
                    serviceService.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHi("test"));
    }
}