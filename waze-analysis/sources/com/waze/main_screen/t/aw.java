package com.waze.main_screen.t;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.navigate.ej;
import com.waze.navigate.en;
import com.waze.reports_v2.presentation.bf;
import com.waze.reports_v2.presentation.bp;
import com.waze.sharedrive.e.bw;
import com.waze.sharedrive.e.cc;
import java.util.Iterator;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aw extends ViewModel {
    private final com.waze.main_screen.ae.a.d A;
    private final com.waze.sound.e.m B;
    private final bn C;
    private final ch D;
    private final com.waze.main_screen.y.f E;
    private final bp F;
    private final com.waze.reports_v2.presentation.k G;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f27524a;

    /* renamed from: b, reason: collision with root package name */
    private final en f27525b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f27526c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.bv.r f27527d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.d.a.c f27528e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.main_screen.q.b.g f27529f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.notifications.b.e f27530g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.main_screen.b.a.d f27531h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.main_screen.ag.a.d f27532i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.a.l f27533j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.main_screen.c.a f27534k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.ui.j.j f27535l;
    private final com.waze.main_screen.v.o m;
    private final com.waze.main_screen.w.a.a n;
    private final com.waze.bw.c.c.x o;
    private final com.waze.main_screen.u.o p;
    private final com.waze.main_screen.ab.a.m q;
    private final com.waze.main_screen.af.b.i r;
    private final com.waze.main_screen.h.a.a s;
    private final com.waze.main_screen.r.a.c t;
    private final com.waze.main_screen.j.i u;
    private final com.waze.view.popups.b.m v;
    private final com.waze.ao.b.a w;
    private final com.waze.tide.a.a x;
    private final com.waze.modules.navigation.bp y;
    private final cc z;

    public aw(SavedStateHandle savedStateHandle, en enVar, com.waze.shared_infra.i.e eVar, com.waze.bv.r rVar, com.waze.main_screen.d.a.c cVar, com.waze.main_screen.q.b.g gVar, com.waze.notifications.b.e eVar2, com.waze.main_screen.b.a.d dVar, com.waze.main_screen.ag.a.d dVar2, com.waze.reports_v2.presentation.a.l lVar, com.waze.main_screen.ae.a.a aVar, com.waze.main_screen.c.a aVar2, com.waze.reports_v2.presentation.k kVar, com.waze.ui.j.j jVar, com.waze.main_screen.v.o oVar, com.waze.main_screen.w.a.a aVar3, com.waze.bw.c.c.x xVar, com.waze.main_screen.u.o oVar2, com.waze.main_screen.ab.a.m mVar, com.waze.main_screen.af.b.i iVar, bf bfVar, com.waze.main_screen.h.a.a aVar4, com.waze.main_screen.r.a.c cVar2, com.waze.main_screen.j.i iVar2, com.waze.view.popups.b.m mVar2, bw bwVar, com.waze.ao.b.a aVar5, com.waze.tide.a.a aVar6, com.waze.sound.e.k kVar2, com.waze.br.c.e eVar3, com.waze.modules.navigation.bp bpVar, com.waze.br.b.p pVar) {
        com.waze.main_screen.ae.a.d dVarA;
        boolean zBooleanValue;
        Object next;
        Object objD;
        as asVar;
        h.ab abVar;
        com.waze.ao.b.f fVarA;
        Object objD2;
        com.waze.main_screen.q.b.i iVarA;
        h.g.b.x.f(savedStateHandle, "savedStateHandle");
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(rVar, "speedometerStateHolderFactory");
        h.g.b.x.f(cVar, "compassStateHolderFactory");
        h.g.b.x.f(gVar, "nearingDestinationStateHolderFactory");
        h.g.b.x.f(eVar2, "notificationService");
        h.g.b.x.f(dVar, "audioSdkButtonStateHolderFactory");
        h.g.b.x.f(dVar2, "zoomControlsStateHolderFactory");
        h.g.b.x.f(lVar, "reportPointsStateHolderFactory");
        h.g.b.x.f(aVar, "transportSdkButtonStateHolderFactory");
        h.g.b.x.f(aVar2, "buttonPackConfiguration");
        h.g.b.x.f(kVar, "preDriveConfig");
        h.g.b.x.f(jVar, "hamburgerButtonStateHolder");
        h.g.b.x.f(oVar, "promotionalChipStateHolder");
        h.g.b.x.f(aVar3, "quickSettingsStateHolder");
        h.g.b.x.f(xVar, "startStateStateHolder");
        h.g.b.x.f(oVar2, "predictionCardStateHolder");
        h.g.b.x.f(mVar, "popupsStateHolder");
        h.g.b.x.f(iVar, "wazeAsksStateHolder");
        h.g.b.x.f(bfVar, "reportMenuButtonStateHolderFactory");
        h.g.b.x.f(aVar4, "floatingNotificationStateHolder");
        h.g.b.x.f(cVar2, "notificationMessageStateHolder");
        h.g.b.x.f(iVar2, "googleAssistantActionsStateHolder");
        h.g.b.x.f(mVar2, "myParkingPhotoStateHolder");
        h.g.b.x.f(bwVar, "shareDriveStateHolderFactory");
        h.g.b.x.f(aVar5, "insightFeedbackEndOfDriveStateHolderFactory");
        h.g.b.x.f(aVar6, "tideBluetoothPermissionStateHolder");
        h.g.b.x.f(kVar2, "voiceGuidanceStateHolderFactory");
        h.g.b.x.f(eVar3, "searchMateSessionStateHolderFactory");
        h.g.b.x.f(bpVar, "navigationCoordinatorControllerFactory");
        h.g.b.x.f(pVar, "searchMateControllerFactory");
        this.f27524a = savedStateHandle;
        this.f27525b = enVar;
        this.f27526c = eVar;
        this.f27527d = rVar;
        this.f27528e = cVar;
        this.f27529f = gVar;
        this.f27530g = eVar2;
        this.f27531h = dVar;
        this.f27532i = dVar2;
        this.f27533j = lVar;
        this.f27534k = aVar2;
        this.G = kVar;
        this.f27535l = jVar;
        this.m = oVar;
        this.n = aVar3;
        this.o = xVar;
        this.p = oVar2;
        this.q = mVar;
        this.r = iVar;
        this.s = aVar4;
        this.t = cVar2;
        this.u = iVar2;
        this.v = mVar2;
        this.w = aVar5;
        this.x = aVar6;
        this.y = bpVar;
        this.z = bwVar.a();
        bp bpVarA = bfVar.a();
        this.F = bpVarA;
        if (aVar2.f()) {
            eVar.a("Returning null state holder for report button due to button pack feature flag");
            dVarA = null;
        } else {
            dVarA = aVar.a();
        }
        this.A = dVarA;
        this.B = kVar2.a();
        int i2 = 0;
        if (aVar2.f()) {
            eVar.a("Disabled mapQuickSettingsButton due to button pack flag");
            zBooleanValue = false;
        } else {
            zBooleanValue = ((Boolean) kVar.g().d()).booleanValue();
        }
        bn bnVarB = ck.b(new as(null, null, null, null, null, null, zBooleanValue, null, bpVarA, aVar4, null, null, enVar.ag().d() instanceof ej, null));
        this.C = bnVarB;
        this.D = kotlinx.coroutines.b.ai.U(bnVarB);
        String str = (String) savedStateHandle.remove("preDriveTriggerReason");
        Iterator<E> it = com.waze.main_screen.y.f.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (h.g.b.x.n(((com.waze.main_screen.y.f) next).name(), str)) {
                    break;
                }
            }
        }
        com.waze.main_screen.y.f fVar = (com.waze.main_screen.y.f) next;
        fVar = fVar == null ? com.waze.main_screen.y.f.f27875a : fVar;
        this.E = fVar;
        this.f27526c.a("init " + System.identityHashCode(this) + ", triggerReason:" + fVar);
        aw awVar = this;
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(this.f27527d.a(), new at(this, (h.c.e) null, 4, (int[]) null)), ViewModelKt.getViewModelScope(awVar));
        int i3 = 2;
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(this.f27530g.b(), new at(this, (h.c.e) null, 2, (char[]) null)), ViewModelKt.getViewModelScope(awVar));
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(this.f27528e.a(), new at(this, null, 0)), ViewModelKt.getViewModelScope(awVar));
        int i4 = 1;
        if (this.f27534k.f()) {
            this.f27526c.a("Aborting launching collection for audioSDKButtonStateHolder due to button pack flag");
        } else {
            kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(this.f27531h.a(), new at(this, (h.c.e) null, 1, (byte[]) null)), ViewModelKt.getViewModelScope(awVar));
        }
        if (this.f27534k.f()) {
            this.f27526c.a("Aborting launching collection for zoomControlsStateHolder due to button pack flag");
        } else {
            kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(this.f27532i.a(), new at(this, (h.c.e) null, 5, (boolean[]) null)), ViewModelKt.getViewModelScope(awVar));
        }
        if (this.f27534k.f()) {
            this.f27526c.a("Aborting launching collection for quickMapSettings due to button pack flag");
        } else {
            kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(this.G.g(), new au(this, null)), ViewModelKt.getViewModelScope(awVar));
        }
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(this.f27533j.a(new h.g.a.a() { // from class: com.waze.main_screen.t.ar
            @Override // h.g.a.a
            public final Object invoke() {
                return aw.t(this.f27503a);
            }
        }), new at(this, (h.c.e) null, 3, (short[]) null)), ViewModelKt.getViewModelScope(awVar));
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(awVar), null, null, new q(this, (h.c.e) null, 4), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(awVar), null, null, new q(this, (h.c.e) null, 5, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(awVar), null, null, new t(eVar3, this, (h.c.e) null, 6), 3);
        this.o.c();
        this.x.d();
        com.waze.main_screen.y.f fVar2 = com.waze.main_screen.y.f.f27875a;
        if (fVar == fVar2) {
            this.f27526c.a("prediction card state holder started");
            this.p.c();
        }
        if (fVar != fVar2) {
            com.waze.main_screen.y.f fVar3 = com.waze.main_screen.y.f.f27876b;
            if (fVar == fVar3) {
                this.f27526c.a("enabling arrived to destination");
                bn bnVar = this.C;
                do {
                    objD2 = bnVar.d();
                    iVarA = this.f27529f.a(new aq(this, i2));
                    addCloseable(new com.waze.main.navigate.f(iVarA, i4));
                } while (!bnVar.f(objD2, as.m((as) objD2, null, iVarA, null, null, null, null, false, null, null, null, false, null, 16381)));
            }
            if (fVar == fVar3 || fVar == com.waze.main_screen.y.f.f27877c || fVar == com.waze.main_screen.y.f.f27878d) {
                this.f27526c.a("enabling insight feedback end of drive flow");
                bn bnVar2 = this.C;
                do {
                    objD = bnVar2.d();
                    asVar = (as) objD;
                    abVar = fVar != com.waze.main_screen.y.f.f27878d ? null : h.ab.f48028a;
                    fVarA = this.w.a(new com.google.firebase.messaging.l(this));
                    addCloseable(new com.waze.main.navigate.f(fVarA, i3));
                } while (!bnVar2.f(objD, as.m(asVar, null, null, null, null, null, null, false, null, fVarA, null, false, abVar, 7167)));
            }
        }
        addCloseable((AutoCloseable) this.n);
        addCloseable((AutoCloseable) this.o);
        addCloseable((AutoCloseable) this.r);
        addCloseable((AutoCloseable) this.p);
        addCloseable((AutoCloseable) this.F);
        com.waze.main_screen.ae.a.d dVar3 = this.A;
        if (dVar3 != null) {
            addCloseable((AutoCloseable) dVar3);
        }
        addCloseable((AutoCloseable) this.f27535l);
        addCloseable((AutoCloseable) this.m);
        addCloseable((AutoCloseable) this.s);
        addCloseable((AutoCloseable) this.t);
        addCloseable((AutoCloseable) this.u);
        addCloseable((AutoCloseable) this.x);
        cc ccVar = this.z;
        if (ccVar != null) {
            addCloseable((AutoCloseable) ccVar);
        }
        addCloseable((AutoCloseable) this.B);
    }

    static final h.ab t(aw awVar) {
        bn bnVar;
        Object objD;
        do {
            bnVar = awVar.C;
            objD = bnVar.d();
        } while (!bnVar.f(objD, as.m((as) objD, null, null, null, null, null, null, false, null, null, null, false, null, 16255)));
        return h.ab.f48028a;
    }

    public static /* synthetic */ void w(aw awVar) {
        bn bnVar;
        Object objD;
        as asVar;
        do {
            bnVar = awVar.C;
            objD = bnVar.d();
            asVar = (as) objD;
        } while (!bnVar.f(objD, as.m(asVar, null, null, null, null, null, null, false, null, null, null, false, null, 16381)));
        com.waze.main_screen.q.b.i iVarC = asVar.c();
        if (iVarC != null) {
            iVarC.b();
        }
    }

    public static /* synthetic */ void x(aw awVar) {
        bn bnVar;
        Object objD;
        as asVar;
        do {
            bnVar = awVar.C;
            objD = bnVar.d();
            asVar = (as) objD;
        } while (!bnVar.f(objD, as.m(asVar, null, null, null, null, null, null, false, null, null, null, false, null, 15359)));
        com.waze.ao.b.f fVarK = asVar.k();
        if (fVarK != null) {
            fVarK.close();
        }
    }

    public final com.waze.main_screen.h.a.a a() {
        return this.s;
    }

    public final com.waze.main_screen.j.i b() {
        return this.u;
    }

    public final com.waze.main_screen.r.a.c c() {
        return this.t;
    }

    public final com.waze.main_screen.u.o d() {
        return this.p;
    }

    public final com.waze.main_screen.v.o e() {
        return this.m;
    }

    public final com.waze.main_screen.w.a.a f() {
        return this.n;
    }

    public final com.waze.main_screen.y.f g() {
        return this.E;
    }

    public final com.waze.main_screen.ab.a.m h() {
        return this.q;
    }

    public final com.waze.main_screen.ae.a.d i() {
        return this.A;
    }

    public final com.waze.main_screen.af.b.i j() {
        return this.r;
    }

    public final cc m() {
        return this.z;
    }

    public final com.waze.sound.e.m n() {
        return this.B;
    }

    public final com.waze.bw.c.c.x o() {
        return this.o;
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        this.f27526c.a("cleared " + System.identityHashCode(this));
    }

    public final com.waze.tide.a.a p() {
        return this.x;
    }

    public final com.waze.ui.j.j q() {
        return this.f27535l;
    }

    public final com.waze.view.popups.b.m r() {
        return this.v;
    }

    public final Object s(com.waze.br.a.f fVar, h.c.e eVar) {
        com.waze.av.b.n nVarE;
        if (fVar instanceof com.waze.br.a.d) {
            nVarE = com.waze.bw.c.d.v.v(((com.waze.br.a.d) fVar).a(), null, null, null, null, 15);
        } else {
            if (!(fVar instanceof com.waze.br.a.e)) {
                throw new h.i();
            }
            nVarE = com.waze.ad.c.b.e(((com.waze.br.a.e) fVar).a());
        }
        Object objC = this.y.b(new com.waze.modules.navigation.ao(com.waze.modules.navigation.ah.o, new com.waze.modules.navigation.ai(nVarE), null, true, com.waze.modules.navigation.at.f30321a, null, false, null, 224)).a().c(eVar);
        return objC == h.c.a.a.f48038a ? objC : h.ab.f48028a;
    }

    public final ch v() {
        return this.D;
    }

    public final void y() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.C;
            objD = bnVar.d();
        } while (!bnVar.f(objD, as.m((as) objD, null, null, null, null, null, null, false, null, null, null, false, null, 8191)));
    }

    public final bp z() {
        return this.F;
    }
}
