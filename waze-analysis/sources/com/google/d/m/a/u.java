package com.google.d.m.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u extends w {
    u(bm bmVar, ag agVar) {
        super(bmVar, agVar);
    }

    @Override // com.google.d.m.a.w
    final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2) {
        ag agVar = (ag) obj;
        bm bmVarApply = agVar.apply(obj2);
        com.google.d.b.an.D(bmVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", agVar);
        return bmVarApply;
    }

    @Override // com.google.d.m.a.w
    final /* synthetic */ void g(Object obj) {
        e((bm) obj);
    }
}
