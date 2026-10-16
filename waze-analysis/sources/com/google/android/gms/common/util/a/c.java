package com.google.android.gms.common.util.a;

import android.os.Process;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f5143a;

    public c(Runnable runnable) {
        this.f5143a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.f5143a.run();
    }
}
