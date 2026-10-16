package androidx.compose.ui.node;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class NodeKind<T> {
    private final int mask;

    private /* synthetic */ NodeKind(int i2) {
        this.mask = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m10066boximpl(int i2) {
        return new NodeKind(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10068equalsimpl(int i2, Object obj) {
        return (obj instanceof NodeKind) && i2 == ((NodeKind) obj).m10074unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10069equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: or-H91voCI, reason: not valid java name */
    public static final int m10071orH91voCI(int i2, int i3) {
        return i2 | i3;
    }

    /* renamed from: or-impl, reason: not valid java name */
    public static final int m10072orimpl(int i2, int i3) {
        return i2 | i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10073toStringimpl(int i2) {
        return "NodeKind(mask=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m10068equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    public String toString() {
        return m10073toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10074unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m10067constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10070hashCodeimpl(int i2) {
        return i2;
    }
}
