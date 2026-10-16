package androidx.compose.foundation.layout;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class GridFlow {
    public static final Companion Companion = new Companion(null);
    private final int bits;

    private /* synthetic */ GridFlow(int i2) {
        this.bits = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridFlow m2665boximpl(int i2) {
        return new GridFlow(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2667equalsimpl(int i2, Object obj) {
        return (obj instanceof GridFlow) && i2 == ((GridFlow) obj).m2671unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2668equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2670toStringimpl(int i2) {
        if (m2668equalsimpl0(i2, 0)) {
            return "Row";
        }
        if (m2668equalsimpl0(i2, 1)) {
            return "Column";
        }
        return "GridFlow(" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m2667equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return this.bits;
    }

    public String toString() {
        return m2670toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2671unboximpl() {
        return this.bits;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getColumn-ITJdzs4, reason: not valid java name */
        public final int m2674getColumnITJdzs4() {
            return 1;
        }

        /* renamed from: getRow-ITJdzs4, reason: not valid java name */
        public final int m2675getRowITJdzs4() {
            return 0;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getColumn-ITJdzs4$annotations, reason: not valid java name */
        public static /* synthetic */ void m2672getColumnITJdzs4$annotations() {
        }

        /* renamed from: getRow-ITJdzs4$annotations, reason: not valid java name */
        public static /* synthetic */ void m2673getRowITJdzs4$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2666constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2669hashCodeimpl(int i2) {
        return i2;
    }
}
