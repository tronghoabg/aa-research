package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzry {
    private final zzv zza;
    private zzham zzb = null;
    private zzbf zzc = zzbf.zza;
    private zzxl zzd = null;

    public zzry(zzv zzvVar) {
        this.zza = zzvVar;
    }

    public final zzry zza(zzham zzhamVar) {
        this.zzb = zzhamVar;
        return this;
    }

    public final zzry zzb(zzbf zzbfVar) {
        this.zzc = zzbfVar;
        return this;
    }

    public final zzry zzc(zzxl zzxlVar) {
        this.zzd = zzxlVar;
        return this;
    }

    public final zzrz zzd() {
        zzxl zzxlVar;
        if (!this.zzc.zzg() && (zzxlVar = this.zzd) != null) {
            zzgtr.zza(this.zzc.zze(zzxlVar.zza) != -1);
        }
        return new zzrz(this, null);
    }

    public final /* synthetic */ zzv zze() {
        return this.zza;
    }

    public final /* synthetic */ zzham zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzbf zzg() {
        return this.zzc;
    }

    public final /* synthetic */ zzxl zzh() {
        return this.zzd;
    }
}
