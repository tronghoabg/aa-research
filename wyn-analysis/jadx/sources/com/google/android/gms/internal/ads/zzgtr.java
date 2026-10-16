package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgtr {
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
            throw new IllegalArgumentException(zzgui.zzd(str, Character.valueOf(c10)));
        }
    }

    public static void zzd(boolean z2, String str, int i5) {
        if (!z2) {
            throw new IllegalArgumentException(zzgui.zzd(str, Integer.valueOf(i5)));
        }
    }

    public static void zze(boolean z2, String str, long j8) {
        if (!z2) {
            throw new IllegalArgumentException(zzgui.zzd(str, Long.valueOf(j8)));
        }
    }

    public static void zzf(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(zzgui.zzd(str, obj));
        }
    }

    public static void zzg(boolean z2, String str, int i5, int i10) {
        if (!z2) {
            throw new IllegalArgumentException(zzgui.zzd(str, Integer.valueOf(i5), Integer.valueOf(i10)));
        }
    }

    public static void zzh(boolean z2, String str, Object obj, Object obj2) {
        if (!z2) {
            throw new IllegalArgumentException(zzgui.zzd(str, obj, obj2));
        }
    }

    public static void zzi(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void zzj(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object zzk(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzl(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzgui.zzd(str, obj2));
    }

    public static int zzm(int i5, int i10, String str) {
        String strZzd;
        if (i5 >= 0 && i5 < i10) {
            return i5;
        }
        if (i5 < 0) {
            strZzd = zzgui.zzd("%s (%s) must not be negative", "index", Integer.valueOf(i5));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(N0.a.d(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
            }
            strZzd = zzgui.zzd("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZzd);
    }

    public static int zzn(int i5, int i10, String str) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(zzp(i5, i10, "index"));
        }
        return i5;
    }

    public static void zzo(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? zzp(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? zzp(i10, i11, "end index") : zzgui.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    private static String zzp(int i5, int i10, String str) {
        if (i5 < 0) {
            return zzgui.zzd("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return zzgui.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(N0.a.d(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
    }
}
