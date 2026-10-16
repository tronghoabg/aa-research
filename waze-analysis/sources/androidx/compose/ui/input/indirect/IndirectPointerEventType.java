package androidx.compose.ui.input.indirect;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class IndirectPointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = 0;
    private static final int Press = 1;
    private static final int Release = 2;
    private static final int Move = 3;

    private /* synthetic */ IndirectPointerEventType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IndirectPointerEventType m9096boximpl(int i2) {
        return new IndirectPointerEventType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9098equalsimpl(int i2, Object obj) {
        return (obj instanceof IndirectPointerEventType) && i2 == ((IndirectPointerEventType) obj).m9102unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9099equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9101toStringimpl(int i2) {
        return m9099equalsimpl0(i2, Press) ? "Press" : m9099equalsimpl0(i2, Release) ? "Release" : m9099equalsimpl0(i2, Move) ? "Move" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m9098equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m9101toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9102unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getMove-4ZHQPSE, reason: not valid java name */
        public final int m9103getMove4ZHQPSE() {
            return IndirectPointerEventType.Move;
        }

        /* renamed from: getPress-4ZHQPSE, reason: not valid java name */
        public final int m9104getPress4ZHQPSE() {
            return IndirectPointerEventType.Press;
        }

        /* renamed from: getRelease-4ZHQPSE, reason: not valid java name */
        public final int m9105getRelease4ZHQPSE() {
            return IndirectPointerEventType.Release;
        }

        /* renamed from: getUnknown-4ZHQPSE, reason: not valid java name */
        public final int m9106getUnknown4ZHQPSE() {
            return IndirectPointerEventType.Unknown;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m9097constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9100hashCodeimpl(int i2) {
        return i2;
    }
}
