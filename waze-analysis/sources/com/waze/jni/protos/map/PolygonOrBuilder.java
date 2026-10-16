package com.waze.jni.protos.map;

import com.google.v.fj;
import com.waze.jni.protos.Position;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface PolygonOrBuilder extends fj {
    int getId();

    Position.IntPosition getPosition(int i2);

    int getPositionCount();

    List<Position.IntPosition> getPositionList();
}
