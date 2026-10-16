package com.waze.perf.tracer;

import androidx.autofill.HintConstants;
import com.waze.jni.protos.places.GenericPlace;
import com.waze.jni.protos.planned_drive.PlannedDriveResponse;
import com.waze.places.ab;
import com.waze.planned_drive.j;
import com.waze.planned_drive.k;
import com.waze.planned_drive.l;
import com.waze.planned_drive.m;
import com.waze.planned_drive.n;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class a {
    public static com.waze.z.a.c a(com.waze.bc.a.b bVar) {
        x.f(bVar, "<this>");
        com.waze.bc.a.b bVar2 = com.waze.bc.a.b.f16196a;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            return com.waze.z.a.c.f45819e;
        }
        if (iOrdinal == 1) {
            return com.waze.z.a.c.f45818d;
        }
        if (iOrdinal == 2) {
            return com.waze.z.a.c.f45817c;
        }
        throw new h.i();
    }

    public static com.waze.planned_drive.i b(PlannedDriveResponse plannedDriveResponse) {
        x.f(plannedDriveResponse, "response");
        return new com.waze.planned_drive.i(g(plannedDriveResponse));
    }

    public static j c(PlannedDriveResponse plannedDriveResponse) {
        x.f(plannedDriveResponse, "response");
        return new j(g(plannedDriveResponse));
    }

    public static n d(PlannedDriveResponse plannedDriveResponse) {
        x.f(plannedDriveResponse, "response");
        return new n(g(plannedDriveResponse));
    }

    public static Object e(ab abVar, h.c.e eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        abVar.fetchRecents(new com.waze.car_lib.login.b(completableDeferredJ, 15));
        return completableDeferredJ.c(eVar);
    }

    public static Object f(ab abVar, GenericPlace genericPlace, h.c.e eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        abVar.storeRecentPlaceInRecents(genericPlace, new com.waze.car_lib.login.b(completableDeferredJ, 20));
        return completableDeferredJ.c(eVar);
    }

    private static m g(PlannedDriveResponse plannedDriveResponse) {
        if (plannedDriveResponse.getSuccess()) {
            return l.f33348a;
        }
        String errorTitle = plannedDriveResponse.getErrorTitle();
        x.e(errorTitle, "getErrorTitle(...)");
        String errorMessage = plannedDriveResponse.getErrorMessage();
        x.e(errorMessage, "getErrorMessage(...)");
        return new k(errorTitle, errorMessage);
    }

    protected final TraceNativeManagerTraceObject newTraceJNI(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return ((TraceNativeManager) this).newTrace$third_party_waze_client_android_project_waze_src_main_java_com_waze_perf_tracer_trace_native_manager(str);
    }

    protected final void putAttributeJNI(TraceNativeManagerTraceObject traceNativeManagerTraceObject, String str, String str2) {
        x.f(traceNativeManagerTraceObject, "obj");
        x.f(str, "key");
        x.f(str2, "value");
        ((TraceNativeManager) this).putAttribute$third_party_waze_client_android_project_waze_src_main_java_com_waze_perf_tracer_trace_native_manager(traceNativeManagerTraceObject, str, str2);
    }

    protected final void putMetricJNI(TraceNativeManagerTraceObject traceNativeManagerTraceObject, String str, long j2) {
        x.f(traceNativeManagerTraceObject, "obj");
        x.f(str, "key");
        ((TraceNativeManager) this).putMetric$third_party_waze_client_android_project_waze_src_main_java_com_waze_perf_tracer_trace_native_manager(traceNativeManagerTraceObject, str, j2);
    }

    protected final void stopTraceJNI(TraceNativeManagerTraceObject traceNativeManagerTraceObject) {
        x.f(traceNativeManagerTraceObject, "obj");
        ((TraceNativeManager) this).stopTrace$third_party_waze_client_android_project_waze_src_main_java_com_waze_perf_tracer_trace_native_manager(traceNativeManagerTraceObject);
    }
}
