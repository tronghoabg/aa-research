package androidx.compose.ui.input;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class InputMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Touch = 1;
    private static final int Keyboard = 2;

    private /* synthetic */ InputMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputMode m9068boximpl(int i2) {
        return new InputMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9070equalsimpl(int i2, Object obj) {
        return (obj instanceof InputMode) && i2 == ((InputMode) obj).m9074unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9071equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9073toStringimpl(int i2) {
        return m9071equalsimpl0(i2, Touch) ? "Touch" : m9071equalsimpl0(i2, Keyboard) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m9070equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m9073toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9074unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getKeyboard-aOaMEAU, reason: not valid java name */
        public final int m9075getKeyboardaOaMEAU() {
            return InputMode.Keyboard;
        }

        /* renamed from: getTouch-aOaMEAU, reason: not valid java name */
        public final int m9076getTouchaOaMEAU() {
            return InputMode.Touch;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m9069constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9072hashCodeimpl(int i2) {
        return i2;
    }
}
