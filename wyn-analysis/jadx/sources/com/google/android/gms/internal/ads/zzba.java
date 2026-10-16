package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzba {
    public final Object zza;
    public final int zzb;
    public final zzak zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzba(Object obj, int i5, zzak zzakVar, Object obj2, int i10, long j8, long j10, int i11, int i12) {
        zzgtr.zza(i5 >= 0);
        zzgtr.zza(i10 >= 0);
        this.zza = obj;
        this.zzb = i5;
        this.zzc = zzakVar;
        this.zzd = obj2;
        this.zze = i10;
        this.zzf = j8;
        this.zzg = j10;
        this.zzh = i11;
        this.zzi = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.zzb == zzbaVar.zzb && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && this.zzh == zzbaVar.zzh && this.zzi == zzbaVar.zzi && Objects.equals(this.zzc, zzbaVar.zzc) && Objects.equals(this.zza, zzbaVar.zza) && Objects.equals(this.zzd, zzbaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi));
    }

    public final String toString() {
        int i5 = this.zzb;
        int length = String.valueOf(i5).length();
        int i10 = this.zze;
        int length2 = String.valueOf(i10).length();
        long j8 = this.zzf;
        StringBuilder sb2 = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j8).length());
        N0.a.l(i5, i10, "mediaItem=", ", period=", sb2);
        sb2.append(", pos=");
        sb2.append(j8);
        String string = sb2.toString();
        int i11 = this.zzh;
        if (i11 == -1) {
            return string;
        }
        long j10 = this.zzg;
        int i12 = this.zzi;
        int length3 = string.length();
        StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + length3 + 13 + String.valueOf(j10).length() + 10 + 5 + String.valueOf(i12).length());
        sb3.append(string);
        sb3.append(", contentPos=");
        sb3.append(j10);
        return com.google.android.gms.internal.consent_sdk.a.u(i11, i12, ", adGroup=", ", ad=", sb3);
    }
}
