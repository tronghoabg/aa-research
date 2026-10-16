package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ga extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f36589a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.navigate.location_preview.ay f36590b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ft f36591c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f36592d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.navigate.location_preview.o f36593e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.av.d.k f36594f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f36595g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ga(com.waze.navigate.location_preview.ay ayVar, ft ftVar, h.g.a.l lVar, com.waze.navigate.location_preview.o oVar, com.waze.av.d.k kVar, h.c.e eVar) {
        super(2, eVar);
        this.f36590b = ayVar;
        this.f36591c = ftVar;
        this.f36592d = lVar;
        this.f36593e = oVar;
        this.f36594f = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ga gaVar = new ga(this.f36590b, this.f36591c, this.f36592d, this.f36593e, this.f36594f, eVar);
        gaVar.f36595g = obj;
        return gaVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ga) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.br brVarZ;
        h.g.b.aq aqVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f36589a != 0) {
            aqVar = (h.g.b.aq) this.f36595g;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f36595g;
            h.g.b.aq aqVar2 = new h.g.b.aq();
            com.waze.navigate.location_preview.ay ayVar = this.f36590b;
            aqVar2.f48105a = ayVar;
            ft ftVar = this.f36591c;
            if (ftVar.a(ayVar.E()) == com.waze.destination_cell.c.b.f23526b) {
                aqVar2.f48105a = this.f36592d.invoke(new com.waze.network.q(19));
            }
            h.g.a.l lVar = this.f36592d;
            kotlinx.coroutines.br[] brVarArr = new kotlinx.coroutines.br[4];
            brVarArr[0] = kotlinx.coroutines.aj.z(afVar, null, null, new fz(ftVar, ayVar, aqVar2, lVar, (h.c.e) null, 1), 3);
            boolean z = ayVar.T() instanceof com.waze.navigate.location_preview.bq;
            com.waze.navigate.location_preview.o oVar = this.f36593e;
            if (z) {
                brVarZ = kotlinx.coroutines.aj.z(afVar, null, null, new fy(ftVar, ayVar, aqVar2, lVar, oVar, null), 3);
            } else {
                oVar.f((com.waze.navigate.location_preview.ay) aqVar2.f48105a);
                brVarZ = null;
            }
            brVarArr[1] = brVarZ;
            brVarArr[2] = ayVar.p() != null ? kotlinx.coroutines.aj.z(afVar, null, null, new fz(ftVar, this.f36594f, aqVar2, lVar, (h.c.e) null, 0), 3) : null;
            brVarArr[3] = kotlinx.coroutines.aj.z(afVar, null, null, new fz(ftVar, this.f36594f, aqVar2, lVar, null, 2, null), 3);
            this.f36595g = aqVar2;
            this.f36589a = 1;
            if (kotlinx.coroutines.aj.E(h.a.i.k(brVarArr), this) == aVar) {
                return aVar;
            }
            aqVar = aqVar2;
        }
        com.waze.navigate.location_preview.o oVar2 = this.f36593e;
        oVar2.a((com.waze.navigate.location_preview.ay) aqVar.f48105a);
        oVar2.b((com.waze.navigate.location_preview.ay) aqVar.f48105a);
        return h.ab.f48028a;
    }
}
