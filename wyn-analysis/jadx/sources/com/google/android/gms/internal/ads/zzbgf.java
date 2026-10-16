package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbgf {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbgf(long j8, String str, int i5) {
        this.zza = j8;
        this.zzb = str;
        this.zzc = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbgf)) {
            return false;
        }
        zzbgf zzbgfVar = (zzbgf) obj;
        return zzbgfVar.zza == this.zza && zzbgfVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
