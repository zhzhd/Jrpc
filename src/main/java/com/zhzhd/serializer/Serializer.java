package com.zhzhd.serializer;

/**
 * @Author:zhzhd
 * @Date:2018-11-18
 * @Despriction:Jrpc
 */
public interface Serializer {

    /**
     * 序列化
     * @param object 需要序列化的对象
     * @param <T> 序列化后的字节码
     * @return
     */
    <T> byte[] serialize(T object);


    /**
     * 反序列化
     * @param data 需要反序列化的数据
     * @param clazz 序列化对象class
     * @param <T>
     * @return
     */
    <T> T deserialize(byte[] data, Class<T> clazz);
}
