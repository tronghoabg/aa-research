package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NetworkCommandTraceOrBuilder extends fj {
    String getName();

    v getNameBytes();

    int getNetworkLatencyMs();

    int getQueueLatencyMs();

    int getRetryCount();
}
