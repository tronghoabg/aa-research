package com.waze.jni.protos.map;

import com.google.v.fj;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface MapLineIntersectionMetadataOrBuilder extends fj {
    float getAzimuth();

    Position.IntPosition getCoordinate();

    int getDistanceMeters();

    MapLine getMapLine();

    boolean hasCoordinate();

    boolean hasMapLine();
}
