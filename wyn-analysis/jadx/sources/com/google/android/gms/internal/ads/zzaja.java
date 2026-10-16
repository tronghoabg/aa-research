package com.google.android.gms.internal.ads;

import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
final class zzaja implements zzaiz {
    private final long zza;
    private final long zzb;
    private final boolean zzc;
    private final zzx zzd;

    public zzaja(long j8, long j10, boolean z2, zzx zzxVar) {
        boolean z10 = true;
        if (j8 != -9223372036854775807L && j10 != -9223372036854775807L && j8 > j10) {
            z10 = false;
        }
        zzgtr.zza(z10);
        this.zza = j8;
        this.zzb = j10;
        this.zzc = z2;
        this.zzd = zzxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaja.class == obj.getClass()) {
            zzaja zzajaVar = (zzaja) obj;
            if (this.zza == zzajaVar.zza && this.zzb == zzajaVar.zzb && this.zzc == zzajaVar.zzc && Objects.equals(this.zzd, zzajaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.zza;
        long j10 = this.zzb;
        int i5 = ((((int) (j8 ^ (j8 >>> 32))) + 527) * 31) + ((int) ((j10 >>> 32) ^ j10));
        zzx zzxVar = this.zzd;
        return (((i5 * 31) + (this.zzc ? 1 : 0)) * 31) + (zzxVar != null ? zzxVar.hashCode() : 0);
    }

    public final String toString() {
        String string;
        long j8 = this.zza;
        Object objValueOf = j8 == -9223372036854775807L ? "UNSET" : Long.valueOf(j8);
        long j10 = this.zzb;
        String string2 = objValueOf.toString();
        if (j10 == -9223372036854775807L) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 12);
            sb2.append(", endTimeMs=");
            sb2.append(j10);
            string = sb2.toString();
        }
        boolean z2 = this.zzc;
        zzx zzxVar = this.zzd;
        String strConcat = zzxVar == null ? "" : ", title=".concat(zzxVar.toString());
        String str = true == z2 ? ", hidden" : "";
        StringBuilder sb3 = new StringBuilder(str.length() + string.length() + string2.length() + 21 + strConcat.length());
        AbstractC3256n.p(sb3, "Chapter: startTimeMs=", string2, string, str);
        sb3.append(strConcat);
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        AbstractC1746j.a(this, zzamVar);
    }
}
