package com.waze.app_nav.a;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class an extends az {

    /* renamed from: a, reason: collision with root package name */
    private final ao f15113a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ao aoVar) {
        super(null);
        h.g.b.x.f(aoVar, "controller");
        this.f15113a = aoVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f15113a;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        ax axVar = (ax) obj;
        h.g.b.x.f(axVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(axVar, av.f15121a)) {
            return;
        }
        if (axVar instanceof aw) {
            throw null;
        }
        if (!(axVar instanceof au)) {
            throw new h.i();
        }
        D(((au) axVar).a());
    }
}
