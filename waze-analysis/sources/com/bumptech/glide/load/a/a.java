package com.bumptech.glide.load.a;

import android.os.Process;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f2939a;

    a(b bVar, Runnable runnable) {
        this.f2939a = runnable;
        Objects.requireNonNull(bVar);
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        this.f2939a.run();
    }
}
