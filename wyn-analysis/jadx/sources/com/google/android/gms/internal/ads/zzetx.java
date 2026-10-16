package com.google.android.gms.internal.ads;

import D6.InterfaceC0407y;
import D6.K0;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzetx {
    private final zzdql zza;
    private final zzetk zzb;
    private final zzddc zzc;

    public zzetx(zzdql zzdqlVar, zzdzt zzdztVar) {
        this.zza = zzdqlVar;
        final zzetk zzetkVar = new zzetk(zzdztVar);
        this.zzb = zzetkVar;
        final zzbsr zzbsrVarZze = zzdqlVar.zze();
        this.zzc = new zzddc() { // from class: com.google.android.gms.internal.ads.zzetw
            @Override // com.google.android.gms.internal.ads.zzddc
            public final /* synthetic */ void zzdJ(K0 k02) {
                zzetkVar.zzdJ(k02);
                zzbsr zzbsrVar = zzbsrVarZze;
                if (zzbsrVar != null) {
                    try {
                        zzbsrVar.zzg(k02);
                    } catch (RemoteException e7) {
                        H6.l.i("#007 Could not call remote method.", e7);
                    }
                }
                if (zzbsrVar != null) {
                    try {
                        zzbsrVar.zzf(k02.f2338a);
                    } catch (RemoteException e10) {
                        H6.l.i("#007 Could not call remote method.", e10);
                    }
                }
            }
        };
    }

    public final void zza(InterfaceC0407y interfaceC0407y) {
        this.zzb.zzl(interfaceC0407y);
    }

    public final zzdof zzb() {
        return new zzdof(this.zza, this.zzb.zzi());
    }

    public final zzetk zzc() {
        return this.zzb;
    }

    public final zzden zzd() {
        return this.zzb;
    }

    public final zzddc zze() {
        return this.zzc;
    }
}
