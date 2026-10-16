package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e<TResult> implements com.google.android.gms.o.o, com.google.android.gms.o.m, com.google.android.gms.o.h {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f10663a = new CountDownLatch(1);

    /* synthetic */ e() {
    }

    public final boolean a(TimeUnit timeUnit) {
        return this.f10663a.await(5L, timeUnit);
    }

    @Override // com.google.android.gms.o.h
    public final void d() {
        this.f10663a.countDown();
    }

    @Override // com.google.android.gms.o.m
    public final void onFailure(Exception exc) {
        this.f10663a.countDown();
    }

    @Override // com.google.android.gms.o.o
    public final void onSuccess(TResult tresult) {
        this.f10663a.countDown();
    }
}
