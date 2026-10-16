package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r extends AbstractResolvableFuture implements ScheduledFuture {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledFuture f9034a;

    r(q qVar) {
        this.f9034a = qVar.a(new p(this));
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    protected final void afterDone() {
        this.f9034a.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f9034a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f9034a.getDelay(timeUnit);
    }
}
