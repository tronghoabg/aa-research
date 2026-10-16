package com.google.android.gms.internal.ads;

import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzajh implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzajh(int i5, String str, String str2, String str3, boolean z2, int i10) {
        boolean z10 = true;
        if (i10 != -1 && i10 <= 0) {
            z10 = false;
        }
        zzgtr.zza(z10);
        this.zza = i5;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z2;
        this.zzf = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajh.class == obj.getClass()) {
            zzajh zzajhVar = (zzajh) obj;
            if (this.zza == zzajhVar.zza && Objects.equals(this.zzb, zzajhVar.zzb) && Objects.equals(this.zzc, zzajhVar.zzc) && Objects.equals(this.zzd, zzajhVar.zzd) && this.zze == zzajhVar.zze && this.zzf == zzajhVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i5 = this.zza;
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = ((i5 + 527) * 31) + iHashCode;
        String str3 = this.zzd;
        return (((((((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        int i5 = this.zza;
        int length3 = String.valueOf(i5).length();
        int i10 = this.zzf;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i10).length());
        AbstractC3256n.p(sb2, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return com.google.android.gms.internal.consent_sdk.a.u(i5, i10, "\", bitrate=", ", metadataInterval=", sb2);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        String str = this.zzc;
        if (str != null) {
            zzamVar.zzu(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzamVar.zzt(str2);
        }
    }
}
