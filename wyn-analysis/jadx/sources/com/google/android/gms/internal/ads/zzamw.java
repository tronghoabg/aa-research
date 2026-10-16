package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzamw implements zzanc {
    private final zzagn zza;
    private final zzagm zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzamw(zzagn zzagnVar, zzagm zzagmVar) {
        this.zza = zzagnVar;
        this.zzb = zzagmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final long zza(zzagb zzagbVar) {
        long j8 = this.zzd;
        if (j8 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j8 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzb(long j8) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfm.zzo(jArr, j8, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final zzahd zzc() {
        zzgtr.zzi(this.zzc != -1);
        return new zzagl(this.zza, this.zzc);
    }

    public final void zzd(long j8) {
        this.zzc = j8;
    }
}
