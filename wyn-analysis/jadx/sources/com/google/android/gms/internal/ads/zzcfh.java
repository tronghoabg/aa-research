package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcfh extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzcfk zza;

    public zzcfh(zzcfk zzcfkVar) {
        Objects.requireNonNull(zzcfkVar);
        this.zza = zzcfkVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzD().set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzD().set(false);
    }
}
