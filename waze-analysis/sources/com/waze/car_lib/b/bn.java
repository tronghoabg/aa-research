package com.waze.car_lib.b;

import androidx.car.app.CarContext;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bn implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f19037a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bo f19038b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CarContext f19039c;

    bn(h.g.b.aq aqVar, bo boVar, CarContext carContext) {
        this.f19037a = aqVar;
        this.f19038b = boVar;
        this.f19039c = carContext;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f19037a.f48105a;
        if (afVar != null) {
            kotlinx.coroutines.aj.h(afVar, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        int i2 = kotlinx.coroutines.av.f51370a;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c());
        h.g.b.aq aqVar = this.f19037a;
        aqVar.f48105a = afVarE;
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) aqVar.f48105a;
        if (afVar != null) {
            kotlinx.coroutines.aj.z(afVar, null, null, new an(this.f19038b, this.f19039c, (h.c.e) null, 2), 3);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }
}
