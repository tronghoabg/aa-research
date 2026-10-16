package androidx.compose.animation.core;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class StartOffsetType {
    public static final Companion Companion = new Companion(null);
    private static final int Delay = -1;
    private static final int FastForward = 1;
    private final int value;

    private /* synthetic */ StartOffsetType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffsetType m1919boximpl(int i2) {
        return new StartOffsetType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1921equalsimpl(int i2, Object obj) {
        return (obj instanceof StartOffsetType) && i2 == ((StartOffsetType) obj).m1925unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1922equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1924toStringimpl(int i2) {
        return "StartOffsetType(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m1921equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m1924toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1925unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getDelay-Eo1U57Q, reason: not valid java name */
        public final int m1926getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q, reason: not valid java name */
        public final int m1927getFastForwardEo1U57Q() {
            return StartOffsetType.FastForward;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1920constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1923hashCodeimpl(int i2) {
        return i2;
    }
}
