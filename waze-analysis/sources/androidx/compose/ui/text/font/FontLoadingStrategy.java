package androidx.compose.ui.text.font;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class FontLoadingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = 0;
    private static final int OptionalLocal = 1;
    private static final int Async = 2;

    private /* synthetic */ FontLoadingStrategy(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m10645boximpl(int i2) {
        return new FontLoadingStrategy(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10647equalsimpl(int i2, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i2 == ((FontLoadingStrategy) obj).m10651unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10648equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10650toStringimpl(int i2) {
        if (m10648equalsimpl0(i2, Blocking)) {
            return "Blocking";
        }
        if (m10648equalsimpl0(i2, OptionalLocal)) {
            return "Optional";
        }
        if (m10648equalsimpl0(i2, Async)) {
            return "Async";
        }
        return "Invalid(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m10647equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10650toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10651unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m10652getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m10653getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m10654getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m10646constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10649hashCodeimpl(int i2) {
        return i2;
    }
}
