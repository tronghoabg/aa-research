package defpackage;

/* loaded from: classes2.dex */
public final class crs {
    public final float a;
    private final float b;
    private final long c;
    private final int d;

    public crs(float f, float f2, long j, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof crs)) {
            return false;
        }
        crs crsVar = (crs) obj;
        return crsVar.a == this.a && crsVar.b == this.b && crsVar.c == this.c && crsVar.d == this.d;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + a.g(this.c)) * 31) + this.d;
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ",deviceId=" + this.d + ")";
    }
}
