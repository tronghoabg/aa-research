package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cd extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final ch f19448d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(ch chVar) {
        super((byte[]) null);
        h.g.b.x.f(chVar, "controller");
        this.f19448d = chVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19448d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ void g(Object obj) {
        h.g.b.x.f((h.ab) obj, NotificationCompat.CATEGORY_EVENT);
        org.a.d.k.b bVarC = c();
        int i2 = h.g.b.ar.f48106a;
        J(new com.waze.car_lib.screens.j(a(), (com.waze.car_lib.r.k) bVarC.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null)), true);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(this.f19448d.b(), new cc(this, null)), A());
    }
}
