package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzajg implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzajg(int i5, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.zza = i5;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = i13;
        this.zzh = bArr;
    }

    public static zzajg zzb(zzeu zzeuVar) {
        int iZzB = zzeuVar.zzB();
        String strZzh = zzas.zzh(zzeuVar.zzK(zzeuVar.zzB(), StandardCharsets.US_ASCII));
        String strZzK = zzeuVar.zzK(zzeuVar.zzB(), StandardCharsets.UTF_8);
        int iZzB2 = zzeuVar.zzB();
        int iZzB3 = zzeuVar.zzB();
        int iZzB4 = zzeuVar.zzB();
        int iZzB5 = zzeuVar.zzB();
        int iZzB6 = zzeuVar.zzB();
        byte[] bArr = new byte[iZzB6];
        zzeuVar.zzm(bArr, 0, iZzB6);
        return new zzajg(iZzB, strZzh, strZzK, iZzB2, iZzB3, iZzB4, iZzB5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajg.class == obj.getClass()) {
            zzajg zzajgVar = (zzajg) obj;
            if (this.zza == zzajgVar.zza && this.zzb.equals(zzajgVar.zzb) && this.zzc.equals(zzajgVar.zzc) && this.zzd == zzajgVar.zzd && this.zze == zzajgVar.zze && this.zzf == zzajgVar.zzf && this.zzg == zzajgVar.zzg && Arrays.equals(this.zzh, zzajgVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zza + 527;
        int iHashCode = this.zzb.hashCode() + (i5 * 31);
        int iHashCode2 = this.zzc.hashCode() + (iHashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((iHashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        return AbstractC3256n.h(new StringBuilder(str2.length() + length + 32), "Picture: mimeType=", str, ", description=", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzh, this.zza);
    }
}
