package com.waze.crash;

import com.waze.jni.protos.crash.NonFatalErrorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class CrashNativeManager extends h {
    public static final int $stable = 8;
    private final c crashManager;
    private final com.waze.shared_infra.i.b exceptionReporter;

    public CrashNativeManager(c cVar, com.waze.shared_infra.i.b bVar) {
        x.f(cVar, "crashManager");
        x.f(bVar, "exceptionReporter");
        this.crashManager = cVar;
        this.exceptionReporter = bVar;
    }

    public final void enforceCrash$third_party_waze_client_android_project_waze_src_main_waze() {
        throw new RuntimeException("Test Crash");
    }

    public final void enforceCrashImplicitly$third_party_waze_client_android_project_waze_src_main_waze() {
        this.crashManager.e();
    }

    public final native byte[] getMainDispatchTracesNTV();

    public final native void initNativeLayerNTV();

    public final void logMessage$third_party_waze_client_android_project_waze_src_main_waze(String str) {
        x.f(str, "message");
        this.crashManager.g(str);
    }

    public final void onNonFatalErrorReceived$third_party_waze_client_android_project_waze_src_main_waze(NonFatalErrorInfo nonFatalErrorInfo) {
        x.f(nonFatalErrorInfo, "nonFatalErrorInfo");
        Throwable th = new Throwable(nonFatalErrorInfo.getArgumentsFormatted());
        th.setStackTrace(new StackTraceElement[]{new StackTraceElement(nonFatalErrorInfo.getSourceFileName(), nonFatalErrorInfo.getFunctionName(), nonFatalErrorInfo.getSourceFileName(), nonFatalErrorInfo.getLine())});
        this.exceptionReporter.a(th, null);
    }
}
