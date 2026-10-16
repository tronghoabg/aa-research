package androidx.compose.foundation.text.modifiers;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class StylePhase {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Layout = 1;
    private static final int Draw = 2;
    private static final int All = -1;

    private /* synthetic */ StylePhase(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StylePhase m3824boximpl(int i2) {
        return new StylePhase(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3826equalsimpl(int i2, Object obj) {
        return (obj instanceof StylePhase) && i2 == ((StylePhase) obj).m3830unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3827equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3829toStringimpl(int i2) {
        return "StylePhase(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3826equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m3829toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3830unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAll-oWBPZag, reason: not valid java name */
        public final int m3831getAlloWBPZag() {
            return StylePhase.All;
        }

        /* renamed from: getDraw-oWBPZag, reason: not valid java name */
        public final int m3832getDrawoWBPZag() {
            return StylePhase.Draw;
        }

        /* renamed from: getLayout-oWBPZag, reason: not valid java name */
        public final int m3833getLayoutoWBPZag() {
            return StylePhase.Layout;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3825constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3828hashCodeimpl(int i2) {
        return i2;
    }
}
