package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.waze.car_lib.f.fw;
import com.waze.car_lib.f.fx;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bn implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CarContext f21883a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.screens.core.n f21884b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21885c;

    bn(com.waze.car_lib.screens.core.n nVar, CarContext carContext, int i2) {
        this.f21885c = i2;
        this.f21884b = nVar;
        this.f21883a = carContext;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        if (this.f21885c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        if (this.f21885c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        if (this.f21885c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        if (this.f21885c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
            ((ae) this.f21884b).b().g(this.f21883a);
            return;
        }
        h.g.b.x.f(lifecycleOwner, "owner");
        fw fwVarB = ((bo) this.f21884b).b();
        CarContext carContext = this.f21883a;
        h.g.b.x.f(carContext, "carContext");
        if (com.waze.car_lib.m.c.c(carContext)) {
            fwVarB.H(new fx(true));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        if (this.f21885c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        if (this.f21885c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }
}
