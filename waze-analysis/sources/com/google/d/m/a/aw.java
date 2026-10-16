package com.google.d.m.a;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aw<V> extends ax<V> implements ScheduledFuture, bm {

    /* renamed from: a, reason: collision with root package name */
    private final bm f8012a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f8013b;

    aw(bm bmVar, ScheduledFuture scheduledFuture) {
        this.f8012a = bmVar;
        this.f8013b = scheduledFuture;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.d.m.a.ax, com.google.d.m.a.av
    /* renamed from: a */
    public final /* synthetic */ Future delegate() {
        return this.f8012a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.d.m.a.ax
    /* renamed from: b */
    public final bm delegate() {
        return this.f8012a;
    }

    @Override // com.google.d.m.a.av, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.f8012a.cancel(z);
        if (zCancel) {
            this.f8013b.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f8013b.compareTo(delayed);
    }

    @Override // com.google.d.m.a.ax, com.google.d.m.a.av, com.google.d.d.be
    protected final /* synthetic */ Object delegate() {
        return this.f8012a;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f8013b.getDelay(timeUnit);
    }
}
