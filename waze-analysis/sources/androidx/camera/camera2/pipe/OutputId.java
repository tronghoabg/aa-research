package androidx.camera.camera2.pipe;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class OutputId {
    private final int value;

    private /* synthetic */ OutputId(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OutputId m734boximpl(int i2) {
        return new OutputId(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m736equalsimpl(int i2, Object obj) {
        return (obj instanceof OutputId) && i2 == ((OutputId) obj).m740unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m737equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m739toStringimpl(int i2) {
        return "Output-" + i2;
    }

    public boolean equals(Object obj) {
        return m736equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m739toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m740unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m735constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m738hashCodeimpl(int i2) {
        return i2;
    }
}
