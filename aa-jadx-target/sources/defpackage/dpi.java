package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dpi extends defpackage.dpf {
    public int f;
    final defpackage.dph g;
    private defpackage.dpj[] h;
    private defpackage.dpj[] i;

    public dpi(defpackage.lam lamVar) {
        super(lamVar);
        this.h = new defpackage.dpj[128];
        this.i = new defpackage.dpj[128];
        this.f = 0;
        this.g = new defpackage.dph(this);
    }

    @Override // defpackage.dpf
    public final void d(defpackage.dpg dpgVar, defpackage.dpf dpfVar, boolean z) {
        defpackage.dpj dpjVar = dpfVar.a;
        if (dpjVar == null) {
            return;
        }
        defpackage.dpe dpeVar = dpfVar.e;
        int i = dpeVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dpj dpjVarD = dpeVar.d(i2);
            float fB = dpeVar.b(i2);
            defpackage.dph dphVar = this.g;
            dphVar.a = dpjVarD;
            if (dphVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = dphVar.a.i;
                    float f = fArr[i3] + (dpjVar.i[i3] * fB);
                    fArr[i3] = f;
                    if (java.lang.Math.abs(f) < 1.0E-4f) {
                        dphVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    dphVar.b.m(dphVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = dpjVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fB;
                        if (java.lang.Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        dphVar.a.i[i4] = f3;
                    } else {
                        dphVar.a.i[i4] = 0.0f;
                    }
                }
                l(dpjVarD);
            }
            this.b += dpfVar.b * fB;
        }
        m(dpjVar);
    }

    @Override // defpackage.dpf
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.dpf
    public final defpackage.dpj k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            defpackage.dpj[] dpjVarArr = this.h;
            defpackage.dpj dpjVar = dpjVarArr[i2];
            if (!zArr[dpjVar.c]) {
                defpackage.dph dphVar = this.g;
                dphVar.a = dpjVar;
                int i3 = 8;
                if (i != -1) {
                    defpackage.dpj dpjVar2 = dpjVarArr[i];
                    while (i3 >= 0) {
                        float f = dpjVar2.i[i3];
                        float f2 = dphVar.a.i[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = dphVar.a.i[i3];
                            if (f3 <= 0.0f) {
                                if (f3 < 0.0f) {
                                    i = i2;
                                    break;
                                }
                                i3--;
                            }
                        }
                        i = -1;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void l(defpackage.dpj dpjVar) {
        int i;
        defpackage.dpj[] dpjVarArr;
        int i2 = this.f + 1;
        defpackage.dpj[] dpjVarArr2 = this.h;
        int length = dpjVarArr2.length;
        if (i2 > length) {
            defpackage.dpj[] dpjVarArr3 = (defpackage.dpj[]) java.util.Arrays.copyOf(dpjVarArr2, length + length);
            this.h = dpjVarArr3;
            int length2 = dpjVarArr3.length;
            this.i = (defpackage.dpj[]) java.util.Arrays.copyOf(dpjVarArr3, length2 + length2);
        }
        defpackage.dpj[] dpjVarArr4 = this.h;
        int i3 = this.f;
        dpjVarArr4[i3] = dpjVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && dpjVarArr4[i3].c > dpjVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                dpjVarArr = this.i;
                if (i5 >= i) {
                    break;
                }
                dpjVarArr[i5] = this.h[i5];
                i5++;
            }
            java.util.Arrays.sort(dpjVarArr, 0, i, new cjd(5));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        dpjVar.b = true;
        dpjVar.a(this);
    }

    public final void m(defpackage.dpj dpjVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == dpjVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i >= i2) {
                        this.f = i2;
                        dpjVar.b = false;
                        return;
                    } else {
                        defpackage.dpj[] dpjVarArr = this.h;
                        int i3 = i + 1;
                        dpjVarArr[i] = dpjVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.dpf
    public final java.lang.String toString() {
        java.lang.String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            defpackage.dpj dpjVar = this.h[i];
            defpackage.dph dphVar = this.g;
            dphVar.a = dpjVar;
            str = str + java.lang.String.valueOf(dphVar) + " ";
        }
        return str;
    }
}
