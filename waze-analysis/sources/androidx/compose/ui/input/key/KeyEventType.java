package androidx.compose.ui.input.key;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class KeyEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = 0;
    private static final int KeyUp = 1;
    private static final int KeyDown = 2;

    private /* synthetic */ KeyEventType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEventType m9425boximpl(int i2) {
        return new KeyEventType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9427equalsimpl(int i2, Object obj) {
        return (obj instanceof KeyEventType) && i2 == ((KeyEventType) obj).m9431unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9428equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9430toStringimpl(int i2) {
        return m9428equalsimpl0(i2, KeyUp) ? "KeyUp" : m9428equalsimpl0(i2, KeyDown) ? "KeyDown" : m9428equalsimpl0(i2, Unknown) ? "Unknown" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m9427equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m9430toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9431unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getKeyDown-CS__XNY, reason: not valid java name */
        public final int m9432getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }

        /* renamed from: getKeyUp-CS__XNY, reason: not valid java name */
        public final int m9433getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* renamed from: getUnknown-CS__XNY, reason: not valid java name */
        public final int m9434getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m9426constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9429hashCodeimpl(int i2) {
        return i2;
    }
}
