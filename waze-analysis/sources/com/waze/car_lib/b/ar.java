package com.waze.car_lib.b;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import androidx.car.app.CarContext;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ar implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CarContext f18994a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ as f18995b;

    ar(CarContext carContext, as asVar) {
        this.f18994a = carContext;
        this.f18995b = asVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        Object objA;
        h.g.b.x.f(lifecycleOwner, "owner");
        as asVar = this.f18995b;
        try {
            ar arVar = this;
            CarContext carContext = this.f18994a;
            BroadcastReceiver broadcastReceiverA = as.a(asVar);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.waze.INTENT_ACTION_ALERTER");
            objA = ContextCompat.registerReceiver(carContext, broadcastReceiverA, intentFilter, 2);
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        as asVar2 = this.f18995b;
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            asVar2.f18997b.a(thC, null);
            com.waze.shared_infra.i.a.d("AlerterActionsBroadcastReceiver").i(thC);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        this.f18994a.unregisterReceiver(as.a(this.f18995b));
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
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }
}
