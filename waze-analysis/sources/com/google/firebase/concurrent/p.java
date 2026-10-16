package com.google.firebase.concurrent;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f9033a;

    p(r rVar) {
        Objects.requireNonNull(rVar);
        this.f9033a = rVar;
    }

    public final void a(Object obj) {
        this.f9033a.set(obj);
    }

    public final void b(Throwable th) {
        this.f9033a.setException(th);
    }
}
