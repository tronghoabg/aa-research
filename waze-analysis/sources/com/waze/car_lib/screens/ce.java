package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.waze.car_lib.r.dr;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ce implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cf f21922a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CarContext f21923b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dr f21924c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f21925d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f21926e;

    ce(cf cfVar, CarContext carContext, dr drVar, h.g.a.l lVar, h.g.a.a aVar) {
        this.f21922a = cfVar;
        this.f21923b = carContext;
        this.f21924c = drVar;
        this.f21925d = lVar;
        this.f21926e = aVar;
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
    public final void onResume(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        h.g.a.l lVar = this.f21925d;
        CarContext carContext = this.f21923b;
        boolean z = lVar != null;
        dr drVar = this.f21924c;
        com.waze.car_lib.p.ac acVarA = drVar.a(z);
        cf cfVar = this.f21922a;
        cfVar.q(com.waze.authentication.ax.h(carContext, acVarA, new com.waze.app_nav.hub.n(cfVar, this.f21926e, 2), new com.waze.ads.c((Object) cfVar, (Object) drVar, (Object) lVar, 4, (char[]) null)));
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
