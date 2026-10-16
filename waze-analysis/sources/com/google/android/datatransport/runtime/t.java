package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class t implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4353a;

    t(Executor executor) {
        this.f4353a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4353a.execute(new s(runnable));
    }
}
