package androidx.camera.camera2.pipe;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class InputStreamId {
    private final int value;

    private /* synthetic */ InputStreamId(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputStreamId m711boximpl(int i2) {
        return new InputStreamId(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m713equalsimpl(int i2, Object obj) {
        return (obj instanceof InputStreamId) && i2 == ((InputStreamId) obj).m717unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m714equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m716toStringimpl(int i2) {
        return "Input-" + i2;
    }

    public boolean equals(Object obj) {
        return m713equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m716toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m717unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m712constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m715hashCodeimpl(int i2) {
        return i2;
    }
}
