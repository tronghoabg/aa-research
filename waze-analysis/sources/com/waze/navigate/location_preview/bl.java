package com.waze.navigate.location_preview;

import com.waze.la;
import com.waze.navigate.cj;
import com.waze.navigate.eo;
import com.waze.navigate.et;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bl extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31653a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f31654b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ la f31655c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.o.a f31656d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.ev.n f31657e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.q.e f31658f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.q.j f31659g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ cj f31660h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ eo f31661i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ p f31662j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ az f31663k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bn bnVar, la laVar, com.waze.shared_infra.o.a aVar, com.waze.ev.n nVar, com.waze.shared_infra.q.e eVar, com.waze.shared_infra.q.j jVar, cj cjVar, eo eoVar, p pVar, az azVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f31654b = bnVar;
        this.f31655c = laVar;
        this.f31656d = aVar;
        this.f31657e = nVar;
        this.f31658f = eVar;
        this.f31659g = jVar;
        this.f31660h = cjVar;
        this.f31661i = eoVar;
        this.f31662j = pVar;
        this.f31663k = azVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bl blVar = new bl(this.f31654b, this.f31655c, this.f31656d, this.f31657e, this.f31658f, this.f31659g, this.f31660h, this.f31661i, this.f31662j, this.f31663k, eVar);
        blVar.f31653a = obj;
        return blVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bl) create((ay) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        az azVar;
        p pVar;
        eo eoVar;
        cj cjVar;
        com.waze.shared_infra.q.j jVar;
        com.waze.shared_infra.q.e eVar;
        com.waze.ev.n nVar;
        com.waze.shared_infra.o.a aVar;
        la laVar;
        Object objD;
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ay ayVar = (ay) this.f31653a;
        bn bnVar = this.f31654b;
        kotlinx.coroutines.b.bn bnVar2 = bnVar.f31670d;
        do {
            azVar = this.f31663k;
            pVar = this.f31662j;
            eoVar = this.f31661i;
            cjVar = this.f31660h;
            jVar = this.f31659g;
            eVar = this.f31658f;
            nVar = this.f31657e;
            aVar = this.f31656d;
            laVar = this.f31655c;
            objD = bnVar2.d();
        } while (!bnVar2.f(objD, et.j(ayVar, laVar, aVar, bnVar.f31668b, nVar, eVar, jVar, et.v(cjVar), eoVar.T(), pVar, azVar.f())));
        return h.ab.f48028a;
    }
}
