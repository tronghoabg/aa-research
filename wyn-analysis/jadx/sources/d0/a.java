package D0;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2255a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f2256b = new Object[0];

    public static final int a(int i5, int i10, int[] iArr) {
        AbstractC3340k.e(iArr, "<this>");
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
