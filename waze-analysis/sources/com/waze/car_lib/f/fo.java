package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fo extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final ft f19588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(ft ftVar) {
        super((byte[]) null);
        h.g.b.x.f(ftVar, "controller");
        this.f19588d = ftVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19588d;
    }

    public final ft f() {
        return this.f19588d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.car_lib.m.c cVar = (com.waze.car_lib.m.c) obj;
        h.g.b.x.f(cVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(cVar, fq.f19590a)) {
            return;
        }
        if (cVar instanceof fr) {
            J(new com.waze.car_lib.screens.be(this.f19588d, ((fr) cVar).a(), a()), true);
            return;
        }
        if (cVar instanceof fs) {
            D(new fn(((fs) cVar).a()));
        } else {
            if (!h.g.b.x.n(cVar, fp.f19589a)) {
                throw new h.i();
            }
            D(fm.f19586a);
        }
    }
}
