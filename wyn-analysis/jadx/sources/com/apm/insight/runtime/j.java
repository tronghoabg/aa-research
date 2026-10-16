package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static MonitorCrash f20658a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f20659b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static int f20660c;

    public static MonitorCrash a() {
        if (f20658a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f20658a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f20658a;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f20659b == -1) {
            f20659b = 5;
        }
        int i5 = f20660c;
        if (i5 < f20659b) {
            f20660c = i5 + 1;
            a().reportCustomErr(str, "INNER", th);
        }
    }
}
