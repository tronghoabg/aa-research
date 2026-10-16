package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzamv implements zzanc {
    private final zzanb zza;
    private final long zzb;
    private final long zzc;
    private final zzang zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzamv(zzang zzangVar, long j8, long j10, long j11, long j12, boolean z2) {
        zzgtr.zza(j8 >= 0 && j10 > j8);
        this.zzd = zzangVar;
        this.zzb = j8;
        this.zzc = j10;
        if (j11 == j10 - j8 || z2) {
            this.zzf = j12;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzanb();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzanc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza(com.google.android.gms.internal.ads.zzagb r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zza(com.google.android.gms.internal.ads.zzagb):long");
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzb(long j8) {
        long j10 = this.zzf - 1;
        String str = zzfm.zza;
        this.zzh = Math.max(0L, Math.min(j8, j10));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final /* bridge */ /* synthetic */ zzahd zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzamu(this, bArr);
        }
        return null;
    }

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ zzang zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzf;
    }
}
