package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfnx {
    private final zzfnp zza;
    private final p8.p zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfnx(final zzfmv zzfmvVar, final zzfno zzfnoVar, final zzfnp zzfnpVar) {
        this.zza = zzfnpVar;
        this.zzb = zzhcf.zzh(zzhcf.zzj(zzfnoVar.zza(zzfnpVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfnw
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc(zzfnoVar, zzfmvVar, zzfnpVar, (zzfne) obj);
            }
        }, zzfnpVar.zza()), Exception.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfnu
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzd(zzfnoVar, (Exception) obj);
            }
        }, zzfnpVar.zza());
    }

    public final synchronized void zza(zzhcc zzhccVar) {
        zzfnp zzfnpVar = this.zza;
        zzhcf.zzr(zzhcf.zzj(this.zzb, zzfnv.zza, zzfnpVar.zza()), zzhccVar, zzfnpVar.zza());
    }

    public final synchronized p8.p zzb(zzfnp zzfnpVar) {
        if (!this.zzd && !this.zzc) {
            zzfnp zzfnpVar2 = this.zza;
            if (zzfnpVar2.zzb() != null && zzfnpVar.zzb() != null && zzfnpVar2.zzb().equals(zzfnpVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    public final /* synthetic */ p8.p zzc(zzfno zzfnoVar, zzfmv zzfmvVar, zzfnp zzfnpVar, zzfne zzfneVar) {
        synchronized (this) {
            try {
                this.zzd = true;
                zzfnoVar.zzb(zzfneVar);
                if (this.zzc) {
                    return zzhcf.zza(new zzfnn(zzfneVar, zzfnpVar));
                }
                zzfmvVar.zzb(zzfnpVar.zzb(), zzfneVar);
                return zzhcf.zza(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ p8.p zzd(zzfno zzfnoVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}
