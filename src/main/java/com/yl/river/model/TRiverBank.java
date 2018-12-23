package com.yl.river.model;

public class TRiverBank {
    private String id;

    private String name;

    private String type;

    private String lonlats;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getLonlats() {
        return lonlats;
    }

    public void setLonlats(String lonlats) {
        this.lonlats = lonlats == null ? null : lonlats.trim();
    }
}