package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zznk {
    public static final zznk zza;
    public static final zznk zzb;
    public static final zznk zzc;
    public final long zzd;
    public final long zze = 0;

    static {
        zznk zznkVar = new zznk(0L, 0L);
        zza = zznkVar;
        zzb = new zznk(Long.MAX_VALUE, 0L);
        zzc = zznkVar;
    }

    public zznk(long j8, long j10) {
        this.zzd = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zznk.class == obj.getClass() && this.zzd == ((zznk) obj).zzd;
    }

    public final int hashCode() {
        return ((int) this.zzd) * 31;
    }
}
