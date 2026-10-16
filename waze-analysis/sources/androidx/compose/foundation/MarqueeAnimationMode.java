package androidx.compose.foundation;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class MarqueeAnimationMode {
    public static final Companion Companion = new Companion(null);
    private static final int Immediately = 0;
    private static final int WhileFocused = 1;
    private final int value;

    private /* synthetic */ MarqueeAnimationMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MarqueeAnimationMode m2051boximpl(int i2) {
        return new MarqueeAnimationMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2053equalsimpl(int i2, Object obj) {
        return (obj instanceof MarqueeAnimationMode) && i2 == ((MarqueeAnimationMode) obj).m2057unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2054equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2056toStringimpl(int i2) {
        if (m2054equalsimpl0(i2, Immediately)) {
            return "Immediately";
        }
        if (m2054equalsimpl0(i2, WhileFocused)) {
            return "WhileFocused";
        }
        throw new IllegalStateException("invalid value: " + i2);
    }

    public boolean equals(Object obj) {
        return m2053equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m2056toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2057unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getImmediately-ZbEOnfQ, reason: not valid java name */
        public final int m2058getImmediatelyZbEOnfQ() {
            return MarqueeAnimationMode.Immediately;
        }

        /* renamed from: getWhileFocused-ZbEOnfQ, reason: not valid java name */
        public final int m2059getWhileFocusedZbEOnfQ() {
            return MarqueeAnimationMode.WhileFocused;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2052constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2055hashCodeimpl(int i2) {
        return i2;
    }
}
