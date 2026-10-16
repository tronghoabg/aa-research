package com.google.android.gms.internal.mlkit_common;

import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public final class zzt {
    public static int zza(int i5, int i10, String str) {
        String strZza;
        if (i5 >= 0 && i5 < i10) {
            return i5;
        }
        if (i5 < 0) {
            strZza = zzu.zza("%s (%s) must not be negative", "index", Integer.valueOf(i5));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
            }
            strZza = zzu.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i5, int i10, String str) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(zzf(i5, i10, "index"));
        }
        return i5;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? zzf(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? zzf(i10, i11, "end index") : zzu.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    public static void zze(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException("A SourcePolicy can only set internal() or external() once.");
        }
    }

    private static String zzf(int i5, int i10, String str) {
        if (i5 < 0) {
            return zzu.zza("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return zzu.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
    }
}
