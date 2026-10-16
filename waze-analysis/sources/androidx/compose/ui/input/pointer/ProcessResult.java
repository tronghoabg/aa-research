package androidx.compose.ui.input.pointer;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m9693boximpl(int i2) {
        return new ProcessResult(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9695equalsimpl(int i2, Object obj) {
        return (obj instanceof ProcessResult) && i2 == ((ProcessResult) obj).m9702unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9696equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: getAnyChangeConsumed-impl, reason: not valid java name */
    public static final boolean m9697getAnyChangeConsumedimpl(int i2) {
        return (i2 & 4) != 0;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m9698getAnyMovementConsumedimpl(int i2) {
        return (i2 & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m9699getDispatchedToAPointerInputModifierimpl(int i2) {
        return (i2 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9701toStringimpl(int i2) {
        return "ProcessResult(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m9695equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m9701toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9702unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m9694constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9700hashCodeimpl(int i2) {
        return i2;
    }
}
