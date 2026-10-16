package androidx.constraintlayout.compose;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes3.dex */
public final class GridFlag {
    public static final Companion Companion = new Companion(null);
    private static final int None = m11530constructorimpl$default(false, false, 3, null);
    private static final int PlaceLayoutsOnSpansFirst = m11530constructorimpl$default(true, false, 2, null);
    private static final int SubGridByColRow = m11530constructorimpl$default(false, true, 1, null);
    private final int value;

    private /* synthetic */ GridFlag(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridFlag m11527boximpl(int i2) {
        return new GridFlag(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m11529constructorimpl(boolean z, boolean z2) {
        return (true != z ? 2 : 0) | (z2 ? 1 : 0);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    static /* synthetic */ int m11530constructorimpl$default(boolean z, boolean z2, int i2, o oVar) {
        return m11529constructorimpl(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), z2 & ((i2 & 2) == 0));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11531equalsimpl(int i2, Object obj) {
        return (obj instanceof GridFlag) && i2 == ((GridFlag) obj).m11538unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11532equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11533hashCodeimpl(int i2) {
        return i2;
    }

    /* renamed from: isPlaceLayoutsOnSpansFirst-impl, reason: not valid java name */
    public static final boolean m11534isPlaceLayoutsOnSpansFirstimpl(int i2) {
        return (i2 & 2) == 0;
    }

    /* renamed from: isSubGridByColRow-impl$constraintlayout_compose, reason: not valid java name */
    public static final boolean m11535isSubGridByColRowimpl$constraintlayout_compose(int i2) {
        return (i2 & 1) > 0;
    }

    /* renamed from: or-90j8xCw, reason: not valid java name */
    public static final int m11536or90j8xCw(int i2, int i3) {
        return m11529constructorimpl(m11534isPlaceLayoutsOnSpansFirstimpl(i2) | m11534isPlaceLayoutsOnSpansFirstimpl(i3), m11535isSubGridByColRowimpl$constraintlayout_compose(i2) | m11535isSubGridByColRowimpl$constraintlayout_compose(i3));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11537toStringimpl(int i2) {
        return "GridFlag(isPlaceLayoutsOnSpansFirst = " + m11534isPlaceLayoutsOnSpansFirstimpl(i2) + ')';
    }

    public boolean equals(Object obj) {
        return m11531equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m11537toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m11538unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-dTRCCdc, reason: not valid java name */
        public final int m11539getNonedTRCCdc() {
            return GridFlag.None;
        }

        /* renamed from: getPlaceLayoutsOnSpansFirst-dTRCCdc, reason: not valid java name */
        public final int m11540getPlaceLayoutsOnSpansFirstdTRCCdc() {
            return GridFlag.PlaceLayoutsOnSpansFirst;
        }

        /* renamed from: getSubGridByColRow-dTRCCdc$constraintlayout_compose, reason: not valid java name */
        public final int m11541getSubGridByColRowdTRCCdc$constraintlayout_compose() {
            return GridFlag.SubGridByColRow;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m11528constructorimpl(int i2) {
        return i2;
    }
}
