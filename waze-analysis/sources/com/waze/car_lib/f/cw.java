package com.waze.car_lib.f;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cw extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.h.g f19471a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.c.a f19472b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.login.a f19473c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19474d;

    /* renamed from: e, reason: collision with root package name */
    private kotlinx.coroutines.br f19475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(com.waze.car_lib.h.g gVar, com.waze.car_lib.c.a aVar, com.waze.car_lib.login.a aVar2, com.waze.car_lib.login.m mVar, kotlinx.coroutines.af afVar, com.waze.shared_infra.i.e eVar) {
        super(cy.f19477a, afVar);
        h.g.b.x.f(gVar, "locationAccessHelper");
        h.g.b.x.f(aVar, "auditReporter");
        h.g.b.x.f(aVar2, "guestSignupConfiguration");
        h.g.b.x.f(mVar, "loginController");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(eVar, "logger");
        this.f19471a = gVar;
        this.f19472b = aVar;
        this.f19473c = aVar2;
        this.f19474d = eVar;
    }

    public static final /* synthetic */ void e(cw cwVar) {
        cwVar.f19474d.a("openLocationPermissionDenied");
        cwVar.H(dd.f19486a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(CarContext carContext) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.k.b bVarC2;
        h.g.b.m mVar2;
        com.waze.shared_infra.i.e eVar = this.f19474d;
        eVar.a("finishWithLocation");
        kotlinx.coroutines.br brVar = this.f19475e;
        if (brVar != null) {
            brVar.s(null);
        }
        cw cwVar = this;
        boolean z = cwVar instanceof org.a.d.a.b;
        if (z) {
            bVarC = ((org.a.d.a.b) cwVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.car_lib.h.b.class);
        } else {
            bVarC = cwVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.car_lib.h.b.class);
        }
        ((com.waze.car_lib.h.b) bVarC.a(mVar, null, null)).a(carContext);
        if (z) {
            bVarC2 = ((org.a.d.a.b) cwVar).l();
            mVar2 = new h.g.b.m(com.waze.location.o.class);
        } else {
            bVarC2 = cwVar.getKoin().a().c();
            mVar2 = new h.g.b.m(com.waze.location.o.class);
        }
        ((com.waze.location.o) bVarC2.a(mVar2, null, null)).start();
        eVar.a("sending event End");
        H(cx.f19476a);
    }

    public final void f(CarContext carContext) {
        h.g.b.x.f(carContext, "carContext");
        com.waze.shared_infra.i.e eVar = this.f19474d;
        eVar.a("checkAndRequestPermissionIfNeeded");
        CarContext carContext2 = carContext;
        if (com.waze.car_lib.h.g.f(carContext2) && com.waze.car_lib.h.g.e(carContext2)) {
            eVar.a("hasFullLocationAccess");
            this.f19473c.a();
            eVar.a("finishWithLocation");
            p(carContext);
            return;
        }
        if (com.waze.car_lib.h.g.f(carContext2)) {
            eVar.a("sending OpenRequestPermissions");
            H(dg.f19489a);
        } else {
            eVar.a("sending OpenLocationAccessFailedScreen");
            H(db.f19484a);
        }
    }

    public final void g(CarContext carContext) {
        h.g.b.x.f(carContext, "carContext");
        com.waze.shared_infra.i.e eVar = this.f19474d;
        eVar.a("onLocationPermissionDeniedScreenResumed");
        if (com.waze.car_lib.h.g.e(carContext)) {
            eVar.a("locationPermissionsGranted");
            f(carContext);
        }
    }

    public final void h() {
        this.f19474d.a("openLegalNotices");
        H(da.f19483a);
    }

    public final void i() {
        this.f19474d.a("openLocationSettingsClicked");
        H(dc.f19485a);
    }

    public final void j() {
        this.f19474d.a("openPermissionSettingsClicked");
        H(de.f19487a);
    }

    public final void k() {
        this.f19474d.a("openPrivacyPolicy");
        H(df.f19488a);
    }

    public final void l() {
        this.f19474d.a("openTermsOfService");
        H(dh.f19490a);
    }

    public final void m(com.waze.car_lib.p.bh bhVar) {
        h.g.b.x.f(bhVar, "uiState");
        this.f19474d.a("privacyPolicyClicked");
        H(new cz(bhVar));
    }

    public final void n(CarContext carContext) {
        h.g.b.x.f(carContext, "carContext");
        this.f19474d.a("requestLocationAccess");
        kotlinx.coroutines.br brVar = this.f19475e;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f19475e = kotlinx.coroutines.aj.z(G(), null, null, new d(this, carContext, (h.c.e) null, 12), 3);
    }

    public final void o(com.waze.car_lib.p.bh bhVar) {
        h.g.b.x.f(bhVar, "uiState");
        this.f19474d.a("termsOfServiceClicked");
        H(new cz(bhVar));
    }
}
