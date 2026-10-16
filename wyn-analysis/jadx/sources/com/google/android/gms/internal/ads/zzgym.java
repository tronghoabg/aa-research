package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgym {
    public static Object[] zza(Object[] objArr, int i5) {
        for (int i10 = 0; i10 < i5; i10++) {
            zzb(objArr[i10], i10);
        }
        return objArr;
    }

    public static Object zzb(Object obj, int i5) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(N0.a.d(i5, "at index ", new StringBuilder(String.valueOf(i5).length() + 9)));
    }
}
