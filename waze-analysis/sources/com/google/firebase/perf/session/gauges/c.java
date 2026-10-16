package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.e.k;
import com.google.firebase.perf.e.n;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Runtime f10571a = Runtime.getRuntime();

    /* renamed from: b, reason: collision with root package name */
    private final ActivityManager f10572b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityManager.MemoryInfo f10573c;

    static {
        com.google.firebase.perf.c.a.a();
    }

    c(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f10572b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f10573c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }

    public final int a() {
        return n.a(k.BYTES.a(this.f10573c.totalMem));
    }

    public final int b() {
        return n.a(k.BYTES.a(this.f10571a.maxMemory()));
    }

    public final int c() {
        return n.a(k.MEGABYTES.a(this.f10572b.getMemoryClass()));
    }
}
