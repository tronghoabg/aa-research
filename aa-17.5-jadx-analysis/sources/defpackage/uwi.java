package defpackage;

/* loaded from: classes3.dex */
public final class uwi {
    final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final uwg i;
    public final int j;
    public final int k;
    public final int l;

    public uwi(uwg uwgVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f) {
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
        this.i = uwgVar;
        this.l = i2;
    }

    public final float a() {
        return this.e * this.h;
    }

    public final float b() {
        return this.d * this.h;
    }

    public final void c() {
        uwg uwgVar = this.i;
        synchronized (uwgVar.a) {
            aeie aeieVar = uwgVar.c;
            ajlp ajlpVar = (ajlp) aeieVar.h(this.a);
            ajlpVar.getClass();
            Object obj = ajlpVar.b;
            woy.Z(obj == this);
            woy.Z(ajlpVar.a >= 0);
            int i = ajlpVar.a - 1;
            ajlpVar.a = i;
            if (i == 0) {
                aeieVar.b(((uwi) obj).a);
                uwh uwhVar = uwgVar.b;
                int i2 = ((uwi) obj).l;
                if (i2 < 0) {
                    ((ynz) ((ynz) uwh.a.g()).ai((char) 9699)).u("freeBlock - Invalid block pointer.");
                } else {
                    usp uspVar = uwhVar.b;
                    woy.Z(i2 < uspVar.c());
                    woy.Z(i2 < uspVar.c());
                    int iE = uspVar.e(i2);
                    int iF = uspVar.f(i2);
                    int iD = uspVar.d(i2);
                    int iB = uspVar.b(i2);
                    int i3 = uspVar.j[iF];
                    boolean z = i3 >= 0;
                    woy.Z(z);
                    woy.Z(i3 < uspVar.j());
                    int i4 = uspVar.a;
                    int i5 = (iF * i4) + iE;
                    uspVar.d.clear(i5, i5 + iD);
                    uspVar.n(i2);
                    int i6 = uspVar.i(i3);
                    int i7 = i6 - iD;
                    uspVar.x(i3, i7);
                    uspVar.z(i3, i4);
                    if (i6 == i4) {
                        woy.Z(z);
                        woy.Z(i3 < uspVar.j());
                        woy.Z(uspVar.h(i3) != -1 || uspVar.i == i3);
                        int iH = uspVar.h(i3);
                        int iG = uspVar.g(i3);
                        if (i3 == uspVar.i) {
                            uspVar.i = iG;
                        }
                        if (iH != -1) {
                            uspVar.v(iH, iG);
                        }
                        if (iG != -1) {
                            uspVar.w(iG, iH);
                        }
                        uspVar.w(i3, -1);
                        uspVar.v(i3, -1);
                        if (i7 == 0) {
                            uspVar.m(i3, iB);
                        } else {
                            uspVar.l(i3, iB);
                        }
                    } else if (i7 == 0) {
                        uspVar.p(i3, iB);
                        uspVar.m(i3, iB);
                    }
                    uspVar.m--;
                }
                uwe uweVar = uwgVar.d;
                synchronized (uweVar) {
                    boolean z2 = uwhVar.b() == 0;
                    int iF2 = uwhVar.f();
                    uweVar.b = z2;
                    uweVar.c = iF2;
                    uweVar.a(this);
                }
            }
        }
    }
}
