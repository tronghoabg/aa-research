package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dga {
    public final defpackage.dfz a;
    public final defpackage.dfi b;
    public final long c;
    public final float d;
    public final float e;
    public final java.util.List f;

    public dga(defpackage.dfz dfzVar, defpackage.dfi dfiVar, long j) {
        this.a = dfzVar;
        this.b = dfiVar;
        this.c = j;
        boolean zIsEmpty = dfiVar.h.isEmpty();
        float fA = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.d = zIsEmpty ? 0.0f : ((defpackage.dfk) dfiVar.h.get(0)).g.b(0);
        if (!dfiVar.h.isEmpty()) {
            defpackage.dfk dfkVar = (defpackage.dfk) defpackage.afga.aE(dfiVar.h);
            fA = dfkVar.a(dfkVar.g.a());
        }
        this.e = fA;
        this.f = dfiVar.g;
    }

    public final float a(int i) {
        return this.b.a(i);
    }

    public final float b(int i) {
        defpackage.dfi dfiVar = this.b;
        dfiVar.k(i);
        java.util.List list = dfiVar.h;
        defpackage.dfk dfkVar = (defpackage.dfk) list.get(defpackage.dai.v(list, i));
        defpackage.deu deuVar = dfkVar.g;
        int iF = dfkVar.f(i);
        defpackage.dgp dgpVar = deuVar.b;
        return dgpVar.d.getLineLeft(iF) + (iF == dgpVar.e + (-1) ? dgpVar.g : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    public final float c(int i) {
        defpackage.dfi dfiVar = this.b;
        dfiVar.k(i);
        java.util.List list = dfiVar.h;
        defpackage.dfk dfkVar = (defpackage.dfk) list.get(defpackage.dai.v(list, i));
        defpackage.deu deuVar = dfkVar.g;
        int iF = dfkVar.f(i);
        defpackage.dgp dgpVar = deuVar.b;
        return dgpVar.d.getLineRight(iF) + (iF == dgpVar.e + (-1) ? dgpVar.h : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    public final float d(int i) {
        return this.b.b(i);
    }

    public final int e() {
        return this.b.f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dga)) {
            return false;
        }
        defpackage.dga dgaVar = (defpackage.dga) obj;
        return defpackage.afga.f(this.a, dgaVar.a) && defpackage.afga.f(this.b, dgaVar.b) && this.c == dgaVar.c && this.d == dgaVar.d && this.e == dgaVar.e && defpackage.afga.f(this.f, dgaVar.f);
    }

    public final int f(int i, boolean z) {
        return this.b.c(i, z);
    }

    public final int g(int i) {
        return this.b.d(i);
    }

    public final int h(float f) {
        return this.b.e(f);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long j = this.c;
        return (((((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final int i(int i) {
        defpackage.dfi dfiVar = this.b;
        dfiVar.k(i);
        java.util.List list = dfiVar.h;
        defpackage.dfk dfkVar = (defpackage.dfk) list.get(defpackage.dai.v(list, i));
        defpackage.deu deuVar = dfkVar.g;
        return dfkVar.c(deuVar.b.l(dfkVar.f(i)));
    }

    public final int j(long j) {
        return this.b.f(j);
    }

    public final long k(int i) {
        int iB;
        int iA;
        defpackage.dfi dfiVar = this.b;
        dfiVar.j(i);
        defpackage.dfk dfkVar = (defpackage.dfk) dfiVar.h.get(i == dfiVar.h().a() ? dfiVar.h.size() - 1 : defpackage.dai.u(dfiVar.h, i));
        defpackage.deu deuVar = dfkVar.g;
        int iE = dfkVar.e(i);
        defpackage.dgw dgwVarN = deuVar.b.n();
        if (!dgwVarN.h(dgwVarN.b(iE))) {
            dgwVarN.c(iE);
            if (!dgwVarN.g(iE)) {
                if (!dgwVarN.d(iE)) {
                    iB = -1;
                    break;
                }
                iB = dgwVarN.b(iE);
            } else {
                iB = (!dgwVarN.f(iE) || dgwVarN.d(iE)) ? dgwVarN.b(iE) : iE;
            }
        } else {
            dgwVarN.c(iE);
            iB = iE;
            while (true) {
                if (iB == -1) {
                    iB = -1;
                    break;
                }
                if (dgwVarN.h(iB) && !dgwVarN.e(iB)) {
                    break;
                }
                iB = dgwVarN.b(iB);
            }
        }
        if (iB == -1) {
            iB = iE;
        }
        if (!dgwVarN.e(dgwVarN.a(iE))) {
            dgwVarN.c(iE);
            if (!dgwVarN.d(iE)) {
                if (!dgwVarN.g(iE)) {
                    iA = -1;
                    break;
                }
                iA = dgwVarN.a(iE);
            } else {
                iA = (!dgwVarN.f(iE) || dgwVarN.g(iE)) ? dgwVarN.a(iE) : iE;
            }
        } else {
            dgwVarN.c(iE);
            iA = iE;
            while (true) {
                if (iA == -1) {
                    iA = -1;
                    break;
                }
                if (!dgwVarN.h(iA) && dgwVarN.e(iA)) {
                    break;
                }
                iA = dgwVarN.a(iA);
            }
        }
        if (iA != -1) {
            iE = iA;
        }
        long jG = defpackage.dax.g(iB, iE);
        long j = defpackage.dgc.a;
        return dfkVar.g(jG, false);
    }

    public final defpackage.cjj l(int i) {
        float f;
        float f2;
        float fE;
        float fE2;
        defpackage.dfi dfiVar = this.b;
        dfiVar.i(i);
        java.util.List list = dfiVar.h;
        defpackage.dfk dfkVar = (defpackage.dfk) list.get(defpackage.dai.u(list, i));
        defpackage.deu deuVar = dfkVar.g;
        int iE = dfkVar.e(i);
        if (iE < 0 || iE >= deuVar.c.length()) {
            defpackage.dki.c("offset(" + iE + ") is out of bounds [0," + deuVar.c.length() + ")");
        }
        defpackage.dgp dgpVar = deuVar.b;
        int i2 = iE + 1;
        int iK = dgpVar.k(iE);
        float fD = dgpVar.d(iK);
        float fB = dgpVar.b(iK);
        boolean z = dgpVar.m(iK) == 1;
        boolean zIsRtlCharAt = dgpVar.d.isRtlCharAt(iE);
        if (!z || zIsRtlCharAt) {
            if (z) {
                fE = dgpVar.f(iE, false);
                fE2 = dgpVar.f(i2, true);
            } else if (zIsRtlCharAt) {
                fE = dgpVar.e(iE, false);
                fE2 = dgpVar.e(i2, true);
            } else {
                f = dgpVar.f(iE, false);
                f2 = dgpVar.f(i2, true);
            }
            float f3 = fE2;
            f2 = fE;
            f = f3;
        } else {
            f = dgpVar.e(iE, false);
            f2 = dgpVar.e(i2, true);
        }
        android.graphics.RectF rectF = new android.graphics.RectF(f, fD, f2, fB);
        return dfkVar.h(new defpackage.cjj(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final defpackage.cjj m(int i) {
        defpackage.dfi dfiVar = this.b;
        dfiVar.j(i);
        defpackage.dfk dfkVar = (defpackage.dfk) dfiVar.h.get(i == dfiVar.h().a() ? dfiVar.h.size() - 1 : defpackage.dai.u(dfiVar.h, i));
        defpackage.deu deuVar = dfkVar.g;
        int iE = dfkVar.e(i);
        if (iE < 0 || iE > deuVar.c.length()) {
            defpackage.dki.c("offset(" + iE + ") is out of bounds [0," + deuVar.c.length() + "]");
        }
        defpackage.dgp dgpVar = deuVar.b;
        float fE = dgpVar.e(iE, false);
        int iK = dgpVar.k(iE);
        return dfkVar.h(new defpackage.cjj(fE, deuVar.e(iK), fE, deuVar.c(iK)));
    }

    public final defpackage.dga n(defpackage.dfz dfzVar, long j) {
        return new defpackage.dga(dfzVar, this.b, j);
    }

    public final boolean o() {
        long j = this.c;
        defpackage.dfi dfiVar = this.b;
        return ((float) ((int) (j >> 32))) < dfiVar.d || dfiVar.c || ((float) ((int) (j & 4294967295L))) < dfiVar.e;
    }

    public final int p(int i) {
        defpackage.dfi dfiVar = this.b;
        dfiVar.j(i);
        defpackage.dfk dfkVar = (defpackage.dfk) dfiVar.h.get(i == dfiVar.h().a() ? dfiVar.h.size() - 1 : defpackage.dai.u(dfiVar.h, i));
        return dfkVar.g.b.q(dfkVar.e(i)) ? 2 : 1;
    }

    public final int q(int i) {
        defpackage.dfi dfiVar = this.b;
        dfiVar.j(i);
        defpackage.dfk dfkVar = (defpackage.dfk) dfiVar.h.get(i == dfiVar.h().a() ? dfiVar.h.size() - 1 : defpackage.dai.u(dfiVar.h, i));
        defpackage.deu deuVar = dfkVar.g;
        int iE = dfkVar.e(i);
        defpackage.dgp dgpVar = deuVar.b;
        return dgpVar.m(dgpVar.k(iE)) == 1 ? 1 : 2;
    }

    public final defpackage.cju r(int i, int i2) throws java.io.IOException {
        defpackage.dfi dfiVar = this.b;
        if (i < 0 || i > i2 || i2 > dfiVar.h().b.length()) {
            defpackage.dki.c("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + dfiVar.h().b.length() + "), or start > end!");
        }
        if (i == i2) {
            return new defpackage.cju((byte[]) null);
        }
        defpackage.cju cjuVar = new defpackage.cju((byte[]) null);
        java.util.List list = dfiVar.h;
        long jG = defpackage.dax.g(i, i2);
        long j = defpackage.dgc.a;
        defpackage.dai.x(list, jG, new defpackage.avb(cjuVar, i, i2, 4));
        return cjuVar;
    }

    public final java.lang.String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + defpackage.dly.c(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
