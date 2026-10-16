package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class csb {
    public final float a;
    private final float b;
    private final long c;
    private final int d;

    public csb(float f, float f2, long j, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.csb)) {
            return false;
        }
        defpackage.csb csbVar = (defpackage.csb) obj;
        return csbVar.a == this.a && csbVar.b == this.b && csbVar.c == this.c && csbVar.d == this.d;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + defpackage.a.f(this.c)) * 31) + this.d;
    }

    public final java.lang.String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ",deviceId=" + this.d + ")";
    }
}
