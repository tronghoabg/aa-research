package com.google.android.gms.internal.mlkit_common;

import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public final class zzak {
    public static Object[] zza(Object[] objArr, int i5) {
        for (int i10 = 0; i10 < i5; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC3256n.g(i10, "at index "));
            }
        }
        return objArr;
    }
}
