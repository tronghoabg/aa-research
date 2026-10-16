package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jhm {
    public float a;
    public float b;
    public float c;
    public float d;
    public final defpackage.jhl e;

    public jhm(defpackage.jhl jhlVar, float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f4;
        this.c = f3;
        this.d = f2;
        this.e = jhlVar;
    }

    public final void a(int i, defpackage.jhm jhmVar) {
        if (i == 2) {
            this.a = java.lang.Math.max(jhmVar.c, this.a);
            return;
        }
        if (i == 4) {
            this.c = java.lang.Math.min(this.c, jhmVar.a);
        } else if (i == 8) {
            this.d = java.lang.Math.min(this.d, jhmVar.b);
        } else {
            if (i != 16) {
                return;
            }
            this.b = java.lang.Math.max(this.b, jhmVar.d);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.jhm)) {
            return false;
        }
        defpackage.jhm jhmVar = (defpackage.jhm) obj;
        return java.lang.Float.compare(jhmVar.a, this.a) == 0 && java.lang.Float.compare(jhmVar.b, this.b) == 0 && java.lang.Float.compare(jhmVar.c, this.c) == 0 && java.lang.Float.compare(jhmVar.d, this.d) == 0;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Float.valueOf(this.a), java.lang.Float.valueOf(this.b), java.lang.Float.valueOf(this.c), java.lang.Float.valueOf(this.d)});
    }

    public final java.lang.String toString() {
        return "ProjectionWindowBounds{name=" + this.e.F() + ", [left=" + this.a + ", top=" + this.d + " -  right=" + this.c + ", bottom=" + this.b + "]}";
    }
}
