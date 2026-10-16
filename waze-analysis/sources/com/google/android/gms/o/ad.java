package com.google.android.gms.o;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ad<T> implements ae<T> {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f5741a = new CountDownLatch(1);

    /* synthetic */ ad() {
    }

    public final void a() throws InterruptedException {
        this.f5741a.await();
    }

    public final boolean b(long j2, TimeUnit timeUnit) {
        return this.f5741a.await(j2, timeUnit);
    }

    @Override // com.google.android.gms.o.h
    public final void d() {
        this.f5741a.countDown();
    }

    @Override // com.google.android.gms.o.m
    public final void onFailure(Exception exc) {
        this.f5741a.countDown();
    }

    @Override // com.google.android.gms.o.o
    public final void onSuccess(T t) {
        this.f5741a.countDown();
    }
}
