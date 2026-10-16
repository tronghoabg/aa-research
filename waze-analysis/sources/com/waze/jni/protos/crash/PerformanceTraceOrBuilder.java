package com.waze.jni.protos.crash;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface PerformanceTraceOrBuilder extends fj {
    long getEndTimeNs();

    String getName();

    v getNameBytes();

    long getStartTimeNs();

    boolean hasEndTimeNs();

    boolean hasName();

    boolean hasStartTimeNs();
}
