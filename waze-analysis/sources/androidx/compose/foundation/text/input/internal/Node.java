package androidx.compose.foundation.text.input.internal;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Node {
    private final int index;

    private /* synthetic */ Node(int i2) {
        this.index = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Node m3637boximpl(int i2) {
        return new Node(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3639equalsimpl(int i2, Object obj) {
        return (obj instanceof Node) && i2 == ((Node) obj).m3643unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3640equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3642toStringimpl(int i2) {
        return "Node(index=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3639equalsimpl(this.index, obj);
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return this.index;
    }

    public String toString() {
        return m3642toStringimpl(this.index);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3643unboximpl() {
        return this.index;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3638constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3641hashCodeimpl(int i2) {
        return i2;
    }
}
