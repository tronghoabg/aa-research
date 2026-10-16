package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzafk {
    public static final zzafk zza = new zzafk(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzafk(int i5, long j8, long j10) {
        this.zzb = i5;
        this.zzc = j8;
        this.zzd = j10;
    }

    public static zzafk zza(long j8, long j10) {
        return new zzafk(-1, j8, j10);
    }

    public static zzafk zzb(long j8, long j10) {
        return new zzafk(-2, j8, j10);
    }

    public static zzafk zzc(long j8) {
        return new zzafk(0, -9223372036854775807L, j8);
    }

    public final /* synthetic */ int zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
