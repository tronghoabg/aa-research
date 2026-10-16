package defpackage;

/* loaded from: classes.dex */
public final class cny extends cob {
    public final float a;
    public final float b;

    public cny(float f, float f2) {
        super(false, true);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cny)) {
            return false;
        }
        cny cnyVar = (cny) obj;
        return Float.compare(this.a, cnyVar.a) == 0 && Float.compare(this.b, cnyVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.a + ", dy=" + this.b + ")";
    }
}
