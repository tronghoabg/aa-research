package androidx.compose.foundation.text.input;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ExpandPolicy {
    private static final int FLAG_EXPAND_END = 2;
    private static final int FLAG_EXPAND_START = 1;
    private final int flag;
    public static final Companion Companion = new Companion(null);
    private static final int InsideOnly = 0;
    private static final int AtStart = 1;
    private static final int AtEnd = 2;
    private static final int AtBoth = 3;

    private /* synthetic */ ExpandPolicy(int i2) {
        this.flag = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ExpandPolicy m3454boximpl(int i2) {
        return new ExpandPolicy(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3456constructorimpl(boolean z, boolean z2) {
        return (z ? 1 : 0) | (true != z2 ? 0 : 2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3457equalsimpl(int i2, Object obj) {
        return (obj instanceof ExpandPolicy) && i2 == ((ExpandPolicy) obj).m3463unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3458equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: getEndExpands-impl$foundation, reason: not valid java name */
    public static final boolean m3459getEndExpandsimpl$foundation(int i2) {
        return (i2 & 2) != 0;
    }

    /* renamed from: getStartExpands-impl$foundation, reason: not valid java name */
    public static final boolean m3460getStartExpandsimpl$foundation(int i2) {
        return (i2 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3462toStringimpl(int i2) {
        return "ExpandPolicy(flag=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3457equalsimpl(this.flag, obj);
    }

    public final int getFlag() {
        return this.flag;
    }

    public int hashCode() {
        return this.flag;
    }

    public String toString() {
        return m3462toStringimpl(this.flag);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3463unboximpl() {
        return this.flag;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAtBoth-RfBwNNI, reason: not valid java name */
        public final int m3464getAtBothRfBwNNI() {
            return ExpandPolicy.AtBoth;
        }

        /* renamed from: getAtEnd-RfBwNNI, reason: not valid java name */
        public final int m3465getAtEndRfBwNNI() {
            return ExpandPolicy.AtEnd;
        }

        /* renamed from: getAtStart-RfBwNNI, reason: not valid java name */
        public final int m3466getAtStartRfBwNNI() {
            return ExpandPolicy.AtStart;
        }

        /* renamed from: getInsideOnly-RfBwNNI, reason: not valid java name */
        public final int m3467getInsideOnlyRfBwNNI() {
            return ExpandPolicy.InsideOnly;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3455constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3461hashCodeimpl(int i2) {
        return i2;
    }
}
