package androidx.compose.foundation.layout;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class FlexWrap {
    public static final Companion Companion = new Companion(null);
    private final int bits;

    private /* synthetic */ FlexWrap(int i2) {
        this.bits = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexWrap m2584boximpl(int i2) {
        return new FlexWrap(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2586equalsimpl(int i2, Object obj) {
        return (obj instanceof FlexWrap) && i2 == ((FlexWrap) obj).m2590unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2587equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2589toStringimpl(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "INVALID" : "WrapReverse" : "Wrap" : "NoWrap";
    }

    public boolean equals(Object obj) {
        return m2586equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return this.bits;
    }

    public String toString() {
        return m2589toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2590unboximpl() {
        return this.bits;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getNoWrap-7ziDAWk, reason: not valid java name */
        public final int m2591getNoWrap7ziDAWk() {
            return 0;
        }

        /* renamed from: getWrap-7ziDAWk, reason: not valid java name */
        public final int m2592getWrap7ziDAWk() {
            return 1;
        }

        /* renamed from: getWrapReverse-7ziDAWk, reason: not valid java name */
        public final int m2593getWrapReverse7ziDAWk() {
            return 2;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2585constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2588hashCodeimpl(int i2) {
        return i2;
    }
}
