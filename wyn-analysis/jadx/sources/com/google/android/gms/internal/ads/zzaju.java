package com.google.android.gms.internal.ads;

import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzaju extends zzajs {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzaju(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaju.class == obj.getClass()) {
            zzaju zzajuVar = (zzaju) obj;
            if (Objects.equals(this.zzb, zzajuVar.zzb) && Objects.equals(this.zza, zzajuVar.zza) && Objects.equals(this.zzc, zzajuVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        return this.zzc.hashCode() + (iHashCode2 * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = str2.length() + length + 9;
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str3.length() + length2 + 14);
        AbstractC3256n.p(sb2, str, ": domain=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
