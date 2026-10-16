package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgqo {
    private final zzgfs zza;
    private final zzgcy zzb;

    public zzgqo(zzgcy zzgcyVar, zzgfs zzgfsVar) {
        this.zza = zzgfsVar;
        this.zzb = zzgcyVar;
    }

    public final zzgqm zza(int i5) {
        return new zzgqm(i5, this.zzb, this.zza);
    }

    public final void zzb(int i5) {
        this.zza.zzb(i5 - 1, -1L, null, null);
    }

    public final void zzc(int i5, String str) {
        this.zza.zzb(i5 - 1, -1L, null, str);
    }

    public final void zzd(int i5, Throwable th) {
        this.zza.zzb(i5 - 1, -1L, th, null);
    }

    public final p8.p zze(int i5, p8.p pVar) {
        zzgqm zzgqmVarZza = zza(i5);
        zzgqmVarZza.zza();
        zzhcf.zzr(pVar, new zzgqn(this, zzgqmVarZza), zzhcw.zza());
        return pVar;
    }

    public final void zzf(int i5, Runnable runnable) {
        try {
            zza(i5).zza();
            runnable.run();
        } finally {
        }
    }
}
