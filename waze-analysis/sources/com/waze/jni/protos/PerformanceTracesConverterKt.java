package com.waze.jni.protos;

import com.waze.jni.protos.crash.PerformanceTrace;
import com.waze.jni.protos.crash.PerformanceTraces;
import com.waze.shared_infra.i.j;
import com.waze.shared_infra.i.k;
import h.a.i;
import h.g.b.x;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PerformanceTracesConverterKt {
    public static final j toKotlinPerformanceTrace(PerformanceTrace performanceTrace) {
        x.f(performanceTrace, "<this>");
        String name = performanceTrace.getName();
        x.e(name, "getName(...)");
        Instant instantOfEpochSecond = Instant.ofEpochSecond(0L, performanceTrace.getStartTimeNs());
        x.e(instantOfEpochSecond, "ofEpochSecond(...)");
        return new j(name, instantOfEpochSecond, performanceTrace.getEndTimeNs() > 0 ? Instant.ofEpochSecond(0L, performanceTrace.getEndTimeNs()) : null);
    }

    public static final k toKotlinPerformanceTraces(PerformanceTraces performanceTraces) {
        x.f(performanceTraces, "<this>");
        List<PerformanceTrace> tracesList = performanceTraces.getTracesList();
        x.e(tracesList, "getTracesList(...)");
        List<PerformanceTrace> list = tracesList;
        ArrayList arrayList = new ArrayList(i.q(list, 10));
        for (PerformanceTrace performanceTrace : list) {
            x.c(performanceTrace);
            arrayList.add(toKotlinPerformanceTrace(performanceTrace));
        }
        Instant instantOfEpochSecond = Instant.ofEpochSecond(0L, performanceTraces.getTimeNowNs());
        x.e(instantOfEpochSecond, "ofEpochSecond(...)");
        return new k(arrayList, instantOfEpochSecond);
    }
}
