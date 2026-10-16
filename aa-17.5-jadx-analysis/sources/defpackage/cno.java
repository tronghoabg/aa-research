package defpackage;

/* loaded from: classes.dex */
public final class cno extends cob {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public cno(float f, float f2, float f3, float f4) {
        super(false, true);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cno)) {
            return false;
        }
        cno cnoVar = (cno) obj;
        return Float.compare(this.a, cnoVar.a) == 0 && Float.compare(this.b, cnoVar.b) == 0 && Float.compare(this.c, cnoVar.c) == 0 && Float.compare(this.d, cnoVar.d) == 0;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "QuadTo(x1=" + this.a + ", y1=" + this.b + ", x2=" + this.c + ", y2=" + this.d + ")";
    }
}
