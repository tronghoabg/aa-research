package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
public final class zzgx {
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

    public static void zzc(boolean z2, String str, char c10) {
        if (!z2) {
            throw new IllegalArgumentException(zzha.zza(str, Character.valueOf(c10)));
        }
    }

    public static void zzd(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? zzf(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? zzf(i10, i11, "end index") : zzha.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    public static void zze(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i5, int i10, String str) {
        return i5 < 0 ? zzha.zza("%s (%s) must not be negative", str, Integer.valueOf(i5)) : zzha.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
    }
}
