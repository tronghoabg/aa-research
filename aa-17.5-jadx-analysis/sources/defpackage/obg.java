package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class obg implements ctp {
    public static final obg a = new obg(1);
    private final /* synthetic */ int b;

    public obg(int i) {
        this.b = i;
    }

    public static final void f(cun cunVar, cuo cuoVar, int i, int i2) {
        cunVar.r(cuoVar, i2, afgi.k((i - cuoVar.b) / 2.0f), BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int a(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.u(this, csqVar, list, i) : tr.u(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int b(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.v(this, csqVar, list, i) : tr.v(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int c(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.w(this, csqVar, list, i) : tr.w(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int d(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.x(this, csqVar, list, i) : tr.x(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        cuo cuoVarV;
        Object obj;
        cuo cuoVarV2;
        Object obj2;
        int iK;
        int i = 0;
        if (this.b != 0) {
            return ctsVar.eK(dle.j(j) ? dle.b(j) : 0, dle.i(j) ? dle.a(j) : 0, afbf.a, new awf(0));
        }
        ctsVar.getClass();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            cto ctoVar = (cto) list.get(i2);
            if (affa.f(bzi.D(ctoVar), obf.a)) {
                int iA = dle.a(j);
                obi obiVar = oay.a;
                float f = iA / 13.0f;
                long jB = oay.a.b(f);
                int i3 = (int) (jB >> 32);
                int i4 = (int) (jB & 4294967295L);
                cuo cuoVarV3 = ctoVar.v(dle.l(afgi.k(Float.intBitsToFloat(i3)), afgi.k(Float.intBitsToFloat(i3)), afgi.k(Float.intBitsToFloat(i4)), afgi.k(Float.intBitsToFloat(i4))));
                int size2 = list.size();
                int i5 = 0;
                while (true) {
                    cuoVarV = null;
                    if (i5 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i5);
                    if (affa.f(bzi.D((cto) obj), obe.a)) {
                        break;
                    }
                    i5++;
                }
                cto ctoVar2 = (cto) obj;
                if (ctoVar2 != null) {
                    long jB2 = oay.b.b(f);
                    int iK2 = afgi.k(Float.intBitsToFloat((int) (jB2 >> 32)));
                    int iK3 = afgi.k(Float.intBitsToFloat((int) (jB2 & 4294967295L)));
                    cuoVarV2 = ctoVar2.v(dle.l(iK2, iK2, iK3, iK3));
                } else {
                    cuoVarV2 = null;
                }
                int size3 = list.size();
                while (true) {
                    if (i >= size3) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i);
                    if (bzi.D((cto) obj2) instanceof obd) {
                        break;
                    }
                    i++;
                }
                cto ctoVar3 = (cto) obj2;
                if (ctoVar3 != null) {
                    Object objD = bzi.D(ctoVar3);
                    objD.getClass();
                    long jD = ((obd) objD).a.d(f);
                    int iK4 = afgi.k(Float.intBitsToFloat((int) (jD >> 32)));
                    int iK5 = afgi.k(Float.intBitsToFloat((int) (jD & 4294967295L)));
                    cuoVarV = ctoVar3.v(dle.l(iK4, iK4, iK5, iK5));
                }
                cuo cuoVar = cuoVarV;
                int i6 = cuoVarV3.a;
                if (cuoVar == null) {
                    if (cuoVarV2 != null) {
                        iK = cuoVarV2.a + afgi.k(f);
                    }
                    return ctsVar.eK(i6, afgi.k(Float.intBitsToFloat(i4)), afbf.a, new obc(ctsVar, cuoVar, cuoVarV2, f, cuoVarV3, 0));
                }
                iK = afgi.j(cuoVar.a * 0.8d);
                i6 += iK;
                return ctsVar.eK(i6, afgi.k(Float.intBitsToFloat(i4)), afbf.a, new obc(ctsVar, cuoVar, cuoVarV2, f, cuoVarV3, 0));
            }
        }
        dlz.a("Collection contains no element matching the predicate.");
        throw new aezp();
    }
}
