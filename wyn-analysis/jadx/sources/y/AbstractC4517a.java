package y;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4517a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f47914a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f47915b = new Object[0];

    public static final int a(int i5, int i10, int[] array) {
        AbstractC3340k.e(array, "array");
        int i11 = i5 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = array[i13];
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

    public static final int b(long[] array, int i5, long j8) {
        AbstractC3340k.e(array, "array");
        int i10 = i5 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j10 = array[i12];
            if (j10 < j8) {
                i11 = i12 + 1;
            } else {
                if (j10 <= j8) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }
}
