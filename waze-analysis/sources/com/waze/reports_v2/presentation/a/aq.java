package com.waze.reports_v2.presentation.a;

import com.waze.reports_v2.c.dn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34654a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.c.e f34655b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ as f34656c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.b.q f34657d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.b.at f34658e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.b.i f34659f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(com.waze.reports_v2.c.e eVar, as asVar, com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar, com.waze.reports_v2.b.i iVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f34655b = eVar;
        this.f34656c = asVar;
        this.f34657d = qVar;
        this.f34658e = atVar;
        this.f34659f = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new aq(this.f34655b, this.f34656c, this.f34657d, this.f34658e, this.f34659f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34654a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f34654a = 1;
            obj = this.f34655b.b().c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.waze.reports_v2.c.d dVar = (com.waze.reports_v2.c.d) obj;
        if (dVar instanceof com.waze.reports_v2.c.b) {
            as asVar = this.f34656c;
            com.waze.reports_v2.b.q qVar = this.f34657d;
            com.waze.reports_v2.b.at atVar = this.f34658e;
            asVar.f34668d.b("Could not send report - " + qVar + ", " + atVar);
            asVar.f34667c.F(dn.f34439i);
            asVar.f34670f.c();
        } else {
            if (!(dVar instanceof com.waze.reports_v2.c.c)) {
                throw new h.i();
            }
            com.waze.reports_v2.c.c cVar = (com.waze.reports_v2.c.c) dVar;
            long jA = cVar.a();
            as asVar2 = this.f34656c;
            if (jA > 0) {
                asVar2.f34669e.b(new com.waze.reports_v2.b.ap((int) cVar.a(), com.waze.reports_v2.b.ab.f34010b));
            } else {
                com.waze.reports_v2.b.q qVar2 = this.f34657d;
                com.waze.reports_v2.b.at atVar2 = this.f34658e;
                asVar2.f34668d.g("User reported " + qVar2 + ", " + atVar2 + " successfully but got invalid points: " + cVar.a());
            }
            this.f34656c.f34670f.b(this.f34657d, this.f34658e, this.f34659f);
        }
        return h.ab.f48028a;
    }
}
