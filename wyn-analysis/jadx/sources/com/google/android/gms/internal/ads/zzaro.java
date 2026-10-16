package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;

/* loaded from: classes3.dex */
public final class zzaro {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzaro(int i5, int i10, int i11) {
        this.zza = i5 != Integer.MIN_VALUE ? AbstractC0279p0.j(i5, "/", new StringBuilder(String.valueOf(i5).length() + 1)) : "";
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void zza() {
        int i5 = this.zzd;
        int i10 = i5 == Integer.MIN_VALUE ? this.zzb : i5 + this.zzc;
        this.zzd = i10;
        String str = this.zza;
        this.zze = N0.a.d(i10, str, new StringBuilder(str.length() + String.valueOf(i10).length()));
    }

    public final int zzb() {
        zzd();
        return this.zzd;
    }

    public final String zzc() {
        zzd();
        return this.zze;
    }
}
