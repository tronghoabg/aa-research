package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cou extends defpackage.dai implements java.lang.Iterable, defpackage.afhc {
    public final java.lang.String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final java.util.List i;
    public final java.util.List j;

    public cou(java.lang.String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, java.util.List list, java.util.List list2) {
        super(null);
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.cou)) {
            defpackage.cou couVar = (defpackage.cou) obj;
            return defpackage.afga.f(this.a, couVar.a) && this.b == couVar.b && this.c == couVar.c && this.d == couVar.d && this.e == couVar.e && this.f == couVar.f && this.g == couVar.g && this.h == couVar.h && defpackage.afga.f(this.i, couVar.i) && defpackage.afga.f(this.j, couVar.j);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<defpackage.dai> iterator() {
        return new defpackage.cot(this);
    }

    public cou() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, defpackage.cov.a, defpackage.afce.a);
    }
}
