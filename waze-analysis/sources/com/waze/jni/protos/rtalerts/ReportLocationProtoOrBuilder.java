package com.waze.jni.protos.rtalerts;

import com.google.v.fj;
import com.waze.jni.protos.location.ProviderPosition;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface ReportLocationProtoOrBuilder extends fj {
    long getFromNodeDbId();

    ProviderPosition getPosition();

    long getToNodeDbId();

    boolean hasFromNodeDbId();

    boolean hasPosition();

    boolean hasToNodeDbId();
}
