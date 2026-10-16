package defpackage;

/* loaded from: classes.dex */
public final class ksb {
    public final float a;
    public final long b;
    public final float c;
    public final float d;

    public ksb(float f, long j, float f2, float f3) {
        this.a = f;
        this.b = j;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksb)) {
            return false;
        }
        ksb ksbVar = (ksb) obj;
        return Float.compare(this.a, ksbVar.a) == 0 && a.j(this.b, ksbVar.b) && dlj.c(this.c, ksbVar.c) && dlj.c(this.d, ksbVar.d);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + a.g(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        float f = this.d;
        float f2 = this.c;
        return "ShadowProperty(alpha=" + this.a + ", offset=" + dlk.a(this.b) + ", radius=" + dlj.b(f2) + ", spread=" + dlj.b(f) + ")";
    }
}
