package androidx.compose.ui.layout;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class ValueInsets {
    private final long packedValue;

    private /* synthetic */ ValueInsets(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ValueInsets m9882boximpl(long j2) {
        return new ValueInsets(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9884equalsimpl(long j2, Object obj) {
        return (obj instanceof ValueInsets) && j2 == ((ValueInsets) obj).m9892unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9885equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m9886getBottomimpl(long j2) {
        return (int) (j2 & 65535);
    }

    /* renamed from: getLeft-impl, reason: not valid java name */
    public static final int m9887getLeftimpl(long j2) {
        return (int) (j2 >>> 48);
    }

    /* renamed from: getRight-impl, reason: not valid java name */
    public static final int m9888getRightimpl(long j2) {
        return (int) ((j2 >>> 16) & 65535);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m9889getTopimpl(long j2) {
        return (int) ((j2 >>> 32) & 65535);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9890hashCodeimpl(long j2) {
        return ValueInsets$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9891toStringimpl(long j2) {
        return "ValueInsets(" + ((int) (j2 >>> 48)) + ", " + ((int) ((j2 >>> 32) & 65535)) + ", " + ((int) ((j2 >>> 16) & 65535)) + ", " + ((int) (j2 & 65535)) + ')';
    }

    public boolean equals(Object obj) {
        return m9884equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m9890hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m9891toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m9892unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m9883constructorimpl(long j2) {
        return j2;
    }
}
