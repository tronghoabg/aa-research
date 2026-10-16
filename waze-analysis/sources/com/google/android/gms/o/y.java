package com.google.android.gms.o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class y implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f5780a = new com.waze.native_managers.j(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5780a.post(runnable);
    }
}
