package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f34497a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.e.c f34498b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.b.at f34499c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f34500d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.rtalerts.y f34501e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.b.i f34502f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ k f34503g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(com.waze.sharedui.e.c cVar, com.waze.reports_v2.b.at atVar, long j2, com.waze.rtalerts.y yVar, com.waze.reports_v2.b.i iVar, k kVar, h.c.e eVar) {
        super(1, eVar);
        this.f34498b = cVar;
        this.f34499c = atVar;
        this.f34500d = j2;
        this.f34501e = yVar;
        this.f34502f = iVar;
        this.f34503g = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new i(this.f34498b, this.f34499c, this.f34500d, this.f34501e, this.f34502f, this.f34503g, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((i) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34497a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.sharedui.e.c cVar2 = this.f34498b;
            com.waze.reports_v2.b.at atVar = this.f34499c;
            long j2 = this.f34500d;
            com.waze.reports_v2.b.a aVar2 = new com.waze.reports_v2.b.a(cVar2, atVar, com.waze.settings.h.c.f(j2), this.f34501e, this.f34502f);
            this.f34497a = 1;
            obj = this.f34503g.f34510b.a(aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.waze.reports_v2.a.a.a.d dVar = (com.waze.reports_v2.a.a.a.d) obj;
        if (h.g.b.x.n(dVar, com.waze.reports_v2.b.b.f34087a)) {
            this.f34503g.f34514f.b("Could not send report, api returned error");
            cVar = b.f34229a;
        } else {
            if (!(dVar instanceof com.waze.reports_v2.b.c)) {
                throw new h.i();
            }
            cVar = new c(((com.waze.reports_v2.b.c) dVar).c());
        }
        k kVar = this.f34503g;
        com.waze.sharedui.e.c cVar3 = this.f34498b;
        kVar.f34513e.onAlertReported(cVar3.f().c(), cVar3.f().d());
        return cVar;
    }
}
