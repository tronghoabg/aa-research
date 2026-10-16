package defpackage;

/* loaded from: classes.dex */
public final class cnv extends cob {
    public final float a;
    public final float b;

    public cnv(float f, float f2) {
        super(false, false);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnv)) {
            return false;
        }
        cnv cnvVar = (cnv) obj;
        return Float.compare(this.a, cnvVar.a) == 0 && Float.compare(this.b, cnvVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "RelativeMoveTo(dx=" + this.a + ", dy=" + this.b + ")";
    }
}
