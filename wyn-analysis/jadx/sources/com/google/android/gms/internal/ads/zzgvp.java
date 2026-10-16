package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
final class zzgvp {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        throw new NullPointerException(M6.t(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
    }

    public static int zzb(int i5, String str) {
        if (i5 >= 0) {
            return i5;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 29 + String.valueOf(i5).length());
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i5);
        throw new IllegalArgumentException(sb2.toString());
    }
}
