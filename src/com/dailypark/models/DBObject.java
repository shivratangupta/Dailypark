package com.dailypark.models;

public abstract class DBObject {
    private final long uid; // unique id
    private static long NEW_UID = 0;
    public DBObject() {
        this.uid = NEW_UID++;
    }

    public long getUid() {
        return uid;
    }
}
