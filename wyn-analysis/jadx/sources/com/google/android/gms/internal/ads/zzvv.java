package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzvv {
    private static final zzvv zza = new zzvv(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false);
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final zzfi zze;
    private boolean zzf;
    private long zzg;

    private zzvv(long j8, long j10, long j11, long j12, boolean z2) {
        this.zzb = j8;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = new zzfi(10);
        this.zzg = -9223372036854775807L;
    }

    public final /* synthetic */ long zzb() {
        return this.zzb;
    }

    public final /* synthetic */ long zzc() {
        return this.zzc;
    }

    public final /* synthetic */ long zzd() {
        return this.zzd;
    }

    public final /* synthetic */ zzfi zze() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzf;
    }

    public final /* synthetic */ void zzg(boolean z2) {
        this.zzf = z2;
    }

    public final /* synthetic */ long zzh() {
        return this.zzg;
    }

    public final /* synthetic */ void zzi(long j8) {
        this.zzg = j8;
    }

    public /* synthetic */ zzvv(long j8, long j10, long j11, long j12, boolean z2, byte[] bArr) {
        this(j8, j10, j11, j12, false);
    }
}
