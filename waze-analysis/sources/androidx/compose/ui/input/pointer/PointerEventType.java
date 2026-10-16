package androidx.compose.ui.input.pointer;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class PointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = 0;
    private static final int Press = 1;
    private static final int Release = 2;
    private static final int Move = 3;
    private static final int Enter = 4;
    private static final int Exit = 5;
    private static final int Scroll = 6;
    private static final int ScaleStart = 7;
    private static final int ScaleChange = 8;
    private static final int ScaleEnd = 9;
    private static final int PanStart = 10;
    private static final int PanMove = 11;
    private static final int PanEnd = 12;

    private /* synthetic */ PointerEventType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m9545boximpl(int i2) {
        return new PointerEventType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9547equalsimpl(int i2, Object obj) {
        return (obj instanceof PointerEventType) && i2 == ((PointerEventType) obj).m9551unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9548equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9550toStringimpl(int i2) {
        return m9548equalsimpl0(i2, Press) ? "Press" : m9548equalsimpl0(i2, Release) ? "Release" : m9548equalsimpl0(i2, Move) ? "Move" : m9548equalsimpl0(i2, Enter) ? "Enter" : m9548equalsimpl0(i2, Exit) ? "Exit" : m9548equalsimpl0(i2, Scroll) ? "Scroll" : m9548equalsimpl0(i2, ScaleStart) ? "ScaleStart" : m9548equalsimpl0(i2, ScaleChange) ? "ScaleChange" : m9548equalsimpl0(i2, ScaleEnd) ? "ScaleFinish" : m9548equalsimpl0(i2, PanStart) ? "PanStart" : m9548equalsimpl0(i2, PanMove) ? "Pan" : m9548equalsimpl0(i2, PanEnd) ? "PanEnd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m9547equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m9550toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9551unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m9552getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m9553getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m9554getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPanEnd-7fucELk, reason: not valid java name */
        public final int m9555getPanEnd7fucELk() {
            return PointerEventType.PanEnd;
        }

        /* renamed from: getPanMove-7fucELk, reason: not valid java name */
        public final int m9556getPanMove7fucELk() {
            return PointerEventType.PanMove;
        }

        /* renamed from: getPanStart-7fucELk, reason: not valid java name */
        public final int m9557getPanStart7fucELk() {
            return PointerEventType.PanStart;
        }

        /* renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m9558getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m9559getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getScaleChange-7fucELk, reason: not valid java name */
        public final int m9560getScaleChange7fucELk() {
            return PointerEventType.ScaleChange;
        }

        /* renamed from: getScaleEnd-7fucELk, reason: not valid java name */
        public final int m9561getScaleEnd7fucELk() {
            return PointerEventType.ScaleEnd;
        }

        /* renamed from: getScaleStart-7fucELk, reason: not valid java name */
        public final int m9562getScaleStart7fucELk() {
            return PointerEventType.ScaleStart;
        }

        /* renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m9563getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m9564getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m9546constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9549hashCodeimpl(int i2) {
        return i2;
    }
}
