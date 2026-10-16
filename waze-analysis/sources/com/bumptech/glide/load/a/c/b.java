package com.bumptech.glide.load.a.c;

import android.os.Process;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends Thread {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, Runnable runnable) {
        super(runnable);
        Objects.requireNonNull(cVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(9);
        super.run();
    }
}
