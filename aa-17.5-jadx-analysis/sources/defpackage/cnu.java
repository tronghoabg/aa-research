package defpackage;

/* loaded from: classes.dex */
public final class cnu extends cob {
    public final float a;
    public final float b;

    public cnu(float f, float f2) {
        super(false, false);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnu)) {
            return false;
        }
        cnu cnuVar = (cnu) obj;
        return Float.compare(this.a, cnuVar.a) == 0 && Float.compare(this.b, cnuVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "RelativeLineTo(dx=" + this.a + ", dy=" + this.b + ")";
    }
}
