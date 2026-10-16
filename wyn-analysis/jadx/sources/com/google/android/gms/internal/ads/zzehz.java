package com.google.android.gms.internal.ads;

import D6.K0;
import G6.C0553q;
import android.os.RemoteException;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzehz implements zzhcc {
    final /* synthetic */ zzcat zza;
    final /* synthetic */ zzcbc zzb;

    public zzehz(zzeiq zzeiqVar, zzcbc zzcbcVar, zzcat zzcatVar) {
        this.zzb = zzcbcVar;
        this.zza = zzcatVar;
        Objects.requireNonNull(zzeiqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        try {
            zzcbc zzcbcVar = this.zzb;
            K0 k0Zza = zzfmi.zza(th);
            zzcbcVar.zzf(new C0553q(zzgui.zzc(th.getMessage()) ? k0Zza.f2339b : th.getMessage(), k0Zza.f2338a));
        } catch (RemoteException e7) {
            G6.L.l("Service can't call client", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zze((String) obj, this.zza);
        } catch (RemoteException e7) {
            G6.L.l("Service can't call client", e7);
        }
    }
}
