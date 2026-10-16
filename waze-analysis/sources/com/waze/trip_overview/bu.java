package com.waze.trip_overview;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bu extends com.waze.shared_infra.coordinators.o {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f41122a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.app_nav.a.v f41123b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(bv bvVar, com.waze.app_nav.a.v vVar) {
        super(null, 3);
        h.g.b.x.f(bvVar, NotificationCompat.CATEGORY_EVENT);
        h.g.b.x.f(vVar, "controller");
        this.f41123b = vVar;
        this.f41122a = h.g.b(h.h.f48130a, new l(this, 2));
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f41123b;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.speech.k kVar = (com.waze.speech.k) obj;
        h.g.b.x.f(kVar, NotificationCompat.CATEGORY_EVENT);
        if (!(kVar instanceof bv)) {
            throw new h.i();
        }
        bv bvVar = (bv) kVar;
        ((ac) this.f41122a.getValue()).d(bvVar.j(), bvVar.a(), bvVar.k(), bvVar.c(), bvVar.b(), bvVar.i(), new com.waze.trip_overview.c.a.d(this));
    }
}
