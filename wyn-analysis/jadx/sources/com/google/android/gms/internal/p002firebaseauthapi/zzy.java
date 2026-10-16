package com.google.android.gms.internal.p002firebaseauthapi;

import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class zzy {
    public static int zza(int i5, int i10) {
        String strZza;
        if (i5 >= 0 && i5 < i10) {
            return i5;
        }
        if (i5 < 0) {
            strZza = zzag.zza("%s (%s) must not be negative", "index", Integer.valueOf(i5));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
            }
            strZza = zzag.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i5, int i10) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(zzb(i5, i10, "index"));
        }
        return i5;
    }

    private static String zzb(int i5, int i10, String str) {
        if (i5 < 0) {
            return zzag.zza("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return zzag.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
    }

    public static int zza(int i5, int i10, String str) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(zzb(i5, i10, str));
        }
        return i5;
    }

    public static <T> T zza(T t10) {
        t10.getClass();
        return t10;
    }

    public static void zza(int i5, int i10, int i11) {
        String strZzb;
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            if (i5 < 0 || i5 > i11) {
                strZzb = zzb(i5, i11, "start index");
            } else if (i10 >= 0 && i10 <= i11) {
                strZzb = zzag.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5));
            } else {
                strZzb = zzb(i10, i11, "end index");
            }
            throw new IndexOutOfBoundsException(strZzb);
        }
    }
}
