package com.waze.jni.protos.crash;

import com.waze.jni.protos.crash.PerformanceTraces;
import com.waze.jni.protos.crash.PerformanceTracesKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PerformanceTracesKtKt {
    /* renamed from: -initializeperformanceTraces, reason: not valid java name */
    public static final PerformanceTraces m26149initializeperformanceTraces(l<? super PerformanceTracesKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PerformanceTracesKt.Dsl.Companion companion = PerformanceTracesKt.Dsl.Companion;
        PerformanceTraces.Builder builderNewBuilder = PerformanceTraces.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PerformanceTracesKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PerformanceTraces copy(PerformanceTraces performanceTraces, l<? super PerformanceTracesKt.Dsl, ab> lVar) {
        x.f(performanceTraces, "<this>");
        x.f(lVar, "block");
        PerformanceTracesKt.Dsl.Companion companion = PerformanceTracesKt.Dsl.Companion;
        PerformanceTraces.Builder builder = performanceTraces.toBuilder();
        x.e(builder, "toBuilder(...)");
        PerformanceTracesKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
