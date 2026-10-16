package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.RemoteException;
import android.view.View;
import j$.util.Objects;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
final class zzeni extends zzbwv {
    final /* synthetic */ zzenj zza;
    private final zzemd zzb;

    public /* synthetic */ zzeni(zzenj zzenjVar, zzemd zzemdVar, byte[] bArr) {
        Objects.requireNonNull(zzenjVar);
        this.zza = zzenjVar;
        this.zzb = zzemdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(InterfaceC3876a interfaceC3876a) throws RemoteException {
        this.zza.zzd((View) BinderC3877b.S(interfaceC3876a));
        ((zzenp) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(String str) throws RemoteException {
        ((zzenp) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg(K0 k02) throws RemoteException {
        ((zzenp) this.zzb.zzc).zzx(k02);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzh(zzbvs zzbvsVar) throws RemoteException {
        this.zza.zze(zzbvsVar);
        ((zzenp) this.zzb.zzc).zzj();
    }
}
