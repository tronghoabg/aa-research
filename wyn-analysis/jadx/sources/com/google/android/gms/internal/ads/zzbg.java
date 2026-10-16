package com.google.android.gms.internal.ads;

import Va.M6;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.util.Arrays;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzbg {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzv[] zzd;
    private int zze;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbg(String str, zzv... zzvVarArr) {
        int length = zzvVarArr.length;
        int i5 = 1;
        zzgtr.zza(length > 0);
        this.zzb = str;
        this.zzd = zzvVarArr;
        this.zza = length;
        String str2 = zzvVarArr[0].zzp;
        this.zzc = TextUtils.isEmpty(str2) ? zzas.zzf(zzvVarArr[0].zzo) : zzas.zzf(str2);
        zzv zzvVar = zzvVarArr[0];
        String strZzc = zzc(zzvVar.zzd);
        int i10 = zzvVar.zzf | Http2.INITIAL_MAX_FRAME_SIZE;
        while (true) {
            zzv[] zzvVarArr2 = this.zzd;
            if (i5 >= zzvVarArr2.length) {
                return;
            }
            zzv zzvVar2 = zzvVarArr2[i5];
            String str3 = zzvVar2.zzd;
            if (!strZzc.equals(zzc(str3))) {
                zzd("languages", zzvVarArr2[0].zzd, str3, i5);
                return;
            } else {
                if (i10 != (zzvVar2.zzf | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    zzd("role flags", Integer.toBinaryString(zzvVarArr2[0].zzf), Integer.toBinaryString(this.zzd[i5].zzf), i5);
                    return;
                }
                i5++;
            }
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(String str, String str2, String str3, int i5) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i5).length() + 1);
        AbstractC3256n.p(sb2, "Different ", str, " combined in one TrackGroup: '", str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i5);
        sb2.append(")");
        zzeh.zzf("TrackGroup", "", new IllegalStateException(sb2.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbg.class == obj.getClass()) {
            zzbg zzbgVar = (zzbg) obj;
            if (this.zzb.equals(zzbgVar.zzb) && Arrays.equals(this.zzd, zzbgVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zze;
        if (i5 != 0) {
            return i5;
        }
        int iHashCode = this.zzb.hashCode() + 527;
        int iHashCode2 = Arrays.hashCode(this.zzd) + (iHashCode * 31);
        this.zze = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        String string = Arrays.toString(this.zzd);
        String str = this.zzb;
        return M6.t(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length()), str, ": ", string);
    }

    public final zzv zza(int i5) {
        return this.zzd[i5];
    }

    public final int zzb(zzv zzvVar) {
        int i5 = 0;
        while (true) {
            zzv[] zzvVarArr = this.zzd;
            if (i5 >= zzvVarArr.length) {
                return -1;
            }
            if (zzvVar == zzvVarArr[i5]) {
                return i5;
            }
            i5++;
        }
    }
}
