package com.google.d.m.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bs implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f8035a;

    bs(bu buVar, Runnable runnable) {
        this.f8035a = runnable;
        Objects.requireNonNull(buVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8035a.run();
    }

    public final String toString() {
        return this.f8035a.toString();
    }
}
