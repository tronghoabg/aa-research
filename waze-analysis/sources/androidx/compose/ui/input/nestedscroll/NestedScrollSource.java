package androidx.compose.ui.input.nestedscroll;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class NestedScrollSource {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int UserInput = 1;
    private static final int SideEffect = 2;
    private static final int Drag = 1;
    private static final int Fling = 2;
    private static final int Relocate = 3;
    private static final int Wheel = 1;

    private /* synthetic */ NestedScrollSource(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m9461boximpl(int i2) {
        return new NestedScrollSource(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9463equalsimpl(int i2, Object obj) {
        return (obj instanceof NestedScrollSource) && i2 == ((NestedScrollSource) obj).m9467unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9464equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9466toStringimpl(int i2) {
        return m9464equalsimpl0(i2, UserInput) ? "UserInput" : m9464equalsimpl0(i2, SideEffect) ? "SideEffect" : m9464equalsimpl0(i2, Relocate) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m9463equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m9466toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9467unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m9472getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m9473getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        /* renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m9474getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        /* renamed from: getSideEffect-WNlRxjI, reason: not valid java name */
        public final int m9475getSideEffectWNlRxjI() {
            return NestedScrollSource.SideEffect;
        }

        /* renamed from: getUserInput-WNlRxjI, reason: not valid java name */
        public final int m9476getUserInputWNlRxjI() {
            return NestedScrollSource.UserInput;
        }

        /* renamed from: getWheel-WNlRxjI, reason: not valid java name */
        public final int m9477getWheelWNlRxjI() {
            return NestedScrollSource.Wheel;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getDrag-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m9468getDragWNlRxjI$annotations() {
        }

        /* renamed from: getFling-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m9469getFlingWNlRxjI$annotations() {
        }

        /* renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m9470getRelocateWNlRxjI$annotations() {
        }

        /* renamed from: getWheel-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m9471getWheelWNlRxjI$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m9462constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9465hashCodeimpl(int i2) {
        return i2;
    }
}
