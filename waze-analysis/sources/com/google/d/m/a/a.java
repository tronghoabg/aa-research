package com.google.d.m.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends c {
    a(bm bmVar, Class cls, ag agVar) {
        super(bmVar, cls, agVar);
    }

    @Override // com.google.d.m.a.c
    final /* bridge */ /* synthetic */ Object f(Object obj, Throwable th) {
        ag agVar = (ag) obj;
        bm bmVarApply = agVar.apply(th);
        com.google.d.b.an.D(bmVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", agVar);
        return bmVarApply;
    }

    @Override // com.google.d.m.a.c
    final /* synthetic */ void g(Object obj) {
        e((bm) obj);
    }
}
