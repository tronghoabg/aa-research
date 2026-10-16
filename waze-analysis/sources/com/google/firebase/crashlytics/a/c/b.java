package com.google.firebase.crashlytics.a.c;

import android.os.Process;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class b implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        a();
    }
}
