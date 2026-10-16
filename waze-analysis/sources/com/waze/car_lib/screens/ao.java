package com.waze.car_lib.screens;

import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ao implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f21776a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IntentFilter f21777b;

    ao(ap apVar, IntentFilter intentFilter) {
        this.f21776a = apVar;
        this.f21777b = intentFilter;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        h.g.b.x.f(lifecycleOwner, "owner");
        try {
            ap apVar = this.f21776a;
            ContextCompat.registerReceiver(apVar.getCarContext(), apVar.f21780c, this.f21777b, 2);
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.e("Failure, could not register startStateBroadcastReceiver due to: ", e2);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        try {
            ap apVar = this.f21776a;
            apVar.getCarContext().unregisterReceiver(apVar.f21780c);
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.e("Failure, could not unregister startStateBroadcastReceiver due to: ", e2);
        }
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
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }
}
