package com.waze.gw;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.waze.car_lib.screens.ap;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes10.dex */
public final class AaStartStateTimeoutObserver implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ap f24285a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f24286b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f24287c;

    public AaStartStateTimeoutObserver(ap apVar) {
        this.f24285a = apVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
        try {
            int aaSuggestWidgetMode = Gateway.getAaSuggestWidgetMode();
            if (aaSuggestWidgetMode != 3) {
                long j2 = 1500;
                if (aaSuggestWidgetMode != 0) {
                    j2 = aaSuggestWidgetMode == 1 ? 10000L : 60000L;
                }
                Handler handler = new Handler(Looper.getMainLooper());
                this.f24286b = handler;
                AaStartStateTimeoutRunnable aaStartStateTimeoutRunnable = new AaStartStateTimeoutRunnable(this.f24285a);
                this.f24287c = aaStartStateTimeoutRunnable;
                handler.postDelayed(aaStartStateTimeoutRunnable, j2);
            }
        } catch (Throwable th) {
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Runnable runnable;
        try {
            Handler handler = this.f24286b;
            if (handler != null && (runnable = this.f24287c) != null) {
                handler.removeCallbacks(runnable);
            }
        } catch (Throwable th) {
        }
        x.f(lifecycleOwner, "owner");
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
