package androidx.compose.animation.core;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ArcMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int ArcAbove = 5;
    private static final int ArcBelow = 4;
    private static final int ArcLinear = 0;

    private /* synthetic */ ArcMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ArcMode m1882boximpl(int i2) {
        return new ArcMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1884equalsimpl(int i2, Object obj) {
        return (obj instanceof ArcMode) && i2 == ((ArcMode) obj).m1888unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1885equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1887toStringimpl(int i2) {
        return "ArcMode(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m1884equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m1887toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1888unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getArcAbove--9T-Mq4, reason: not valid java name */
        public final int m1889getArcAbove9TMq4() {
            return ArcMode.ArcAbove;
        }

        /* renamed from: getArcBelow--9T-Mq4, reason: not valid java name */
        public final int m1890getArcBelow9TMq4() {
            return ArcMode.ArcBelow;
        }

        /* renamed from: getArcLinear--9T-Mq4, reason: not valid java name */
        public final int m1891getArcLinear9TMq4() {
            return ArcMode.ArcLinear;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1883constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1886hashCodeimpl(int i2) {
        return i2;
    }
}
