package com.waze.jni.protos.location;

import com.google.v.fj;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.location.ProviderPosition;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface ProviderPositionOrBuilder extends fj {
    int getAccuracy();

    long getLastUpdateTimeEpochSeconds();

    MatchedPositionProto getMatcherInfo();

    Position.IntPosition getPosition();

    ProviderPosition.LocProvider getProvider();

    int getProviderValue();

    int getSpeed();

    int getSteering();

    boolean hasMatcherInfo();

    boolean hasPosition();
}
