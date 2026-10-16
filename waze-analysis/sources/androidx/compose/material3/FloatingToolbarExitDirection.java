package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class FloatingToolbarExitDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Bottom = 0;
    private static final int Top = 1;
    private static final int Start = 2;
    private static final int End = 3;

    private /* synthetic */ FloatingToolbarExitDirection(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatingToolbarExitDirection m4918boximpl(int i2) {
        return new FloatingToolbarExitDirection(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4920equalsimpl(int i2, Object obj) {
        return (obj instanceof FloatingToolbarExitDirection) && i2 == ((FloatingToolbarExitDirection) obj).m4924unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4921equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4923toStringimpl(int i2) {
        return m4921equalsimpl0(i2, Bottom) ? "FloatingToolbarExitDirection.Bottom" : m4921equalsimpl0(i2, Top) ? "FloatingToolbarExitDirection.Top" : m4921equalsimpl0(i2, Start) ? "FloatingToolbarExitDirection.Start" : "FloatingToolbarExitDirection.End";
    }

    public boolean equals(Object obj) {
        return m4920equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m4923toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4924unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getBottom-8LIK8-E, reason: not valid java name */
        public final int m4925getBottom8LIK8E() {
            return FloatingToolbarExitDirection.Bottom;
        }

        /* renamed from: getEnd-8LIK8-E, reason: not valid java name */
        public final int m4926getEnd8LIK8E() {
            return FloatingToolbarExitDirection.End;
        }

        /* renamed from: getStart-8LIK8-E, reason: not valid java name */
        public final int m4927getStart8LIK8E() {
            return FloatingToolbarExitDirection.Start;
        }

        /* renamed from: getTop-8LIK8-E, reason: not valid java name */
        public final int m4928getTop8LIK8E() {
            return FloatingToolbarExitDirection.Top;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4919constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4922hashCodeimpl(int i2) {
        return i2;
    }
}
