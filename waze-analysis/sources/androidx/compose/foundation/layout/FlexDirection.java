package androidx.compose.foundation.layout;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class FlexDirection {
    public static final Companion Companion = new Companion(null);
    private final int bits;

    private /* synthetic */ FlexDirection(int i2) {
        this.bits = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexDirection m2560boximpl(int i2) {
        return new FlexDirection(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2562equalsimpl(int i2, Object obj) {
        return (obj instanceof FlexDirection) && i2 == ((FlexDirection) obj).m2566unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2563equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2565toStringimpl(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "INVALID" : "ColumnReverse" : "RowReverse" : "Column" : "Row";
    }

    public boolean equals(Object obj) {
        return m2562equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return this.bits;
    }

    public String toString() {
        return m2565toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2566unboximpl() {
        return this.bits;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getColumn-T4wFHC8, reason: not valid java name */
        public final int m2567getColumnT4wFHC8() {
            return 1;
        }

        /* renamed from: getColumnReverse-T4wFHC8, reason: not valid java name */
        public final int m2568getColumnReverseT4wFHC8() {
            return 3;
        }

        /* renamed from: getRow-T4wFHC8, reason: not valid java name */
        public final int m2569getRowT4wFHC8() {
            return 0;
        }

        /* renamed from: getRowReverse-T4wFHC8, reason: not valid java name */
        public final int m2570getRowReverseT4wFHC8() {
            return 2;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2561constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2564hashCodeimpl(int i2) {
        return i2;
    }
}
