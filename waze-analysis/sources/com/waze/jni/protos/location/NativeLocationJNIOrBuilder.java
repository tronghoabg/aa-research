package com.waze.jni.protos.location;

import com.google.v.fj;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.location.NativeLocationJNI;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NativeLocationJNIOrBuilder extends fj {
    Vector3 getAccelerometer();

    double getAccuracyMeters();

    int getAltitude();

    Vector3 getCompass();

    boolean getDecayStaleAccuracy();

    boolean getGeneratedBySoftware();

    long getGpsTimeMs();

    Vector3 getGyroscope();

    Position.IntPosition getPosition();

    NativeLocationJNI.Provider getProvider();

    int getProviderValue();

    NativeLocationJNI.SourceType getSourceType();

    int getSourceTypeValue();

    int getSpeedAccuracyMmSec();

    int getSpeedMmSec();

    int getSteeringAccuracyDegrees();

    int getSteeringDegrees();

    boolean hasAccelerometer();

    boolean hasAccuracyMeters();

    boolean hasAltitude();

    boolean hasCompass();

    boolean hasDecayStaleAccuracy();

    boolean hasGeneratedBySoftware();

    boolean hasGpsTimeMs();

    boolean hasGyroscope();

    boolean hasPosition();

    boolean hasProvider();

    boolean hasSourceType();

    boolean hasSpeedAccuracyMmSec();

    boolean hasSpeedMmSec();

    boolean hasSteeringAccuracyDegrees();

    boolean hasSteeringDegrees();
}
