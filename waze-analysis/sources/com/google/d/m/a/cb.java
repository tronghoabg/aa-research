package com.google.d.m.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cb extends bk {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cd f8057a;

    /* renamed from: b, reason: collision with root package name */
    private final af f8058b;

    cb(cd cdVar, af afVar) {
        Objects.requireNonNull(cdVar);
        this.f8057a = cdVar;
        this.f8058b = afVar;
    }

    @Override // com.google.d.m.a.bk
    final /* bridge */ /* synthetic */ Object a() {
        af afVar = this.f8058b;
        bm bmVarA = afVar.a();
        com.google.d.b.an.D(bmVarA, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", afVar);
        return bmVarA;
    }

    @Override // com.google.d.m.a.bk
    final String b() {
        return this.f8058b.toString();
    }

    @Override // com.google.d.m.a.bk
    final void d(Throwable th) {
        this.f8057a.d(th);
    }

    @Override // com.google.d.m.a.bk
    final /* bridge */ /* synthetic */ void e(Object obj) {
        this.f8057a.e((bm) obj);
    }

    @Override // com.google.d.m.a.bk
    final boolean g() {
        return this.f8057a.isDone();
    }
}
