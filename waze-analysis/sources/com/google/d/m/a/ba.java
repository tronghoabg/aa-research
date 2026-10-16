package com.google.d.m.a;

import java.util.concurrent.Future;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ba implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    bm f8016a;

    /* renamed from: b, reason: collision with root package name */
    Future f8017b;

    ba(bm bmVar, Future future) {
        this.f8016a = bmVar;
        this.f8017b = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bd.C(this.f8016a, this.f8017b);
        this.f8016a = null;
        this.f8017b = null;
    }
}
