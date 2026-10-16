package com.waze.jni.protos.alerters;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface AlertValidationResultOrBuilder extends fj {
    int getDistanceMeters();

    boolean getIsValid();

    int getTimeToAlertSec();

    boolean hasDistanceMeters();

    boolean hasTimeToAlertSec();
}
