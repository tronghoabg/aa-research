package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
public final class zzahe {
    public static final zzahe zza = new zzahe(0, 0);
    public final long zzb;
    public final long zzc;

    public zzahe(long j8, long j10) {
        this.zzb = j8;
        this.zzc = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahe.class == obj.getClass()) {
            zzahe zzaheVar = (zzahe) obj;
            if (this.zzb == zzaheVar.zzb && this.zzc == zzaheVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j8 = this.zzb;
        int length = String.valueOf(j8).length();
        long j10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(j10).length() + 1);
        M6.A(sb2, "[timeUs=", j8, ", position=");
        return M6.s(sb2, j10, "]");
    }
}
