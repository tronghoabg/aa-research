package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.MapAdObject;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface MapAdObjectOrBuilder extends fj {
    MapAdObject.PinType getPinType();

    int getPinTypeValue();

    Position.IntPosition getPosition();

    String getVenueContext();

    v getVenueContextBytes();

    String getVenueId();

    v getVenueIdBytes();

    boolean hasPinType();

    boolean hasPosition();

    boolean hasVenueContext();

    boolean hasVenueId();
}
