package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.DistanceUnitOuterClass;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface DistanceUpdateOrBuilder extends fj {
    int getRawMeters();

    DistanceUnitOuterClass.DistanceUnit getUnit();

    String getUnitString();

    v getUnitStringBytes();

    int getUnitValue();

    double getValue();

    String getValueString();

    v getValueStringBytes();
}
