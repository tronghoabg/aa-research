package defpackage;

/* loaded from: classes.dex */
public final class obi {
    public final cjm a;
    private final float b;
    private final float c;

    public obi(cjm cjmVar, float f, float f2) {
        this.a = cjmVar;
        this.b = f;
        this.c = f2;
    }

    public final float a(float f, float f2) {
        return Math.min(f / this.b, f2 / this.c);
    }

    public final long b(float f) {
        return (Float.floatToRawIntBits(this.c * f) & 4294967295L) | (Float.floatToRawIntBits(this.b * f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obi)) {
            return false;
        }
        obi obiVar = (obi) obj;
        return affa.f(this.a, obiVar.a) && dlj.c(this.b, obiVar.b) && dlj.c(this.c, obiVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        float f = this.c;
        return "PathSpec(path=" + this.a + ", viewportWidth=" + dlj.b(this.b) + ", viewportHeight=" + dlj.b(f) + ")";
    }
}
