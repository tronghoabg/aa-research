package com.waze;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.planned_drive.PlannedDriveNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ez extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.notifications.a.a f23746a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.app_nav.w f23747b;

    /* renamed from: c, reason: collision with root package name */
    private final PlannedDriveNativeManager f23748c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.map.eq f23749d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f23750e;

    /* renamed from: f, reason: collision with root package name */
    private final LiveData f23751f;

    /* renamed from: g, reason: collision with root package name */
    private final LiveData f23752g;

    /* renamed from: h, reason: collision with root package name */
    private com.waze.planned_drive.o f23753h;

    /* renamed from: i, reason: collision with root package name */
    private final MutableLiveData f23754i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f23755j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23756k;

    public ez(com.waze.notifications.a.a aVar, com.waze.app_nav.w wVar, PlannedDriveNativeManager plannedDriveNativeManager, com.waze.map.eq eqVar, kotlinx.coroutines.b.ch chVar, kotlinx.coroutines.b.ch chVar2) {
        h.g.b.x.f(aVar, "pushNotificationDisplayedSender");
        h.g.b.x.f(wVar, "flowController");
        h.g.b.x.f(plannedDriveNativeManager, "plannedDriveNativeManager");
        h.g.b.x.f(eqVar, "primaryMapConfiguration");
        h.g.b.x.f(chVar, "installationRequirement");
        h.g.b.x.f(chVar2, "carConnectionState");
        this.f23746a = aVar;
        this.f23747b = wVar;
        this.f23748c = plannedDriveNativeManager;
        this.f23749d = eqVar;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new ev(new com.waze.app_nav.m(com.waze.main_screen.r.f27406a, new com.waze.app_nav.ah(false, null, new com.waze.app_nav.f(com.waze.app_nav.g.f15205a), 3)), false));
        this.f23750e = bnVarB;
        this.f23751f = FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new dn(bnVarB, 4)), (h.c.j) null, 0L, 3, (Object) null);
        this.f23752g = FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new dn(bnVarB, 5)), (h.c.j) null, 0L, 3, (Object) null);
        this.f23754i = new MutableLiveData(null);
        kotlinx.coroutines.b.k kVarQ = kotlinx.coroutines.b.ai.q(chVar, chVar2, new ew(this));
        ez ezVar = this;
        kotlinx.coroutines.af viewModelScope = ViewModelKt.getViewModelScope(ezVar);
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.f23755j = kotlinx.coroutines.b.ai.V(kVarQ, viewModelScope, kotlinx.coroutines.b.by.b(), r((com.waze.install.w) chVar.d(), (cf) chVar2.d()));
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(wVar.b(), new eh(this, (h.c.e) null, 2)), ViewModelKt.getViewModelScope(ezVar));
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(ezVar), null, null, new ck(this, (h.c.e) null, 7), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(ezVar), null, null, new ck(this, (h.c.e) null, 8, (byte[]) null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        com.waze.planned_drive.o oVar;
        if (!h.g.b.x.n(((com.waze.app_nav.v) this.f23747b.b().d()).a().b(), com.waze.main_screen.r.f27406a) || (oVar = this.f23753h) == null) {
            return;
        }
        this.f23754i.postValue(oVar);
        this.f23753h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final er r(com.waze.install.w wVar, cf cfVar) {
        if (wVar instanceof com.waze.install.o) {
            return new en(cfVar instanceof am);
        }
        if (wVar instanceof com.waze.install.q) {
            return em.f23661a;
        }
        if ((cfVar instanceof an) || (cfVar instanceof ak)) {
            return eo.f23663a;
        }
        if (!(cfVar instanceof am)) {
            return (!this.f23756k || this.f23749d.isWazeMapAsPrimaryEnabled()) ? ep.f23664a : eq.f23665a;
        }
        eq eqVar = eq.f23665a;
        this.f23756k = true;
        return eqVar;
    }

    public final LiveData a() {
        return this.f23751f;
    }

    public final LiveData b() {
        return this.f23752g;
    }

    public final LiveData c() {
        return this.f23754i;
    }

    public final kotlinx.coroutines.b.ch g() {
        return this.f23755j;
    }

    public final void j() {
        this.f23754i.postValue(null);
    }

    public final void k() {
        this.f23747b.d();
    }

    public final void l() {
        this.f23747b.d();
    }

    public final void m() {
        this.f23747b.d();
        q();
    }

    public final void n() {
        this.f23746a.a("LOCATION_HISTORY");
    }

    public final void o(boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f23750e;
            objD = bnVar.d();
        } while (!bnVar.f(objD, ev.c((ev) objD, null, z, 3)));
    }
}
