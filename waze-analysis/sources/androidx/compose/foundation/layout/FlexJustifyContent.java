package androidx.compose.foundation.layout;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class FlexJustifyContent {
    public static final Companion Companion = new Companion(null);
    private final int bits;

    private /* synthetic */ FlexJustifyContent(int i2) {
        this.bits = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexJustifyContent m2571boximpl(int i2) {
        return new FlexJustifyContent(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2573equalsimpl(int i2, Object obj) {
        return (obj instanceof FlexJustifyContent) && i2 == ((FlexJustifyContent) obj).m2577unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2574equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2576toStringimpl(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "INVALID" : "SpaceEvenly" : "SpaceAround" : "SpaceBetween" : "Center" : "End" : "Start";
    }

    public boolean equals(Object obj) {
        return m2573equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return this.bits;
    }

    public String toString() {
        return m2576toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2577unboximpl() {
        return this.bits;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-GomtQF4, reason: not valid java name */
        public final int m2578getCenterGomtQF4() {
            return 2;
        }

        /* renamed from: getEnd-GomtQF4, reason: not valid java name */
        public final int m2579getEndGomtQF4() {
            return 1;
        }

        /* renamed from: getSpaceAround-GomtQF4, reason: not valid java name */
        public final int m2580getSpaceAroundGomtQF4() {
            return 4;
        }

        /* renamed from: getSpaceBetween-GomtQF4, reason: not valid java name */
        public final int m2581getSpaceBetweenGomtQF4() {
            return 3;
        }

        /* renamed from: getSpaceEvenly-GomtQF4, reason: not valid java name */
        public final int m2582getSpaceEvenlyGomtQF4() {
            return 5;
        }

        /* renamed from: getStart-GomtQF4, reason: not valid java name */
        public final int m2583getStartGomtQF4() {
            return 0;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2572constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2575hashCodeimpl(int i2) {
        return i2;
    }
}
