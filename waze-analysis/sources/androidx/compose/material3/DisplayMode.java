package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class DisplayMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Picker = 0;
    private static final int Input = 1;

    private /* synthetic */ DisplayMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DisplayMode m4765boximpl(int i2) {
        return new DisplayMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4767equalsimpl(int i2, Object obj) {
        return (obj instanceof DisplayMode) && i2 == ((DisplayMode) obj).m4771unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4768equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4770toStringimpl(int i2) {
        return m4768equalsimpl0(i2, Picker) ? "Picker" : m4768equalsimpl0(i2, Input) ? "Input" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4767equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m4770toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4771unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getInput-jFl-4v0, reason: not valid java name */
        public final int m4772getInputjFl4v0() {
            return DisplayMode.Input;
        }

        /* renamed from: getPicker-jFl-4v0, reason: not valid java name */
        public final int m4773getPickerjFl4v0() {
            return DisplayMode.Picker;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4766constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4769hashCodeimpl(int i2) {
        return i2;
    }
}
