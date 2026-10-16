package androidx.compose.foundation.text.modifiers;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class LayoutCacheOperation {
    private final long flag;
    public static final Companion Companion = new Companion(null);
    private static final long MarkDirtyStyle = 0;
    private static final long MarkDirtyDensity = 1;
    private static final long MarkDirtyNode = 2;
    private static final long LayoutWithConstraints = 3;

    private /* synthetic */ LayoutCacheOperation(long j2) {
        this.flag = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LayoutCacheOperation m3784boximpl(long j2) {
        return new LayoutCacheOperation(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3786equalsimpl(long j2, Object obj) {
        return (obj instanceof LayoutCacheOperation) && j2 == ((LayoutCacheOperation) obj).m3790unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3787equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3788hashCodeimpl(long j2) {
        return LayoutCacheOperation$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3789toStringimpl(long j2) {
        return "LayoutCacheOperation(flag=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m3786equalsimpl(this.flag, obj);
    }

    public final long getFlag() {
        return this.flag;
    }

    public int hashCode() {
        return m3788hashCodeimpl(this.flag);
    }

    public String toString() {
        return m3789toStringimpl(this.flag);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3790unboximpl() {
        return this.flag;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getLayoutWithConstraints-DEKiAbY, reason: not valid java name */
        public final long m3791getLayoutWithConstraintsDEKiAbY() {
            return LayoutCacheOperation.LayoutWithConstraints;
        }

        /* renamed from: getMarkDirtyDensity-DEKiAbY, reason: not valid java name */
        public final long m3792getMarkDirtyDensityDEKiAbY() {
            return LayoutCacheOperation.MarkDirtyDensity;
        }

        /* renamed from: getMarkDirtyNode-DEKiAbY, reason: not valid java name */
        public final long m3793getMarkDirtyNodeDEKiAbY() {
            return LayoutCacheOperation.MarkDirtyNode;
        }

        /* renamed from: getMarkDirtyStyle-DEKiAbY, reason: not valid java name */
        public final long m3794getMarkDirtyStyleDEKiAbY() {
            return LayoutCacheOperation.MarkDirtyStyle;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m3785constructorimpl(long j2) {
        return j2;
    }
}
