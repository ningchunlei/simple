package com.xuanniu.business.simple.service.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/6/19.
 */
public class Message implements Serializable {

    private Integer id;
    private String say;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", say='" + say + '\'' +
                '}';
    }
}
