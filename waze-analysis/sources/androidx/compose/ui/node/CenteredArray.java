package androidx.compose.ui.node;

import h.g.a;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
final class CenteredArray {
    private final int[] data;

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CenteredArray m9904boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9906equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && x.n(iArr, ((CenteredArray) obj).m9913unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9907equalsimpl0(int[] iArr, int[] iArr2) {
        return x.n(iArr, iArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final int m9908getimpl(int[] iArr, int i2) {
        return iArr[i2 + m9909getMidimpl(iArr)];
    }

    /* renamed from: getMid-impl, reason: not valid java name */
    private static final int m9909getMidimpl(int[] iArr) {
        return iArr.length >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9910hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m9911setimpl(int[] iArr, int i2, int i3) {
        iArr[i2 + m9909getMidimpl(iArr)] = i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9912toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m9906equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m9910hashCodeimpl(this.data);
    }

    public String toString() {
        return m9912toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m9913unboximpl() {
        return this.data;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m9905constructorimpl(int[] iArr) {
        return iArr;
    }
}
