package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public class zzeqd extends zzere {
    private final zzdlp zza;

    public zzeqd(zzdcx zzdcxVar, zzdle zzdleVar, zzddr zzddrVar, zzdeg zzdegVar, zzdel zzdelVar, zzddm zzddmVar, zzdid zzdidVar, zzdmc zzdmcVar, zzdfk zzdfkVar, zzdlp zzdlpVar, zzdhz zzdhzVar) {
        super(zzdcxVar, zzdleVar, zzddrVar, zzdegVar, zzdelVar, zzdidVar, zzdfkVar, zzdmcVar, zzdhzVar, zzddmVar);
        this.zza = zzdlpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzere, com.google.android.gms.internal.ads.zzbvp
    public final void zzn() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzere, com.google.android.gms.internal.ads.zzbvp
    public final void zzo() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzere, com.google.android.gms.internal.ads.zzbvp
    public final void zzp(zzcci zzcciVar) {
        this.zza.zzb(zzcciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzere, com.google.android.gms.internal.ads.zzbvp
    public final void zzr(zzccm zzccmVar) throws RemoteException {
        this.zza.zzb(new zzcci(zzccmVar.zze(), zzccmVar.zzf()));
    }

    @Override // com.google.android.gms.internal.ads.zzere, com.google.android.gms.internal.ads.zzbvp
    public final void zzt() throws RemoteException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzere, com.google.android.gms.internal.ads.zzbvp
    public final void zzz() throws RemoteException {
        this.zza.zzb(null);
    }
}
