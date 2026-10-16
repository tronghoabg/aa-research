package com.waze.modules.navigation;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d extends com.waze.shared_infra.coordinators.o {

    /* renamed from: a, reason: collision with root package name */
    private final bk f30420a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bk bkVar) {
        super(null, 3);
        h.g.b.x.f(bkVar, "controller");
        this.f30420a = bkVar;
    }

    public final bk a() {
        return this.f30420a;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f30420a;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        bo boVar = (bo) obj;
        h.g.b.x.f(boVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(boVar, bm.f30410a)) {
            return;
        }
        if (boVar instanceof bn) {
            kotlinx.coroutines.aj.z(A(), null, null, new ba(this, boVar, (h.c.e) null, 1), 3);
        } else {
            if (!(boVar instanceof bl)) {
                throw new h.i();
            }
            D(((bl) boVar).a());
        }
    }
}
