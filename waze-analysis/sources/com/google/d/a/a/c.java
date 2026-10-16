package com.google.d.a.a;

import android.os.SystemClock;
import com.google.d.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final aq f7193a;

    static {
        aq bVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            bVar = new a();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            bVar = new b();
        }
        f7193a = bVar;
    }

    public static aq a() {
        return f7193a;
    }
}
