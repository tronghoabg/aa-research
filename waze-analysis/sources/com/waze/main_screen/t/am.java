package com.waze.main_screen.t;

import com.waze.reports_v2.presentation.a.az;
import com.waze.sharedrive.e.cc;
import com.waze.ui.l.cg;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    private final ch f27487a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.p.g f27488b;

    /* renamed from: c, reason: collision with root package name */
    private final az f27489c;

    /* renamed from: d, reason: collision with root package name */
    private final cg f27490d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ui.j.j f27491e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.main_screen.v.m f27492f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.main_screen.v.o f27493g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.main_screen.u.b.a f27494h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.main_screen.i.a.e f27495i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.main_screen.ab f27496j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.main_screen.ab.a.m f27497k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.main_screen.af.b.i f27498l;
    private final com.waze.main_screen.ad.a.h m;
    private final com.waze.main_screen.ae.a.d n;
    private final com.waze.main_screen.r.a.c o;
    private final com.waze.main_screen.j.i p;
    private final com.waze.view.popups.b.m q;
    private final com.waze.sound.e.j r;
    private final cc s;
    private final com.waze.main_screen.c.an t;
    private final com.waze.tide.a.a u;
    private final com.waze.main_screen.w.a.a v;
    private final h.g.a.a w;
    private final ch x;
    private final com.waze.reports_v2.presentation.a.ab y;

    public am(ch chVar, com.waze.ui.p.g gVar, az azVar, com.waze.reports_v2.presentation.a.ab abVar, cg cgVar, com.waze.ui.j.j jVar, com.waze.main_screen.v.m mVar, com.waze.main_screen.v.o oVar, com.waze.main_screen.u.b.a aVar, com.waze.main_screen.i.a.e eVar, com.waze.main_screen.ab abVar2, com.waze.main_screen.ab.a.m mVar2, com.waze.main_screen.af.b.i iVar, com.waze.main_screen.ad.a.h hVar, com.waze.main_screen.ae.a.d dVar, com.waze.main_screen.r.a.c cVar, com.waze.main_screen.j.i iVar2, com.waze.view.popups.b.m mVar3, com.waze.sound.e.j jVar2, cc ccVar, com.waze.main_screen.c.an anVar, com.waze.tide.a.a aVar2, com.waze.main_screen.w.a.a aVar3, h.g.a.a aVar4) {
        h.g.b.x.f(chVar, "screenState");
        h.g.b.x.f(gVar, "mainMapState");
        h.g.b.x.f(azVar, "reportMenuState");
        h.g.b.x.f(cgVar, "insightState");
        h.g.b.x.f(jVar, "hamburgerButtonStateHolder");
        h.g.b.x.f(mVar, "promotionalChipState");
        h.g.b.x.f(oVar, "promotionalChipStateHolder");
        h.g.b.x.f(aVar, "predictionCardState");
        h.g.b.x.f(eVar, "floatingNotificationState");
        h.g.b.x.f(abVar2, "startStateSheetState");
        h.g.b.x.f(mVar2, "popupsStateHolder");
        h.g.b.x.f(iVar, "wazeAsksStateHolder");
        h.g.b.x.f(hVar, "trafficBarStateHolder");
        h.g.b.x.f(cVar, "notificationMessageStateHolder");
        h.g.b.x.f(iVar2, "googleAssistantActionsStateHolder");
        h.g.b.x.f(mVar3, "myParkingPhotoStateHolder");
        h.g.b.x.f(aVar2, "tideBluetoothPermissionStateHolder");
        h.g.b.x.f(aVar3, "quickSettingsStateHolder");
        h.g.b.x.f(aVar4, "onSavedParkingHandled");
        this.f27487a = chVar;
        this.f27488b = gVar;
        this.f27489c = azVar;
        this.y = abVar;
        this.f27490d = cgVar;
        this.f27491e = jVar;
        this.f27492f = mVar;
        this.f27493g = oVar;
        this.f27494h = aVar;
        this.f27495i = eVar;
        this.f27496j = abVar2;
        this.f27497k = mVar2;
        this.f27498l = iVar;
        this.m = hVar;
        this.n = dVar;
        this.o = cVar;
        this.p = iVar2;
        this.q = mVar3;
        this.r = jVar2;
        this.s = ccVar;
        this.t = anVar;
        this.u = aVar2;
        this.v = aVar3;
        this.w = aVar4;
        this.x = aVar3.a();
    }

    public final void A() {
        com.waze.sound.e.j jVar = this.r;
        if (jVar != null) {
            jVar.e();
        } else {
            this.v.c("quick_sound_settings");
        }
    }

    public final com.waze.reports_v2.presentation.a.ab B() {
        return this.y;
    }

    public final com.waze.main_screen.ab a() {
        return this.f27496j;
    }

    public final com.waze.main_screen.c.an b() {
        return this.t;
    }

    public final com.waze.main_screen.i.a.e c() {
        return this.f27495i;
    }

    public final com.waze.main_screen.j.i d() {
        return this.p;
    }

    public final com.waze.main_screen.r.a.c e() {
        return this.o;
    }

    public final com.waze.main_screen.u.b.a f() {
        return this.f27494h;
    }

    public final com.waze.main_screen.v.m g() {
        return this.f27492f;
    }

    public final com.waze.main_screen.v.o h() {
        return this.f27493g;
    }

    public final com.waze.main_screen.ab.a.m i() {
        return this.f27497k;
    }

    public final com.waze.main_screen.ad.a.h j() {
        return this.m;
    }

    public final com.waze.main_screen.ae.a.d k() {
        return this.n;
    }

    public final com.waze.main_screen.af.b.i l() {
        return this.f27498l;
    }

    public final az m() {
        return this.f27489c;
    }

    public final cc n() {
        return this.s;
    }

    public final com.waze.sound.e.j o() {
        return this.r;
    }

    public final com.waze.tide.a.a p() {
        return this.u;
    }

    public final com.waze.ui.j.j q() {
        return this.f27491e;
    }

    public final cg r() {
        return this.f27490d;
    }

    public final com.waze.ui.p.g s() {
        return this.f27488b;
    }

    public final com.waze.view.popups.b.m t() {
        return this.q;
    }

    public final h.g.a.a u() {
        return this.w;
    }

    public final ch v() {
        return this.x;
    }

    public final ch w() {
        return this.f27487a;
    }

    public final void x() {
        this.v.b();
    }

    public final void y() {
        this.v.c("quick_map_settings");
    }

    public final void z() {
        this.v.c("quick_navigation");
    }
}
