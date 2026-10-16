package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dfk {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final defpackage.deu g;

    public dfk(defpackage.deu deuVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.g = deuVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = f2;
    }

    public final float a(float f) {
        return f + this.e;
    }

    public final int b() {
        return this.b - this.a;
    }

    public final int c(int i) {
        return i + this.a;
    }

    public final int d(int i) {
        return i + this.c;
    }

    public final int e(int i) {
        int i2 = this.a;
        return defpackage.afqt.g(i, i2, this.b) - i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dfk)) {
            return false;
        }
        defpackage.dfk dfkVar = (defpackage.dfk) obj;
        return defpackage.afga.f(this.g, dfkVar.g) && this.a == dfkVar.a && this.b == dfkVar.b && this.c == dfkVar.c && this.d == dfkVar.d && java.lang.Float.compare(this.e, dfkVar.e) == 0 && java.lang.Float.compare(this.f, dfkVar.f) == 0;
    }

    public final int f(int i) {
        return i - this.c;
    }

    public final long g(long j, boolean z) {
        if (z) {
            long j2 = defpackage.dgc.a;
            if (j == j2) {
                return j2;
            }
        }
        long j3 = defpackage.dgc.a;
        return defpackage.dax.g(c((int) (j >> 32)), c((int) (j & 4294967295L)));
    }

    public final defpackage.cjj h(defpackage.cjj cjjVar) {
        return cjjVar.f(((long) java.lang.Float.floatToRawIntBits(this.e)) & 4294967295L);
    }

    public final int hashCode() {
        return (((((((((((this.g.hashCode() * 31) + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f);
    }

    public final defpackage.cjj i(defpackage.cjj cjjVar) {
        return cjjVar.f(((long) java.lang.Float.floatToRawIntBits(-this.e)) & 4294967295L);
    }

    public final java.lang.String toString() {
        return "ParagraphInfo(paragraph=" + this.g + ", startIndex=" + this.a + ", endIndex=" + this.b + ", startLineIndex=" + this.c + ", endLineIndex=" + this.d + ", top=" + this.e + ", bottom=" + this.f + ")";
    }
}
