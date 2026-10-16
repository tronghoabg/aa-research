package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hjs {
    public final float a;
    public final float b;

    public hjs(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hjs)) {
            return false;
        }
        defpackage.hjs hjsVar = (defpackage.hjs) obj;
        return defpackage.dlr.c(this.a, hjsVar.a) && defpackage.dlr.c(this.b, hjsVar.b);
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        float f = this.b;
        return "TypographySize(fontSize=" + defpackage.dlr.b(this.a) + ", lineHeight=" + defpackage.dlr.b(f) + ")";
    }
}
