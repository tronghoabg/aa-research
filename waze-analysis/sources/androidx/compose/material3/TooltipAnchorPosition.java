package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class TooltipAnchorPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Above = 1;
    private static final int Below = 2;
    private static final int Left = 3;
    private static final int Right = 4;
    private static final int Start = 5;
    private static final int End = 6;

    private /* synthetic */ TooltipAnchorPosition(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TooltipAnchorPosition m6026boximpl(int i2) {
        return new TooltipAnchorPosition(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6028equalsimpl(int i2, Object obj) {
        return (obj instanceof TooltipAnchorPosition) && i2 == ((TooltipAnchorPosition) obj).m6032unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6029equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6031toStringimpl(int i2) {
        return m6029equalsimpl0(i2, Above) ? "Above" : m6029equalsimpl0(i2, Below) ? "Below" : m6029equalsimpl0(i2, Left) ? "Left" : m6029equalsimpl0(i2, Right) ? "Right" : m6029equalsimpl0(i2, Start) ? "Start" : m6029equalsimpl0(i2, End) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m6028equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m6031toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6032unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAbove-lOKsHw4, reason: not valid java name */
        public final int m6033getAbovelOKsHw4() {
            return TooltipAnchorPosition.Above;
        }

        /* renamed from: getBelow-lOKsHw4, reason: not valid java name */
        public final int m6034getBelowlOKsHw4() {
            return TooltipAnchorPosition.Below;
        }

        /* renamed from: getEnd-lOKsHw4, reason: not valid java name */
        public final int m6035getEndlOKsHw4() {
            return TooltipAnchorPosition.End;
        }

        /* renamed from: getLeft-lOKsHw4, reason: not valid java name */
        public final int m6036getLeftlOKsHw4() {
            return TooltipAnchorPosition.Left;
        }

        /* renamed from: getRight-lOKsHw4, reason: not valid java name */
        public final int m6037getRightlOKsHw4() {
            return TooltipAnchorPosition.Right;
        }

        /* renamed from: getStart-lOKsHw4, reason: not valid java name */
        public final int m6038getStartlOKsHw4() {
            return TooltipAnchorPosition.Start;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6027constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6030hashCodeimpl(int i2) {
        return i2;
    }
}
