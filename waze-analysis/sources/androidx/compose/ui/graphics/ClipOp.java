package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ClipOp {
    public static final Companion Companion = new Companion(null);
    private static final int Difference = 0;
    private static final int Intersect = 1;
    private final int value;

    private /* synthetic */ ClipOp(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipOp m8209boximpl(int i2) {
        return new ClipOp(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8211equalsimpl(int i2, Object obj) {
        return (obj instanceof ClipOp) && i2 == ((ClipOp) obj).m8215unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8212equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8214toStringimpl(int i2) {
        return m8212equalsimpl0(i2, Difference) ? "Difference" : m8212equalsimpl0(i2, Intersect) ? "Intersect" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8211equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8214toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8215unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getDifference-rtfAjoo, reason: not valid java name */
        public final int m8216getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo, reason: not valid java name */
        public final int m8217getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8210constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8213hashCodeimpl(int i2) {
        return i2;
    }
}
