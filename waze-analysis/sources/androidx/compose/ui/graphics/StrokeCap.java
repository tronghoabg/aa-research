package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class StrokeCap {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Butt = 0;
    private static final int Round = 1;
    private static final int Square = 2;

    private /* synthetic */ StrokeCap(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeCap m8625boximpl(int i2) {
        return new StrokeCap(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8627equalsimpl(int i2, Object obj) {
        return (obj instanceof StrokeCap) && i2 == ((StrokeCap) obj).m8631unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8628equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8630toStringimpl(int i2) {
        return m8628equalsimpl0(i2, Butt) ? "Butt" : m8628equalsimpl0(i2, Round) ? "Round" : m8628equalsimpl0(i2, Square) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8627equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8630toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8631unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getButt-KaPHkGw, reason: not valid java name */
        public final int m8632getButtKaPHkGw() {
            return StrokeCap.Butt;
        }

        /* renamed from: getRound-KaPHkGw, reason: not valid java name */
        public final int m8633getRoundKaPHkGw() {
            return StrokeCap.Round;
        }

        /* renamed from: getSquare-KaPHkGw, reason: not valid java name */
        public final int m8634getSquareKaPHkGw() {
            return StrokeCap.Square;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8626constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8629hashCodeimpl(int i2) {
        return i2;
    }
}
