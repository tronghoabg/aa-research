package com.waze.bw.c.c;

import com.waze.sound.df;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ad extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f17776a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17777b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f17778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(am amVar, h.c.e eVar) {
        super(2, eVar);
        this.f17778c = amVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ad adVar = new ad(this.f17778c, eVar);
        adVar.f17777b = obj;
        return adVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ad) create((com.waze.br.c.o) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f17776a == 0) {
            e.b.c.b(obj);
            com.waze.br.c.o oVar = (com.waze.br.c.o) this.f17777b;
            am amVar = this.f17778c;
            amVar.v = oVar;
            if (oVar == null) {
                am.z(amVar, new df(19));
                return h.ab.f48028a;
            }
            this.f17776a = 1;
            if (oVar.a().collect(new ab(amVar, 8), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
