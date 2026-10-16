package androidx.compose.ui.semantics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class LiveRegionMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Polite = 0;
    private static final int Assertive = 1;

    private /* synthetic */ LiveRegionMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m10300boximpl(int i2) {
        return new LiveRegionMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10302equalsimpl(int i2, Object obj) {
        return (obj instanceof LiveRegionMode) && i2 == ((LiveRegionMode) obj).m10306unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10303equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10305toStringimpl(int i2) {
        return m10303equalsimpl0(i2, Polite) ? "Polite" : m10303equalsimpl0(i2, Assertive) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m10302equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10305toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10306unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAssertive-0phEisY, reason: not valid java name */
        public final int m10307getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }

        /* renamed from: getPolite-0phEisY, reason: not valid java name */
        public final int m10308getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m10301constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10304hashCodeimpl(int i2) {
        return i2;
    }
}
