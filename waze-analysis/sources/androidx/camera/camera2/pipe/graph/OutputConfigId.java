package androidx.camera.camera2.pipe.graph;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class OutputConfigId {
    private final int value;

    private /* synthetic */ OutputConfigId(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OutputConfigId m1164boximpl(int i2) {
        return new OutputConfigId(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1166equalsimpl(int i2, Object obj) {
        return (obj instanceof OutputConfigId) && i2 == ((OutputConfigId) obj).m1170unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1167equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1169toStringimpl(int i2) {
        return "OutputConfig-" + i2;
    }

    public boolean equals(Object obj) {
        return m1166equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m1169toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1170unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1165constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1168hashCodeimpl(int i2) {
        return i2;
    }
}
