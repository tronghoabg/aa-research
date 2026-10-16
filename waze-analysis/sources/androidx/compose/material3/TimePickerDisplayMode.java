package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class TimePickerDisplayMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Picker = 0;
    private static final int Input = 1;

    private /* synthetic */ TimePickerDisplayMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerDisplayMode m5850boximpl(int i2) {
        return new TimePickerDisplayMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5852equalsimpl(int i2, Object obj) {
        return (obj instanceof TimePickerDisplayMode) && i2 == ((TimePickerDisplayMode) obj).m5856unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5853equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5855toStringimpl(int i2) {
        return m5853equalsimpl0(i2, Picker) ? "Picker" : m5853equalsimpl0(i2, Input) ? "Input" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5852equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m5855toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5856unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getInput--ONbchU, reason: not valid java name */
        public final int m5857getInputONbchU() {
            return TimePickerDisplayMode.Input;
        }

        /* renamed from: getPicker--ONbchU, reason: not valid java name */
        public final int m5858getPickerONbchU() {
            return TimePickerDisplayMode.Picker;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5851constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5854hashCodeimpl(int i2) {
        return i2;
    }
}
