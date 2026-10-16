package androidx.constraintlayout.compose;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes3.dex */
public final class DebugFlags {
    private static final int BOUNDS_FLAG = 1;
    private static final int KEY_POSITIONS_FLAG = 4;
    private static final int PATHS_FLAG = 2;
    private final int flags;
    public static final Companion Companion = new Companion(null);
    private static final int None = 0;
    private static final int All = -1;

    private /* synthetic */ DebugFlags(int i2) {
        this.flags = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DebugFlags m11510boximpl(int i2) {
        return new DebugFlags(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m11512constructorimpl(boolean z, boolean z2, boolean z3) {
        return (z ? 1 : 0) | (true != z2 ? 0 : 2) | (true == z3 ? 4 : 0);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11514equalsimpl(int i2, Object obj) {
        return (obj instanceof DebugFlags) && i2 == ((DebugFlags) obj).m11521unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11515equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: getShowBounds-impl, reason: not valid java name */
    public static final boolean m11516getShowBoundsimpl(int i2) {
        return (i2 & 1) > 0;
    }

    /* renamed from: getShowKeyPositions-impl, reason: not valid java name */
    public static final boolean m11517getShowKeyPositionsimpl(int i2) {
        return (i2 & 4) > 0;
    }

    /* renamed from: getShowPaths-impl, reason: not valid java name */
    public static final boolean m11518getShowPathsimpl(int i2) {
        return (i2 & 2) > 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11519hashCodeimpl(int i2) {
        return i2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11520toStringimpl(int i2) {
        return "DebugFlags(showBounds = " + m11516getShowBoundsimpl(i2) + ", showPaths = " + m11518getShowPathsimpl(i2) + ", showKeyPositions = " + m11517getShowKeyPositionsimpl(i2) + ')';
    }

    public boolean equals(Object obj) {
        return m11514equalsimpl(this.flags, obj);
    }

    public int hashCode() {
        return this.flags;
    }

    public String toString() {
        return m11520toStringimpl(this.flags);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m11521unboximpl() {
        return this.flags;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAll-bfy_xzQ, reason: not valid java name */
        public final int m11522getAllbfy_xzQ() {
            return DebugFlags.All;
        }

        /* renamed from: getNone-bfy_xzQ, reason: not valid java name */
        public final int m11523getNonebfy_xzQ() {
            return DebugFlags.None;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m11511constructorimpl(int i2) {
        return i2;
    }
}
