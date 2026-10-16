package defpackage;

/* loaded from: classes2.dex */
public final class hjk {
    public final float a;
    public final float b;

    public hjk(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjk)) {
            return false;
        }
        hjk hjkVar = (hjk) obj;
        return dlj.c(this.a, hjkVar.a) && dlj.c(this.b, hjkVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        float f = this.b;
        return "TypographySize(fontSize=" + dlj.b(this.a) + ", lineHeight=" + dlj.b(f) + ")";
    }
}
