package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ic extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final id f19694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(id idVar) {
        super((byte[]) null);
        h.g.b.x.f(idVar, "controller");
        this.f19694d = idVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19694d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.authentication.ax axVar = (com.waze.authentication.ax) obj;
        h.g.b.x.f(axVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(axVar, Cif.f19697a)) {
            J(new com.waze.car_lib.screens.cq(this.f19694d, a()), true);
        } else {
            if (!h.g.b.x.n(axVar, ie.f19696a)) {
                throw new h.i();
            }
            D(ig.f19698a);
        }
    }
}
