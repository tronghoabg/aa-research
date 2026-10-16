package androidx.compose.foundation.layout;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class FlexAlignItems {
    public static final Companion Companion = new Companion(null);
    private final int bits;

    private /* synthetic */ FlexAlignItems(int i2) {
        this.bits = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexAlignItems m2499boximpl(int i2) {
        return new FlexAlignItems(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2501equalsimpl(int i2, Object obj) {
        return (obj instanceof FlexAlignItems) && i2 == ((FlexAlignItems) obj).m2505unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2502equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2504toStringimpl(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "INVALID" : "Baseline" : "Stretch" : "Center" : "End" : "Start";
    }

    public boolean equals(Object obj) {
        return m2501equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return this.bits;
    }

    public String toString() {
        return m2504toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2505unboximpl() {
        return this.bits;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getBaseline-20X20zU, reason: not valid java name */
        public final int m2506getBaseline20X20zU() {
            return 4;
        }

        /* renamed from: getCenter-20X20zU, reason: not valid java name */
        public final int m2507getCenter20X20zU() {
            return 2;
        }

        /* renamed from: getEnd-20X20zU, reason: not valid java name */
        public final int m2508getEnd20X20zU() {
            return 1;
        }

        /* renamed from: getStart-20X20zU, reason: not valid java name */
        public final int m2509getStart20X20zU() {
            return 0;
        }

        /* renamed from: getStretch-20X20zU, reason: not valid java name */
        public final int m2510getStretch20X20zU() {
            return 3;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2500constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2503hashCodeimpl(int i2) {
        return i2;
    }
}
