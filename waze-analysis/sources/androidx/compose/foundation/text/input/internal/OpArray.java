package androidx.compose.foundation.text.input.internal;

import h.ab;
import h.g.a;
import h.g.a.q;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
final class OpArray {
    private final int[] values;

    private /* synthetic */ OpArray(int[] iArr) {
        this.values = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OpArray m3648boximpl(int[] iArr) {
        return new OpArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m3649constructorimpl(int i2) {
        return new int[i2 * 3];
    }

    /* renamed from: copyOf-pSmdads, reason: not valid java name */
    public static final int[] m3651copyOfpSmdads(int[] iArr, int i2) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i2 * 3);
        x.e(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3652equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && x.n(iArr, ((OpArray) obj).m3660unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3653equalsimpl0(int[] iArr, int[] iArr2) {
        return x.n(iArr, iArr2);
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m3654forEachimpl(int[] iArr, int i2, boolean z, q<? super Integer, ? super Integer, ? super Integer, ab> qVar) {
        if (i2 < 0) {
            return;
        }
        if (!z) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * 3;
                qVar.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr[i4 + 1]), Integer.valueOf(iArr[i4 + 2]));
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            int i5 = i2 * 3;
            qVar.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr[i5 + 1]), Integer.valueOf(iArr[i5 + 2]));
        }
    }

    /* renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m3655forEachimpl$default(int[] iArr, int i2, boolean z, q qVar, int i3, Object obj) {
        if (i2 < 0) {
            return;
        }
        if (!z || !((i3 & 2) == 0)) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i4 * 3;
                qVar.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr[i5 + 1]), Integer.valueOf(iArr[i5 + 2]));
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            int i6 = i2 * 3;
            qVar.invoke(Integer.valueOf(iArr[i6]), Integer.valueOf(iArr[i6 + 1]), Integer.valueOf(iArr[i6 + 2]));
        }
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m3656getSizeimpl(int[] iArr) {
        return iArr.length / 3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3657hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m3658setimpl(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = i2 * 3;
        iArr[i6] = i3;
        iArr[i6 + 1] = i4;
        iArr[i6 + 2] = i5;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3659toStringimpl(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m3652equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m3657hashCodeimpl(this.values);
    }

    public String toString() {
        return m3659toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m3660unboximpl() {
        return this.values;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int[] m3650constructorimpl(int[] iArr) {
        return iArr;
    }
}
