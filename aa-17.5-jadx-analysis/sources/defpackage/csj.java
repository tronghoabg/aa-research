package defpackage;

/* loaded from: classes.dex */
public final class csj implements csi {
    private final float a = 1.0f;

    @Override // defpackage.csi
    public final long a(long j, long j2) {
        return (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csj)) {
            return false;
        }
        float f = ((csj) obj).a;
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
