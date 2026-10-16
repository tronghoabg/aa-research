package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class TimePickerSelectionMode {
    public static final Companion Companion = new Companion(null);
    private static final int Hour = 0;
    private static final int Minute = 1;
    private final int value;

    private /* synthetic */ TimePickerSelectionMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerSelectionMode m5898boximpl(int i2) {
        return new TimePickerSelectionMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5900equalsimpl(int i2, Object obj) {
        return (obj instanceof TimePickerSelectionMode) && i2 == ((TimePickerSelectionMode) obj).m5904unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5901equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5903toStringimpl(int i2) {
        return m5901equalsimpl0(i2, Hour) ? "Hour" : m5901equalsimpl0(i2, Minute) ? "Minute" : "";
    }

    public boolean equals(Object obj) {
        return m5900equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m5903toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5904unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getHour-yecRtBI, reason: not valid java name */
        public final int m5905getHouryecRtBI() {
            return TimePickerSelectionMode.Hour;
        }

        /* renamed from: getMinute-yecRtBI, reason: not valid java name */
        public final int m5906getMinuteyecRtBI() {
            return TimePickerSelectionMode.Minute;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5899constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5902hashCodeimpl(int i2) {
        return i2;
    }
}
