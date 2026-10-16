package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Process;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f5151a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f5152b;

    public static String a() {
        String str = f5151a;
        if (str != null) {
            return str;
        }
        String processName = Application.getProcessName();
        f5151a = processName;
        return processName;
    }

    public static boolean b() {
        Boolean boolValueOf = f5152b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(Process.isIsolated());
            f5152b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
