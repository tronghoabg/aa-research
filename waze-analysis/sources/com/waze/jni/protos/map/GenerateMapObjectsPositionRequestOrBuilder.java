package com.waze.jni.protos.map;

import com.google.v.fj;
import com.waze.jni.protos.Position;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface GenerateMapObjectsPositionRequestOrBuilder extends fj {
    Position.IntPosition getCoordinatesToBeFarFrom(int i2);

    int getCoordinatesToBeFarFromCount();

    List<Position.IntPosition> getCoordinatesToBeFarFromList();

    Polyline getPolylines(int i2);

    int getPolylinesCount();

    List<Polyline> getPolylinesList();
}
