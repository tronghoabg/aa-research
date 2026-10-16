package com.waze.car_lib.r;

import com.waze.car_lib.f.jl;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fo extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21650a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fp f21651b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.asks.as f21652c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ jl f21653d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f21654e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fo(fp fpVar, com.waze.asks.as asVar, jl jlVar, h.c.e eVar) {
        super(2, eVar);
        this.f21651b = fpVar;
        this.f21652c = asVar;
        this.f21653d = jlVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        fo foVar = new fo(this.f21651b, this.f21652c, this.f21653d, eVar);
        foVar.f21654e = obj;
        return foVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fo) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.af afVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21650a != 0) {
            afVar = (kotlinx.coroutines.af) this.f21654e;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f21654e;
            this.f21654e = afVar2;
            this.f21650a = 1;
            if (kotlinx.coroutines.aj.q(h.o.a.m(this.f21651b.f21658d.a()), this) == aVar) {
                return aVar;
            }
            afVar = afVar2;
        }
        if (kotlinx.coroutines.aj.j(afVar)) {
            fp.d(this.f21651b, this.f21652c, this.f21653d);
        }
        return h.ab.f48028a;
    }
}
