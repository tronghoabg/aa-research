package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ab implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f9085a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.firebase.crashlytics.a.h.f f9086b;

    ab(ae aeVar, com.google.firebase.crashlytics.a.h.f fVar) {
        this.f9086b = fVar;
        Objects.requireNonNull(aeVar);
        this.f9085a = aeVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.o.t call() {
        return ae.k(this.f9085a, this.f9086b);
    }
}
