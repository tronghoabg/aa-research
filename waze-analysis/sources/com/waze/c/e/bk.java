package com.waze.c.e;

import androidx.compose.ui.geometry.Rect;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.jni.protos.navigate.NavigationItem;
import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.navigate.en;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bk extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.ai f18595a;

    /* renamed from: b, reason: collision with root package name */
    private final aq f18596b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.p.b.a.b.c f18597c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.main_screen.l.b.e f18598d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.c.a.b f18599e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.c.d.am f18600f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f18601g;

    /* renamed from: h, reason: collision with root package name */
    private final en f18602h;

    /* renamed from: i, reason: collision with root package name */
    private final SavedStateHandle f18603i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.main_screen.y.b f18604j;

    /* renamed from: k, reason: collision with root package name */
    private bc f18605k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f18606l;
    private final kotlinx.coroutines.b.ch m;

    public bk(com.waze.map.b.ai aiVar, aq aqVar, com.waze.main_screen.p.b.a.b.c cVar, com.waze.main_screen.l.b.e eVar, com.waze.c.a.b bVar, com.waze.c.d.am amVar, com.waze.shared_infra.i.e eVar2, en enVar, SavedStateHandle savedStateHandle) {
        h.g.b.x.f(aiVar, "mainMapController");
        h.g.b.x.f(aqVar, "alternateRoutesStateHolderFactory");
        h.g.b.x.f(cVar, "navigationBarStateHolderFactory");
        h.g.b.x.f(eVar, "navInstructionListStateHolderFactory");
        h.g.b.x.f(bVar, "alternateRoutesConfig");
        h.g.b.x.f(amVar, "alternateRoutesStatsSender");
        h.g.b.x.f(eVar2, "logger");
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(savedStateHandle, "savedStateHandle");
        this.f18595a = aiVar;
        this.f18596b = aqVar;
        this.f18597c = cVar;
        this.f18598d = eVar;
        this.f18599e = bVar;
        this.f18600f = amVar;
        this.f18601g = eVar2;
        this.f18602h = enVar;
        this.f18603i = savedStateHandle;
        Boolean bool = (Boolean) savedStateHandle.get("safeRoutesEnabled");
        this.f18604j = new com.waze.main_screen.y.b(bool != null ? bool.booleanValue() : false);
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new bi(new g(d.f18660a, new com.waze.ui.b.bd(null), new com.waze.c.e.a.c(null, 63)), cVar.a(new bj(this)), null, new r(null), bVar.e(), null));
        this.f18606l = bnVarB;
        this.m = kotlinx.coroutines.b.ai.U(bnVarB);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new bh(this, null), 3);
    }

    public static final /* synthetic */ void i(final bk bkVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        bi biVar;
        do {
            bnVar = bkVar.f18606l;
            objD = bnVar.d();
            biVar = (bi) objD;
        } while (!bnVar.f(objD, biVar.d() == null ? bi.g(biVar, null, bkVar.f18598d.a(new com.waze.main_screen.l.b.g() { // from class: com.waze.c.e.bd
            @Override // com.waze.main_screen.l.b.g
            public final void a(NavigationItem navigationItem) {
                h.g.b.x.f(navigationItem, "<unused var>");
                this.f18579a.n();
            }
        }, new com.waze.main_screen.l.b.h() { // from class: com.waze.c.e.be
            @Override // com.waze.main_screen.l.b.h
            public final void a(RtAlertItem rtAlertItem) {
                h.g.b.x.f(rtAlertItem, "<unused var>");
                this.f18580a.n();
            }
        }), null, null, null, 59) : bi.g(biVar, null, null, null, null, null, 59)));
        com.waze.main_screen.l.b.j jVarD = biVar.d();
        if (jVarD != null) {
            jVarD.b();
        }
        bc bcVar = bkVar.f18605k;
        if (bcVar != null) {
            bcVar.p(((bi) bnVar.d()).d() != null);
        }
    }

    public final com.waze.main_screen.y.b c() {
        return this.f18604j;
    }

    public final kotlinx.coroutines.b.ch h() {
        return this.m;
    }

    public final void k() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f18606l;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bi.g((bi) objD, null, null, null, com.waze.c.a.a.f18216a, null, 47)));
        this.f18600f.g(com.waze.c.d.ak.f18311b, com.waze.c.d.al.f18313a);
    }

    public final void l() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f18606l;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bi.g((bi) objD, null, null, null, com.waze.c.a.a.f18217b, null, 47)));
        this.f18600f.g(com.waze.c.d.ak.f18310a, com.waze.c.d.al.f18313a);
    }

    public final void m(Rect rect) {
        h.g.b.x.f(rect, "rect");
        bc bcVar = this.f18605k;
        if (bcVar != null) {
            bcVar.o(rect);
        }
    }

    public final void n() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        bi biVar;
        do {
            bnVar = this.f18606l;
            objD = bnVar.d();
            biVar = (bi) objD;
        } while (!bnVar.f(objD, bi.g(biVar, null, null, null, null, null, 59)));
        com.waze.main_screen.l.b.j jVarD = biVar.d();
        if (jVarD != null) {
            jVarD.b();
        }
        bc bcVar = this.f18605k;
        if (bcVar != null) {
            bcVar.p(false);
        }
    }

    public final void o() {
        this.f18600f.a(com.waze.c.d.ai.n, com.waze.c.d.aj.f18303b);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        bc bcVar = this.f18605k;
        if (bcVar != null) {
            bcVar.s();
        }
        kotlinx.coroutines.b.bn bnVar = this.f18606l;
        ((bi) bnVar.d()).f().close();
        com.waze.main_screen.l.b.j jVarD = ((bi) bnVar.d()).d();
        if (jVarD != null) {
            jVarD.b();
        }
        this.f18599e.g(((bi) bnVar.d()).a());
    }

    public final void p() {
        this.f18600f.a(com.waze.c.d.ai.f18296g, com.waze.c.d.aj.f18305d);
    }

    public final void q() {
        this.f18600f.a(com.waze.c.d.ai.o, com.waze.c.d.aj.f18308g);
    }

    public final void r(String str) {
        h.g.b.x.f(str, "alternativeRouteUuid");
        bc bcVar = this.f18605k;
        if (bcVar != null) {
            bcVar.q(str);
        }
    }
}
