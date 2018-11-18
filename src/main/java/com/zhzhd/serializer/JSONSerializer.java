package com.zhzhd.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @Author:zhzhd
 * @Date:2018-11-18
 * @Despriction:Jrpc
 */
public class JSONSerializer implements Serializer{

    @Override
    public <T> byte[] serialize(T object) {
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSON.toJSONString(object, SerializerFeature.WriteDateUseDateFormat)
                .getBytes();
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        return (T) JSON.parseObject(new String(data), clazz);
    }
}
