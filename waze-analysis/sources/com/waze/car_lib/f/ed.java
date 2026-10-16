package com.waze.car_lib.f;

import android.content.Intent;
import androidx.car.app.AppManager;
import androidx.car.app.CarContext;
import androidx.core.app.NotificationCompat;
import com.waze.R;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ed extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final ej f19522d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.navigate.db f19523e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.car_lib.d.b f19524f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19525g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19526h;

    /* renamed from: i, reason: collision with root package name */
    private com.waze.sharedui.profile.b f19527i;

    /* renamed from: j, reason: collision with root package name */
    private com.waze.sharedui.profile.b f19528j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(ej ejVar, com.waze.navigate.db dbVar, com.waze.car_lib.d.b bVar, com.waze.shared_infra.i.b bVar2) {
        super((byte[]) null);
        h.g.b.x.f(ejVar, "controller");
        h.g.b.x.f(dbVar, "navigationController");
        h.g.b.x.f(bVar, "bluetoothAccessHelper");
        h.g.b.x.f(bVar2, "nonFatalErrorReporterInterface");
        this.f19522d = ejVar;
        this.f19523e = dbVar;
        this.f19524f = bVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("NavigationCoordinator");
        h.g.b.x.e(eVarD, "create(...)");
        this.f19525g = eVarD;
    }

    public static final /* synthetic */ void k(ed edVar) {
        if (edVar.f19526h) {
            edVar.f19523e.f();
            return;
        }
        ((AppManager) edVar.a().getCarService(AppManager.class)).showToast("Press back again to stop navigation", 1);
        edVar.f19526h = true;
        kotlinx.coroutines.aj.z(edVar.A(), null, null, new aw(edVar, (h.c.e) null, 13, (byte[][]) null), 3);
    }

    public static final /* synthetic */ Object m(ed edVar, com.waze.settings.tree.a.d dVar, h.c.e eVar) {
        if (!(dVar instanceof com.waze.shared_infra.coordinators.d)) {
            return h.ab.f48028a;
        }
        com.waze.c.c.e eVar2 = (com.waze.c.c.e) ((com.waze.shared_infra.coordinators.d) dVar).f();
        if (eVar2 instanceof com.waze.car_lib.a.n) {
            com.waze.shared_infra.i.e eVar3 = edVar.f19525g;
            com.waze.av.b.n nVarP = ((com.waze.car_lib.a.n) eVar2).p();
            Objects.toString(nVarP);
            eVar3.a("AdPreview ended with Navigate to ".concat(nVarP.toString()));
            org.a.d.k.b bVarC = edVar.c();
            int i2 = h.g.b.ar.f48106a;
            com.waze.car_lib.o oVar = (com.waze.car_lib.o) bVarC.a(new h.g.b.m(com.waze.car_lib.o.class), null, null);
            com.waze.car_lib.bm bmVar = (com.waze.car_lib.bm) oVar.b().a(new h.g.b.m(a.class), null, null);
            bmVar.d(oVar.a());
            bmVar.e(oVar.b());
            bmVar.E(new com.waze.car_lib.br());
            Object objX = edVar.x(bmVar, new com.waze.c.e.an(eVar2, 9), eVar);
            if (objX == h.c.a.a.f48038a) {
                return objX;
            }
        } else if (eVar2 instanceof com.waze.car_lib.a.o) {
            edVar.f19525g.a("AdPreview ended with ReportAlert");
            ed edVar2 = edVar;
            org.a.d.k.b bVarC2 = edVar.c();
            int i3 = h.g.b.ar.f48106a;
            com.waze.car_lib.o oVar2 = (com.waze.car_lib.o) bVarC2.a(new h.g.b.m(com.waze.car_lib.o.class), null, null);
            com.waze.car_lib.bm bmVar2 = (com.waze.car_lib.bm) oVar2.b().a(new h.g.b.m(gf.class), null, null);
            bmVar2.d(oVar2.a());
            bmVar2.e(oVar2.b());
            bmVar2.E(new com.waze.car_lib.br());
            Object objX2 = edVar2.x(bmVar2, new com.waze.perf.p(11), eVar);
            if (objX2 == h.c.a.a.f48038a) {
                return objX2;
            }
        } else {
            if (!h.g.b.x.n(eVar2, com.waze.car_lib.a.l.f18839a) && !h.g.b.x.n(eVar2, com.waze.car_lib.a.m.f18840a)) {
                throw new h.i();
            }
            edVar.f19525g.a("AdPreview ended with Back/Exit");
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ Object n(ed edVar, com.waze.settings.tree.a.d dVar, com.waze.modules.navigation.ah ahVar, h.c.e eVar) {
        if (!(dVar instanceof com.waze.shared_infra.coordinators.d)) {
            return h.ab.f48028a;
        }
        com.waze.design_components.d.b bVar = (com.waze.design_components.d.b) ((com.waze.shared_infra.coordinators.d) dVar).f();
        if (!(bVar instanceof ai)) {
            if (h.g.b.x.n(bVar, ag.f19356a) || h.g.b.x.n(bVar, ah.f19357a)) {
                return h.ab.f48028a;
            }
            throw new h.i();
        }
        org.a.d.k.b bVarC = edVar.c();
        int i2 = h.g.b.ar.f48106a;
        com.waze.car_lib.o oVar = (com.waze.car_lib.o) bVarC.a(new h.g.b.m(com.waze.car_lib.o.class), null, null);
        com.waze.car_lib.bm bmVar = (com.waze.car_lib.bm) oVar.b().a(new h.g.b.m(a.class), null, null);
        bmVar.d(oVar.a());
        bmVar.e(oVar.b());
        bmVar.E(new com.waze.car_lib.br());
        Object objX = edVar.x(bmVar, new com.waze.c.d.a(bVar, ahVar, 13), eVar);
        return objX != h.c.a.a.f48038a ? h.ab.f48028a : objX;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19522d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.app_nav.hub.b.m mVar = (com.waze.app_nav.hub.b.m) obj;
        h.g.b.x.f(mVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(mVar, ep.f19561a)) {
            CarContext carContextA = a();
            ej ejVar = this.f19522d;
            com.waze.car_lib.screens.aw awVar = new com.waze.car_lib.screens.aw(carContextA, ejVar, ejVar.f());
            awVar.addBackPressedHandler(new eb(this));
            J(awVar, true);
            return;
        }
        if (h.g.b.x.n(mVar, eq.f19562a)) {
            D(ff.f19580a);
            return;
        }
        h.g.a.a aVar = null;
        if (mVar instanceof eu) {
            kotlinx.coroutines.aj.z(A(), null, null, new d(mVar, this, (h.c.e) null, 14), 3);
            return;
        }
        if (h.g.b.x.n(mVar, es.f19565a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new aw(this, (h.c.e) null, 10, (int[]) null), 3);
            return;
        }
        if (h.g.b.x.n(mVar, el.f19557a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new aw(this, (h.c.e) null, 11, (boolean[]) null), 3);
            return;
        }
        if (mVar instanceof ek) {
            kotlinx.coroutines.aj.z(A(), null, null, new ec(this, ((ek) mVar).g(), null), 3);
            return;
        }
        int i2 = 12;
        if (h.g.b.x.n(mVar, fc.f19577a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new aw(this, (h.c.e) null, 12, (float[]) null), 3);
            return;
        }
        if (mVar instanceof fe) {
            if (this.f19527i == null) {
                CarContext carContextA2 = a();
                ej ejVar2 = this.f19522d;
                this.f19527i = J(new com.waze.car_lib.screens.db(carContextA2, ejVar2, ejVar2.f()), true);
                return;
            }
            return;
        }
        if (h.g.b.x.n(mVar, fd.f19578a)) {
            com.waze.sharedui.profile.b bVar = this.f19527i;
            if (bVar != null) {
                bVar.p();
            }
            this.f19527i = null;
            return;
        }
        if (mVar instanceof ew) {
            J(new com.waze.car_lib.screens.au(a(), new com.waze.car_lib.screens.aq(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_PERMISSION_TITLE, R.string.AAOS_ROUTING_ALERT_BLUETOOTH_PERMISSION_TEXT, new com.waze.car_lib.screens.ar(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_DECLINE, false, true, 2), new com.waze.car_lib.screens.ar(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_NEXT, true, false, 4)), ((ew) mVar).g(), i2), true);
            return;
        }
        if (mVar instanceof et) {
            kotlinx.coroutines.aj.z(A(), null, null, new ak(mVar, this, (h.c.e) null, 5), 3);
            return;
        }
        int i3 = 28;
        if (h.g.b.x.n(mVar, ey.f19572a)) {
            this.f19528j = J(new com.waze.car_lib.screens.au(a(), new com.waze.car_lib.screens.aq(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_PERMISSION_CHECK_PHONE_TITLE, R.string.AAOS_ROUTING_ALERT_BLUETOOTH_PERMISSION_CHECK_PHONE_TEXT, new com.waze.car_lib.screens.ar(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_OK, true, true)), aVar, i3), true);
            return;
        }
        if (h.g.b.x.n(mVar, en.f19559a)) {
            com.waze.sharedui.profile.b bVar2 = this.f19528j;
            if (bVar2 != null) {
                bVar2.p();
            }
            this.f19528j = null;
            return;
        }
        if (mVar instanceof ez) {
            J(new com.waze.car_lib.screens.au(a(), new com.waze.car_lib.screens.aq(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_ENABLE_TITLE, R.string.AAOS_ROUTING_ALERT_BLUETOOTH_ENABLE_TEXT, new com.waze.car_lib.screens.ar(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_DECLINE, false, true, 2), new com.waze.car_lib.screens.ar(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_ACCEPT, true, false, 4)), ((ez) mVar).g(), i2), true);
            return;
        }
        if (h.g.b.x.n(mVar, em.f19558a)) {
            com.waze.car_lib.d.b bVar3 = this.f19524f;
            CarContext carContextA3 = a();
            h.g.b.x.f(carContextA3, "carContext");
            if (bVar3.a()) {
                Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                intent.setFlags(268435456);
                com.waze.car_lib.r.bq.h(carContextA3, intent);
                return;
            }
            return;
        }
        if (h.g.b.x.n(mVar, ex.f19571a)) {
            J(new com.waze.car_lib.screens.au(a(), new com.waze.car_lib.screens.aq(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_ENABLE_CHECK_PHONE_TITLE, R.string.AAOS_ROUTING_ALERT_BLUETOOTH_ENABLE_CHECK_PHONE_TEXT, new com.waze.car_lib.screens.ar(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_OK, true, true)), aVar, i3), true);
            return;
        }
        if (mVar instanceof fb) {
            kotlinx.coroutines.aj.z(A(), null, null, new d(this, mVar, (h.c.e) null, 15), 3);
            return;
        }
        if (mVar instanceof fa) {
            kotlinx.coroutines.aj.z(A(), null, null, new d(this, mVar, (h.c.e) null, 16, (byte[]) null), 3);
            return;
        }
        if (!(mVar instanceof eo)) {
            if (mVar instanceof er) {
                kotlinx.coroutines.aj.z(A(), null, null, new ak(this, mVar, (h.c.e) null, 3), 3);
                return;
            } else {
                if (!(mVar instanceof ev)) {
                    throw new h.i();
                }
                kotlinx.coroutines.aj.z(A(), null, null, new ak(this, mVar, (h.c.e) null, 4, (byte[]) null), 3);
                return;
            }
        }
        com.waze.navigate.a.d dVarG = ((eo) mVar).g();
        if (dVarG instanceof com.waze.navigate.a.b) {
            ((com.waze.navigate.a.b) dVarG).a();
            return;
        }
        if (!(dVarG instanceof com.waze.navigate.a.c)) {
            throw new h.i();
        }
        com.waze.navigate.a.i iVarA = ((com.waze.navigate.a.c) dVarG).a();
        if (!(iVarA instanceof com.waze.navigate.a.g)) {
            if (!h.g.b.x.n(iVarA, com.waze.navigate.a.h.f30942a)) {
                throw new h.i();
            }
            this.f19522d.s();
            return;
        }
        com.waze.settings.b.l lVarA = ((com.waze.navigate.a.g) iVarA).a();
        if (lVarA instanceof com.waze.settings.b.g) {
            kotlinx.coroutines.aj.z(A(), null, null, new d(this, lVarA, (h.c.e) null, 17), 3);
            return;
        }
        if (h.g.b.x.n(lVarA, com.waze.settings.b.i.f36840a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new aw(this, (h.c.e) null, 6), 3);
            return;
        }
        if (h.g.b.x.n(lVarA, com.waze.settings.b.k.f36842a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new aw(this, (h.c.e) null, 7, (byte[]) null), 3);
        } else if (h.g.b.x.n(lVarA, com.waze.settings.b.j.f36841a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new aw(this, (h.c.e) null, 8, (char[]) null), 3);
        } else {
            if (!h.g.b.x.n(lVarA, com.waze.settings.b.h.f36839a)) {
                throw new h.i();
            }
            kotlinx.coroutines.aj.z(A(), null, null, new aw(this, (h.c.e) null, 9, (short[]) null), 3);
        }
    }
}
