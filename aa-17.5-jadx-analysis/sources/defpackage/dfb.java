package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dfb {
    public final dfc a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final List g;
    public final List h;

    public dfb(dfc dfcVar, long j, int i, int i2) {
        boolean z;
        int iA;
        this.a = dfcVar;
        this.b = i;
        if (dle.d(j) != 0 || dle.c(j) != 0) {
            dka.c("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List list = dfcVar.c;
        int size = list.size();
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (i4 < size) {
            dfe dfeVar = (dfe) list.get(i4);
            dff dffVar = dfeVar.a;
            int iB = dle.b(j);
            if (dle.g(j)) {
                iA = dle.a(j) - ((int) Math.ceil(f));
                if (iA < 0) {
                    iA = 0;
                }
            } else {
                iA = dle.a(j);
            }
            den denVar = new den((dep) dffVar, this.b - i3, i2, dlf.d(0, iB, 0, iA));
            float f2 = denVar.d + f;
            int iG = i3 + denVar.g();
            arrayList.add(new dfd(denVar, dfeVar.b, dfeVar.c, i3, iG, f, f2));
            z = true;
            if (!denVar.j()) {
                if (iG == this.b) {
                    this.a.c.getClass();
                    if (i4 != r6.size() - 1) {
                    }
                }
                i4++;
                i3 = iG;
                f = f2;
            }
            i3 = iG;
            f = f2;
            break;
        }
        z = false;
        this.e = f;
        this.f = i3;
        this.c = z;
        this.h = arrayList;
        this.d = dle.b(j);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            dfd dfdVar = (dfd) arrayList.get(i5);
            List list2 = dfdVar.g.e;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size3 = list2.size();
            for (int i6 = 0; i6 < size3; i6++) {
                cjb cjbVar = (cjb) list2.get(i6);
                arrayList3.add(cjbVar != null ? dfdVar.h(cjbVar) : null);
            }
            woy.cq(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = woy.bY(arrayList2, arrayList4);
        }
        this.g = arrayList2;
    }

    public final float a(int i) {
        k(i);
        List list = this.h;
        dfd dfdVar = (dfd) list.get(das.f(list, i));
        return dfdVar.a(dfdVar.g.c(dfdVar.f(i)));
    }

    public final float b(int i) {
        k(i);
        List list = this.h;
        dfd dfdVar = (dfd) list.get(das.f(list, i));
        return dfdVar.a(dfdVar.g.e(dfdVar.f(i)));
    }

    public final int c(int i, boolean z) {
        int iJ;
        k(i);
        List list = this.h;
        dfd dfdVar = (dfd) list.get(das.f(list, i));
        den denVar = dfdVar.g;
        int iF = dfdVar.f(i);
        if (z) {
            dgi dgiVar = denVar.b;
            ThreadLocal threadLocal = dgj.a;
            Layout layout = dgiVar.d;
            if (layout.getEllipsisCount(iF) <= 0 || dgiVar.b != TextUtils.TruncateAt.END) {
                okv okvVarQ = dgiVar.q();
                Layout layout2 = (Layout) okvVarQ.c;
                iJ = okvVarQ.h(layout2.getLineEnd(iF), layout2.getLineStart(iF));
            } else {
                iJ = layout.getLineStart(iF) + layout.getEllipsisStart(iF);
            }
        } else {
            iJ = denVar.b.j(iF);
        }
        return dfdVar.c(iJ);
    }

    public final int d(int i) {
        dfd dfdVar = (dfd) this.h.get(i >= h().a() ? this.h.size() - 1 : i < 0 ? 0 : das.e(this.h, i));
        return dfdVar.d(dfdVar.g.b.k(dfdVar.e(i)));
    }

    public final int e(float f) {
        int lineForVertical;
        List list = this.h;
        dfd dfdVar = (dfd) list.get(das.g(list, f));
        if (dfdVar.b() == 0) {
            return dfdVar.c;
        }
        den denVar = dfdVar.g;
        float f2 = f - dfdVar.e;
        dgi dgiVar = denVar.b;
        int i = dgiVar.e;
        if (i <= 0) {
            lineForVertical = 0;
        } else {
            int i2 = i - 1;
            lineForVertical = dgiVar.d.getLineForVertical(((int) (f2 + BitmapDescriptorFactory.HUE_RED)) - dgiVar.f);
            if (lineForVertical > i2) {
                lineForVertical = i2;
            }
        }
        return dfdVar.d(lineForVertical);
    }

    public final int f(long j) {
        List list = this.h;
        dfd dfdVar = (dfd) list.get(das.g(list, Float.intBitsToFloat((int) (j & 4294967295L))));
        if (dfdVar.b() == 0) {
            return dfdVar.a;
        }
        den denVar = dfdVar.g;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat(r2) - dfdVar.e) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) + BitmapDescriptorFactory.HUE_RED;
        dgi dgiVar = denVar.b;
        int i = dgiVar.f;
        Layout layout = dgiVar.d;
        int lineForVertical = layout.getLineForVertical(((int) fIntBitsToFloat) - i);
        return dfdVar.c(lineForVertical >= denVar.g() ? dgiVar.o().length() : layout.getOffsetForHorizontal(lineForVertical, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) + (-dgiVar.a(lineForVertical))));
    }

    public final long g(cjb cjbVar, int i, dfr dfrVar) {
        List list = this.h;
        int iG = das.g(list, cjbVar.c);
        float f = ((dfd) list.get(iG)).f;
        float f2 = cjbVar.e;
        if (f >= f2 || iG == list.size() - 1) {
            dfd dfdVar = (dfd) list.get(iG);
            return dfdVar.g(dfdVar.g.h(dfdVar.i(cjbVar), i, dfrVar), true);
        }
        int iG2 = das.g(list, f2);
        long j = dfv.a;
        long jG = j;
        while (jG == j && iG <= iG2) {
            dfd dfdVar2 = (dfd) list.get(iG);
            jG = dfdVar2.g(dfdVar2.g.h(dfdVar2.i(cjbVar), i, dfrVar), true);
            iG++;
        }
        if (jG == j) {
            return j;
        }
        long jG2 = j;
        while (jG2 == j && iG <= iG2) {
            dfd dfdVar3 = (dfd) list.get(iG2);
            jG2 = dfdVar3.g(dfdVar3.g.h(dfdVar3.i(cjbVar), i, dfrVar), true);
            iG2--;
        }
        return jG2 == j ? jG : czz.t((int) (jG >> 32), (int) (4294967295L & jG2));
    }

    public final deu h() {
        return this.a.a;
    }

    public final void i(int i) {
        if (i < 0 || i >= h().b.length()) {
            dka.c("offset(" + i + ") is out of bounds [0, " + h().a() + ")");
        }
    }

    public final void j(int i) {
        if (i < 0 || i > h().b.length()) {
            dka.c("offset(" + i + ") is out of bounds [0, " + h().a() + "]");
        }
    }

    public final void k(int i) {
        if (i < 0 || i >= this.f) {
            dka.c("lineIndex(" + i + ") is out of bounds [0, " + this.f + ")");
        }
    }

    public final void l(long j, float[] fArr) {
        long j2 = dfv.a;
        int i = (int) (j >> 32);
        int i2 = (int) (4294967295L & j);
        i(Math.min(i, i2));
        j(Math.max(i, i2));
        afft afftVar = new afft();
        afftVar.a = 0;
        das.h(this.h, j, new dfa(j, fArr, afftVar, new affs(), 0));
    }

    public final void m(cju cjuVar, long j, cku ckuVar, dku dkuVar, czz czzVar) {
        cjuVar.g();
        List list = this.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            den denVar = ((dfd) list.get(i)).g;
            denVar.k(cjuVar, j, ckuVar, dkuVar, czzVar);
            cjuVar.i(BitmapDescriptorFactory.HUE_RED, denVar.d);
        }
        cjuVar.e();
    }
}
