package com.waze.sharedrive.e;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.navigate.ej;
import com.waze.navigate.en;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class at extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final w f38352a;

    /* renamed from: b, reason: collision with root package name */
    private final en f38353b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.p.b.a.b.c f38354c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.main_screen.l.b.e f38355d;

    /* renamed from: e, reason: collision with root package name */
    private final cn f38356e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.modules.navigation.bp f38357f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38358g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f38359h;

    /* renamed from: i, reason: collision with root package name */
    private final bp f38360i;

    /* renamed from: j, reason: collision with root package name */
    private final h.f f38361j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f38362k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f38363l;
    private final kotlinx.coroutines.b.bn m;
    private final kotlinx.coroutines.b.bn n;
    private final h.f o;

    public at(com.waze.sharedrive.d.a aVar, w wVar, en enVar, com.waze.main_screen.p.b.a.b.c cVar, com.waze.main_screen.l.b.e eVar, cn cnVar, bo boVar, com.waze.modules.navigation.bp bpVar, com.waze.shared_infra.i.e eVar2) {
        h.g.b.x.f(aVar, "shareDriveControllerFactory");
        h.g.b.x.f(wVar, "liveDriveMapStateHolderFactory");
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(cVar, "navigationBarStateHolderFactory");
        h.g.b.x.f(eVar, "navigationInstructionsListStateHolderFactory");
        h.g.b.x.f(cnVar, "uiMapper");
        h.g.b.x.f(boVar, "shareDriveMapIndicationStateHolderFactory");
        h.g.b.x.f(bpVar, "startNavigationCoordinatorFactory");
        h.g.b.x.f(eVar2, "logger");
        this.f38352a = wVar;
        this.f38353b = enVar;
        this.f38354c = cVar;
        this.f38355d = eVar;
        this.f38356e = cnVar;
        this.f38357f = bpVar;
        this.f38358g = eVar2;
        this.f38359h = h.g.a(new ai(this, 1));
        bp bpVarA = boVar.a();
        this.f38360i = bpVarA;
        this.f38361j = h.g.a(new com.waze.bk.f(aVar, 14));
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(y(h.g.b.x.n(enVar.ag().d(), ej.f31313a)));
        this.f38362k = bnVarB;
        this.f38363l = kotlinx.coroutines.b.ai.U(bnVarB);
        this.m = kotlinx.coroutines.b.ck.b(null);
        this.n = kotlinx.coroutines.b.ck.b(false);
        this.o = h.g.a(new ai(this, 0));
        eVar2.e("Started");
        addCloseable((AutoCloseable) d());
        if (bpVarA != null) {
            addCloseable((AutoCloseable) bpVarA);
        }
        A().G();
        A().K();
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new bm(this, (h.c.e) null, 1), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.sharedrive.d.aq A() {
        return (com.waze.sharedrive.d.aq) this.f38361j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(com.waze.sharedrive.g.z zVar) {
        zVar.b().close();
        com.waze.main_screen.l.b.j jVarA = zVar.a();
        if (jVarA != null) {
            jVarA.b();
        }
    }

    static final z e(at atVar) {
        z zVarA = atVar.f38352a.a();
        if (zVarA != null) {
            return zVarA;
        }
        throw new IllegalArgumentException("LiveShareDriveViewModel created while mapStateHolderFactory.create is unavailable (FF off?)");
    }

    static final kotlinx.coroutines.b.ch j(at atVar) {
        com.waze.sharedrive.d.r rVar = (com.waze.sharedrive.d.r) atVar.A().n().d();
        com.waze.sharedrive.g.z zVar = (com.waze.sharedrive.g.z) atVar.f38362k.d();
        y yVar = (y) atVar.d().b().d();
        kotlinx.coroutines.b.bn bnVar = atVar.m;
        String str = (String) bnVar.d();
        kotlinx.coroutines.b.bn bnVar2 = atVar.n;
        com.waze.sharedrive.g.aa aaVarZ = atVar.z(rVar, zVar, yVar, str, ((Boolean) bnVar2.d()).booleanValue());
        kotlinx.coroutines.b.k kVarL = kotlinx.coroutines.b.ai.L(kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.P(kotlinx.coroutines.b.ai.t(atVar.A().n(), atVar.f38363l, atVar.d().b(), bnVar, bnVar2, new an(atVar, null)), aaVarZ, new ao(null))), new ap(atVar, null));
        kotlinx.coroutines.af viewModelScope = ViewModelKt.getViewModelScope(atVar);
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        return kotlinx.coroutines.b.ai.V(kVarL, viewModelScope, kotlinx.coroutines.b.by.c(), aaVarZ);
    }

    public static final /* synthetic */ void k(at atVar) {
        kotlinx.coroutines.b.bn bnVar = atVar.f38362k;
        com.waze.sharedrive.g.z zVar = (com.waze.sharedrive.g.z) bnVar.d();
        if (zVar == null) {
            atVar.f38358g.g("nav bar does not exist to handle on click on it");
            return;
        }
        bnVar.e(com.waze.sharedrive.g.z.c(zVar, zVar.a() == null ? atVar.f38355d.a(new aj(0), new ak(0)) : null));
        com.waze.main_screen.l.b.j jVarA = zVar.a();
        if (jVarA != null) {
            jVarA.b();
        }
    }

    private final com.waze.sharedrive.d.q x(String str) {
        com.waze.sharedrive.d.r rVar = (com.waze.sharedrive.d.r) A().n().d();
        if (rVar instanceof com.waze.sharedrive.d.q) {
            return (com.waze.sharedrive.d.q) rVar;
        }
        this.f38358g.g(str.concat(": Current state is not LiveDrive."));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.sharedrive.g.z y(boolean z) {
        if (z) {
            return new com.waze.sharedrive.g.z(this.f38354c.a(new am(this)), null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.waze.sharedrive.g.aa z(com.waze.sharedrive.d.r r17, com.waze.sharedrive.g.z r18, com.waze.sharedrive.e.y r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.e.at.z(com.waze.sharedrive.d.r, com.waze.sharedrive.g.z, com.waze.sharedrive.e.y, java.lang.String, boolean):com.waze.sharedrive.g.aa");
    }

    public final z d() {
        return (z) this.f38359h.getValue();
    }

    public final kotlinx.coroutines.b.ch i() {
        return (kotlinx.coroutines.b.ch) this.o.getValue();
    }

    public final void l() {
        com.waze.sharedrive.c.a.q qVarA;
        com.waze.sharedrive.c.a.m mVar;
        com.waze.shared_infra.i.e eVar = this.f38358g;
        eVar.a("addParticipant: requesting to add participant");
        com.waze.sharedrive.d.q qVarX = x("addParticipant");
        String strC = null;
        if (qVarX != null && (qVarA = qVarX.a()) != null && (mVar = (com.waze.sharedrive.c.a.m) qVarA.b()) != null) {
            strC = mVar.c();
        }
        if (strC != null) {
            this.m.e(strC);
        } else if (qVarX != null) {
            eVar.g("addParticipant: shareUrl is null");
        }
    }

    public final void m() {
        com.waze.sharedrive.d.q qVarX = x("becomeDriver");
        if (qVarX == null) {
            return;
        }
        com.waze.sharedrive.c.a.b bVarA = ((com.waze.sharedrive.c.a.m) qVarX.a().b()).a();
        h.g.b.x.f(bVarA, "<this>");
        com.waze.modules.navigation.ao aoVar = new com.waze.modules.navigation.ao(com.waze.modules.navigation.ah.A, new com.waze.modules.navigation.ai(new com.waze.av.b.m(new com.waze.av.a.p(new com.waze.av.a.a(null, null, null, null, null, null, bVarA.b(), 63), bVarA.a(), new com.waze.av.a.o(bVarA.d(), bVarA.c(), null, null, null, null, 60)))), null, false, null, com.waze.modules.navigation.as.f30317a, false, null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_11);
        this.f38358g.e("becomeDriver: Launching navigation flow with Caller.ShareDrive");
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new al(this, aoVar, (h.c.e) null, 0), 3);
    }

    public final void n() {
        A().F();
    }

    public final void o() {
        A().I();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        A().L();
        com.waze.sharedrive.g.z zVar = (com.waze.sharedrive.g.z) this.f38362k.d();
        if (zVar != null) {
            B(zVar);
        }
    }

    public final void p() {
        this.n.e(false);
    }

    public final void q() {
        this.m.e(null);
    }

    public final void r(boolean z) {
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new aq(this, z, null), 3);
    }

    public final void s() {
        A().F();
    }

    public final void t() {
        A().x();
    }
}
