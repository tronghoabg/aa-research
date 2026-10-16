package com.google.android.gms.internal.mlkit_common;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
final class zzw {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(AbstractC0279p0.l("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
