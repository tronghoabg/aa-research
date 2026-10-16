package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class FloatingToolbarVerticalFabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Top = 0;
    private static final int Bottom = 1;

    private /* synthetic */ FloatingToolbarVerticalFabPosition(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatingToolbarVerticalFabPosition m4961boximpl(int i2) {
        return new FloatingToolbarVerticalFabPosition(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4963equalsimpl(int i2, Object obj) {
        return (obj instanceof FloatingToolbarVerticalFabPosition) && i2 == ((FloatingToolbarVerticalFabPosition) obj).m4967unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4964equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4966toStringimpl(int i2) {
        return true != m4964equalsimpl0(i2, Top) ? "FloatingToolbarVerticalFabPosition.Bottom" : "FloatingToolbarVerticalFabPosition.Top";
    }

    public boolean equals(Object obj) {
        return m4963equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m4966toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4967unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getBottom-dDJPGzU, reason: not valid java name */
        public final int m4968getBottomdDJPGzU() {
            return FloatingToolbarVerticalFabPosition.Bottom;
        }

        /* renamed from: getTop-dDJPGzU, reason: not valid java name */
        public final int m4969getTopdDJPGzU() {
            return FloatingToolbarVerticalFabPosition.Top;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4962constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4965hashCodeimpl(int i2) {
        return i2;
    }
}
