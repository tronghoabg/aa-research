package com.waze.car_lib.b;

import androidx.car.app.AppManager;
import androidx.car.app.CarContext;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f19082a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f19083b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CarContext f19084c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppManager f19085d;

    e(f fVar, h.g.b.aq aqVar, CarContext carContext, AppManager appManager) {
        this.f19082a = fVar;
        this.f19083b = aqVar;
        this.f19084c = carContext;
        this.f19085d = appManager;
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
        this.f19082a.f19087b.a("onPause, cancelling alert collection job");
        kotlinx.coroutines.br brVar = (kotlinx.coroutines.br) this.f19083b.f48105a;
        if (brVar != null) {
            brVar.s(null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        f fVar = this.f19082a;
        fVar.f19087b.a("onResume, collecting alerts");
        this.f19083b.f48105a = kotlinx.coroutines.aj.z(fVar.f19089d, null, null, new d(fVar, this.f19084c, this.f19085d, null), 3);
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
