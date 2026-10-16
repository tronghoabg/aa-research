package com.waze.jni.protos.map;

import com.google.v.fj;
import com.waze.jni.protos.Position;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface MapLineOrBuilder extends fj {
    Position.IntPosition getCenterPosition();

    int getLineId();

    Position.IntPosition getPositions(int i2);

    int getPositionsCount();

    List<Position.IntPosition> getPositionsList();

    boolean getReversed();

    int getTileId();

    boolean hasCenterPosition();
}
