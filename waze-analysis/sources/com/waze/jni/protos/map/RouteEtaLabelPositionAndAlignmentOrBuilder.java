package com.waze.jni.protos.map;

import com.google.v.fj;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.Marker;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface RouteEtaLabelPositionAndAlignmentOrBuilder extends fj {
    Marker.Alignment getAlignment();

    int getAlignmentValue();

    long getPolylineId();

    Position.IntPosition getPosition();

    boolean hasPosition();
}
