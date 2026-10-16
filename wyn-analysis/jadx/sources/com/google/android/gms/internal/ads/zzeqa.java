package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.RemoteException;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzeqa extends zzbxe {
    private final zzemd zza;

    public /* synthetic */ zzeqa(zzeqb zzeqbVar, zzemd zzemdVar, byte[] bArr) {
        Objects.requireNonNull(zzeqbVar);
        this.zza = zzemdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zze() throws RemoteException {
        ((zzenp) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzf(String str) throws RemoteException {
        ((zzenp) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzg(K0 k02) throws RemoteException {
        ((zzenp) this.zza.zzc).zzx(k02);
    }
}
