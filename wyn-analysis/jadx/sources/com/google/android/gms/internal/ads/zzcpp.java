package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcpp {
    private zzcns zza;
    private zzcqm zzb;
    private zzfpw zzc;
    private zzcra zzd;
    private zzfmj zze;

    private zzcpp() {
        throw null;
    }

    public final zzcpp zza(zzcns zzcnsVar) {
        this.zza = zzcnsVar;
        return this;
    }

    public final zzcpp zzb(zzcqm zzcqmVar) {
        this.zzb = zzcqmVar;
        return this;
    }

    public final zzcnq zzc() {
        zzinh.zzc(this.zza, zzcns.class);
        zzinh.zzc(this.zzb, zzcqm.class);
        if (this.zzc == null) {
            this.zzc = new zzfpw();
        }
        if (this.zzd == null) {
            this.zzd = new zzcra();
        }
        if (this.zze == null) {
            this.zze = new zzfmj();
        }
        return new zzcpe(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public /* synthetic */ zzcpp(byte[] bArr) {
    }
}
