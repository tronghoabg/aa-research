package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f9194a;

    k(n nVar) {
        Objects.requireNonNull(nVar);
        this.f9194a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9194a.f9199d.set(true);
    }
}
