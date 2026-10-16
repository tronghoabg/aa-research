package com.waze.map;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bn implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bq f28435a;

    bn(bq bqVar) {
        Objects.requireNonNull(bqVar);
        this.f28435a = bqVar;
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
        bq bqVar = this.f28435a;
        if (bqVar.f28437b != null) {
            bqVar.f28437b.i();
            bqVar.f28437b = null;
        }
        if (bqVar.f28436a != null && bqVar.f28436a.i()) {
            bqVar.f28436a.f(false);
            bqVar.f28436a = null;
        }
        if (bqVar.f28438c != null) {
            bqVar.f28438c.e();
            bqVar.f28438c = null;
        }
        if (bqVar.f28443h) {
            com.waze.t.n(bqVar);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        bq bqVar = this.f28435a;
        if (bqVar.f28443h) {
            com.waze.t.i(bqVar);
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
