package com.google.android.gms.internal.consent_sdk;

import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class zzdj {
    public static int zza(int i5, int i10, String str) {
        String strZza;
        if (i5 >= 0 && i5 < i10) {
            return i5;
        }
        if (i5 < 0) {
            strZza = zzdp.zza("%s (%s) must not be negative", "index", Integer.valueOf(i5));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
            }
            strZza = zzdp.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i5, int i10, String str) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(zzd(i5, i10, "index"));
        }
        return i5;
    }

    public static void zzc(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? zzd(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? zzd(i10, i11, "end index") : zzdp.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    private static String zzd(int i5, int i10, String str) {
        if (i5 < 0) {
            return zzdp.zza("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return zzdp.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
    }
}
