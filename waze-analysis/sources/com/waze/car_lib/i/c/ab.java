package com.waze.car_lib.i.c;

import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ab extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20059a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20060b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f20061c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ai f20062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(bn bnVar, ai aiVar, h.c.e eVar) {
        super(2, eVar);
        this.f20061c = bnVar;
        this.f20062d = aiVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ab abVar = new ab(this.f20061c, this.f20062d, eVar);
        abVar.f20060b = obj;
        return abVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ab) create((com.waze.an.a.p) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f20059a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.an.a.p pVar = (com.waze.an.a.p) this.f20060b;
            if (pVar == null) {
                bn bnVar = this.f20061c;
                do {
                    objD = bnVar.d();
                } while (!bnVar.f(objD, u.c((u) objD, null, null, 1)));
            } else {
                this.f20059a = 1;
                if (kotlinx.coroutines.b.ai.J(kotlinx.coroutines.b.ai.L(pVar.b(), new y(pVar, null)), new z(pVar, null)).collect(new aa(this.f20062d, this.f20061c, pVar), this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
