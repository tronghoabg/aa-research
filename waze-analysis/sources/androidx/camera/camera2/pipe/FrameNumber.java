package androidx.camera.camera2.pipe;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class FrameNumber {
    private final long value;

    private /* synthetic */ FrameNumber(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FrameNumber m690boximpl(long j2) {
        return new FrameNumber(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m692equalsimpl(long j2, Object obj) {
        return (obj instanceof FrameNumber) && j2 == ((FrameNumber) obj).m696unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m693equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m694hashCodeimpl(long j2) {
        return FrameNumber$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m695toStringimpl(long j2) {
        return "Frame-" + j2;
    }

    public boolean equals(Object obj) {
        return m692equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m694hashCodeimpl(this.value);
    }

    public String toString() {
        return m695toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m696unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m691constructorimpl(long j2) {
        return j2;
    }
}
