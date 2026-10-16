package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends dj {

    /* renamed from: d, reason: collision with root package name */
    private final t f19777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar) {
        super(tVar);
        h.g.b.x.f(tVar, "controller");
        this.f19777d = tVar;
    }

    @Override // com.waze.car_lib.f.dj, com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19777d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        h.g.b.x.f((com.waze.z.a.b.y) obj, NotificationCompat.CATEGORY_EVENT);
        J(new com.waze.car_lib.screens.ah(a()), true);
    }
}
