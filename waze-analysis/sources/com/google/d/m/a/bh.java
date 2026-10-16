package com.google.d.m.a;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bh<V> implements bm<V> {

    /* renamed from: a, reason: collision with root package name */
    static final bm f8022a = new bh(null);

    /* renamed from: b, reason: collision with root package name */
    private static final bl f8023b = new bl(bh.class);

    /* renamed from: c, reason: collision with root package name */
    private final Object f8024c;

    bh(Object obj) {
        this.f8024c = obj;
    }

    @Override // com.google.d.m.a.bm
    public final void addListener(Runnable runnable, Executor executor) {
        com.google.d.b.an.C(runnable, "Runnable was null.");
        com.google.d.b.an.C(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            f8023b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        com.google.d.b.an.B(timeUnit);
        return (V) this.f8024c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f8024c;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return (V) this.f8024c;
    }
}
