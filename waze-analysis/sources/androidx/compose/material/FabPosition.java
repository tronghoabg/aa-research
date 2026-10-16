package androidx.compose.material;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class FabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Start = 0;
    private static final int Center = 1;
    private static final int End = 2;

    private /* synthetic */ FabPosition(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FabPosition m4088boximpl(int i2) {
        return new FabPosition(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4090equalsimpl(int i2, Object obj) {
        return (obj instanceof FabPosition) && i2 == ((FabPosition) obj).m4094unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4091equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4093toStringimpl(int i2) {
        return m4091equalsimpl0(i2, Start) ? "FabPosition.Start" : m4091equalsimpl0(i2, Center) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m4090equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m4093toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4094unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-5ygKITE, reason: not valid java name */
        public final int m4095getCenter5ygKITE() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-5ygKITE, reason: not valid java name */
        public final int m4096getEnd5ygKITE() {
            return FabPosition.End;
        }

        /* renamed from: getStart-5ygKITE, reason: not valid java name */
        public final int m4097getStart5ygKITE() {
            return FabPosition.Start;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4089constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4092hashCodeimpl(int i2) {
        return i2;
    }
}
