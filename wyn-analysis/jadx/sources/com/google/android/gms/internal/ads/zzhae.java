package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzhae {
    public static long zza(double d3) {
        zzgtr.zzb(zzb(d3), "not a normal value");
        int exponent = Math.getExponent(d3);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d3) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean zzb(double d3) {
        return Math.getExponent(d3) <= 1023;
    }
}
