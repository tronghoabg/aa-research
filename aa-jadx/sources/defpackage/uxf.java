package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uxf {
    final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final defpackage.uxd i;
    public final int j;
    public final int k;
    public final int l;

    public uxf(defpackage.uxd uxdVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f) {
        this.a = i;
        this.b = i5;
        this.c = i6;
        this.f = i3;
        this.g = i4;
        this.d = i7;
        this.e = i8;
        this.j = i9;
        this.k = i10;
        this.h = f;
        this.i = uxdVar;
        this.l = i2;
    }

    public final float a() {
        return this.e * this.h;
    }

    public final float b() {
        return this.d * this.h;
    }

    public final void c() {
        defpackage.uxd uxdVar = this.i;
        synchronized (uxdVar.a) {
            defpackage.aeje aejeVar = uxdVar.c;
            defpackage.ajmp ajmpVar = (defpackage.ajmp) aejeVar.h(this.a);
            ajmpVar.getClass();
            java.lang.Object obj = ajmpVar.b;
            defpackage.ysr.bj(obj == this);
            defpackage.ysr.bj(ajmpVar.a >= 0);
            int i = ajmpVar.a - 1;
            ajmpVar.a = i;
            if (i == 0) {
                aejeVar.b(((defpackage.uxf) obj).a);
                defpackage.uxe uxeVar = uxdVar.b;
                int i2 = ((defpackage.uxf) obj).l;
                if (i2 < 0) {
                    ((defpackage.ype) ((defpackage.ype) defpackage.uxe.a.g()).ai((char) 9727)).u("freeBlock - Invalid block pointer.");
                } else {
                    defpackage.utl utlVar = uxeVar.b;
                    defpackage.ysr.bj(i2 < utlVar.c());
                    defpackage.ysr.bj(i2 < utlVar.c());
                    int iE = utlVar.e(i2);
                    int iF = utlVar.f(i2);
                    int iD = utlVar.d(i2);
                    int iB = utlVar.b(i2);
                    int i3 = utlVar.j[iF];
                    boolean z = i3 >= 0;
                    defpackage.ysr.bj(z);
                    defpackage.ysr.bj(i3 < utlVar.j());
                    int i4 = utlVar.a;
                    int i5 = (iF * i4) + iE;
                    utlVar.d.clear(i5, i5 + iD);
                    utlVar.n(i2);
                    int i6 = utlVar.i(i3);
                    int i7 = i6 - iD;
                    utlVar.x(i3, i7);
                    utlVar.z(i3, i4);
                    if (i6 == i4) {
                        defpackage.ysr.bj(z);
                        defpackage.ysr.bj(i3 < utlVar.j());
                        defpackage.ysr.bj(utlVar.h(i3) != -1 || utlVar.i == i3);
                        int iH = utlVar.h(i3);
                        int iG = utlVar.g(i3);
                        if (i3 == utlVar.i) {
                            utlVar.i = iG;
                        }
                        if (iH != -1) {
                            utlVar.v(iH, iG);
                        }
                        if (iG != -1) {
                            utlVar.w(iG, iH);
                        }
                        utlVar.w(i3, -1);
                        utlVar.v(i3, -1);
                        if (i7 == 0) {
                            utlVar.m(i3, iB);
                        } else {
                            utlVar.l(i3, iB);
                        }
                    } else if (i7 == 0) {
                        utlVar.p(i3, iB);
                        utlVar.m(i3, iB);
                    }
                    utlVar.m--;
                }
                defpackage.uxb uxbVar = uxdVar.d;
                synchronized (uxbVar) {
                    boolean z2 = uxeVar.b() == 0;
                    int iF2 = uxeVar.f();
                    uxbVar.b = z2;
                    uxbVar.c = iF2;
                    uxbVar.a(this);
                }
            }
        }
    }
}
