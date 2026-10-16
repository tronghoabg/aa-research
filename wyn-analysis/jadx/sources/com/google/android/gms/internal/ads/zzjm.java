package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import Va.M6;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzjm extends zzau {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzv zzf;
    public final int zzg;
    public final zzxl zzh;
    final boolean zzi;

    private zzjm(int i5, Throwable th, int i10) {
        this(i5, th, null, i10, null, -1, null, 4, null, false);
    }

    public static zzjm zza(IOException iOException, int i5) {
        return new zzjm(0, iOException, i5);
    }

    public static zzjm zzb(Throwable th, String str, int i5, zzv zzvVar, int i10, zzxl zzxlVar, boolean z2, int i11) {
        if (zzvVar == null) {
            i10 = 4;
        }
        return new zzjm(1, th, null, i11, str, i5, zzvVar, i10, zzxlVar, z2);
    }

    public static zzjm zzc(RuntimeException runtimeException, int i5) {
        return new zzjm(2, runtimeException, i5);
    }

    public final zzjm zzd(zzxl zzxlVar) {
        String message = getMessage();
        String str = zzfm.zza;
        return new zzjm(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzxlVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzjm(int i5, Throwable th, String str, int i10, String str2, int i11, zzv zzvVar, int i12, zzxl zzxlVar, boolean z2) {
        String str3;
        int i13;
        String strT;
        String str4;
        if (i5 == 0) {
            str3 = str2;
            i13 = i11;
            strT = "Source error";
        } else if (i5 != 1) {
            strT = "Unexpected runtime error";
            str3 = str2;
            i13 = i11;
        } else {
            String strValueOf = String.valueOf(zzvVar);
            String str5 = zzfm.zza;
            if (i12 == 0) {
                str4 = "NO";
            } else if (i12 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i12 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb2 = new StringBuilder(str4.length() + strValueOf.length() + AbstractC0279p0.g(String.valueOf(str2).length() + 14, 9, String.valueOf(i11)) + 19);
            str3 = str2;
            sb2.append(str3);
            sb2.append(" error, index=");
            i13 = i11;
            sb2.append(i13);
            sb2.append(", format=");
            strT = M6.t(sb2, strValueOf, ", format_supported=", str4);
        }
        this(TextUtils.isEmpty(null) ? strT : strT.concat(": null"), th, i10, i5, str3, i13, zzvVar, i12, zzxlVar, SystemClock.elapsedRealtime(), z2);
    }

    private zzjm(String str, Throwable th, int i5, int i10, String str2, int i11, zzv zzvVar, int i12, zzxl zzxlVar, long j8, boolean z2) {
        boolean z10;
        super(str, th, i5, Bundle.EMPTY, j8);
        if (!z2) {
            z10 = true;
        } else if (i10 == 1) {
            i10 = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        zzgtr.zza(z10);
        zzgtr.zza(th != null);
        this.zzc = i10;
        this.zzd = str2;
        this.zze = i11;
        this.zzf = zzvVar;
        this.zzg = i12;
        this.zzh = zzxlVar;
        this.zzi = z2;
    }
}
