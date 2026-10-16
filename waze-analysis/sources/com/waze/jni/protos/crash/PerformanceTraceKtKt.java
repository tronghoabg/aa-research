package com.waze.jni.protos.crash;

import com.waze.jni.protos.crash.PerformanceTrace;
import com.waze.jni.protos.crash.PerformanceTraceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PerformanceTraceKtKt {
    /* renamed from: -initializeperformanceTrace, reason: not valid java name */
    public static final PerformanceTrace m26139initializeperformanceTrace(l<? super PerformanceTraceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PerformanceTraceKt.Dsl.Companion companion = PerformanceTraceKt.Dsl.Companion;
        PerformanceTrace.Builder builderNewBuilder = PerformanceTrace.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PerformanceTraceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PerformanceTrace copy(PerformanceTrace performanceTrace, l<? super PerformanceTraceKt.Dsl, ab> lVar) {
        x.f(performanceTrace, "<this>");
        x.f(lVar, "block");
        PerformanceTraceKt.Dsl.Companion companion = PerformanceTraceKt.Dsl.Companion;
        PerformanceTrace.Builder builder = performanceTrace.toBuilder();
        x.e(builder, "toBuilder(...)");
        PerformanceTraceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
