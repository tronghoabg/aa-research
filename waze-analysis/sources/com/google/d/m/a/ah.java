package com.google.d.m.a;

import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah extends aj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ak f7982a;

    /* renamed from: c, reason: collision with root package name */
    private final af f7983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ak akVar, af afVar, Executor executor) {
        super(akVar, executor);
        Objects.requireNonNull(akVar);
        this.f7982a = akVar;
        this.f7983c = afVar;
    }

    @Override // com.google.d.m.a.bk
    final /* bridge */ /* synthetic */ Object a() {
        af afVar = this.f7983c;
        bm bmVarA = afVar.a();
        com.google.d.b.an.D(bmVarA, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", afVar);
        return bmVarA;
    }

    @Override // com.google.d.m.a.bk
    final String b() {
        return this.f7983c.toString();
    }

    @Override // com.google.d.m.a.aj
    final /* bridge */ /* synthetic */ void c(Object obj) {
        this.f7982a.e((bm) obj);
    }
}
