package androidx.camera.camera2.pipe;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class FrameId {
    private final long value;

    private /* synthetic */ FrameId(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FrameId m681boximpl(long j2) {
        return new FrameId(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m683equalsimpl(long j2, Object obj) {
        return (obj instanceof FrameId) && j2 == ((FrameId) obj).m687unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m684equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m685hashCodeimpl(long j2) {
        return FrameId$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m686toStringimpl(long j2) {
        return "FrameId(value=" + j2 + ")";
    }

    public boolean equals(Object obj) {
        return m683equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m685hashCodeimpl(this.value);
    }

    public String toString() {
        return m686toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m687unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m682constructorimpl(long j2) {
        return j2;
    }
}
