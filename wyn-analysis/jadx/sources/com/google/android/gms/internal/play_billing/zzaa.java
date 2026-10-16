package com.google.android.gms.internal.play_billing;

import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public final class zzaa {
    public static int zza(int i5, int i10, String str) {
        String strZza;
        if (i5 >= 0 && i5 < i10) {
            return i5;
        }
        if (i5 < 0) {
            strZza = zzab.zza("%s (%s) must not be negative", "index", Integer.valueOf(i5));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
            }
            strZza = zzab.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i5, int i10, String str) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(zze(i5, i10, "index"));
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
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? zze(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? zze(i10, i11, "end index") : zzab.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    private static String zze(int i5, int i10, String str) {
        if (i5 < 0) {
            return zzab.zza("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return zzab.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
    }
}
