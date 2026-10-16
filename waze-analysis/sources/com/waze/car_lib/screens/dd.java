package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dd implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ de f21997a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CarContext f21998b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.r.ay f21999c;

    dd(de deVar, com.waze.car_lib.r.ay ayVar, CarContext carContext) {
        this.f21997a = deVar;
        this.f21999c = ayVar;
        this.f21998b = carContext;
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
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        de deVar = this.f21997a;
        deVar.f22001b.a("onStart, beginning observing viewModel");
        int i2 = kotlinx.coroutines.av.f51370a;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(h.g.b.o.i()));
        com.waze.car_lib.r.ay ayVar = this.f21999c;
        ayVar.b(afVarE).observe(lifecycleOwner, new g(new com.waze.z.a.c.j(deVar, this.f21998b, ayVar, afVarE, 1), 17, (boolean[][][]) null));
        deVar.f22002c = afVarE;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        de deVar = this.f21997a;
        deVar.f22001b.a("onStop, stopping observing viewModel");
        kotlinx.coroutines.af afVar = deVar.f22002c;
        if (afVar != null) {
            kotlinx.coroutines.aj.h(afVar, null);
        }
        deVar.f22002c = null;
    }
}
