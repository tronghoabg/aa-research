package androidx.compose.material3.carousel;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class CarouselAlignment {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Start = -1;
    private static final int Center = 0;
    private static final int End = 1;

    private /* synthetic */ CarouselAlignment(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CarouselAlignment m6148boximpl(int i2) {
        return new CarouselAlignment(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6150equalsimpl(int i2, Object obj) {
        return (obj instanceof CarouselAlignment) && i2 == ((CarouselAlignment) obj).m6154unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6151equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6153toStringimpl(int i2) {
        return "CarouselAlignment(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m6150equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m6153toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6154unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-NUL3oTo, reason: not valid java name */
        public final int m6155getCenterNUL3oTo() {
            return CarouselAlignment.Center;
        }

        /* renamed from: getEnd-NUL3oTo, reason: not valid java name */
        public final int m6156getEndNUL3oTo() {
            return CarouselAlignment.End;
        }

        /* renamed from: getStart-NUL3oTo, reason: not valid java name */
        public final int m6157getStartNUL3oTo() {
            return CarouselAlignment.Start;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6149constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6152hashCodeimpl(int i2) {
        return i2;
    }
}
