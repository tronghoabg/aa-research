package androidx.compose.ui.focus;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class FocusDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Next = 1;
    private static final int Previous = 2;
    private static final int Left = 3;
    private static final int Right = 4;
    private static final int Up = 5;
    private static final int Down = 6;
    private static final int Enter = 7;
    private static final int Exit = 8;

    private /* synthetic */ FocusDirection(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m7852boximpl(int i2) {
        return new FocusDirection(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7854equalsimpl(int i2, Object obj) {
        return (obj instanceof FocusDirection) && i2 == ((FocusDirection) obj).m7858unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7855equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7857toStringimpl(int i2) {
        return m7855equalsimpl0(i2, Next) ? "Next" : m7855equalsimpl0(i2, Previous) ? "Previous" : m7855equalsimpl0(i2, Left) ? "Left" : m7855equalsimpl0(i2, Right) ? "Right" : m7855equalsimpl0(i2, Up) ? "Up" : m7855equalsimpl0(i2, Down) ? "Down" : m7855equalsimpl0(i2, Enter) ? "Enter" : m7855equalsimpl0(i2, Exit) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m7854equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m7857toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7858unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m7859getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        /* renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m7860getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        /* renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m7861getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m7862getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m7863getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m7864getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m7865getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m7866getUpdhqQ8s() {
            return FocusDirection.Up;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7853constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7856hashCodeimpl(int i2) {
        return i2;
    }
}
