package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cno {
    public static int a;
    public static final java.lang.Object b;
    public static final defpackage.dai m;
    public final java.lang.String c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final defpackage.cou h;
    public final long i;
    public final int j;
    public final boolean k;
    public final int l;

    static {
        defpackage.dai daiVar = new defpackage.dai();
        m = daiVar;
        b = daiVar;
    }

    public cno(java.lang.String str, float f, float f2, float f3, float f4, defpackage.cou couVar, long j, int i, boolean z, int i2) {
        this.c = str;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = couVar;
        this.i = j;
        this.j = i;
        this.k = z;
        this.l = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cno)) {
            return false;
        }
        defpackage.cno cnoVar = (defpackage.cno) obj;
        return defpackage.afga.f(this.c, cnoVar.c) && java.lang.Float.compare(this.d, cnoVar.d) == 0 && java.lang.Float.compare(this.e, cnoVar.e) == 0 && this.f == cnoVar.f && this.g == cnoVar.g && defpackage.afga.f(this.h, cnoVar.h) && this.i == cnoVar.i && this.j == cnoVar.j && this.k == cnoVar.k;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.c.hashCode() * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + this.h.hashCode();
        int i = true != this.k ? 1237 : 1231;
        long j = this.i;
        return (((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.j) * 31) + i;
    }
}
