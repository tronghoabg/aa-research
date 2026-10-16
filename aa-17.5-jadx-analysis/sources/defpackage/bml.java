package defpackage;

import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class bml implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bml(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [dlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [afdr, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) throws Throwable {
        boolean z;
        float f;
        long j;
        int i = this.b;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        switch (i) {
            case 0:
                return a.ak((cuo) this.a, (cun) obj);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                View view = (View) entry.getValue();
                int[] iArr = ebm.a;
                return Boolean.valueOf(woy.cn(this.a, view.getTransitionName()));
            case 2:
                ((dec) obj).a(ddx.d, this.a);
                return afak.a;
            case 3:
                dec decVar = (dec) obj;
                int i2 = boc.a;
                daq.d(decVar, (String) this.a);
                daq.g(decVar, 5);
                return afak.a;
            case 4:
                dec decVar2 = (dec) obj;
                aen aenVar = boz.a;
                Object objInvoke = this.a.invoke();
                Float f3 = (Float) (true != Float.isNaN(((Number) objInvoke).floatValue()) ? objInvoke : null);
                daq.f(decVar2, new ddn(f3 != null ? f3.floatValue() : 0.0f, new afgw(BitmapDescriptorFactory.HUE_RED, 1.0f)));
                return afak.a;
            case 5:
                Object obj2 = this.a;
                bqb bqbVar = bqb.a;
                return a.ak((cuo) obj2, (cun) obj);
            case 6:
                float fFloatValue = ((Float) obj).floatValue();
                bqj bqjVar = (bqj) this.a;
                afgw afgwVar = bqjVar.h;
                float f4 = bqh.a;
                float fD = afpt.d(fFloatValue, ((Number) afgwVar.d()).floatValue(), ((Number) afgwVar.c()).floatValue());
                if (fD == bqjVar.c()) {
                    z = false;
                } else {
                    if (fD != bqjVar.c()) {
                        afec afecVar = bqjVar.b;
                        if (afecVar != null) {
                            afecVar.invoke(Float.valueOf(fD));
                        } else {
                            bqjVar.j(fD);
                        }
                    }
                    afdr afdrVar = bqjVar.a;
                    if (afdrVar != null) {
                        afdrVar.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                Float f5 = (Float) obj;
                float fFloatValue2 = f5.floatValue();
                float f6 = bqh.a;
                bqj bqjVar2 = (bqj) this.a;
                afec afecVar2 = bqjVar2.b;
                if (afecVar2 != null) {
                    afecVar2.invoke(f5);
                } else {
                    bqjVar2.j(fFloatValue2);
                }
                return afak.a;
            case 8:
                long j2 = ((dlq) obj).a;
                float f7 = bqh.a;
                bqj bqjVar3 = (bqj) this.a;
                bqjVar3.k.h((int) (j2 >> 32));
                bqjVar3.l.h((int) (j2 & 4294967295L));
                return afak.a;
            case 9:
                bqj bqjVar4 = (bqj) this.a;
                bqjVar4.g(BitmapDescriptorFactory.HUE_RED);
                bqjVar4.g.invoke();
                return afak.a;
            case 10:
                ((Float) obj).floatValue();
                return Float.valueOf(this.a.eA(56.0f));
            case 11:
                return new sx((bqr) obj, (afec) this.a);
            case 12:
                return new dlo(((dlg) obj).eF(((dlj) this.a.a()).a) << 32);
            case 13:
                dec decVar3 = (dec) obj;
                aec aecVar = bsc.a;
                Object objInvoke2 = this.a.invoke();
                Float f8 = (Float) (true != Float.isNaN(((Number) objInvoke2).floatValue()) ? objInvoke2 : null);
                float fFloatValue3 = f8 != null ? f8.floatValue() : 0.0f;
                if (fFloatValue3 < BitmapDescriptorFactory.HUE_RED) {
                    fFloatValue3 = 0.0f;
                }
                if (fFloatValue3 > 1.0f) {
                    fFloatValue3 = 1.0f;
                }
                daq.f(decVar3, new ddn(fFloatValue3, new afgw(BitmapDescriptorFactory.HUE_RED, 1.0f)));
                return afak.a;
            case 14:
                ((bsm) this.a).j.h(((Number) ((adu) obj).d()).floatValue() % 1.0f);
                return afak.a;
            case 15:
                Object obj3 = this.a;
                cxd cxdVar = (cxd) obj;
                bsm bsmVar = (bsm) obj3;
                adu aduVar = bsmVar.h;
                float fFloatValue4 = aduVar != null ? ((Number) aduVar.d()).floatValue() : 0.0f;
                bsy bsyVar = bsmVar.i;
                bsyVar.a(cxdVar.o(), cxdVar.eA(bsmVar.f), ((bsr) obj3).h(), fFloatValue4, fFloatValue4 > BitmapDescriptorFactory.HUE_RED ? bsmVar.j.e() : 0.0f, cxdVar.eA(bsmVar.e), bsmVar.c, bsmVar.d);
                f = cxdVar.p() == dlr.a ? 0.0f : 180.0f;
                long jN = cxdVar.n();
                cma cmaVarR = cxdVar.r();
                long jA = cmaVarR.a();
                cmaVarR.b().g();
                try {
                    cmaVarR.c.j(f, jN);
                    j = jA;
                    try {
                        czz.aJ(cxdVar, bsyVar.b, ((bsm) obj3).b, ((bsm) obj3).d, 52);
                        cjm[] cjmVarArr = bsyVar.c;
                        if (cjmVarArr != null) {
                            for (cjm cjmVar : cjmVarArr) {
                                czz.aJ(cxdVar, cjmVar, ((bsm) obj3).a, ((bsm) obj3).c, 52);
                            }
                        }
                        float f9 = ((bsr) obj3).h()[1];
                        long jO = cxdVar.o();
                        float f10 = ((bsr) obj3).m;
                        float f11 = bsyVar.a;
                        cmg cmgVar = ((bsm) obj3).d;
                        long j3 = ((bsm) obj3).a;
                        float f12 = cmgVar.a;
                        float fMin = Math.min(f12, cxdVar.eA(f10));
                        int i3 = (int) (jO >> 32);
                        float fIntBitsToFloat = (Float.intBitsToFloat(i3) - fMin) - (fMin == f12 ? 0.0f : f12 / 4.0f);
                        float fIntBitsToFloat2 = (Float.intBitsToFloat(i3) * f9) + f11;
                        if (fIntBitsToFloat <= fIntBitsToFloat2) {
                            fMin = Math.max(BitmapDescriptorFactory.HUE_RED, fMin - (fIntBitsToFloat2 - fIntBitsToFloat));
                            fIntBitsToFloat = fIntBitsToFloat2;
                        }
                        if (fMin > BitmapDescriptorFactory.HUE_RED) {
                            if (a.Y(cmgVar.c, 1)) {
                                czz.aH(cxdVar, j3, fMin / 2.0f, (Float.floatToRawIntBits(fIntBitsToFloat + r6) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jO & 4294967295L)) / 2.0f) & 4294967295L), null, 120);
                            } else {
                                czz.I(cxdVar, j3, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (jO & 4294967295L)) - fMin) / 2.0f) & 4294967295L), (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMin) & 4294967295L), BitmapDescriptorFactory.HUE_RED, null, 120);
                            }
                        }
                        cmaVarR.b().e();
                        cmaVarR.h(j);
                        return afak.a;
                    } catch (Throwable th) {
                        th = th;
                        cmaVarR.b().e();
                        cmaVarR.h(j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = jA;
                }
            case 16:
                cgz cgzVar = (cgz) obj;
                Object obj4 = this.a;
                bsr bsrVar = (bsr) obj4;
                float fFloatValue5 = ((Number) bsrVar.k.invoke()).floatValue();
                if (fFloatValue5 < BitmapDescriptorFactory.HUE_RED) {
                    fFloatValue5 = 0.0f;
                }
                if (fFloatValue5 > 1.0f) {
                    fFloatValue5 = 1.0f;
                }
                float fFloatValue6 = ((Number) bsrVar.l.invoke(Float.valueOf(fFloatValue5))).floatValue();
                if (fFloatValue6 >= BitmapDescriptorFactory.HUE_RED) {
                    f2 = fFloatValue6;
                }
                ((bsm) obj4).f(f2 <= 1.0f ? f2 : 1.0f);
                return cgzVar.q(new bml(obj4, 15));
            case 17:
                Object obj5 = this.a;
                cxd cxdVar2 = (cxd) obj;
                bsm bsmVar2 = (bsm) obj5;
                adu aduVar2 = bsmVar2.h;
                float fFloatValue7 = aduVar2 != null ? ((Number) aduVar2.d()).floatValue() : 0.0f;
                bsy bsyVar2 = bsmVar2.i;
                long jO2 = cxdVar2.o();
                float fEA = cxdVar2.eA(bsmVar2.f);
                bsx bsxVar = (bsx) obj5;
                float[] fArr = bsxVar.p;
                fArr[0] = ((Number) bsxVar.l.invoke()).floatValue();
                fArr[1] = ((Number) bsxVar.k.invoke()).floatValue();
                fArr[2] = ((Number) bsxVar.n.invoke()).floatValue();
                fArr[3] = ((Number) bsxVar.m.invoke()).floatValue();
                bsyVar2.a(jO2, fEA, fArr, fFloatValue7, fFloatValue7 > BitmapDescriptorFactory.HUE_RED ? bsmVar2.j.e() : 0.0f, cxdVar2.eA(bsmVar2.e), bsmVar2.c, bsmVar2.d);
                f = cxdVar2.p() == dlr.a ? 0.0f : 180.0f;
                long jN2 = cxdVar2.n();
                cma cmaVarR2 = cxdVar2.r();
                long jA2 = cmaVarR2.a();
                cmaVarR2.b().g();
                try {
                    cmaVarR2.c.j(f, jN2);
                    czz.aJ(cxdVar2, bsyVar2.b, ((bsm) obj5).b, ((bsm) obj5).d, 52);
                    cjm[] cjmVarArr2 = bsyVar2.c;
                    if (cjmVarArr2 != null) {
                        for (cjm cjmVar2 : cjmVarArr2) {
                            czz.aJ(cxdVar2, cjmVar2, ((bsm) obj5).a, ((bsm) obj5).c, 52);
                        }
                    }
                    cmaVarR2.b().e();
                    cmaVarR2.h(jA2);
                    return afak.a;
                } catch (Throwable th3) {
                    cmaVarR2.b().e();
                    cmaVarR2.h(jA2);
                    throw th3;
                }
            case 18:
                Object obj6 = this.a;
                ((bsm) obj6).f(((bsx) obj6).o);
                return ((cgz) obj).q(new bml(obj6, 17));
            case 19:
                return Integer.valueOf(((bzg) this.a).d(bzi.h(((bwl) obj).g)));
            default:
                cgu cguVar = (cgu) obj;
                if (!cguVar.A) {
                    return cyy.b;
                }
                cgu cguVar2 = cguVar.d;
                afec afecVar3 = cguVar.a;
                cguVar.d = null;
                cgu cguVar3 = cguVar.d;
                return cyy.a;
        }
    }
}
