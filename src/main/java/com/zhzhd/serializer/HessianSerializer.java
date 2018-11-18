package com.zhzhd.serializer;

/**
 * @Author:zhzhd
 * @Date:2018-11-18
 * @Despriction:Jrpc
 */
public class HessianSerializer implements Serializer {
    @Override
    public <T> byte[] serialize(T object) {
        return new byte[0];
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        return null;
    }
}
