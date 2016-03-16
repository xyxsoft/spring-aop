package com.xyxsoft.spring.ioc.beans;

/**
 * 用于bean的属性注入
 * @author xyxsoft@126.com
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
