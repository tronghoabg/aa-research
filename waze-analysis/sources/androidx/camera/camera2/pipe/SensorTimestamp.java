package androidx.camera.camera2.pipe;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class SensorTimestamp {
    private final long value;

    private /* synthetic */ SensorTimestamp(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SensorTimestamp m911boximpl(long j2) {
        return new SensorTimestamp(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m913equalsimpl(long j2, Object obj) {
        return (obj instanceof SensorTimestamp) && j2 == ((SensorTimestamp) obj).m917unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m914equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m915hashCodeimpl(long j2) {
        return SensorTimestamp$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m916toStringimpl(long j2) {
        return "SensorTimestamp(value=" + j2 + ")";
    }

    public boolean equals(Object obj) {
        return m913equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m915hashCodeimpl(this.value);
    }

    public String toString() {
        return m916toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m917unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m912constructorimpl(long j2) {
        return j2;
    }
}
