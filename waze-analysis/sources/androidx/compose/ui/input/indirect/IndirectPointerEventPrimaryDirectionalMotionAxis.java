package androidx.compose.ui.input.indirect;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class IndirectPointerEventPrimaryDirectionalMotionAxis {
    public static final Companion Companion = new Companion(null);
    private static final int None = 0;
    private static final int X = 1;
    private static final int Y = 2;
    private final int value;

    private /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis m9086boximpl(int i2) {
        return new IndirectPointerEventPrimaryDirectionalMotionAxis(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9088equalsimpl(int i2, Object obj) {
        return (obj instanceof IndirectPointerEventPrimaryDirectionalMotionAxis) && i2 == ((IndirectPointerEventPrimaryDirectionalMotionAxis) obj).m9092unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9089equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9091toStringimpl(int i2) {
        return "IndirectPointerEventPrimaryDirectionalMotionAxis(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m9088equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m9091toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9092unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-nZO2Niw, reason: not valid java name */
        public final int m9093getNonenZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.None;
        }

        /* renamed from: getX-nZO2Niw, reason: not valid java name */
        public final int m9094getXnZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.X;
        }

        /* renamed from: getY-nZO2Niw, reason: not valid java name */
        public final int m9095getYnZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.Y;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m9087constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9090hashCodeimpl(int i2) {
        return i2;
    }
}
