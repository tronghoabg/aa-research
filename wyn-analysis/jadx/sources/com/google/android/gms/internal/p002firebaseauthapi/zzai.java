package com.google.android.gms.internal.p002firebaseauthapi;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
final class zzai {
    public static int zza(int i5, String str) {
        if (i5 >= 0) {
            return i5;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i5);
    }

    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(AbstractC0279p0.l("null value in entry: ", String.valueOf(obj), "=null"));
        }
    }
}
