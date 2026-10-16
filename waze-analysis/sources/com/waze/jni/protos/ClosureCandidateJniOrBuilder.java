package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.Position;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface ClosureCandidateJniOrBuilder extends fj {
    Position.IntPosition getFromCoordinate();

    int getFromNode();

    boolean getIsOnRoute();

    int getLineId();

    Position.IntPosition getPolyline(int i2);

    int getPolylineCount();

    List<Position.IntPosition> getPolylineList();

    String getStreetName();

    v getStreetNameBytes();

    int getTileId();

    Position.IntPosition getToCoordinate();

    int getToNode();

    boolean hasFromCoordinate();

    boolean hasFromNode();

    boolean hasIsOnRoute();

    boolean hasLineId();

    boolean hasStreetName();

    boolean hasTileId();

    boolean hasToCoordinate();

    boolean hasToNode();
}
