package com.waze.ads.c;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.av.b.n;
import com.waze.modules.navigation.as;
import com.waze.modules.navigation.at;
import com.waze.modules.navigation.bp;
import com.waze.navigate.AddressItem;
import com.waze.navigate.eo;
import com.waze.navigate.et;
import com.waze.ui.a.s;
import com.waze.ui.a.u;
import h.g.a.p;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ads.d.i f13980a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f13981b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ads.d.b f13982c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ads.b.a f13983d;

    /* renamed from: e, reason: collision with root package name */
    private final bp f13984e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.ads.a.a f13985f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.nightmode.j f13986g;

    /* renamed from: h, reason: collision with root package name */
    private final eo f13987h;

    /* renamed from: i, reason: collision with root package name */
    private final String f13988i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f13989j;

    /* renamed from: k, reason: collision with root package name */
    private br f13990k;

    /* renamed from: l, reason: collision with root package name */
    private final ch f13991l;

    public m(SavedStateHandle savedStateHandle, com.waze.ads.d.i iVar, com.waze.shared_infra.i.e eVar, com.waze.ads.d.b bVar, com.waze.ads.b.a aVar, bp bpVar, com.waze.ads.a.a aVar2, com.waze.nightmode.j jVar, eo eoVar) {
        x.f(savedStateHandle, "savedStateHandle");
        x.f(iVar, "statsSender");
        x.f(eVar, "logger");
        x.f(bVar, "adTracking");
        x.f(aVar, "modifyAtaUrlForDarkModeUseCase");
        x.f(bpVar, "startNavigationCoordinatorFactory");
        x.f(aVar2, "adRepository");
        x.f(jVar, "nightModeManager");
        x.f(eoVar, "navigationStatus");
        this.f13980a = iVar;
        this.f13981b = eVar;
        this.f13982c = bVar;
        this.f13983d = aVar;
        this.f13984e = bpVar;
        this.f13985f = aVar2;
        this.f13986g = jVar;
        this.f13987h = eoVar;
        this.f13988i = (String) savedStateHandle.get("adId");
        bn bnVarB = ck.b(new f(new AddressItem(0, 0, "")));
        this.f13989j = bnVarB;
        kotlinx.coroutines.b.k kVarL = ai.L(ai.r(bnVarB, jVar.a(), et.b(eoVar), new j(this, null)), new l(this, null));
        af viewModelScope = ViewModelKt.getViewModelScope(this);
        int i2 = bz.f51630a;
        this.f13991l = ai.V(kVarL, viewModelScope, by.a(5000L, 2), new u(null, null, null, null, null, null, false, s.f41691a, null));
    }

    private final void s(com.waze.ads.d.d dVar) {
        com.waze.ads.a.f fVarA = ((f) this.f13989j.d()).a();
        if (fVarA != null) {
            this.f13980a.c(fVarA, dVar);
        }
    }

    private final void t(com.waze.ads.d.c cVar, at atVar, as asVar, h.g.a.a aVar) {
        com.waze.av.b.m mVarF;
        String strM;
        f fVar = (f) this.f13989j.d();
        com.waze.av.d.k kVarB = fVar.b();
        if (kVarB != null) {
            mVarF = com.waze.ad.c.b.e(kVarB);
        } else {
            com.waze.ads.a.f fVarA = fVar.a();
            if (fVarA == null) {
                com.waze.shared_infra.i.e eVar = this.f13981b;
                Objects.toString(cVar);
                eVar.b("startNavigationForAd: no mapAdData for action ".concat(String.valueOf(cVar)));
                return;
            }
            mVarF = a.a.F(fVarA);
        }
        n nVar = mVarF;
        com.waze.ads.a.f fVarA2 = fVar.a();
        if (fVarA2 != null) {
            this.f13980a.a(fVarA2, cVar);
        }
        com.waze.ads.a.f fVarA3 = fVar.a();
        if (fVarA3 != null && (strM = fVarA3.m()) != null) {
            aj.z(ViewModelKt.getViewModelScope(this), null, null, new h(this, strM, (h.c.e) null, 1), 3);
        }
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new i(this, nVar, atVar, asVar, aVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r19, h.c.e r20) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ads.c.m.f(java.lang.String, h.c.e):java.lang.Object");
    }

    public final ch i() {
        return this.f13991l;
    }

    public final void j() {
        if (((f) this.f13989j.d()).e()) {
            s(com.waze.ads.d.d.f14007d);
        }
    }

    public final void k() {
        Object objD;
        bn bnVar = this.f13989j;
        f fVar = (f) bnVar.d();
        com.waze.ads.a.f fVarA = fVar.a();
        if (fVarA != null) {
            this.f13980a.a(fVarA, com.waze.ads.d.c.f14001d);
        }
        if (fVar.e()) {
            return;
        }
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, f.g((f) objD, true, null, null, null, 29)));
    }

    public final void l(boolean z) {
        com.waze.ads.a.f fVarA = ((f) this.f13989j.d()).a();
        if (fVarA != null) {
            this.f13980a.d(fVarA, z);
        }
    }

    public final void m() {
        s(com.waze.ads.d.d.f14008e);
    }

    public final void n() {
        s(com.waze.ads.d.d.f14007d);
    }

    public final void o(p pVar) {
        x.f(pVar, "onPreviewReady");
        f fVar = (f) this.f13989j.d();
        com.waze.ads.a.f fVarA = fVar.a();
        AddressItem addressItemC = fVar.c();
        if (fVarA == null) {
            this.f13981b.g("Unable to report info click: ad data is null.");
        } else {
            this.f13980a.a(fVarA, com.waze.ads.d.c.f14000c);
            pVar.invoke(addressItemC, fVarA);
        }
    }

    public final void p() {
        if (((f) this.f13989j.d()).e()) {
            s(com.waze.ads.d.d.f14006c);
        }
    }

    public final void q() {
        s(com.waze.ads.d.d.f14006c);
    }

    public final void r(h.g.a.a aVar) {
        x.f(aVar, "onNavigationStarted");
        if (this.f13987h.T()) {
            t(com.waze.ads.d.c.f13999b, at.f30322b, as.f30318b, aVar);
        } else {
            t(com.waze.ads.d.c.f14002e, at.f30321a, as.f30317a, aVar);
        }
    }
}
