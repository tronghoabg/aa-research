package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfta extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzftc zza;

    public zzfta(zzftc zzftcVar) {
        Objects.requireNonNull(zzftcVar);
        this.zza = zzftcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzk(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzk(false);
    }
}
