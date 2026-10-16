package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class PathOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Difference = 0;
    private static final int Intersect = 1;
    private static final int Union = 2;
    private static final int Xor = 3;
    private static final int ReverseDifference = 4;

    private /* synthetic */ PathOperation(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m8557boximpl(int i2) {
        return new PathOperation(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8559equalsimpl(int i2, Object obj) {
        return (obj instanceof PathOperation) && i2 == ((PathOperation) obj).m8563unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8560equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8562toStringimpl(int i2) {
        return m8560equalsimpl0(i2, Difference) ? "Difference" : m8560equalsimpl0(i2, Intersect) ? "Intersect" : m8560equalsimpl0(i2, Union) ? "Union" : m8560equalsimpl0(i2, Xor) ? "Xor" : m8560equalsimpl0(i2, ReverseDifference) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8559equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8562toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8563unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m8564getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m8565getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m8566getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m8567getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m8568getXorb3I0S0c() {
            return PathOperation.Xor;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8558constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8561hashCodeimpl(int i2) {
        return i2;
    }
}
