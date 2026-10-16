package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ck extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final cl f19457d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f19458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(cl clVar, com.waze.shared_infra.o.a aVar) {
        super((byte[]) null);
        h.g.b.x.f(clVar, "controller");
        h.g.b.x.f(aVar, "stringProvider");
        this.f19457d = clVar;
        this.f19458e = aVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19457d;
    }

    public final cl f() {
        return this.f19457d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        cm cmVar = (cm) obj;
        h.g.b.x.f(cmVar, NotificationCompat.CATEGORY_EVENT);
        if (!h.g.b.x.n(cmVar, cm.f19460a)) {
            throw new h.i();
        }
        J(new com.waze.car_lib.screens.v(a(), this.f19457d, this.f19458e), true);
    }
}
