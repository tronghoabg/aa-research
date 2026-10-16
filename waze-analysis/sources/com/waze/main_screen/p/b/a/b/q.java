package com.waze.main_screen.p.b.a.b;

import h.ab;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27145a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f27146b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(t tVar, h.c.e eVar) {
        super(2, eVar);
        this.f27146b = tVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        q qVar = new q(this.f27146b, eVar);
        qVar.f27145a = obj;
        return qVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((q) create((o) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        o oVar = (o) this.f27145a;
        bn bnVar = this.f27146b.f27158f;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, n.b((n) objD, oVar)));
        return ab.f48028a;
    }
}
