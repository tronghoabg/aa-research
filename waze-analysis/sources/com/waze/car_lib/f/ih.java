package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ih extends com.waze.car_lib.bm implements org.a.d.a.a {

    /* renamed from: d, reason: collision with root package name */
    private final il f19699d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.install.a f19700e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f19701f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19702g;

    /* renamed from: h, reason: collision with root package name */
    private com.waze.sharedui.profile.b f19703h;

    /* renamed from: i, reason: collision with root package name */
    private com.waze.sharedui.profile.b f19704i;

    /* renamed from: j, reason: collision with root package name */
    private com.waze.sharedui.profile.b f19705j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih(il ilVar, com.waze.install.a aVar, com.waze.shared_infra.o.a aVar2) {
        super((byte[]) null);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("StartAppCoordinator");
        h.g.b.x.e(eVarD, "create(...)");
        h.g.b.x.f(ilVar, "controller");
        h.g.b.x.f(aVar, "geoConfigController");
        h.g.b.x.f(aVar2, "stringProvider");
        h.g.b.x.f(eVarD, "logger");
        this.f19699d = ilVar;
        this.f19700e = aVar;
        this.f19701f = aVar2;
        this.f19702g = eVarD;
    }

    @Override // com.waze.shared_infra.coordinators.o
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public il b() {
        return this.f19699d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ void g(Object obj) {
        com.waze.beacons.n nVar = (com.waze.beacons.n) obj;
        h.g.b.x.f(nVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(nVar, is.f19727a)) {
            if (this.f19703h == null) {
                com.waze.car_lib.screens.cr crVar = new com.waze.car_lib.screens.cr(a(), this.f19701f);
                crVar.disableBackPresses();
                this.f19703h = J(crVar, true);
                return;
            }
            return;
        }
        if (h.g.b.x.n(nVar, io.f19723a)) {
            this.f19702g.a("handling event End");
            com.waze.sharedui.profile.b bVar = this.f19704i;
            if (bVar != null) {
                bVar.p();
            }
            kotlinx.coroutines.aj.z(A(), null, null, new ge(this, (h.c.e) null, 4), 3);
            return;
        }
        if (h.g.b.x.n(nVar, it.f19728a)) {
            this.f19702g.a("handling WaitForLoginState");
            com.waze.car_lib.screens.de deVar = new com.waze.car_lib.screens.de(b(), a());
            deVar.disableBackPresses();
            this.f19704i = J(deVar, true);
            return;
        }
        if (h.g.b.x.n(nVar, iq.f19725a)) {
            this.f19702g.a("handling login");
            kotlinx.coroutines.aj.z(A(), null, null, new ge(this, (h.c.e) null, 5, (byte[]) null), 3);
            return;
        }
        if (nVar instanceof ir) {
            this.f19702g.a("handling ShowLoginSucceededScreen");
            com.waze.sharedui.profile.b bVar2 = this.f19704i;
            if (bVar2 != null) {
                bVar2.p();
            }
            this.f19705j = J(new com.waze.car_lib.screens.ai(b(), a()), true);
            return;
        }
        if (h.g.b.x.n(nVar, in.f19722a)) {
            this.f19702g.a("handling CloseLoginSucceededScreen");
            com.waze.sharedui.profile.b bVar3 = this.f19705j;
            if (bVar3 != null) {
                bVar3.p();
                return;
            }
            return;
        }
        if (!h.g.b.x.n(nVar, ip.f19724a)) {
            throw new h.i();
        }
        this.f19702g.a("handling KillSwitch");
        com.waze.car_lib.screens.w wVar = new com.waze.car_lib.screens.w(a(), com.waze.car_lib.r.ah.f20941a);
        wVar.disableBackPresses();
        J(wVar, true);
    }
}
