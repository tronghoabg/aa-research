package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cn extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final co f19461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(co coVar) {
        super((byte[]) null);
        h.g.b.x.f(coVar, "controller");
        this.f19461d = coVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19461d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        cu cuVar = (cu) obj;
        h.g.b.x.f(cuVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(cuVar, cs.f19465a)) {
            J(new com.waze.car_lib.screens.ac(a(), this.f19461d), true);
        } else if (h.g.b.x.n(cuVar, ct.f19466a)) {
            D(cq.f19463a);
        } else {
            if (!h.g.b.x.n(cuVar, cr.f19464a)) {
                throw new h.i();
            }
            D(cp.f19462a);
        }
    }
}
