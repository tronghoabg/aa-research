package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class TimePickerLayoutType {
    public static final Companion Companion = new Companion(null);
    private static final int Horizontal = 0;
    private static final int Vertical = 1;
    private final int value;

    private /* synthetic */ TimePickerLayoutType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerLayoutType m5889boximpl(int i2) {
        return new TimePickerLayoutType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5891equalsimpl(int i2, Object obj) {
        return (obj instanceof TimePickerLayoutType) && i2 == ((TimePickerLayoutType) obj).m5895unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5892equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5894toStringimpl(int i2) {
        return m5892equalsimpl0(i2, Horizontal) ? "Horizontal" : m5892equalsimpl0(i2, Vertical) ? "Vertical" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5891equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m5894toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5895unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getHorizontal-QJTpgSE, reason: not valid java name */
        public final int m5896getHorizontalQJTpgSE() {
            return TimePickerLayoutType.Horizontal;
        }

        /* renamed from: getVertical-QJTpgSE, reason: not valid java name */
        public final int m5897getVerticalQJTpgSE() {
            return TimePickerLayoutType.Vertical;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5890constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5893hashCodeimpl(int i2) {
        return i2;
    }
}
