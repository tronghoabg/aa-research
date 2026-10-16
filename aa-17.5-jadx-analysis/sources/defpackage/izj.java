package defpackage;

import android.os.Build;
import android.os.IBinder;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class izj {
    public final /* synthetic */ Object a;

    public izj(Object obj) {
        this.a = obj;
    }

    public final void A(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.B(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public final void B(mo moVar) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.n.aS(moVar.a, recyclerView.e);
    }

    public final void C(mo moVar, etz etzVar, etz etzVar2) {
        moVar.n(false);
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.E.j(moVar, etzVar, etzVar2)) {
            recyclerView.S();
        }
    }

    public final void D(mo moVar, etz etzVar, etz etzVar2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.e.l(moVar);
        recyclerView.t(moVar);
        moVar.n(false);
        if (recyclerView.E.l(moVar, etzVar, etzVar2)) {
            recyclerView.S();
        }
    }

    public final void a(yzf yzfVar) {
        Object obj = this.a;
        ((izl) obj).s.aF(yze.PROTOCOL_IO_ERROR, yzfVar, "io error");
    }

    public final void b(ots otsVar) {
        irb irbVar = (irb) this.a;
        jfm jfmVar = irbVar.p;
        if (!jfmVar.a.isEmpty()) {
            byte[] bArrH = otsVar.h();
            woy.O(bArrH.length <= (Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536), "payload length");
            jfmVar.a(bArrH);
        }
        irbVar.y.q(otsVar);
    }

    public final void c(ouo ouoVar) {
        f(ouoVar, e());
    }

    public final void d(ouo ouoVar) {
        abnp abnpVarE = e();
        abnp abnpVarN = oup.a.n();
        abnpVarN.t();
        oup oupVar = (oup) abnpVarN.b;
        oupVar.b |= 1;
        oupVar.c = "AudioSourceService";
        abnpVarN.t();
        oup oupVar2 = (oup) abnpVarN.b;
        oupVar2.e = ouoVar.al;
        oupVar2.b |= 4;
        abnpVarN.t();
        oup oupVar3 = (oup) abnpVarN.b;
        oum oumVar = (oum) abnpVarE.q();
        oumVar.getClass();
        oupVar3.g = oumVar;
        oupVar3.b |= 16;
        ((iqc) this.a).k.B(abnpVarN);
    }

    public final abnp e() {
        int iA;
        abnp abnpVarN = oum.a.n();
        iqc iqcVar = (iqc) this.a;
        boolean z = iqcVar.f;
        abnpVarN.t();
        oum oumVar = (oum) abnpVarN.b;
        oumVar.b |= 1;
        oumVar.c = z;
        boolean z2 = iqcVar.e != null && ((ipw) iqcVar.e).i;
        abnpVarN.t();
        oum oumVar2 = (oum) abnpVarN.b;
        oumVar2.b |= 2;
        oumVar2.d = z2;
        boolean z3 = iqcVar.e != null && ((ipw) iqcVar.e).h;
        abnpVarN.t();
        oum oumVar3 = (oum) abnpVarN.b;
        oumVar3.b |= 4;
        oumVar3.e = z3;
        boolean z4 = iqcVar.h;
        abnpVarN.t();
        oum oumVar4 = (oum) abnpVarN.b;
        oumVar4.b |= 8;
        oumVar4.f = z4;
        int i = iqcVar.i.get();
        if (i != 0) {
            oul oulVarU = roc.U(i);
            abnpVarN.t();
            oum oumVar5 = (oum) abnpVarN.b;
            oumVar5.g = oulVarU.f;
            oumVar5.b |= 16;
        }
        iqa iqaVar = iqcVar.e == null ? null : ((ipw) iqcVar.e).k;
        if (iqaVar != null) {
            int i2 = iqaVar.c;
            yph yphVar = irb.a;
            ouh ouhVarM = roc.M(i2);
            abnpVarN.t();
            oum oumVar6 = (oum) abnpVarN.b;
            oumVar6.h = ouhVarM.f;
            oumVar6.b |= 32;
        }
        iqa iqaVar2 = (iqa) iqcVar.j.get();
        if (iqaVar2 != null) {
            int i3 = iqaVar2.c;
            yph yphVar2 = irb.a;
            ouh ouhVarM2 = roc.M(i3);
            abnpVarN.t();
            oum oumVar7 = (oum) abnpVarN.b;
            oumVar7.i = ouhVarM2.f;
            oumVar7.b |= 64;
        }
        if (iqcVar.e != null && (iA = ((ipw) iqcVar.e).f.a()) > 0) {
            abnpVarN.t();
            oum oumVar8 = (oum) abnpVarN.b;
            oumVar8.b |= 1024;
            oumVar8.m = iA;
        }
        return abnpVarN;
    }

    public final void f(ouo ouoVar, abnp abnpVar) {
        abnp abnpVarN = oup.a.n();
        abnpVarN.t();
        oup oupVar = (oup) abnpVarN.b;
        oupVar.b |= 1;
        oupVar.c = "AudioSourceService";
        abnpVarN.t();
        oup oupVar2 = (oup) abnpVarN.b;
        oupVar2.e = ouoVar.al;
        oupVar2.b |= 4;
        abnpVarN.t();
        oup oupVar3 = (oup) abnpVarN.b;
        oum oumVar = (oum) abnpVar.q();
        oumVar.getClass();
        oupVar3.g = oumVar;
        oupVar3.b |= 16;
        ((iqc) this.a).k.A(abnpVarN);
    }

    public final long g() {
        return ((cma) this.a).a();
    }

    public final void h(float f, float f2, float f3, float f4, int i) {
        ((cma) this.a).b().a(f, f2, f3, f4, i);
    }

    public final void i(float f, float f2, float f3, float f4) {
        cma cmaVar = (cma) this.a;
        cju cjuVarB = cmaVar.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (g() >> 32)) - (f3 + f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (g() & 4294967295L)) - (f4 + f2);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < BitmapDescriptorFactory.HUE_RED || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < BitmapDescriptorFactory.HUE_RED) {
            ckf.a("Width and height must be greater than or equal to zero");
        }
        cmaVar.h(jFloatToRawIntBits);
        cjuVarB.i(f, f2);
    }

    public final void j(float f, long j) {
        cju cjuVarB = ((cma) this.a).b();
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        cjuVarB.i(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        cjuVarB.f(f);
        cjuVarB.i(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i));
    }

    public final void k(float f, float f2, long j) {
        cju cjuVarB = ((cma) this.a).b();
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        cjuVarB.i(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        cjuVarB.h(f, f2);
        cjuVarB.i(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i));
    }

    public final void l(float f, float f2) {
        ((cma) this.a).b().i(f, f2);
    }

    public final void m(cjm cjmVar) {
        ((cma) this.a).b().q(cjmVar);
    }

    public final azs n(int i) {
        cec cecVar = (cec) cek.i.j();
        Object obj = this.a;
        afec afecVarI = cecVar != null ? cecVar.i() : null;
        cec cecVarI = byx.i(cecVar);
        try {
            axj axjVar = (axj) ((axr) obj).e.a();
            byx.l(cecVar, cecVarI, afecVarI);
            axr axrVar = (axr) this.a;
            return axrVar.l.a(i, axjVar.h, axrVar.c, new awf(7));
        } catch (Throwable th) {
            byx.l(cecVar, cecVarI, afecVarI);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd A[PHI: r19 r21
  0x00bd: PHI (r19v2 long) = (r19v1 long), (r19v5 long) binds: [B:52:0x00ea, B:41:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r21v1 float) = (r21v0 float), (r21v2 float) binds: [B:52:0x00ea, B:41:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012d A[PHI: r5
  0x012d: PHI (r5v7 float) = (r5v5 float), (r5v9 float) binds: [B:76:0x0157, B:65:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(long r24, int r26) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izj.o(long, int):long");
    }

    public final long p(long j) {
        aqk aqkVar = (aqk) this.a;
        return aqkVar.c(aqkVar.h, j, 1);
    }

    public final mo q(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iB = recyclerView.h.b();
        int i2 = 0;
        mo moVar = null;
        while (true) {
            if (i2 >= iB) {
                break;
            }
            mo moVarK = RecyclerView.k(recyclerView.h.e(i2));
            if (moVarK != null && !moVarK.v() && moVarK.c == i) {
                if (!recyclerView.h.k(moVarK.a)) {
                    moVar = moVarK;
                    break;
                }
                moVar = moVarK;
            }
            i2++;
        }
        if (moVar == null || recyclerView.h.k(moVar.a)) {
            return null;
        }
        return moVar;
    }

    public final void r(it itVar) {
        int i = itVar.a;
        if (i == 1) {
            ((RecyclerView) this.a).n.y(itVar.b, itVar.d);
            return;
        }
        if (i == 2) {
            ((RecyclerView) this.a).n.B(itVar.b, itVar.d);
            return;
        }
        if (i != 4) {
            if (i != 8) {
                return;
            }
            ((RecyclerView) this.a).n.A(itVar.b, itVar.d);
        } else {
            lz lzVar = ((RecyclerView) this.a).n;
            int i2 = itVar.b;
            int i3 = itVar.d;
            Object obj = itVar.c;
            lzVar.C(i2, i3);
        }
    }

    public final void s(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iB = recyclerView.h.b();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= iB) {
                break;
            }
            View viewE = recyclerView.h.e(i6);
            mo moVarK = RecyclerView.k(viewE);
            if (moVarK != null && !moVarK.A() && (i5 = moVarK.c) >= i && i5 < i3) {
                moVarK.f(2);
                moVarK.e(obj);
                ((ma) viewE.getLayoutParams()).e = true;
            }
            i6++;
        }
        me meVar = recyclerView.e;
        ArrayList arrayList = meVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.P = true;
                return;
            }
            mo moVar = (mo) arrayList.get(size);
            if (moVar != null && (i4 = moVar.c) >= i && i4 < i3) {
                moVar.f(2);
                meVar.h(size);
            }
        }
    }

    public final void t(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iB = recyclerView.h.b();
        for (int i3 = 0; i3 < iB; i3++) {
            mo moVarK = RecyclerView.k(recyclerView.h.e(i3));
            if (moVarK != null && !moVarK.A() && moVarK.c >= i) {
                moVarK.k(i2, false);
                recyclerView.N.f = true;
            }
        }
        ArrayList arrayList = recyclerView.e.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            mo moVar = (mo) arrayList.get(i4);
            if (moVar != null && moVar.c >= i) {
                moVar.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.O = true;
    }

    public final void u(int i, int i2) {
        int i3;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iB = recyclerView.h.b();
        int i4 = 0;
        while (true) {
            if (i4 >= iB) {
                break;
            }
            mo moVarK = RecyclerView.k(recyclerView.h.e(i4));
            if (moVarK != null) {
                int i5 = i < i2 ? i : i2;
                int i6 = moVarK.c;
                if (i6 >= i5) {
                    if (i6 <= (i < i2 ? i2 : i)) {
                        if (i6 == i) {
                            moVarK.k(i2 - i, false);
                        } else {
                            moVarK.k(i >= i2 ? 1 : -1, false);
                        }
                        recyclerView.N.f = true;
                    }
                }
            }
            i4++;
        }
        me meVar = recyclerView.e;
        int i7 = i < i2 ? i2 : i;
        int i8 = i < i2 ? i : i2;
        ArrayList arrayList = meVar.c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            mo moVar = (mo) arrayList.get(i9);
            if (moVar != null && (i3 = moVar.c) >= i8 && i3 <= i7) {
                if (i3 == i) {
                    moVar.k(i2 - i, false);
                } else {
                    moVar.k(i < i2 ? -1 : 1, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.O = true;
    }

    public final void v(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.P(i, i2, true);
        recyclerView.O = true;
        recyclerView.N.c += i2;
    }

    public final int w() {
        return ((RecyclerView) this.a).getChildCount();
    }

    public final int x(View view) {
        return ((RecyclerView) this.a).indexOfChild(view);
    }

    public final View y(int i) {
        return ((RecyclerView) this.a).getChildAt(i);
    }

    public final void z(View view) {
        mo moVarK = RecyclerView.k(view);
        if (moVarK != null) {
            ((RecyclerView) this.a).ar(moVarK, moVarK.o);
            moVarK.o = 0;
        }
    }

    public /* synthetic */ izj(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
