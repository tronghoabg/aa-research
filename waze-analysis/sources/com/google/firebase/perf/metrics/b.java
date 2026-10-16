package com.google.firebase.perf.metrics;

import com.google.firebase.perf.e.m;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final AppStartTrace f10518a;

    public b(AppStartTrace appStartTrace) {
        this.f10518a = appStartTrace;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppStartTrace appStartTrace = this.f10518a;
        if (appStartTrace.n == null) {
            appStartTrace.o = new m();
        }
    }
}
