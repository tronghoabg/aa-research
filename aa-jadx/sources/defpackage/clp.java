package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class clp {
    public final java.lang.String a;
    public final long b;
    public final int c;

    public clp(java.lang.String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public float c(float f, float f2, float f3) {
        throw null;
    }

    public long d(float f, float f2, float f3) {
        throw null;
    }

    public long e(float f, float f2, float f3, float f4, defpackage.clp clpVar) {
        throw null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.clp clpVar = (defpackage.clp) obj;
            if (this.c == clpVar.c && defpackage.afga.f(this.a, clpVar.a) && this.b == clpVar.b) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + ((int) (this.b ^ 3))) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return this.a + " (id=" + this.c + ", model=" + defpackage.clo.a(this.b) + ")";
    }
}
