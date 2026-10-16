package androidx.compose.ui.platform;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes3.dex */
public final class AutoClearFocusBehavior {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = 0;
    private static final int CursorBased = 1;

    private /* synthetic */ AutoClearFocusBehavior(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AutoClearFocusBehavior m10203boximpl(int i2) {
        return new AutoClearFocusBehavior(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m10204constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10205equalsimpl(int i2, Object obj) {
        return (obj instanceof AutoClearFocusBehavior) && i2 == ((AutoClearFocusBehavior) obj).m10209unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10206equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10207hashCodeimpl(int i2) {
        return i2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10208toStringimpl(int i2) {
        return "AutoClearFocusBehavior(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m10205equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10208toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10209unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCursorBased-4UtRPd4, reason: not valid java name */
        public final int m10210getCursorBased4UtRPd4() {
            return AutoClearFocusBehavior.CursorBased;
        }

        /* renamed from: getDefault-4UtRPd4, reason: not valid java name */
        public final int m10211getDefault4UtRPd4() {
            return m10210getCursorBased4UtRPd4();
        }

        /* renamed from: getNone-4UtRPd4, reason: not valid java name */
        public final int m10212getNone4UtRPd4() {
            return AutoClearFocusBehavior.None;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
