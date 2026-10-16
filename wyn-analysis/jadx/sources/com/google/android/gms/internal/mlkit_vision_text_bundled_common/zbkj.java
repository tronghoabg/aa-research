package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public final class zbkj {
    public static int zba(int i5, int i10, String str) {
        String strZba;
        if (i5 >= 0 && i5 < i10) {
            return i5;
        }
        if (i5 < 0) {
            strZba = zbkp.zba("%s (%s) must not be negative", "index", Integer.valueOf(i5));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
            }
            strZba = zbkp.zba("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZba);
    }

    public static int zbb(int i5, int i10, String str) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(zbe(i5, i10, "index"));
        }
        return i5;
    }

    public static void zbc(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void zbd(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? zbe(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? zbe(i10, i11, "end index") : zbkp.zba("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    private static String zbe(int i5, int i10, String str) {
        if (i5 < 0) {
            return zbkp.zba("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return zbkp.zba("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
    }
}
