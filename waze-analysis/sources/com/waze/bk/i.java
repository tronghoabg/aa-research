package com.waze.bk;

import h.g.b.x;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f16865a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f16866b;

    public i(Runnable runnable) {
        x.f(runnable, "callback");
        this.f16865a = runnable;
        this.f16866b = new AtomicBoolean(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16866b.getAndSet(true)) {
            return;
        }
        this.f16865a.run();
    }
}
