package com.zhzhd.service;
import java.io.IOException;

/**
 *@author zhangzhendong1
 *@date 2018/11/6
 *@package com.zhzhd.service
 *@describe
 **/
public interface Service {
    void stop();

    void start() throws IOException;

    void register(Class serviceInterface, Class impl);

    boolean isRunning();

    int getPort();
}