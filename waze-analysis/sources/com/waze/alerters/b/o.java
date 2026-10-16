package com.waze.alerters.b;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f14257a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f14258b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(p pVar, h.c.e eVar) {
        super(2, eVar);
        this.f14257a = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        o oVar = new o(this.f14257a, eVar);
        oVar.f14258b = obj;
        return oVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        af afVar = (af) this.f14258b;
        p pVar = this.f14257a;
        ai.m(ai.K(pVar.f14259a, new j(pVar, (h.c.e) null, 0)), afVar);
        return ai.m(ai.K(ai.y(new n(pVar.i())), new k(pVar, null)), afVar);
    }
}
