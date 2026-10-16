package com.google.android.gms.internal.mlkit_vision_text_common;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
final class zzaq {
    public static int zza(int i5, String str) {
        if (i5 >= 0) {
            return i5;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i5);
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(AbstractC0279p0.l("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
