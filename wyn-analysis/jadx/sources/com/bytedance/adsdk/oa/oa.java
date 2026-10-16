package com.bytedance.adsdk.oa;

/* loaded from: classes.dex */
class oa {
    static final int[] uef = new int[0];

    /* renamed from: oa, reason: collision with root package name */
    static final long[] f24570oa = new long[0];
    static final Object[] yo = new Object[0];

    public static int uef(int[] iArr, int i5, int i10) {
        int i11 = i5 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }
}
