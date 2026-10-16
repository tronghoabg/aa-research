package androidx.camera.camera2.pipe;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class CameraTimestamp {
    private final long value;

    private /* synthetic */ CameraTimestamp(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CameraTimestamp m588boximpl(long j2) {
        return new CameraTimestamp(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m590equalsimpl(long j2, Object obj) {
        return (obj instanceof CameraTimestamp) && j2 == ((CameraTimestamp) obj).m594unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m591equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m592hashCodeimpl(long j2) {
        return CameraTimestamp$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m593toStringimpl(long j2) {
        return "CameraTimestamp(value=" + j2 + ")";
    }

    public boolean equals(Object obj) {
        return m590equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m592hashCodeimpl(this.value);
    }

    public String toString() {
        return m593toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m594unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m589constructorimpl(long j2) {
        return j2;
    }
}
