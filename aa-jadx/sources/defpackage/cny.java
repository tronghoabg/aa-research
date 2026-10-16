package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cny extends defpackage.coj {
    public final float a;
    public final float b;

    public cny(float f, float f2) {
        super(false, true);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cny)) {
            return false;
        }
        defpackage.cny cnyVar = (defpackage.cny) obj;
        return java.lang.Float.compare(this.a, cnyVar.a) == 0 && java.lang.Float.compare(this.b, cnyVar.b) == 0;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "ReflectiveQuadTo(x=" + this.a + ", y=" + this.b + ")";
    }
}
