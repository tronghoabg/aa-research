package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.RemoteException;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzeoq extends zzbxb {
    final /* synthetic */ zzeor zza;
    private final zzemd zzb;

    public /* synthetic */ zzeoq(zzeor zzeorVar, zzemd zzemdVar, byte[] bArr) {
        Objects.requireNonNull(zzeorVar);
        this.zza = zzeorVar;
        this.zzb = zzemdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zze(zzbvy zzbvyVar) throws RemoteException {
        this.zza.zzc(zzbvyVar);
        ((zzenp) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzf(String str) throws RemoteException {
        ((zzenp) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzg(K0 k02) throws RemoteException {
        ((zzenp) this.zzb.zzc).zzx(k02);
    }
}
