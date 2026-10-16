package com.waze.jni.protos;

import com.google.v.fj;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NavigationSegmentOrBuilder extends fj {
    Position.IntPosition getFromCoordinate();

    int getFromNode();

    boolean getIsReversed();

    int getLineId();

    int getTileId();

    Position.IntPosition getToCoordinate();

    int getToNode();

    boolean hasFromCoordinate();

    boolean hasFromNode();

    boolean hasIsReversed();

    boolean hasLineId();

    boolean hasTileId();

    boolean hasToCoordinate();

    boolean hasToNode();
}
