package com.waze.car_lib.i;

import androidx.car.app.CarContext;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.internal.o;
import com.waze.NativeManager;
import com.waze.car_lib.aq;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f20158a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.i.a.a f20159b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f20160c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CarContext f20161d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f20162e;

    e(aq aqVar, com.waze.car_lib.i.a.a aVar, af afVar, CarContext carContext, f fVar) {
        this.f20158a = aqVar;
        this.f20159b = aVar;
        this.f20160c = afVar;
        this.f20161d = carContext;
        this.f20162e = fVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
        this.f20158a.a(this.f20159b, this.f20160c, this.f20161d);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
        NativeManager.runOnNativeManagerReady(new o(this.f20162e, 12));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }
}
