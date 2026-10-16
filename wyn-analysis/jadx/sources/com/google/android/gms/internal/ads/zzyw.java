package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzyw implements zzabl {
    public long zza;
    public long zzb;
    public zzabk zzc;
    public zzyw zzd;

    public zzyw(long j8, int i5) {
        zza(j8, 65536);
    }

    public final void zza(long j8, int i5) {
        zzgtr.zzi(this.zzc == null);
        this.zza = j8;
        this.zzb = j8 + 65536;
    }

    public final int zzb(long j8) {
        long j10 = j8 - this.zza;
        int i5 = this.zzc.zzb;
        return (int) j10;
    }

    public final zzyw zzc() {
        this.zzc = null;
        zzyw zzywVar = this.zzd;
        this.zzd = null;
        return zzywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final zzabk zzd() {
        zzabk zzabkVar = this.zzc;
        zzabkVar.getClass();
        return zzabkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final zzabl zze() {
        zzyw zzywVar = this.zzd;
        if (zzywVar == null || zzywVar.zzc == null) {
            return null;
        }
        return zzywVar;
    }
}
