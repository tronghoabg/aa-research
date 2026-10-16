package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfnt {
    private final long zza;
    private long zzc;
    private final zzfns zzb = new zzfns();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfnt() {
        C6.n.f1857D.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zza = jCurrentTimeMillis;
        this.zzc = jCurrentTimeMillis;
    }

    public final void zza() {
        C6.n.f1857D.k.getClass();
        this.zzc = System.currentTimeMillis();
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
        this.zzb.zza = true;
    }

    public final void zzc() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final long zzd() {
        return this.zza;
    }

    public final long zze() {
        return this.zzc;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final zzfns zzg() {
        zzfns zzfnsVar = this.zzb;
        zzfns zzfnsVarClone = zzfnsVar.clone();
        zzfnsVar.zza = false;
        zzfnsVar.zzb = 0;
        return zzfnsVarClone;
    }

    public final String zzh() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }
}
