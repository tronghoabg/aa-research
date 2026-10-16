package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzzh extends zzbf {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzak zzf;
    private final zzaf zzg;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("SinglePeriodTimeline");
        zzzVar.zzb(Uri.EMPTY);
        zzzVar.zzc();
    }

    public zzzh(long j8, long j10, long j11, long j12, long j13, long j14, long j15, boolean z2, boolean z10, boolean z11, Object obj, zzak zzakVar, zzaf zzafVar) {
        this.zzc = j12;
        this.zzd = j13;
        this.zze = z2;
        zzakVar.getClass();
        this.zzf = zzakVar;
        this.zzg = zzafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i5, zzbe zzbeVar, long j8) {
        zzgtr.zzm(i5, 1, "index");
        boolean z2 = this.zze;
        zzbeVar.zza(zzbe.zza, this.zzf, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z2, false, this.zzg, 0L, this.zzd, 0, 0, 0L);
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i5, zzbd zzbdVar, boolean z2) {
        zzgtr.zzm(i5, 1, "index");
        zzbdVar.zza(null, z2 ? zzb : null, 0, this.zzc, 0L, zzc.zza, false, false);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i5) {
        zzgtr.zzm(i5, 1, "index");
        return zzb;
    }
}
