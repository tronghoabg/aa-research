package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzft {
    public static boolean zza(int i5, int i10) {
        if ((i5 >> 18) == 0) {
            return i5 == 0 || Integer.bitCount(i5) == i10;
        }
        return false;
    }

    public static int zzb(int i5) {
        if (i5 == 0) {
            return -1;
        }
        return i5 << 2;
    }
}
