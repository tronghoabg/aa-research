package androidx.compose.foundation.layout;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class FlexAlignSelf {
    public static final Companion Companion = new Companion(null);
    private final int bits;

    private /* synthetic */ FlexAlignSelf(int i2) {
        this.bits = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexAlignSelf m2511boximpl(int i2) {
        return new FlexAlignSelf(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2513equalsimpl(int i2, Object obj) {
        return (obj instanceof FlexAlignSelf) && i2 == ((FlexAlignSelf) obj).m2517unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2514equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2516toStringimpl(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "INVALID" : "Baseline" : "Stretch" : "Center" : "End" : "Start" : "Auto";
    }

    public boolean equals(Object obj) {
        return m2513equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return this.bits;
    }

    public String toString() {
        return m2516toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2517unboximpl() {
        return this.bits;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAuto-_ov7Qcc, reason: not valid java name */
        public final int m2518getAuto_ov7Qcc() {
            return 0;
        }

        /* renamed from: getBaseline-_ov7Qcc, reason: not valid java name */
        public final int m2519getBaseline_ov7Qcc() {
            return 5;
        }

        /* renamed from: getCenter-_ov7Qcc, reason: not valid java name */
        public final int m2520getCenter_ov7Qcc() {
            return 3;
        }

        /* renamed from: getEnd-_ov7Qcc, reason: not valid java name */
        public final int m2521getEnd_ov7Qcc() {
            return 2;
        }

        /* renamed from: getStart-_ov7Qcc, reason: not valid java name */
        public final int m2522getStart_ov7Qcc() {
            return 1;
        }

        /* renamed from: getStretch-_ov7Qcc, reason: not valid java name */
        public final int m2523getStretch_ov7Qcc() {
            return 4;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2512constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2515hashCodeimpl(int i2) {
        return i2;
    }
}
