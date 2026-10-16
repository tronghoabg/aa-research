package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdq {
    public static final zzdq zza = new zzdq(0, 0, false);
    private final int zzb;
    private final int zzc;
    private final boolean zzd;

    private zzdq(int i5, int i10, boolean z2) {
        this.zzd = z2;
        this.zzb = i5;
        this.zzc = i10;
    }

    public final int zza() {
        zzgtr.zzi(this.zzd);
        return this.zzb;
    }

    public final int zzb() {
        zzgtr.zzi(this.zzd);
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public zzdq(int i5, int i10) {
        this(i5, i10, true);
    }
}
