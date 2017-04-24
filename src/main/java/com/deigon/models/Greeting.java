package com.deigon.models;

/**
 * Created by lenna on 4/21/2017.
 * this class will return and fill in the greeting.html template
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
