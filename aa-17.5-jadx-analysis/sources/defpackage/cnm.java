package defpackage;

/* loaded from: classes.dex */
public final class cnm extends cob {
    public final float a;
    public final float b;

    public cnm(float f, float f2) {
        super(false, false);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnm)) {
            return false;
        }
        cnm cnmVar = (cnm) obj;
        return Float.compare(this.a, cnmVar.a) == 0 && Float.compare(this.b, cnmVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "LineTo(x=" + this.a + ", y=" + this.b + ")";
    }
}
