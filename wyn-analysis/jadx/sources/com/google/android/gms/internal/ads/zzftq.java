package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzftq extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzftr zza;

    public zzftq(zzftr zzftrVar) {
        Objects.requireNonNull(zzftrVar);
        this.zza = zzftrVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzi(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzi(false);
    }
}
