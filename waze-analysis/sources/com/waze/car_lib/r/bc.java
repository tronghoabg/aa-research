package com.waze.car_lib.r;

import androidx.car.app.CarContext;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bc implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.f.ax f21017a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bn.b f21018b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.b.bo f21019c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.b.f f21020d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.map.b.n f21021e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.network.b.al f21022f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.o.c.c.b f21023g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f21024h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.car_lib.p.am f21025i;

    /* renamed from: j, reason: collision with root package name */
    private final MutableLiveData f21026j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.bw.a.b.v f21027k;

    public bc(com.waze.car_lib.f.ax axVar, com.waze.bn.b bVar, com.waze.car_lib.b.bo boVar, com.waze.car_lib.b.f fVar, com.waze.map.b.n nVar, com.waze.bw.a.b.k kVar, com.waze.network.b.al alVar, com.waze.o.c.c.b bVar2) {
        h.g.b.x.f(axVar, "appCoordinatorController");
        h.g.b.x.f(bVar, "roamingStateProvider");
        h.g.b.x.f(boVar, "notificationToastLifecyclePresenter");
        h.g.b.x.f(fVar, "alertLifecyclePresenter");
        h.g.b.x.f(nVar, "mainMap");
        h.g.b.x.f(kVar, "startStateCarViewModelFactory");
        h.g.b.x.f(alVar, "networkStatusIndicatorUseCase");
        h.g.b.x.f(bVar2, "companinioConfig");
        this.f21017a = axVar;
        this.f21018b = bVar;
        this.f21019c = boVar;
        this.f21020d = fVar;
        this.f21021e = nVar;
        this.f21022f = alVar;
        this.f21023g = bVar2;
        this.f21024h = kotlinx.coroutines.b.ck.b(false);
        this.f21027k = kVar.a();
        com.waze.car_lib.p.am amVar = new com.waze.car_lib.p.am(false, false, false, new com.waze.car_lib.p.al(false, false, false, false, false));
        this.f21025i = amVar;
        this.f21026j = new MutableLiveData(amVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void p(bc bcVar, com.waze.resume_drive.a aVar, boolean z, boolean z2) {
        MutableLiveData mutableLiveData = bcVar.f21026j;
        com.waze.car_lib.p.am amVar = (com.waze.car_lib.p.am) mutableLiveData.getValue();
        if (amVar == null) {
            amVar = bcVar.f21025i;
        }
        mutableLiveData.setValue(com.waze.car_lib.p.am.e(amVar, aVar instanceof com.waze.bn.e, !z, z2, null, 8));
    }

    public final LiveData a() {
        return this.f21026j;
    }

    public final com.waze.car_lib.p.am d() {
        return this.f21025i;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    public final void j() {
        this.f21021e.r(com.waze.map.b.q.f28364a, true);
    }

    public final void k() {
        this.f21027k.o(com.waze.bw.a.b.e.f17573a);
    }

    public final void l(boolean z) {
        this.f21024h.e(Boolean.valueOf(z));
    }

    public final void m() {
        this.f21027k.o(com.waze.bw.a.b.i.f17577a);
    }

    public final void n(final kotlinx.coroutines.af afVar, CarContext carContext, Lifecycle lifecycle) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(lifecycle, "lifecycle");
        this.f21019c.b(lifecycle, carContext);
        this.f21020d.h(lifecycle, carContext);
        this.f21027k.n(afVar);
        kotlinx.coroutines.aj.z(afVar, null, null, new j(this, (h.c.e) null, 4), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new j(this, (h.c.e) null, 5, (byte[]) null), 3);
        NativeManager.runOnNativeManagerReady(new Runnable() { // from class: com.waze.car_lib.r.ax
            @Override // java.lang.Runnable
            public final void run() {
                kotlinx.coroutines.aj.z(afVar, null, null, new j(this, (h.c.e) null, 6, (char[]) null), 3);
            }
        });
    }
}
