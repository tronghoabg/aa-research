package com.waze.perf.tracer;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TraceNativeManager extends a {
    private final h tracerProvider;

    public TraceNativeManager(h hVar) {
        x.f(hVar, "tracerProvider");
        this.tracerProvider = hVar;
    }

    public final native void initNativeLayerNTV();

    public final TraceNativeManagerTraceObject newTrace$third_party_waze_client_android_project_waze_src_main_java_com_waze_perf_tracer_trace_native_manager(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        TraceNativeManagerTraceObject traceNativeManagerTraceObject = new TraceNativeManagerTraceObject(this.tracerProvider.a().a(str));
        traceNativeManagerTraceObject.getTrace().c();
        return traceNativeManagerTraceObject;
    }

    public final void putAttribute$third_party_waze_client_android_project_waze_src_main_java_com_waze_perf_tracer_trace_native_manager(TraceNativeManagerTraceObject traceNativeManagerTraceObject, String str, String str2) {
        x.f(traceNativeManagerTraceObject, "obj");
        x.f(str, "key");
        x.f(str2, "value");
        traceNativeManagerTraceObject.getTrace().a(str, str2);
    }

    public final void putMetric$third_party_waze_client_android_project_waze_src_main_java_com_waze_perf_tracer_trace_native_manager(TraceNativeManagerTraceObject traceNativeManagerTraceObject, String str, long j2) {
        x.f(traceNativeManagerTraceObject, "obj");
        x.f(str, "key");
        traceNativeManagerTraceObject.getTrace().b(str, j2);
    }

    public final void stopTrace$third_party_waze_client_android_project_waze_src_main_java_com_waze_perf_tracer_trace_native_manager(TraceNativeManagerTraceObject traceNativeManagerTraceObject) {
        x.f(traceNativeManagerTraceObject, "obj");
        traceNativeManagerTraceObject.getTrace().d();
    }
}
