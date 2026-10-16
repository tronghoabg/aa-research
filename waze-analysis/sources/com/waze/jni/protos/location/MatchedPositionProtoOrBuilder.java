package com.waze.jni.protos.location;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface MatchedPositionProtoOrBuilder extends fj {
    double getAccuracyMeters();

    long getFromNodeDbId();

    Position.IntPosition getPosition();

    String getStreetName();

    v getStreetNameBytes();

    long getToNodeDbId();

    boolean hasPosition();

    boolean hasStreetName();
}
