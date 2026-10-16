package com.waze.main_screen.p;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.c.e.ce;
import com.waze.jni.protos.navigate.NavigationItem;
import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.navigate.dg;
import com.waze.navigate.en;
import com.waze.navigate.fo;
import com.waze.sharedrive.e.bw;
import com.waze.sharedrive.e.cc;
import com.waze.strings.DisplayStrings;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bs extends ViewModel {
    private final com.waze.main_screen.x.a A;
    private final com.waze.beacons.a.f B;
    private final com.waze.main_screen.p.a.b.b.af C;
    private final com.waze.sharedrive.e.bp D;
    private final cc E;
    private final com.waze.sound.e.m F;
    private final com.waze.main_screen.ae.a.d G;
    private final kotlinx.coroutines.b.bn H;
    private final ch I;
    private final com.waze.main_screen.p.b.a.b.t J;
    private final com.waze.reports_v2.presentation.bp K;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f27225a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f27226b;

    /* renamed from: c, reason: collision with root package name */
    private final dg f27227c;

    /* renamed from: d, reason: collision with root package name */
    private final en f27228d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.map.b.ai f27229e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bv.r f27230f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.main_screen.l.b.e f27231g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.main_screen.q.b.g f27232h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.notifications.b.e f27233i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.main_screen.d.a.c f27234j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.main_screen.b.a.d f27235k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.main_screen.j.a.g f27236l;
    private final com.waze.main_screen.ag.a.d m;
    private final com.waze.reports_v2.presentation.a.l n;
    private final ce o;
    private final com.waze.main_screen.c.a p;
    private final com.waze.main_screen.af.b.i q;
    private final com.waze.main_screen.s.c r;
    private final fo s;
    private final com.waze.main_screen.ab.a.m t;
    private final com.waze.main_screen.w.a.a u;
    private final com.waze.main_screen.r.a.c v;
    private final com.waze.reports_v2.c.an w;
    private final com.waze.main_screen.j.i x;
    private final com.waze.view.popups.b.m y;
    private final com.waze.c.e.i z;

    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [byte[], h.c.e, h.c.j, int[], kotlinx.coroutines.ag, short[]] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public bs(SavedStateHandle savedStateHandle, com.waze.shared_infra.i.e eVar, dg dgVar, en enVar, com.waze.main_screen.p.b.a.b.c cVar, com.waze.map.b.ai aiVar, com.waze.bv.r rVar, com.waze.main_screen.l.b.e eVar2, com.waze.main_screen.q.b.g gVar, com.waze.notifications.b.e eVar3, com.waze.main_screen.d.a.c cVar2, com.waze.main_screen.b.a.d dVar, com.waze.main_screen.j.a.g gVar2, com.waze.main_screen.ag.a.d dVar2, com.waze.reports_v2.presentation.a.l lVar, ce ceVar, com.waze.main_screen.ae.a.a aVar, com.waze.main_screen.c.a aVar2, com.waze.main_screen.p.a.b.b.ac acVar, com.waze.reports_v2.presentation.bf bfVar, bw bwVar, com.waze.sharedrive.e.bo boVar, com.waze.main_screen.af.b.i iVar, com.waze.main_screen.s.c cVar3, fo foVar, com.waze.main_screen.ab.a.m mVar, com.waze.main_screen.w.a.a aVar3, com.waze.main_screen.r.a.c cVar4, com.waze.reports_v2.c.an anVar, com.waze.main_screen.j.i iVar2, com.waze.view.popups.b.m mVar2, com.waze.c.e.i iVar3, com.waze.main_screen.x.a aVar4, com.waze.beacons.a.f fVar, com.waze.sound.e.k kVar) {
        com.waze.main_screen.ae.a.d dVarA;
        ?? r11;
        h.g.b.x.f(savedStateHandle, "savedStateHandle");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(dgVar, "navInfoProvider");
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(cVar, "navigationBarStateHolderFactory");
        h.g.b.x.f(aiVar, "mainMapController");
        h.g.b.x.f(rVar, "speedometerStateHolderFactory");
        h.g.b.x.f(eVar2, "navInstructionListStateHolderFactory");
        h.g.b.x.f(gVar, "nearingDestinationStateHolderFactory");
        h.g.b.x.f(eVar3, "notificationService");
        h.g.b.x.f(cVar2, "compassStateHolderFactory");
        h.g.b.x.f(dVar, "audioSdkButtonStateHolderFactory");
        h.g.b.x.f(gVar2, "googleAssistantButtonStateHolderFactory");
        h.g.b.x.f(dVar2, "zoomControlsStateHolderFactory");
        h.g.b.x.f(lVar, "reportPointsStateHolderFactory");
        h.g.b.x.f(ceVar, "openAlternativeRoutesService");
        h.g.b.x.f(aVar, "transportSdkButtonStateHolderFactory");
        h.g.b.x.f(aVar2, "buttonPackConfiguration");
        h.g.b.x.f(acVar, "etaDrawerStateHolderFactory");
        h.g.b.x.f(bfVar, "reportMenuButtonStateHolderFactory");
        h.g.b.x.f(bwVar, "shareDriveStateHolderFactory");
        h.g.b.x.f(boVar, "shareDriveMapIndicationStateHolderFactory");
        h.g.b.x.f(iVar, "wazeAsksStateHolder");
        h.g.b.x.f(cVar3, "viaBarStateHolder");
        h.g.b.x.f(foVar, "recenterBarStateHolder");
        h.g.b.x.f(mVar, "popupsStateHolder");
        h.g.b.x.f(aVar3, "quickSettingsStateHolder");
        h.g.b.x.f(cVar4, "notificationMessageStateHolder");
        h.g.b.x.f(anVar, "conversationalReportingActivationStateHolder");
        h.g.b.x.f(iVar2, "googleAssistantActionsStateHolder");
        h.g.b.x.f(mVar2, "myParkingPhotoStateHolder");
        h.g.b.x.f(iVar3, "alternateRoutesFTETooltipStateHolderFactory");
        h.g.b.x.f(aVar4, "rerouteSuggestionStateHolder");
        h.g.b.x.f(fVar, "beaconBluetoothPermissionStateHolder");
        h.g.b.x.f(kVar, "voiceGuidanceStateHolderFactory");
        this.f27225a = savedStateHandle;
        this.f27226b = eVar;
        this.f27227c = dgVar;
        this.f27228d = enVar;
        this.f27229e = aiVar;
        this.f27230f = rVar;
        this.f27231g = eVar2;
        this.f27232h = gVar;
        this.f27233i = eVar3;
        this.f27234j = cVar2;
        this.f27235k = dVar;
        this.f27236l = gVar2;
        this.m = dVar2;
        this.n = lVar;
        this.o = ceVar;
        this.p = aVar2;
        this.q = iVar;
        this.r = cVar3;
        this.s = foVar;
        this.t = mVar;
        this.u = aVar3;
        this.v = cVar4;
        this.w = anVar;
        this.x = iVar2;
        this.y = mVar2;
        this.z = iVar3;
        this.A = aVar4;
        this.B = fVar;
        com.waze.main_screen.p.b.a.b.t tVarA = cVar.a(new bp(this));
        this.J = tVarA;
        com.waze.main_screen.p.a.b.b.af afVarA = acVar.a();
        this.C = afVarA;
        com.waze.sharedrive.e.bp bpVarA = boVar.a();
        this.D = bpVarA;
        cc ccVarA = bwVar.a();
        this.E = ccVarA;
        com.waze.sound.e.m mVarA = kVar.a();
        this.F = mVarA;
        com.waze.reports_v2.presentation.bp bpVarA2 = bfVar.a();
        this.K = bpVarA2;
        if (aVar2.f()) {
            eVar.a("Returning null state holder for report button due to button pack feature flag");
            dVarA = null;
        } else {
            dVarA = aVar.a();
        }
        this.G = dVarA;
        com.waze.main_screen.ae.a.d dVar3 = dVarA;
        Boolean bool = (Boolean) savedStateHandle.remove("resumeDrive");
        kotlinx.coroutines.b.bn bnVarB = ck.b(new bm(null, null, null, null, null, null, null, null, null, iVar3.a(new v(this, 4)), new bj(bool != null ? bool.booleanValue() : false), null));
        this.H = bnVarB;
        this.I = kotlinx.coroutines.b.ai.U(bnVarB);
        eVar.a("init " + System.identityHashCode(this));
        bs bsVar = this;
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(rVar.a(), new bo(this, (h.c.e) null, 5, (boolean[]) null)), ViewModelKt.getViewModelScope(bsVar));
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(cVar2.a(), new bo(this, null, 0)), ViewModelKt.getViewModelScope(bsVar));
        if (aVar2.f()) {
            eVar.a("Aborting launching collection for audioSDKButtonStateHolder due to button pack flag");
        } else {
            kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(dVar.a(), new bo(this, (h.c.e) null, 1, (byte[]) null)), ViewModelKt.getViewModelScope(bsVar));
        }
        if (aVar2.f()) {
            eVar.a("Aborting launching collection for googleAssistantButtonStateHolder due to button pack flag");
        } else {
            kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(gVar2.b(), new bo(this, (h.c.e) null, 2, (char[]) null)), ViewModelKt.getViewModelScope(bsVar));
        }
        if (aVar2.f()) {
            eVar.a("Aborting launching collection for zoomControlsStateHolder due to button pack flag");
            r11 = 0;
        } else {
            r11 = 0;
            kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(dVar2.a(), new bo(this, (h.c.e) null, 6, (float[]) null)), ViewModelKt.getViewModelScope(bsVar));
        }
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(eVar3.b(), new bo(this, (h.c.e) r11, 3, (short[]) r11)), ViewModelKt.getViewModelScope(bsVar));
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(dgVar.V()), new bn(this, r11)), ViewModelKt.getViewModelScope(bsVar));
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(lVar.a(new v(this, 3)), new bo(this, (h.c.e) r11, 4, (int[]) r11)), ViewModelKt.getViewModelScope(bsVar));
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bsVar), r11, r11, new ar(this, (h.c.e) r11, 12, (byte[]) r11), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bsVar), r11, r11, new ar(this, (h.c.e) r11, 11), 3);
        fVar.l();
        addCloseable((AutoCloseable) tVarA);
        addCloseable((AutoCloseable) foVar);
        addCloseable((AutoCloseable) cVar3);
        addCloseable((AutoCloseable) iVar);
        addCloseable((AutoCloseable) afVarA);
        if (bpVarA != null) {
            addCloseable((AutoCloseable) bpVarA);
        }
        addCloseable((AutoCloseable) bpVarA2);
        if (dVar3 != null) {
            addCloseable((AutoCloseable) dVar3);
        }
        addCloseable((AutoCloseable) cVar4);
        addCloseable((AutoCloseable) anVar);
        addCloseable((AutoCloseable) iVar2);
        addCloseable((AutoCloseable) aVar4);
        addCloseable((AutoCloseable) fVar);
        if (ccVarA != null) {
            addCloseable((AutoCloseable) ccVarA);
        }
        addCloseable((AutoCloseable) mVarA);
    }

    private final boolean G() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        bm bmVar;
        do {
            bnVar = this.H;
            objD = bnVar.d();
            bmVar = (bm) objD;
        } while (!bnVar.f(objD, bm.m(bmVar, null, null, null, null, null, null, null, null, null, null, null, 4091)));
        com.waze.main_screen.l.b.j jVarE = bmVar.e();
        if (jVarE != null) {
            jVarE.b();
        }
        return bmVar.e() != null;
    }

    static final h.ab s(bs bsVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        bm bmVar;
        do {
            bnVar = bsVar.H;
            objD = bnVar.d();
            bmVar = (bm) objD;
        } while (!bnVar.f(objD, bm.m(bmVar, null, null, null, null, null, null, null, null, null, null, null, DisplayStrings.DS_CONVERSATIONAL_REPORTING_TTS_VEHICLE_STOPPED)));
        com.waze.c.e.k kVarA = bmVar.a();
        if (kVarA != null) {
            kVarA.close();
        }
        return h.ab.f48028a;
    }

    static final h.ab t(bs bsVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = bsVar.H;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bm.m((bm) objD, null, null, null, null, null, null, null, null, null, null, null, DisplayStrings.DS_COMPANINIO_BOTTOM_SHEET_TITLE)));
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void w(bs bsVar, NavigationItem navigationItem) {
        bsVar.G();
        com.waze.map.b.ai aiVar = bsVar.f27229e;
        aiVar.r(new com.waze.map.b.o(new com.waze.shared_infra.h.c(navigationItem.getLat(), navigationItem.getLon()), Float.valueOf(navigationItem.getRotation()), 0.0f, false, null, 28), true);
        aiVar.n(navigationItem.getNavSegmentIdx());
    }

    public static final /* synthetic */ void x(bs bsVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        bm bmVar;
        do {
            bnVar = bsVar.H;
            objD = bnVar.d();
            bmVar = (bm) objD;
        } while (!bnVar.f(objD, bmVar.e() == null ? bm.m(bmVar, null, null, bsVar.f27231g.a(new bq(bsVar, 1), new br(bsVar, 1)), null, null, null, null, null, null, null, null, 4091) : bm.m(bmVar, null, null, null, null, null, null, null, null, null, null, null, 4091)));
        bsVar.f27226b.a("nav instructions list removed due to bar clicked");
        com.waze.main_screen.l.b.j jVarE = bmVar.e();
        if (jVarE != null) {
            jVarE.b();
        }
    }

    public static final /* synthetic */ void y(bs bsVar, RtAlertItem rtAlertItem) {
        bsVar.G();
        bsVar.f27229e.r(new com.waze.map.b.o(new com.waze.shared_infra.h.c(rtAlertItem.getLatitude(), rtAlertItem.getLongitude()), null, 0.0f, false, null, 28), true);
    }

    public final void A() {
        this.z.b();
    }

    public final void B() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.H;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bm.m((bm) objD, null, null, null, null, null, null, null, null, null, null, null, 2047)));
        this.o.b();
    }

    public final void C() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        bm bmVarM;
        do {
            bnVar = this.H;
            objD = bnVar.d();
            bmVarM = (bm) objD;
            if (bmVarM.l() instanceof bj) {
                bmVarM = bm.m(bmVarM, null, null, null, null, null, null, null, null, null, new bj(false), null, DisplayStrings.DS_AAOS_TRIP_OVERVIEW_VIEW_ALL_SETTINGS_BUTTON);
            }
        } while (!bnVar.f(objD, bmVarM));
    }

    public final void D() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        bm bmVarM;
        do {
            bnVar = this.H;
            objD = bnVar.d();
            bmVarM = (bm) objD;
            if (bmVarM.e() == null) {
                bmVarM = bm.m(bmVarM, null, null, this.f27231g.a(new bq(this, 0), new br(this, 0)), null, null, null, null, null, null, null, null, 4091);
            }
        } while (!bnVar.f(objD, bmVarM));
    }

    public final com.waze.main_screen.p.b.a.b.t E() {
        return this.J;
    }

    public final com.waze.reports_v2.presentation.bp F() {
        return this.K;
    }

    public final com.waze.beacons.a.f b() {
        return this.B;
    }

    public final com.waze.main_screen.j.i c() {
        return this.x;
    }

    public final com.waze.main_screen.p.a.b.b.af d() {
        return this.C;
    }

    public final com.waze.main_screen.r.a.c f() {
        return this.v;
    }

    public final com.waze.main_screen.s.c g() {
        return this.r;
    }

    public final com.waze.main_screen.w.a.a h() {
        return this.u;
    }

    public final com.waze.main_screen.x.a i() {
        return this.A;
    }

    public final com.waze.main_screen.ab.a.m j() {
        return this.t;
    }

    public final com.waze.main_screen.ae.a.d k() {
        return this.G;
    }

    public final com.waze.main_screen.af.b.i l() {
        return this.q;
    }

    public final fo n() {
        return this.s;
    }

    public final com.waze.reports_v2.c.an o() {
        return this.w;
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        this.f27226b.a("cleared " + System.identityHashCode(this));
    }

    public final cc p() {
        return this.E;
    }

    public final com.waze.sound.e.m q() {
        return this.F;
    }

    public final com.waze.view.popups.b.m r() {
        return this.y;
    }

    public final ch v() {
        return this.I;
    }

    public final void z() {
        if (G()) {
            this.f27226b.a("nav instructions list removed due to HW back");
        }
    }
}
