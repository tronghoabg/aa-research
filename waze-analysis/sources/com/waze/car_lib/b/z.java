package com.waze.car_lib.b;

import com.waze.AlerterController$Alerter$Type;
import com.waze.iv;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19151a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f19152b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.ad f19153c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ap f19154d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f19155e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.an.a.b f19156f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(kotlinx.coroutines.a.ad adVar, ap apVar, h.g.b.am amVar, com.waze.an.a.b bVar, h.c.e eVar) {
        super(2, eVar);
        this.f19153c = adVar;
        this.f19154d = apVar;
        this.f19155e = amVar;
        this.f19156f = bVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        z zVar = new z(this.f19153c, this.f19154d, this.f19155e, this.f19156f, eVar);
        zVar.f19152b = obj;
        return zVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((com.waze.j) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19151a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.j jVarZ = (com.waze.j) this.f19152b;
            kotlinx.coroutines.a.ad adVar = this.f19153c;
            ap apVar = this.f19154d;
            if (jVarZ.e() != AlerterController$Alerter$Type.DANGER_ZONE && jVarZ.e() != AlerterController$Alerter$Type.WAZE_TO_GOAL) {
                String strL = jVarZ.w() ? jVarZ.l() : null;
                String strK = jVarZ.k();
                jVarZ = com.waze.j.z(jVarZ, (strK == null || strK.length() == 0) ? jVarZ.o() : jVarZ.k(), strL, null, null, -81);
            }
            h.g.b.am amVar = this.f19155e;
            com.waze.an.a.b bVar = this.f19156f;
            this.f19151a = 1;
            if (adVar.g(ap.b(apVar, jVarZ, new com.waze.a.aa(amVar, bVar, 10), new iv(bVar, 13), new com.waze.a.aa(amVar, bVar, 11)), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
