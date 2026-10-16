package androidx.camera.camera2.pipe;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class StreamId {
    private final int value;

    private /* synthetic */ StreamId(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StreamId m974boximpl(int i2) {
        return new StreamId(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m976equalsimpl(int i2, Object obj) {
        return (obj instanceof StreamId) && i2 == ((StreamId) obj).m980unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m977equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m979toStringimpl(int i2) {
        return "Stream-" + i2;
    }

    public boolean equals(Object obj) {
        return m976equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m979toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m980unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m975constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m978hashCodeimpl(int i2) {
        return i2;
    }
}
