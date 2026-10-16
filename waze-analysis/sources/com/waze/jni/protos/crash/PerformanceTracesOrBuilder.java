package com.waze.jni.protos.crash;

import com.google.v.fj;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface PerformanceTracesOrBuilder extends fj {
    long getTimeNowNs();

    PerformanceTrace getTraces(int i2);

    int getTracesCount();

    List<PerformanceTrace> getTracesList();

    boolean hasTimeNowNs();
}
