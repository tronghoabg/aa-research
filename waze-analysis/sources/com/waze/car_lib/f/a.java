package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.modules.navigation.bk f19330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.waze.modules.navigation.bk bkVar) {
        super((byte[]) null);
        h.g.b.x.f(bkVar, "controller");
        this.f19330d = bkVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19330d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final void bu(com.waze.settings.tree.a.d dVar) {
        h.g.b.x.f(dVar, "endEvent");
        com.waze.ads.c.e.e();
        super.bu(dVar);
    }

    public final com.waze.modules.navigation.bk f() {
        return this.f19330d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.modules.navigation.bo boVar = (com.waze.modules.navigation.bo) obj;
        h.g.b.x.f(boVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(boVar, com.waze.modules.navigation.bm.f30410a)) {
            return;
        }
        if (boVar instanceof com.waze.modules.navigation.bn) {
            kotlinx.coroutines.aj.z(A(), null, null, new d(this, boVar, (h.c.e) null, 1), 3);
        } else {
            if (!(boVar instanceof com.waze.modules.navigation.bl)) {
                throw new h.i();
            }
            D(((com.waze.modules.navigation.bl) boVar).a());
        }
    }
}
