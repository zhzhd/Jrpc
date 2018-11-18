package com.zhzhd.serializer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * @Author:zhzhd
 * @Date:2018-11-18
 * @Despriction:Jrpc
 */
public class XmlSerializer implements Serializer{

    private static final XStream xStream = new XStream(new DomDriver());

    @Override
    public <T> byte[] serialize(T object) {
        return xStream.toXML(object).getBytes();
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        String xml = new String(data);
        return (T) xStream.fromXML(xml);
    }
}
