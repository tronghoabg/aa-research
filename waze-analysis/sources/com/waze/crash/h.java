package com.waze.crash;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.jni.protos.crash.NonFatalErrorInfo;
import com.waze.jni.protos.crash.PerformanceTraces;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class h {
    public static final int $stable = 0;

    static final void enforceCrashImplicitlyJNI$lambda$0(h hVar) {
        x.d(hVar, "null cannot be cast to non-null type com.waze.crash.CrashNativeManager");
        ((CrashNativeManager) hVar).enforceCrashImplicitly$third_party_waze_client_android_project_waze_src_main_waze();
    }

    static final void enforceCrashJNI$lambda$0(h hVar) {
        x.d(hVar, "null cannot be cast to non-null type com.waze.crash.CrashNativeManager");
        ((CrashNativeManager) hVar).enforceCrash$third_party_waze_client_android_project_waze_src_main_waze();
    }

    static final void logMessageJNI$lambda$0(h hVar, String str) {
        x.d(hVar, "null cannot be cast to non-null type com.waze.crash.CrashNativeManager");
        ((CrashNativeManager) hVar).logMessage$third_party_waze_client_android_project_waze_src_main_waze(str);
    }

    static final void onNonFatalErrorReceivedJNI$lambda$0(h hVar, NonFatalErrorInfo nonFatalErrorInfo) {
        x.d(hVar, "null cannot be cast to non-null type com.waze.crash.CrashNativeManager");
        x.c(nonFatalErrorInfo);
        ((CrashNativeManager) hVar).onNonFatalErrorReceived$third_party_waze_client_android_project_waze_src_main_waze(nonFatalErrorInfo);
    }

    protected final void enforceCrashImplicitlyJNI() {
        NativeManager.runMainThreadTask(new g(this, 1));
    }

    protected final void enforceCrashJNI() {
        NativeManager.runMainThreadTask(new g(this, 0));
    }

    public PerformanceTraces getMainDispatchTraces() {
        byte[] mainDispatchTracesNTV = ((CrashNativeManager) this).getMainDispatchTracesNTV();
        if (mainDispatchTracesNTV != null) {
            try {
                return (PerformanceTraces) PerformanceTraces.parser().c(mainDispatchTracesNTV);
            } catch (eu unused) {
            }
        }
        return null;
    }

    protected final void logMessageJNI(String str) {
        x.f(str, "message");
        NativeManager.runMainThreadTask(new f(this, str, 1));
    }

    protected final void onNonFatalErrorReceivedJNI(byte[] bArr) {
        x.f(bArr, "nonFatalErrorInfo");
        try {
            NativeManager.runMainThreadTask(new f(this, (NonFatalErrorInfo) NonFatalErrorInfo.parser().c(bArr), 0));
        } catch (eu unused) {
        }
    }
}
