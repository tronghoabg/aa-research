package com.google.d.m.a;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cc extends bk {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cd f8059a;

    /* renamed from: b, reason: collision with root package name */
    private final Callable f8060b;

    cc(cd cdVar, Callable callable) {
        Objects.requireNonNull(cdVar);
        this.f8059a = cdVar;
        com.google.d.b.an.B(callable);
        this.f8060b = callable;
    }

    @Override // com.google.d.m.a.bk
    final Object a() {
        return this.f8060b.call();
    }

    @Override // com.google.d.m.a.bk
    final String b() {
        return this.f8060b.toString();
    }

    @Override // com.google.d.m.a.bk
    final void d(Throwable th) {
        this.f8059a.d(th);
    }

    @Override // com.google.d.m.a.bk
    final void e(Object obj) {
        this.f8059a.c(obj);
    }

    @Override // com.google.d.m.a.bk
    final boolean g() {
        return this.f8059a.isDone();
    }
}
