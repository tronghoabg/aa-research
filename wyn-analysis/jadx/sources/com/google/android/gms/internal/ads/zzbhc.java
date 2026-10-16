package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.InterfaceC1713b;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbhc implements InterfaceC1713b {
    final /* synthetic */ zzbhe zza;

    public zzbhc(zzbhe zzbheVar) {
        Objects.requireNonNull(zzbheVar);
        this.zza = zzbheVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnected(Bundle bundle) {
        zzbhe zzbheVar = this.zza;
        synchronized (zzbheVar.zzh()) {
            try {
            } catch (DeadObjectException e7) {
                int i5 = G6.L.f4523b;
                H6.l.d("Unable to obtain a cache service instance.", e7);
                this.zza.zzg();
            }
            if (zzbheVar.zzi() != null) {
                zzbheVar.zzk(zzbheVar.zzi().zzq());
                this.zza.zzh().notifyAll();
            } else {
                this.zza.zzh().notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnectionSuspended(int i5) {
        zzbhe zzbheVar = this.zza;
        synchronized (zzbheVar.zzh()) {
            zzbheVar.zzk(null);
            zzbheVar.zzh().notifyAll();
        }
    }
}
