package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class zzbhu {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbhu(InputStream inputStream, boolean z2, boolean z10, long j8, boolean z11) {
        this.zza = inputStream;
        this.zzb = z2;
        this.zzc = z10;
        this.zzd = j8;
        this.zze = z11;
    }

    public static zzbhu zza(InputStream inputStream, boolean z2, boolean z10, long j8, boolean z11) {
        return new zzbhu(inputStream, z2, z10, j8, z11);
    }

    public final InputStream zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
