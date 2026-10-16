package com.bumptech.glide.g;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f2901a;

    g(int i2) {
        this.f2901a = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.f2901a != 0) {
            r.i(runnable);
        } else {
            runnable.run();
        }
    }
}
