package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class iu extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final iv f19729d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(iv ivVar) {
        super((byte[]) null);
        h.g.b.x.f(ivVar, "controller");
        this.f19729d = ivVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19729d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.l.m mVar = (com.waze.l.m) obj;
        h.g.b.x.f(mVar, NotificationCompat.CATEGORY_EVENT);
        if (mVar instanceof iy) {
            J(new com.waze.car_lib.screens.cs(this.f19729d, a()), true);
        } else if (mVar instanceof iw) {
            D(iz.f19734a);
        } else {
            if (!(mVar instanceof ix)) {
                throw new h.i();
            }
            D(ja.f19736a);
        }
    }
}
