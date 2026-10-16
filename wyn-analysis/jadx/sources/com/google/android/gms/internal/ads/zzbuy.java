package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbuy {
    private final zzbub zza;
    private p8.p zzb;

    public zzbuy(zzbub zzbubVar) {
        this.zza = zzbubVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcgd zzcgdVar = new zzcgd();
            this.zzb = zzcgdVar;
            this.zza.zzb(null).zze(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzbux
                @Override // com.google.android.gms.internal.ads.zzcgh
                public final /* synthetic */ void zza(Object obj) {
                    zzcgdVar.zzc((zzbuc) obj);
                }
            }, new zzcgf() { // from class: com.google.android.gms.internal.ads.zzbuu
                @Override // com.google.android.gms.internal.ads.zzcgf
                public final /* synthetic */ void zza() {
                    zzcgdVar.zzd(new zzbue("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbvb zza(String str, zzbui zzbuiVar, zzbuh zzbuhVar) {
        zzd();
        return new zzbvb(this.zzb, "google.afma.activeView.handleUpdate", zzbuiVar, zzbuhVar);
    }

    public final void zzb(final String str, final zzbpx zzbpxVar) {
        zzd();
        this.zzb = zzhcf.zzj(this.zzb, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzbuv
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                zzbuc zzbucVar = (zzbuc) obj;
                zzbucVar.zzm(str, zzbpxVar);
                return zzhcf.zza(zzbucVar);
            }
        }, zzcfy.zzh);
    }

    public final void zzc(final String str, final zzbpx zzbpxVar) {
        this.zzb = zzhcf.zzk(this.zzb, new zzgti() { // from class: com.google.android.gms.internal.ads.zzbuw
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzbuc zzbucVar = (zzbuc) obj;
                zzbucVar.zzn(str, zzbpxVar);
                return zzbucVar;
            }
        }, zzcfy.zzh);
    }
}
