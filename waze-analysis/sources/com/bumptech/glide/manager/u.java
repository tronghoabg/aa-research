package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    boolean f3545a;

    /* renamed from: b, reason: collision with root package name */
    final b f3546b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.g.j f3547c;

    /* renamed from: d, reason: collision with root package name */
    private final ConnectivityManager.NetworkCallback f3548d = new t(this);

    u(com.bumptech.glide.g.j jVar, b bVar) {
        this.f3547c = jVar;
        this.f3546b = bVar;
    }

    public final void a() {
        ((ConnectivityManager) this.f3547c.a()).unregisterNetworkCallback(this.f3548d);
    }

    public final boolean b() {
        com.bumptech.glide.g.j jVar = this.f3547c;
        this.f3545a = ((ConnectivityManager) jVar.a()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) jVar.a()).registerDefaultNetworkCallback(this.f3548d);
            return true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e2);
            }
            return false;
        }
    }
}
