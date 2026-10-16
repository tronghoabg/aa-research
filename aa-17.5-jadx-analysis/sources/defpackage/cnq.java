package defpackage;

/* loaded from: classes.dex */
public final class cnq extends cob {
    public final float a;
    public final float b;

    public cnq(float f, float f2) {
        super(false, true);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnq)) {
            return false;
        }
        cnq cnqVar = (cnq) obj;
        return Float.compare(this.a, cnqVar.a) == 0 && Float.compare(this.b, cnqVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "ReflectiveQuadTo(x=" + this.a + ", y=" + this.b + ")";
    }
}
