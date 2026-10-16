package com.waze.app_nav.a;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae extends az {

    /* renamed from: a, reason: collision with root package name */
    private final ag f15103a;

    /* renamed from: b, reason: collision with root package name */
    private com.waze.sharedui.profile.b f15104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(ag agVar) {
        super(null);
        h.g.b.x.f(agVar, "controller");
        this.f15103a = agVar;
    }

    public final ag a() {
        return this.f15103a;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f15103a;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        am amVar = (am) obj;
        h.g.b.x.f(amVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(amVar, al.f15112a)) {
            return;
        }
        if (h.g.b.x.n(amVar, ai.f15109a)) {
            this.f15104b = J(new com.waze.main_screen.af(), true);
            return;
        }
        if (h.g.b.x.n(amVar, ak.f15111a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new i(this, (h.c.e) null, 3), 3);
            return;
        }
        if (h.g.b.x.n(amVar, ah.f15108a)) {
            D(h.ab.f48028a);
        } else {
            if (!h.g.b.x.n(amVar, aj.f15110a)) {
                throw new h.i();
            }
            com.waze.sharedui.profile.b bVar = this.f15104b;
            if (bVar != null) {
                bVar.o();
            }
        }
    }
}
