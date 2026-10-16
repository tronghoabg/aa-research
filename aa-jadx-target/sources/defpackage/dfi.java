package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dfi {
    public final defpackage.dfj a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final java.util.List g;
    public final java.util.List h;

    public dfi(defpackage.dfj dfjVar, long j, int i, int i2) {
        boolean z;
        int iA;
        this.a = dfjVar;
        this.b = i;
        if (defpackage.dlm.d(j) != 0 || defpackage.dlm.c(j) != 0) {
            defpackage.dki.c("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = dfjVar.c;
        int size = list.size();
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z = false;
                break;
            }
            defpackage.dfl dflVar = (defpackage.dfl) list.get(i4);
            defpackage.dfm dfmVar = dflVar.a;
            int iB = defpackage.dlm.b(j);
            if (defpackage.dlm.g(j)) {
                iA = defpackage.dlm.a(j) - ((int) java.lang.Math.ceil(f));
                if (iA < 0) {
                    iA = 0;
                }
            } else {
                iA = defpackage.dlm.a(j);
            }
            defpackage.deu deuVar = new defpackage.deu((defpackage.dew) dfmVar, this.b - i3, i2, defpackage.dln.d(0, iB, 0, iA));
            float f2 = deuVar.d + f;
            int iH = i3 + deuVar.h();
            arrayList.add(new defpackage.dfk(deuVar, dflVar.b, dflVar.c, i3, iH, f, f2));
            z = true;
            if (!deuVar.k()) {
                if (iH == this.b) {
                    java.util.List list2 = this.a.c;
                    list2.getClass();
                    if (i4 != list2.size() - 1) {
                    }
                }
                i4++;
                i3 = iH;
                f = f2;
            }
            i3 = iH;
            f = f2;
            break;
        }
        this.e = f;
        this.f = i3;
        this.c = z;
        this.h = arrayList;
        this.d = defpackage.dlm.b(j);
        java.util.List arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            defpackage.dfk dfkVar = (defpackage.dfk) arrayList.get(i5);
            java.util.List list3 = dfkVar.g.e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list3.size());
            int size3 = list3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                defpackage.cjj cjjVar = (defpackage.cjj) list3.get(i6);
                arrayList3.add(cjjVar != null ? dfkVar.h(cjjVar) : null);
            }
            defpackage.afga.bk(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList2.size();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = defpackage.afga.aS(arrayList2, arrayList4);
        }
        this.g = arrayList2;
    }

    public final float a(int i) {
        k(i);
        java.util.List list = this.h;
        defpackage.dfk dfkVar = (defpackage.dfk) list.get(defpackage.dai.v(list, i));
        return dfkVar.a(dfkVar.g.c(dfkVar.f(i)));
    }

    public final float b(int i) {
        k(i);
        java.util.List list = this.h;
        defpackage.dfk dfkVar = (defpackage.dfk) list.get(defpackage.dai.v(list, i));
        return dfkVar.a(dfkVar.g.e(dfkVar.f(i)));
    }

    public final int c(int i, boolean z) {
        int iJ;
        k(i);
        java.util.List list = this.h;
        defpackage.dfk dfkVar = (defpackage.dfk) list.get(defpackage.dai.v(list, i));
        defpackage.deu deuVar = dfkVar.g;
        int iF = dfkVar.f(i);
        if (z) {
            defpackage.dgp dgpVar = deuVar.b;
            java.lang.ThreadLocal threadLocal = defpackage.dgq.a;
            android.text.Layout layout = dgpVar.d;
            if (layout.getEllipsisCount(iF) <= 0 || dgpVar.b != android.text.TextUtils.TruncateAt.END) {
                defpackage.oln olnVarR = dgpVar.r();
                android.text.Layout layout2 = (android.text.Layout) olnVarR.c;
                iJ = olnVarR.h(layout2.getLineEnd(iF), layout2.getLineStart(iF));
            } else {
                iJ = layout.getLineStart(iF) + layout.getEllipsisStart(iF);
            }
        } else {
            iJ = deuVar.b.j(iF);
        }
        return dfkVar.c(iJ);
    }

    public final int d(int i) {
        int iU;
        if (i >= h().a()) {
            iU = this.h.size() - 1;
        } else {
            iU = i < 0 ? 0 : defpackage.dai.u(this.h, i);
        }
        defpackage.dfk dfkVar = (defpackage.dfk) this.h.get(iU);
        return dfkVar.d(dfkVar.g.b.k(dfkVar.e(i)));
    }

    public final int e(float f) {
        int lineForVertical;
        java.util.List list = this.h;
        defpackage.dfk dfkVar = (defpackage.dfk) list.get(defpackage.dai.w(list, f));
        if (dfkVar.b() == 0) {
            return dfkVar.c;
        }
        defpackage.deu deuVar = dfkVar.g;
        float f2 = f - dfkVar.e;
        defpackage.dgp dgpVar = deuVar.b;
        int i = dgpVar.e;
        if (i <= 0) {
            lineForVertical = 0;
        } else {
            int i2 = i - 1;
            lineForVertical = dgpVar.d.getLineForVertical(((int) (f2 + 0.0f)) - dgpVar.f);
            if (lineForVertical > i2) {
                lineForVertical = i2;
            }
        }
        return dfkVar.d(lineForVertical);
    }

    public final int f(long j) {
        java.util.List list = this.h;
        int i = (int) (j & 4294967295L);
        defpackage.dfk dfkVar = (defpackage.dfk) list.get(defpackage.dai.w(list, java.lang.Float.intBitsToFloat(i)));
        if (dfkVar.b() == 0) {
            return dfkVar.a;
        }
        defpackage.deu deuVar = dfkVar.g;
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i) - dfkVar.e)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32)))) << 32);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) + 0.0f;
        defpackage.dgp dgpVar = deuVar.b;
        int i2 = dgpVar.f;
        android.text.Layout layout = dgpVar.d;
        int lineForVertical = layout.getLineForVertical(((int) fIntBitsToFloat) - i2);
        return dfkVar.c(lineForVertical >= deuVar.h() ? dgpVar.o().length() : layout.getOffsetForHorizontal(lineForVertical, java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) + (-dgpVar.a(lineForVertical))));
    }

    public final long g(defpackage.cjj cjjVar, int i, defpackage.dfy dfyVar) {
        java.util.List list = this.h;
        int iW = defpackage.dai.w(list, cjjVar.c);
        float f = ((defpackage.dfk) list.get(iW)).f;
        float f2 = cjjVar.e;
        if (f >= f2 || iW == list.size() - 1) {
            defpackage.dfk dfkVar = (defpackage.dfk) list.get(iW);
            return dfkVar.g(dfkVar.g.i(dfkVar.i(cjjVar), i, dfyVar), true);
        }
        int iW2 = defpackage.dai.w(list, f2);
        long j = defpackage.dgc.a;
        long jG = j;
        while (jG == j && iW <= iW2) {
            defpackage.dfk dfkVar2 = (defpackage.dfk) list.get(iW);
            jG = dfkVar2.g(dfkVar2.g.i(dfkVar2.i(cjjVar), i, dfyVar), true);
            iW++;
        }
        if (jG == j) {
            return j;
        }
        long jG2 = j;
        while (jG2 == j && iW <= iW2) {
            defpackage.dfk dfkVar3 = (defpackage.dfk) list.get(iW2);
            jG2 = dfkVar3.g(dfkVar3.g.i(dfkVar3.i(cjjVar), i, dfyVar), true);
            iW2--;
        }
        return jG2 == j ? jG : defpackage.dax.g((int) (jG >> 32), (int) (4294967295L & jG2));
    }

    public final defpackage.dfb h() {
        return this.a.a;
    }

    public final void i(int i) {
        if (i < 0 || i >= h().b.length()) {
            defpackage.dki.c("offset(" + i + ") is out of bounds [0, " + h().a() + ")");
        }
    }

    public final void j(int i) {
        if (i < 0 || i > h().b.length()) {
            defpackage.dki.c("offset(" + i + ") is out of bounds [0, " + h().a() + "]");
        }
    }

    public final void k(int i) {
        if (i < 0 || i >= this.f) {
            defpackage.dki.c("lineIndex(" + i + ") is out of bounds [0, " + this.f + ")");
        }
    }

    public final void l(long j, float[] fArr) throws java.io.IOException {
        long j2 = defpackage.dgc.a;
        int i = (int) (j >> 32);
        int i2 = (int) (4294967295L & j);
        i(java.lang.Math.min(i, i2));
        j(java.lang.Math.max(i, i2));
        defpackage.afgt afgtVar = new defpackage.afgt();
        afgtVar.a = 0;
        defpackage.dai.x(this.h, j, new defpackage.dfh(j, fArr, afgtVar, new afgs(), 0));
    }

    public final void m(defpackage.ckc ckcVar, long j, defpackage.clc clcVar, defpackage.dlc dlcVar, defpackage.dai daiVar) {
        ckcVar.g();
        java.util.List list = this.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.deu deuVar = ((defpackage.dfk) list.get(i)).g;
            deuVar.l(ckcVar, j, clcVar, dlcVar, daiVar);
            ckcVar.i(0.0f, deuVar.d);
        }
        ckcVar.e();
    }
}
