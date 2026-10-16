package com.waze.shared_infra.a;

import h.ab;
import h.g.a.q;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends h.c.b.a.g implements q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f37767a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(3, eVar);
        this.f37767a = fVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new e(this.f37767a, (h.c.e) obj3).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        af afVarE = this.f37767a.e();
        if (afVarE != null) {
            aj.h(afVarE, null);
        }
        return ab.f48028a;
    }
}
