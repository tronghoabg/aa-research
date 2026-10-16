package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class ShortNavigationBarArrangement {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int EqualWeight = 0;
    private static final int Centered = 1;

    private /* synthetic */ ShortNavigationBarArrangement(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ShortNavigationBarArrangement m5541boximpl(int i2) {
        return new ShortNavigationBarArrangement(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5543equalsimpl(int i2, Object obj) {
        return (obj instanceof ShortNavigationBarArrangement) && i2 == ((ShortNavigationBarArrangement) obj).m5547unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5544equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5546toStringimpl(int i2) {
        return m5544equalsimpl0(i2, EqualWeight) ? "EqualWeight" : m5544equalsimpl0(i2, Centered) ? "Centered" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5543equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m5546toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5547unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCentered-LnnQw40, reason: not valid java name */
        public final int m5548getCenteredLnnQw40() {
            return ShortNavigationBarArrangement.Centered;
        }

        /* renamed from: getEqualWeight-LnnQw40, reason: not valid java name */
        public final int m5549getEqualWeightLnnQw40() {
            return ShortNavigationBarArrangement.EqualWeight;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5542constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5545hashCodeimpl(int i2) {
        return i2;
    }
}
