package com.google.android.gms.internal.identity;

import N0.a;

/* loaded from: classes.dex */
public final class zzer {
    public static void zza(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static int zzc(int i5, int i10, String str) {
        String strZza;
        if (i5 >= 0 && i5 < i10) {
            return i5;
        }
        if (i5 < 0) {
            strZza = zzes.zza("%s (%s) must not be negative", "index", Integer.valueOf(i5));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(a.d(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
            }
            strZza = zzes.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzd(int i5, int i10, String str) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(zzf(i5, i10, "index"));
        }
        return i5;
    }

    public static void zze(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? zzf(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? zzf(i10, i11, "end index") : zzes.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    private static String zzf(int i5, int i10, String str) {
        if (i5 < 0) {
            return zzes.zza("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return zzes.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(a.d(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
    }
}
