package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class t extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f3544a;

    t(u uVar) {
        Objects.requireNonNull(uVar);
        this.f3544a = uVar;
    }

    private final void a(boolean z) {
        com.bumptech.glide.g.r.i(new s(this, z));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
