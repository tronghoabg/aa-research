package androidx.compose.ui.input.pointer;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class PointerButtons {
    private final int packedValue;

    private /* synthetic */ PointerButtons(int i2) {
        this.packedValue = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerButtons m9531boximpl(int i2) {
        return new PointerButtons(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9533equalsimpl(int i2, Object obj) {
        return (obj instanceof PointerButtons) && i2 == ((PointerButtons) obj).m9537unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9534equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9536toStringimpl(int i2) {
        return "PointerButtons(packedValue=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m9533equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return this.packedValue;
    }

    public String toString() {
        return m9536toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m9537unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m9532constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9535hashCodeimpl(int i2) {
        return i2;
    }
}
