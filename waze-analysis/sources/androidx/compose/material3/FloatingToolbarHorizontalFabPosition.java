package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class FloatingToolbarHorizontalFabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Start = 0;
    private static final int End = 1;

    private /* synthetic */ FloatingToolbarHorizontalFabPosition(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatingToolbarHorizontalFabPosition m4929boximpl(int i2) {
        return new FloatingToolbarHorizontalFabPosition(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4931equalsimpl(int i2, Object obj) {
        return (obj instanceof FloatingToolbarHorizontalFabPosition) && i2 == ((FloatingToolbarHorizontalFabPosition) obj).m4935unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4932equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4934toStringimpl(int i2) {
        return true != m4932equalsimpl0(i2, Start) ? "FloatingToolbarHorizontalFabPosition.End" : "FloatingToolbarHorizontalFabPosition.Start";
    }

    public boolean equals(Object obj) {
        return m4931equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m4934toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4935unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getEnd-EdPuMIg, reason: not valid java name */
        public final int m4936getEndEdPuMIg() {
            return FloatingToolbarHorizontalFabPosition.End;
        }

        /* renamed from: getStart-EdPuMIg, reason: not valid java name */
        public final int m4937getStartEdPuMIg() {
            return FloatingToolbarHorizontalFabPosition.Start;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4930constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4933hashCodeimpl(int i2) {
        return i2;
    }
}
