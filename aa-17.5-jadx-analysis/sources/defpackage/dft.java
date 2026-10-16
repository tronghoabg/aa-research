package defpackage;

import android.graphics.RectF;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class dft {
    public final dfs a;
    public final dfb b;
    public final long c;
    public final float d;
    public final float e;
    public final List f;

    public dft(dfs dfsVar, dfb dfbVar, long j) {
        this.a = dfsVar;
        this.b = dfbVar;
        this.c = j;
        boolean zIsEmpty = dfbVar.h.isEmpty();
        float fA = BitmapDescriptorFactory.HUE_RED;
        this.d = zIsEmpty ? 0.0f : ((dfd) dfbVar.h.get(0)).g.b(0);
        if (!dfbVar.h.isEmpty()) {
            dfd dfdVar = (dfd) woy.bK(dfbVar.h);
            fA = dfdVar.a(dfdVar.g.a());
        }
        this.e = fA;
        this.f = dfbVar.g;
    }

    public final float a(int i) {
        return this.b.a(i);
    }

    public final float b(int i) {
        dfb dfbVar = this.b;
        dfbVar.k(i);
        List list = dfbVar.h;
        dfd dfdVar = (dfd) list.get(das.f(list, i));
        den denVar = dfdVar.g;
        int iF = dfdVar.f(i);
        dgi dgiVar = denVar.b;
        return dgiVar.d.getLineLeft(iF) + (iF == dgiVar.e + (-1) ? dgiVar.g : BitmapDescriptorFactory.HUE_RED);
    }

    public final float c(int i) {
        dfb dfbVar = this.b;
        dfbVar.k(i);
        List list = dfbVar.h;
        dfd dfdVar = (dfd) list.get(das.f(list, i));
        den denVar = dfdVar.g;
        int iF = dfdVar.f(i);
        dgi dgiVar = denVar.b;
        return dgiVar.d.getLineRight(iF) + (iF == dgiVar.e + (-1) ? dgiVar.h : BitmapDescriptorFactory.HUE_RED);
    }

    public final float d(int i) {
        return this.b.b(i);
    }

    public final int e() {
        return this.b.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dft)) {
            return false;
        }
        dft dftVar = (dft) obj;
        return affa.f(this.a, dftVar.a) && affa.f(this.b, dftVar.b) && this.c == dftVar.c && this.d == dftVar.d && this.e == dftVar.e && affa.f(this.f, dftVar.f);
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
        return (((((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final int i(int i) {
        dfb dfbVar = this.b;
        dfbVar.k(i);
        List list = dfbVar.h;
        dfd dfdVar = (dfd) list.get(das.f(list, i));
        den denVar = dfdVar.g;
        return dfdVar.c(denVar.b.l(dfdVar.f(i)));
    }

    public final int j(long j) {
        return this.b.f(j);
    }

    public final long k(int i) {
        int iB;
        int iA;
        dfb dfbVar = this.b;
        dfbVar.j(i);
        dfd dfdVar = (dfd) dfbVar.h.get(i == dfbVar.h().a() ? dfbVar.h.size() - 1 : das.e(dfbVar.h, i));
        den denVar = dfdVar.g;
        int iE = dfdVar.e(i);
        dgp dgpVarN = denVar.b.n();
        if (dgpVarN.h(dgpVarN.b(iE))) {
            dgpVarN.c(iE);
            iB = iE;
            while (iB != -1) {
                if (dgpVarN.h(iB) && !dgpVarN.e(iB)) {
                    break;
                }
                iB = dgpVarN.b(iB);
            }
        } else {
            dgpVarN.c(iE);
            iB = dgpVarN.g(iE) ? (!dgpVarN.f(iE) || dgpVarN.d(iE)) ? dgpVarN.b(iE) : iE : dgpVarN.d(iE) ? dgpVarN.b(iE) : -1;
        }
        if (iB == -1) {
            iB = iE;
        }
        if (dgpVarN.e(dgpVarN.a(iE))) {
            dgpVarN.c(iE);
            iA = iE;
            while (iA != -1) {
                if (!dgpVarN.h(iA) && dgpVarN.e(iA)) {
                    break;
                }
                iA = dgpVarN.a(iA);
            }
        } else {
            dgpVarN.c(iE);
            iA = dgpVarN.d(iE) ? (!dgpVarN.f(iE) || dgpVarN.g(iE)) ? dgpVarN.a(iE) : iE : dgpVarN.g(iE) ? dgpVarN.a(iE) : -1;
        }
        if (iA != -1) {
            iE = iA;
        }
        long jT = czz.t(iB, iE);
        long j = dfv.a;
        return dfdVar.g(jT, false);
    }

    public final cjb l(int i) {
        float f;
        float f2;
        float fE;
        float fE2;
        dfb dfbVar = this.b;
        dfbVar.i(i);
        List list = dfbVar.h;
        dfd dfdVar = (dfd) list.get(das.e(list, i));
        den denVar = dfdVar.g;
        int iE = dfdVar.e(i);
        if (iE < 0 || iE >= denVar.c.length()) {
            dka.c("offset(" + iE + ") is out of bounds [0," + denVar.c.length() + ")");
        }
        dgi dgiVar = denVar.b;
        int i2 = iE + 1;
        int iK = dgiVar.k(iE);
        float fD = dgiVar.d(iK);
        float fB = dgiVar.b(iK);
        boolean z = dgiVar.m(iK) == 1;
        boolean zIsRtlCharAt = dgiVar.d.isRtlCharAt(iE);
        if (!z || zIsRtlCharAt) {
            if (z) {
                fE = dgiVar.f(iE, false);
                fE2 = dgiVar.f(i2, true);
            } else if (zIsRtlCharAt) {
                fE = dgiVar.e(iE, false);
                fE2 = dgiVar.e(i2, true);
            } else {
                f = dgiVar.f(iE, false);
                f2 = dgiVar.f(i2, true);
            }
            float f3 = fE2;
            f2 = fE;
            f = f3;
        } else {
            f = dgiVar.e(iE, false);
            f2 = dgiVar.e(i2, true);
        }
        RectF rectF = new RectF(f, fD, f2, fB);
        return dfdVar.h(new cjb(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final cjb m(int i) {
        dfb dfbVar = this.b;
        dfbVar.j(i);
        dfd dfdVar = (dfd) dfbVar.h.get(i == dfbVar.h().a() ? dfbVar.h.size() - 1 : das.e(dfbVar.h, i));
        den denVar = dfdVar.g;
        int iE = dfdVar.e(i);
        if (iE < 0 || iE > denVar.c.length()) {
            dka.c("offset(" + iE + ") is out of bounds [0," + denVar.c.length() + "]");
        }
        dgi dgiVar = denVar.b;
        float fE = dgiVar.e(iE, false);
        int iK = dgiVar.k(iE);
        return dfdVar.h(new cjb(fE, denVar.e(iK), fE, denVar.c(iK)));
    }

    public final dft n(dfs dfsVar, long j) {
        return new dft(dfsVar, this.b, j);
    }

    public final boolean o() {
        long j = this.c;
        dfb dfbVar = this.b;
        return ((float) ((int) (j >> 32))) < dfbVar.d || dfbVar.c || ((float) ((int) (j & 4294967295L))) < dfbVar.e;
    }

    public final int p(int i) {
        dfb dfbVar = this.b;
        dfbVar.j(i);
        dfd dfdVar = (dfd) dfbVar.h.get(i == dfbVar.h().a() ? dfbVar.h.size() - 1 : das.e(dfbVar.h, i));
        return dfdVar.g.b.p(dfdVar.e(i)) ? 2 : 1;
    }

    public final int q(int i) {
        dfb dfbVar = this.b;
        dfbVar.j(i);
        dfd dfdVar = (dfd) dfbVar.h.get(i == dfbVar.h().a() ? dfbVar.h.size() - 1 : das.e(dfbVar.h, i));
        den denVar = dfdVar.g;
        int iE = dfdVar.e(i);
        dgi dgiVar = denVar.b;
        return dgiVar.m(dgiVar.k(iE)) == 1 ? 1 : 2;
    }

    public final cjm r(int i, int i2) {
        dfb dfbVar = this.b;
        if (i < 0 || i > i2 || i2 > dfbVar.h().b.length()) {
            dka.c("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + dfbVar.h().b.length() + "), or start > end!");
        }
        byte[] bArr = null;
        if (i == i2) {
            return new cjm(bArr);
        }
        cjm cjmVar = new cjm(bArr);
        List list = dfbVar.h;
        long jT = czz.t(i, i2);
        long j = dfv.a;
        das.h(list, jT, new auv(cjmVar, i, i2, 4));
        return cjmVar;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + dlq.c(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
