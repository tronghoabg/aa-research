package com.waze.car_lib.screens;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class by implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.screens.core.n f21906a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21907b;

    by(com.waze.car_lib.screens.core.n nVar, int i2) {
        this.f21907b = i2;
        this.f21906a = nVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        if (this.f21907b != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        if (this.f21907b != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
            ((f) this.f21906a).f22010a.q(com.waze.map.b.g.f28352a);
            return;
        }
        h.g.b.x.f(lifecycleOwner, "owner");
        com.waze.shared_infra.s.d dVar = ((bz) this.f21906a).f21913f;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        if (this.f21907b != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        if (this.f21907b != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        if (this.f21907b != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        if (this.f21907b != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }
}
