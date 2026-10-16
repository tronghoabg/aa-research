package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cog extends defpackage.coj {
    public final float a;
    public final float b;

    public cog(float f, float f2) {
        super(false, true);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cog)) {
            return false;
        }
        defpackage.cog cogVar = (defpackage.cog) obj;
        return java.lang.Float.compare(this.a, cogVar.a) == 0 && java.lang.Float.compare(this.b, cogVar.b) == 0;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.a + ", dy=" + this.b + ")";
    }
}
