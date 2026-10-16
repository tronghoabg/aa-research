package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ca extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final cb f19444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(cb cbVar) {
        super((byte[]) null);
        h.g.b.x.f(cbVar, "controller");
        this.f19444d = cbVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19444d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ void g(Object obj) {
        h.g.b.x.f((h.ab) obj, NotificationCompat.CATEGORY_EVENT);
        org.a.d.k.b bVarC = c();
        int i2 = h.g.b.ar.f48106a;
        J(new com.waze.car_lib.screens.i(a(), (com.waze.car_lib.r.h) bVarC.a(new h.g.b.m(com.waze.car_lib.r.h.class), null, null)), true);
    }
}
