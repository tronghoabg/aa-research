package androidx.compose.foundation.layout;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class FlexAlignContent {
    public static final Companion Companion = new Companion(null);
    private final int bits;

    private /* synthetic */ FlexAlignContent(int i2) {
        this.bits = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexAlignContent m2486boximpl(int i2) {
        return new FlexAlignContent(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2488equalsimpl(int i2, Object obj) {
        return (obj instanceof FlexAlignContent) && i2 == ((FlexAlignContent) obj).m2492unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2489equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2491toStringimpl(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "INVALID" : "SpaceAround" : "SpaceBetween" : "Stretch" : "Center" : "End" : "Start";
    }

    public boolean equals(Object obj) {
        return m2488equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return this.bits;
    }

    public String toString() {
        return m2491toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2492unboximpl() {
        return this.bits;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-d9B3MrI, reason: not valid java name */
        public final int m2493getCenterd9B3MrI() {
            return 2;
        }

        /* renamed from: getEnd-d9B3MrI, reason: not valid java name */
        public final int m2494getEndd9B3MrI() {
            return 1;
        }

        /* renamed from: getSpaceAround-d9B3MrI, reason: not valid java name */
        public final int m2495getSpaceAroundd9B3MrI() {
            return 5;
        }

        /* renamed from: getSpaceBetween-d9B3MrI, reason: not valid java name */
        public final int m2496getSpaceBetweend9B3MrI() {
            return 4;
        }

        /* renamed from: getStart-d9B3MrI, reason: not valid java name */
        public final int m2497getStartd9B3MrI() {
            return 0;
        }

        /* renamed from: getStretch-d9B3MrI, reason: not valid java name */
        public final int m2498getStretchd9B3MrI() {
            return 3;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2487constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2490hashCodeimpl(int i2) {
        return i2;
    }
}
