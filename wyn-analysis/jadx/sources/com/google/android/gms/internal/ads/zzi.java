package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import Va.M6;
import java.util.Arrays;
import java.util.Locale;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzi {
    public static final zzi zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzh zzhVar = new zzh();
        zzhVar.zza(1);
        zzhVar.zzb(2);
        zzhVar.zzc(3);
        zza = zzhVar.zzg();
        zzh zzhVar2 = new zzh();
        zzhVar2.zza(1);
        zzhVar2.zzb(1);
        zzhVar2.zzc(2);
        zzhVar2.zzg();
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzi(int i5, int i10, int i11, byte[] bArr, int i12, int i13, byte[] bArr2) {
        this.zzb = i5;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = bArr;
        this.zzf = i12;
        this.zzg = i13;
    }

    public static boolean zza(zzi zziVar) {
        if (zziVar == null) {
            return true;
        }
        int i5 = zziVar.zzb;
        if (i5 != -1 && i5 != 1 && i5 != 2) {
            return false;
        }
        int i10 = zziVar.zzc;
        if (i10 != -1 && i10 != 2) {
            return false;
        }
        int i11 = zziVar.zzd;
        if ((i11 != -1 && i11 != 3) || zziVar.zze != null) {
            return false;
        }
        int i12 = zziVar.zzg;
        if (i12 != -1 && i12 != 8) {
            return false;
        }
        int i13 = zziVar.zzf;
        return i13 == -1 || i13 == 8;
    }

    public static int zzb(int i5) {
        if (i5 == 1) {
            return 1;
        }
        if (i5 != 9) {
            return (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzc(int i5) {
        if (i5 == 1) {
            return 3;
        }
        if (i5 == 4) {
            return 10;
        }
        if (i5 == 13) {
            return 2;
        }
        if (i5 == 16) {
            return 6;
        }
        if (i5 != 18) {
            return (i5 == 6 || i5 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzh(int i5) {
        return i5 != -1 ? i5 != 6 ? i5 != 1 ? i5 != 2 ? N0.a.d(i5, "Undefined color space ", new StringBuilder(String.valueOf(i5).length() + 22)) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzi(int i5) {
        return i5 != -1 ? i5 != 10 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 6 ? i5 != 7 ? N0.a.d(i5, "Undefined color transfer ", new StringBuilder(String.valueOf(i5).length() + 25)) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    private static String zzj(int i5) {
        return i5 != -1 ? i5 != 1 ? i5 != 2 ? N0.a.d(i5, "Undefined color range ", new StringBuilder(String.valueOf(i5).length() + 22)) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzi.class == obj.getClass()) {
            zzi zziVar = (zzi) obj;
            if (this.zzb == zziVar.zzb && this.zzc == zziVar.zzc && this.zzd == zziVar.zzd && Arrays.equals(this.zze, zziVar.zze) && this.zzf == zziVar.zzf && this.zzg == zziVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzh;
        if (i5 != 0) {
            return i5;
        }
        int iHashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i5 = this.zzf;
        int i10 = this.zzd;
        int i11 = this.zzc;
        String strZzh = zzh(this.zzb);
        String strZzj = zzj(i11);
        String strZzi = zzi(i10);
        String strJ = i5 != -1 ? AbstractC0279p0.j(i5, "bit Luma", new StringBuilder(String.valueOf(i5).length() + 8)) : "NA";
        int i12 = this.zzg;
        String strJ2 = i12 != -1 ? AbstractC0279p0.j(i12, "bit Chroma", new StringBuilder(String.valueOf(i12).length() + 10)) : "NA";
        boolean z2 = this.zze != null;
        StringBuilder sb2 = new StringBuilder(AbstractC0279p0.g(AbstractC0279p0.g(AbstractC0279p0.g(AbstractC0279p0.g(strZzh.length() + 12, 2, strZzj) + strZzi.length() + 2, 2, String.valueOf(z2)), 2, strJ), 1, strJ2));
        sb2.append("ColorInfo(");
        sb2.append(strZzh);
        sb2.append(", ");
        sb2.append(strZzj);
        sb2.append(", ");
        sb2.append(strZzi);
        sb2.append(", ");
        sb2.append(z2);
        AbstractC3256n.p(sb2, ", ", strJ, ", ", strJ2);
        sb2.append(")");
        return sb2.toString();
    }

    public final zzh zzd() {
        return new zzh(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    public final String zzg() {
        String str;
        String string;
        if (zzf()) {
            String strZzh = zzh(this.zzb);
            String strZzj = zzj(this.zzc);
            String strZzi = zzi(this.zzd);
            String str2 = zzfm.zza;
            Locale locale = Locale.US;
            str = strZzh + "/" + strZzj + "/" + strZzi;
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            int i5 = this.zzf;
            int i10 = this.zzg;
            StringBuilder sb2 = new StringBuilder(AbstractC0279p0.f(i5, 1) + String.valueOf(i10).length());
            sb2.append(i5);
            sb2.append("/");
            sb2.append(i10);
            string = sb2.toString();
        } else {
            string = "NA/NA";
        }
        return M6.t(new StringBuilder(string.length() + str.length() + 1), str, "/", string);
    }
}
