package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class coy extends defpackage.dai {
    public final java.lang.String a;
    public final java.util.List b;
    public final int c;
    public final defpackage.cka d;
    public final float e;
    public final defpackage.cka f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public coy(java.lang.String str, java.util.List list, int i, defpackage.cka ckaVar, float f, defpackage.cka ckaVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = ckaVar;
        this.e = f;
        this.f = ckaVar2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.coy coyVar = (defpackage.coy) obj;
            return defpackage.afga.f(this.a, coyVar.a) && defpackage.afga.f(this.d, coyVar.d) && this.e == coyVar.e && defpackage.afga.f(this.f, coyVar.f) && this.g == coyVar.g && this.h == coyVar.h && this.i == coyVar.i && this.j == coyVar.j && this.k == coyVar.k && this.l == coyVar.l && this.m == coyVar.m && this.n == coyVar.n && this.c == coyVar.c && defpackage.afga.f(this.b, coyVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        defpackage.cka ckaVar = this.d;
        int iHashCode2 = ((((iHashCode * 31) + (ckaVar != null ? ckaVar.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31;
        defpackage.cka ckaVar2 = this.f;
        return ((((((((((((((((((iHashCode2 + (ckaVar2 != null ? ckaVar2.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + this.i) * 31) + this.j) * 31) + java.lang.Float.floatToIntBits(this.k)) * 31) + java.lang.Float.floatToIntBits(this.l)) * 31) + java.lang.Float.floatToIntBits(this.m)) * 31) + java.lang.Float.floatToIntBits(this.n)) * 31) + this.c;
    }
}
