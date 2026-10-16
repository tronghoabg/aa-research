package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class PathFillType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NonZero = 0;
    private static final int EvenOdd = 1;

    private /* synthetic */ PathFillType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathFillType m8547boximpl(int i2) {
        return new PathFillType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8549equalsimpl(int i2, Object obj) {
        return (obj instanceof PathFillType) && i2 == ((PathFillType) obj).m8553unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8550equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8552toStringimpl(int i2) {
        return m8550equalsimpl0(i2, NonZero) ? "NonZero" : m8550equalsimpl0(i2, EvenOdd) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8549equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8552toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8553unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getEvenOdd-Rg-k1Os, reason: not valid java name */
        public final int m8554getEvenOddRgk1Os() {
            return PathFillType.EvenOdd;
        }

        /* renamed from: getNonZero-Rg-k1Os, reason: not valid java name */
        public final int m8555getNonZeroRgk1Os() {
            return PathFillType.NonZero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8548constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8551hashCodeimpl(int i2) {
        return i2;
    }
}
