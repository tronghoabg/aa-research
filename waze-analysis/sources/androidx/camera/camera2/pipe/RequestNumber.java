package androidx.camera.camera2.pipe;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class RequestNumber {
    private final long value;

    private /* synthetic */ RequestNumber(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RequestNumber m880boximpl(long j2) {
        return new RequestNumber(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m882equalsimpl(long j2, Object obj) {
        return (obj instanceof RequestNumber) && j2 == ((RequestNumber) obj).m886unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m883equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m884hashCodeimpl(long j2) {
        return RequestNumber$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m885toStringimpl(long j2) {
        return "RequestNumber(value=" + j2 + ")";
    }

    public boolean equals(Object obj) {
        return m882equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m884hashCodeimpl(this.value);
    }

    public String toString() {
        return m885toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m886unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m881constructorimpl(long j2) {
        return j2;
    }
}
