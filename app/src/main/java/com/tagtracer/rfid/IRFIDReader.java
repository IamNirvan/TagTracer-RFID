package com.tagtracer.rfid;

import com.rscja.deviceapi.entity.Gen2Entity;
import com.tagtracer.models.RFIDTag;
import com.tagtracer.util.IDisposable;

import java.util.Map;
import java.util.Queue;

public abstract class IRFIDReader implements IDisposable {
    private Queue<RFIDTag> queue;
    public boolean readTag;

    public abstract Queue<RFIDTag> getQueue();
    //
    // Power level
    //
    public abstract boolean setPowerLevel(int power) throws RuntimeException;
    public abstract int getPowerLevel() throws RuntimeException;
    //
    // Session
    //
    public abstract boolean setGen2(Gen2Entity entity) throws RuntimeException;
    public abstract Gen2Entity getGen2() throws RuntimeException;
    public abstract boolean setSession(int sessionId, int target) throws RuntimeException;
    public abstract Map<String, Integer> getSession() throws RuntimeException;
    //
    // Inventory
    //
    public abstract boolean startInventory() throws RuntimeException;
    public abstract boolean stopInventory() throws RuntimeException;
}
