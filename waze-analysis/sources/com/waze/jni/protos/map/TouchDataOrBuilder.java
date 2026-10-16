package com.waze.jni.protos.map;

import com.google.v.fj;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface TouchDataOrBuilder extends fj {
    TouchPoint getPoints(int i2);

    int getPointsCount();

    List<TouchPoint> getPointsList();

    long getTimestampMs();
}
