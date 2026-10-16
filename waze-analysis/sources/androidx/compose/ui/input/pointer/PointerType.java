package androidx.compose.ui.input.pointer;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class PointerType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = 0;
    private static final int Touch = 1;
    private static final int Mouse = 2;
    private static final int Stylus = 3;
    private static final int Eraser = 4;

    private /* synthetic */ PointerType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerType m9679boximpl(int i2) {
        return new PointerType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9681equalsimpl(int i2, Object obj) {
        return (obj instanceof PointerType) && i2 == ((PointerType) obj).m9685unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9682equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9684toStringimpl(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public boolean equals(Object obj) {
        return m9681equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m9684toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9685unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getEraser-T8wyACA, reason: not valid java name */
        public final int m9686getEraserT8wyACA() {
            return PointerType.Eraser;
        }

        /* renamed from: getMouse-T8wyACA, reason: not valid java name */
        public final int m9687getMouseT8wyACA() {
            return PointerType.Mouse;
        }

        /* renamed from: getStylus-T8wyACA, reason: not valid java name */
        public final int m9688getStylusT8wyACA() {
            return PointerType.Stylus;
        }

        /* renamed from: getTouch-T8wyACA, reason: not valid java name */
        public final int m9689getTouchT8wyACA() {
            return PointerType.Touch;
        }

        /* renamed from: getUnknown-T8wyACA, reason: not valid java name */
        public final int m9690getUnknownT8wyACA() {
            return PointerType.Unknown;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m9680constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9683hashCodeimpl(int i2) {
        return i2;
    }
}
