package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f33859a = new Handler(Looper.getMainLooper());

    public final void a(Runnable runnable, long j8) {
        AbstractC3340k.e(runnable, "runnable");
        this.f33859a.postAtTime(runnable, SystemClock.uptimeMillis() + j8);
    }
}
