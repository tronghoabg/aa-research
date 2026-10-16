package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bv extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final bw f19438d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.o.d.a.j f19439e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f19440f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(bw bwVar, com.waze.o.d.a.j jVar, com.waze.shared_infra.o.a aVar) {
        super((byte[]) null);
        h.g.b.x.f(bwVar, "controller");
        h.g.b.x.f(jVar, "viewModelFactory");
        h.g.b.x.f(aVar, "stringProvider");
        this.f19438d = bwVar;
        this.f19439e = jVar;
        this.f19440f = aVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19438d;
    }

    public final bw f() {
        return this.f19438d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.z.a.be beVar = (com.waze.z.a.be) obj;
        h.g.b.x.f(beVar, NotificationCompat.CATEGORY_EVENT);
        if (!h.g.b.x.n(beVar, by.f19442a)) {
            if (!h.g.b.x.n(beVar, bx.f19441a)) {
                throw new h.i();
            }
            D(bz.f19443a);
        } else {
            com.waze.car_lib.r.f fVarA = this.f19439e.a(a());
            if (fVarA == null) {
                D(bz.f19443a);
            } else {
                kotlinx.coroutines.aj.z(A(), null, null, new d(this, fVarA, (h.c.e) null, 11), 3);
            }
        }
    }
}
