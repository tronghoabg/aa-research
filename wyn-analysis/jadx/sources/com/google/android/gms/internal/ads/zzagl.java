package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzagl implements zzahd {
    private final zzagn zza;
    private final long zzb;

    public zzagl(zzagn zzagnVar, long j8) {
        this.zza = zzagnVar;
        this.zzb = j8;
    }

    private final zzahe zze(long j8, long j10) {
        return new zzahe((j8 * 1000000) / this.zza.zze, this.zzb + j10);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        zzagn zzagnVar = this.zza;
        zzagm zzagmVar = zzagnVar.zzk;
        zzagmVar.getClass();
        long jZzb = zzagnVar.zzb(j8);
        long[] jArr = zzagmVar.zza;
        int iZzo = zzfm.zzo(jArr, jZzb, true, false);
        long j10 = iZzo == -1 ? 0L : jArr[iZzo];
        long[] jArr2 = zzagmVar.zzb;
        zzahe zzaheVarZze = zze(j10, iZzo != -1 ? jArr2[iZzo] : 0L);
        if (zzaheVarZze.zzb == j8 || iZzo == jArr.length - 1) {
            return new zzahb(zzaheVarZze, zzaheVarZze);
        }
        int i5 = iZzo + 1;
        return new zzahb(zzaheVarZze, zze(jArr[i5], jArr2[i5]));
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}
