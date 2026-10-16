package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzajm extends zzajs {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzajm(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajm.class == obj.getClass()) {
            zzajm zzajmVar = (zzajm) obj;
            if (Objects.equals(this.zzb, zzajmVar.zzb) && Objects.equals(this.zza, zzajmVar.zza) && Objects.equals(this.zzc, zzajmVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() + ((this.zza.hashCode() + 527) * 31);
        String str = this.zzc;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zza;
        int length3 = str3.length() + length + 11;
        String str4 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 14 + 7 + length2);
        AbstractC3256n.p(sb2, str, ": language=", str3, ", description=");
        return M6.t(sb2, str4, ", text=", str2);
    }
}
