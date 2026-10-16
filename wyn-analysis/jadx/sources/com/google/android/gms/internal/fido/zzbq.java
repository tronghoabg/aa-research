package com.google.android.gms.internal.fido;

import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class zzbq {
    public static Object zza(Object obj, int i5) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(AbstractC3256n.g(i5, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i5) {
        for (int i10 = 0; i10 < i5; i10++) {
            zza(objArr[i10], i10);
        }
        return objArr;
    }
}
