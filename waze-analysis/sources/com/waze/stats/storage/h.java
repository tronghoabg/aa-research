package com.waze.stats.storage;

import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {
    public static String a() {
        return Build.DEVICE.replace("|", "");
    }

    public static String b() {
        return Build.MODEL.replace("|", "");
    }

    public static String c() {
        return Build.VERSION.RELEASE + "-SDK" + Build.VERSION.SDK;
    }
}
