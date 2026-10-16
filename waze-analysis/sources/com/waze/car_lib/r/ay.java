package com.waze.car_lib.r;

import androidx.car.app.CarContext;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.waze.R;
import com.waze.car_lib.f.il;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ay {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20984a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f20985b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f20986c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f20987d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f20988e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f20989f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f20990g;

    public ay(il ilVar, com.waze.shared_infra.o.a aVar, com.waze.config.c cVar, com.waze.system.e eVar) {
        h.g.b.x.f(ilVar, "coordinatorController");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(cVar, "loginTimeoutSecConfig");
        h.g.b.x.f(eVar, "systemSettingsInterface");
        this.f20986c = ilVar;
        this.f20987d = cVar;
        this.f20989f = eVar;
        String strC = aVar.c(R.string.QR_LOGIN_TITLE, new Object[0]);
        this.f20984a = strC;
        com.waze.car_lib.p.df dfVar = new com.waze.car_lib.p.df(strC, aVar.c(R.string.AAOS_LOADING_LOGIN_STATE_MESSAGE, new Object[0]));
        this.f20985b = dfVar;
        this.f20990g = new com.waze.car_lib.p.dg(strC, aVar.c(R.string.AAOS_LOADING_LOGIN_STATE_TIMEOUT_MESSAGE, new Object[0]), Integer.valueOf(R.drawable.launch_icon_64px), false, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_LOADING_LOGIN_STATE_TIMEOUT_SETTINGS_BUTTON, new Object[0]), false), new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_LOADING_LOGIN_STATE_TIMEOUT_REFRESH_BUTTON, new Object[0]), true));
        this.f20988e = kotlinx.coroutines.b.ck.b(dfVar);
    }

    public static final /* synthetic */ com.waze.car_lib.p.dg e(ay ayVar) {
        return (com.waze.car_lib.p.dg) ayVar.f20990g;
    }

    public static final /* synthetic */ com.waze.config.c f(ay ayVar) {
        return (com.waze.config.c) ayVar.f20987d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    private final void h(kotlinx.coroutines.af afVar) {
        this.f20988e.e(this.f20985b);
        kotlinx.coroutines.aj.z(afVar, null, null, new j(this, (h.c.e) null, 14), 3);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.waze.bn.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.waze.map.b.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.waze.bw.a.b.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.waze.network.b.al, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.waze.o.c.c.b, java.lang.Object] */
    public final bc a(com.waze.car_lib.f.ax axVar) {
        h.g.b.x.f(axVar, "appCoordinatorController");
        return new bc(axVar, this.f20984a, (com.waze.car_lib.b.bo) this.f20985b, (com.waze.car_lib.b.f) this.f20986c, this.f20987d, this.f20988e, this.f20989f, this.f20990g);
    }

    public final LiveData b(kotlinx.coroutines.af afVar) {
        h.g.b.x.f(afVar, "scope");
        h(afVar);
        return FlowLiveDataConversions.asLiveData$default((kotlinx.coroutines.b.k) this.f20988e, (h.c.j) null, 0L, 3, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.system.e, java.lang.Object] */
    public final void c(CarContext carContext) {
        h.g.b.x.f(carContext, "carContext");
        this.f20989f.a(carContext);
    }

    public final void d(kotlinx.coroutines.af afVar) {
        h.g.b.x.f(afVar, "scope");
        h(afVar);
        ((il) this.f20986c).i();
    }

    public ay(com.waze.bn.b bVar, com.waze.car_lib.b.bo boVar, com.waze.car_lib.b.f fVar, com.waze.map.b.n nVar, com.waze.bw.a.b.k kVar, com.waze.network.b.al alVar, com.waze.o.c.c.b bVar2) {
        h.g.b.x.f(bVar, "roamingStateProvider");
        h.g.b.x.f(boVar, "notificationToastLifecyclePresenter");
        h.g.b.x.f(fVar, "alertLifecyclePresenter");
        h.g.b.x.f(nVar, "mainMap");
        h.g.b.x.f(kVar, "startStateCarViewModelFactory");
        h.g.b.x.f(alVar, "networkStatusIndicatorUseCase");
        h.g.b.x.f(bVar2, "companinioConfig");
        this.f20984a = bVar;
        this.f20985b = boVar;
        this.f20986c = fVar;
        this.f20987d = nVar;
        this.f20988e = kVar;
        this.f20989f = alVar;
        this.f20990g = bVar2;
    }
}
