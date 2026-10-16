package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzagw implements zzahd {
    private final zzei zza;
    private final zzei zzb;
    private long zzc;

    public zzagw(long[] jArr, long[] jArr2, long j8) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzgtr.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzei(length2);
            this.zzb = new zzei(length2);
        } else {
            int i5 = length2 + 1;
            zzei zzeiVar = new zzei(i5);
            this.zza = zzeiVar;
            zzei zzeiVar2 = new zzei(i5);
            this.zzb = zzeiVar2;
            zzeiVar.zza(0L);
            zzeiVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        zzei zzeiVar = this.zzb;
        if (zzeiVar.zzd() == 0) {
            zzahe zzaheVar = zzahe.zza;
            return new zzahb(zzaheVar, zzaheVar);
        }
        int iZzp = zzfm.zzp(zzeiVar, j8, true, true);
        long jZzc = zzeiVar.zzc(iZzp);
        zzei zzeiVar2 = this.zza;
        zzahe zzaheVar2 = new zzahe(jZzc, zzeiVar2.zzc(iZzp));
        if (zzaheVar2.zzb == j8 || iZzp == zzeiVar.zzd() - 1) {
            return new zzahb(zzaheVar2, zzaheVar2);
        }
        int i5 = iZzp + 1;
        return new zzahb(zzaheVar2, new zzahe(zzeiVar.zzc(i5), zzeiVar2.zzc(i5)));
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}
