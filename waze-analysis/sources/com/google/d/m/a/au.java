package com.google.d.m.a;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class au<V> extends be {

    /* renamed from: a, reason: collision with root package name */
    private final bm f8011a;

    au(bm bmVar) {
        com.google.d.b.an.B(bmVar);
        this.f8011a = bmVar;
    }

    @Override // com.google.d.m.a.k, com.google.d.m.a.bm
    public final void addListener(Runnable runnable, Executor executor) {
        this.f8011a.addListener(runnable, executor);
    }

    @Override // com.google.d.m.a.k, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f8011a.cancel(z);
    }

    @Override // com.google.d.m.a.k, java.util.concurrent.Future
    public final V get() {
        return this.f8011a.get();
    }

    @Override // com.google.d.m.a.k, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8011a.isCancelled();
    }

    @Override // com.google.d.m.a.k, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8011a.isDone();
    }

    @Override // com.google.d.m.a.k
    public final String toString() {
        return this.f8011a.toString();
    }

    @Override // com.google.d.m.a.k, java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        return this.f8011a.get(j2, timeUnit);
    }
}
