package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jd extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final jg f19748d;

    /* renamed from: e, reason: collision with root package name */
    private com.waze.sharedui.profile.b f19749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(jg jgVar) {
        super((byte[]) null);
        h.g.b.x.f(jgVar, "controller");
        this.f19748d = jgVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19748d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.car_lib.b bVar = (com.waze.car_lib.b) obj;
        h.g.b.x.f(bVar, NotificationCompat.CATEGORY_EVENT);
        if (bVar instanceof jh) {
            J(new com.waze.car_lib.screens.ay(((jh) bVar).e(), this.f19748d, a()), true);
            return;
        }
        if (h.g.b.x.n(bVar, jj.f19755a)) {
            this.f19749e = J(new com.waze.car_lib.screens.dc(this.f19748d, a()), true);
        } else {
            if (!h.g.b.x.n(bVar, ji.f19754a)) {
                throw new h.i();
            }
            com.waze.sharedui.profile.b bVar2 = this.f19749e;
            if (bVar2 != null) {
                bVar2.o();
            }
        }
    }
}
