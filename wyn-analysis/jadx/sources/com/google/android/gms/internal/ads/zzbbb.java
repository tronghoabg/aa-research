package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbbb extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbbc zza;

    public zzbbb(zzbbc zzbbcVar) {
        Objects.requireNonNull(zzbbcVar);
        this.zza = zzbbcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzbbc.class) {
            this.zza.zzd(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzbbc.class) {
            this.zza.zzd(null);
        }
    }
}
