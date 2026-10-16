package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class zzasb implements zzahd {
    private final zzary zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzasb(zzary zzaryVar, int i5, long j8, long j10) {
        this.zza = zzaryVar;
        this.zzb = i5;
        this.zzc = j8;
        long j11 = (j10 - j8) / zzaryVar.zzd;
        this.zzd = j11;
        this.zze = zze(j11);
    }

    private final long zze(long j8) {
        return zzfm.zzw(j8 * this.zzb, 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        long j10 = this.zzb;
        zzary zzaryVar = this.zza;
        long j11 = (zzaryVar.zzc * j8) / (j10 * 1000000);
        String str = zzfm.zza;
        long j12 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j11, j12));
        long j13 = zzaryVar.zzd;
        long jZze = zze(jMax);
        long j14 = this.zzc;
        zzahe zzaheVar = new zzahe(jZze, (jMax * j13) + j14);
        if (jZze >= j8 || jMax == j12) {
            return new zzahb(zzaheVar, zzaheVar);
        }
        long j15 = jMax + 1;
        return new zzahb(zzaheVar, new zzahe(zze(j15), (j13 * j15) + j14));
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}
