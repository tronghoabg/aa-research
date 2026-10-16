package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzajz {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzajz(long j8, long j10, int i5) {
        zzgtr.zza(j8 < j10);
        this.zza = j8;
        this.zzb = j10;
        this.zzc = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajz.class == obj.getClass()) {
            zzajz zzajzVar = (zzajz) obj;
            if (this.zza == zzajzVar.zza && this.zzb == zzajzVar.zzb && this.zzc == zzajzVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        long j8 = this.zza;
        long j10 = this.zzb;
        int i5 = this.zzc;
        String str = zzfm.zza;
        Locale locale = Locale.US;
        StringBuilder sbU = M6.u(j8, "Segment: startTimeMs=", ", endTimeMs=");
        sbU.append(j10);
        sbU.append(", speedDivisor=");
        sbU.append(i5);
        return sbU.toString();
    }
}
