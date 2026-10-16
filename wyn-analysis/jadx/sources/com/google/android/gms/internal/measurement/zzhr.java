package com.google.android.gms.internal.measurement;

import android.net.Uri;
import k8.InterfaceC3199h;

/* loaded from: classes4.dex */
public final class zzhr {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final InterfaceC3199h zzh;
    private final boolean zzi;

    public zzhr(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzhr zza() {
        return new zzhr(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzhr zzb() {
        if (!this.zzc.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        InterfaceC3199h interfaceC3199h = this.zzh;
        if (interfaceC3199h == null) {
            return new zzhr(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, interfaceC3199h);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }

    private zzhr(String str, Uri uri, String str2, String str3, boolean z2, boolean z10, boolean z11, boolean z12, InterfaceC3199h interfaceC3199h) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z2;
        this.zzf = z10;
        this.zzi = z11;
        this.zzg = z12;
        this.zzh = interfaceC3199h;
    }

    public final zzhj<Double> zza(String str, double d3) {
        return zzhj.zza(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzhj<Long> zza(String str, long j8) {
        return zzhj.zza(this, str, Long.valueOf(j8), true);
    }

    public final zzhj<String> zza(String str, String str2) {
        return zzhj.zza(this, str, str2, true);
    }

    public final zzhj<Boolean> zza(String str, boolean z2) {
        return zzhj.zza(this, str, Boolean.valueOf(z2), true);
    }
}
