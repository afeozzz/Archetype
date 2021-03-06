package com.stepango.archetype.player.data.db.response.feed;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Enclosure {

    @Attribute(name = "url")
    public String url;

    @Attribute(name = "type")
    public String type;
}
