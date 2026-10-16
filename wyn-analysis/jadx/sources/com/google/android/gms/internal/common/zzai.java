package com.google.android.gms.internal.common;

import N0.a;

/* loaded from: classes3.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i5) {
        for (int i10 = 0; i10 < i5; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(a.d(i10, "at index ", new StringBuilder(String.valueOf(i10).length() + 9)));
            }
        }
        return objArr;
    }
}
