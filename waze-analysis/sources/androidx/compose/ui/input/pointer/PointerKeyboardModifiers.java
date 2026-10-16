package androidx.compose.ui.input.pointer;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class PointerKeyboardModifiers {
    private final int packedValue;

    private /* synthetic */ PointerKeyboardModifiers(int i2) {
        this.packedValue = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m9672boximpl(int i2) {
        return new PointerKeyboardModifiers(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9674equalsimpl(int i2, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i2 == ((PointerKeyboardModifiers) obj).m9678unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9675equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9677toStringimpl(int i2) {
        return "PointerKeyboardModifiers(packedValue=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m9674equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return this.packedValue;
    }

    public String toString() {
        return m9677toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9678unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m9673constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9676hashCodeimpl(int i2) {
        return i2;
    }
}
