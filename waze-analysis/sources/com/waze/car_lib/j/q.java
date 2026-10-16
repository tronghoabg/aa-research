package com.waze.car_lib.j;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20253a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f20254b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aq f20255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(r rVar, aq aqVar, h.c.e eVar) {
        super(2, eVar);
        this.f20254b = rVar;
        this.f20255c = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new q(this.f20254b, this.f20255c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f20253a == 0) {
            e.b.c.b(obj);
            r rVar = this.f20254b;
            this.f20253a = 1;
            if (rVar.f20257b.c().collect(new p(this.f20255c, rVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
