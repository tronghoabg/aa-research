package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class FilterQuality {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = 0;
    private static final int Low = 1;
    private static final int Medium = 2;
    private static final int High = 3;

    private /* synthetic */ FilterQuality(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FilterQuality m8320boximpl(int i2) {
        return new FilterQuality(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8322equalsimpl(int i2, Object obj) {
        return (obj instanceof FilterQuality) && i2 == ((FilterQuality) obj).m8326unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8323equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8325toStringimpl(int i2) {
        return m8323equalsimpl0(i2, None) ? "None" : m8323equalsimpl0(i2, Low) ? "Low" : m8323equalsimpl0(i2, Medium) ? "Medium" : m8323equalsimpl0(i2, High) ? "High" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8322equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8325toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8326unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getHigh-f-v9h1I, reason: not valid java name */
        public final int m8327getHighfv9h1I() {
            return FilterQuality.High;
        }

        /* renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m8328getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* renamed from: getMedium-f-v9h1I, reason: not valid java name */
        public final int m8329getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m8330getNonefv9h1I() {
            return FilterQuality.None;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8321constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8324hashCodeimpl(int i2) {
        return i2;
    }
}
