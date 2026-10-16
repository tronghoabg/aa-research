package com.waze.jni.protos.location;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NativeRotationVectorsOrBuilder extends fj {
    long getDeltaTns();

    Vector3 getGravity();

    Vector3 getMagneticField();

    float getMaxAcceleration();

    float getMaxRateOfTurn();

    Quaternion getRotation();

    long getTimestampMs();

    boolean hasDeltaTns();

    boolean hasGravity();

    boolean hasMagneticField();

    boolean hasMaxAcceleration();

    boolean hasMaxRateOfTurn();

    boolean hasRotation();

    boolean hasTimestampMs();
}
