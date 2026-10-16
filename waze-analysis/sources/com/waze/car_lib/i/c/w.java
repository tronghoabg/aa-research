package com.waze.car_lib.i.c;

import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class w extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20145a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20146b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f20147c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(bn bnVar, h.c.e eVar) {
        super(2, eVar);
        this.f20147c = bnVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        w wVar = new w(this.f20147c, eVar);
        wVar.f20146b = obj;
        return wVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((w) create((com.waze.an.a.q) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f20145a == 0) {
            e.b.c.b(obj);
            com.waze.an.a.q qVar = (com.waze.an.a.q) this.f20146b;
            bn bnVar = this.f20147c;
            if (qVar == null) {
                do {
                    objD = bnVar.d();
                } while (!bnVar.f(objD, u.c((u) objD, null, null, 2)));
                return h.ab.f48028a;
            }
            this.f20145a = 1;
            if (qVar.a().collect(new v(bnVar, 0), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
