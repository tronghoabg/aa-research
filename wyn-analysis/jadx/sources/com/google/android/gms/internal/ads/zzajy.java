package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzajy extends zzajs {
    public final String zza;
    public final String zzb;

    public zzajy(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajy.class == obj.getClass()) {
            zzajy zzajyVar = (zzajy) obj;
            if (this.zzf.equals(zzajyVar.zzf) && Objects.equals(this.zza, zzajyVar.zza) && Objects.equals(this.zzb, zzajyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        return M6.t(new StringBuilder(str2.length() + length + 6), str, ": url=", str2);
    }
}
