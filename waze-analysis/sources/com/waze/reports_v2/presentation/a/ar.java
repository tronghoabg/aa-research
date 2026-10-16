package com.waze.reports_v2.presentation.a;

import com.waze.reports_v2.c.dn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ar extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34660a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.c.e f34661b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ as f34662c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.b.q f34663d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.b.at f34664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(com.waze.reports_v2.c.e eVar, as asVar, com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f34661b = eVar;
        this.f34662c = asVar;
        this.f34663d = qVar;
        this.f34664e = atVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ar(this.f34661b, this.f34662c, this.f34663d, this.f34664e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ar) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34660a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.reports_v2.c.e eVar = this.f34661b;
            if (eVar.a() == com.waze.reports_v2.c.f.f34484b) {
                this.f34662c.f34667c.F(dn.f34440j);
            }
            this.f34660a = 1;
            obj = eVar.b().c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.waze.reports_v2.c.d dVar = (com.waze.reports_v2.c.d) obj;
        if (dVar instanceof com.waze.reports_v2.c.b) {
            as asVar = this.f34662c;
            com.waze.reports_v2.b.q qVar = this.f34663d;
            com.waze.reports_v2.b.at atVar = this.f34664e;
            asVar.f34668d.b("Could not send report - " + qVar + ", " + atVar);
            asVar.f34667c.F(dn.f34439i);
        } else {
            if (!(dVar instanceof com.waze.reports_v2.c.c)) {
                throw new h.i();
            }
            com.waze.reports_v2.c.c cVar = (com.waze.reports_v2.c.c) dVar;
            long jA = cVar.a();
            as asVar2 = this.f34662c;
            if (jA > 0) {
                asVar2.f34669e.b(new com.waze.reports_v2.b.ap((int) cVar.a(), com.waze.reports_v2.b.ab.f34010b));
            } else {
                asVar2.f34668d.g("User reported successfully but got invalid points: " + cVar.a());
            }
        }
        return h.ab.f48028a;
    }
}
