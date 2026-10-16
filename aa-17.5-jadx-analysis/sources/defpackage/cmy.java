package defpackage;

import android.graphics.BlurMaskFilter;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cmy extends cmw {
    private final ckv a;
    private final cmz b;
    private float c = 1.0f;
    private cjw d;
    private final coc e;

    public cmy(ckv ckvVar, cmz cmzVar, coc cocVar) {
        this.a = ckvVar;
        this.b = cmzVar;
        this.e = cocVar;
    }

    @Override // defpackage.cmw
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.cmw
    protected final void b(cmd cmdVar) {
        cna cnaVar;
        long j;
        cjw cjwVar;
        cjw cjwVar2;
        char c;
        cjj cjjVarY;
        cmz cmzVar = this.b;
        ckv ckvVar = this.a;
        long jO = cmdVar.o();
        dlr dlrVarP = cmdVar.p();
        coc cocVar = this.e;
        synchronized (cocVar) {
            Object obj = cocVar.b;
            if (obj == null) {
                cmx cmxVar = new cmx(ckq.a, 0L, dlr.a, 1.0f, null);
                cocVar.b = cmxVar;
                obj = cmxVar;
            }
            ((cmx) obj).a = ckvVar;
            ((cmx) obj).b = jO;
            ((cmx) obj).c = dlrVarP;
            ((cmx) obj).d = cmdVar.a();
            float f = cmzVar.a;
            float f2 = cmzVar.b;
            long j2 = cmzVar.e;
            float f3 = cmzVar.f;
            int i = cmzVar.d;
            ((cmx) obj).e = new cmz(f, f2, 0L, f3);
            cnaVar = (cna) cocVar.c().a(obj);
            if (cnaVar == null) {
                cnaVar = new cna(cmzVar, ckvVar.a(jO, dlrVarP, cmdVar));
                cocVar.c().m(new cmx(((cmx) obj).a, ((cmx) obj).b, ((cmx) obj).c, ((cmx) obj).d, ((cmx) obj).e), cnaVar);
            }
        }
        long j3 = cmzVar.c;
        float fEA = cmdVar.eA(Float.intBitsToFloat((int) (j3 >> 32)) + BitmapDescriptorFactory.HUE_RED);
        float f4 = -fEA;
        float fEA2 = cmdVar.eA(Float.intBitsToFloat((int) (j3 & 4294967295L)) + BitmapDescriptorFactory.HUE_RED);
        float f5 = -fEA2;
        cmdVar.r().c.l(fEA, fEA2);
        try {
            cjw cjwVar3 = this.d;
            long jO2 = cmdVar.o();
            cmz cmzVar2 = cnaVar.i;
            long j4 = cmzVar2.e;
            float fD = afpt.d(this.c * cmzVar2.f, BitmapDescriptorFactory.HUE_RED, 1.0f);
            int i2 = cmzVar2.d;
            ckm ckmVar = cnaVar.a;
            long j5 = 0;
            if (ckmVar instanceof ckj) {
                cnaVar.h = ((ckj) ckmVar).a;
                cnaVar.d = 0L;
            } else {
                if (ckmVar instanceof ckl) {
                    ckl cklVar = (ckl) ckmVar;
                    cjc cjcVar = cklVar.a;
                    if (byx.D(cjcVar)) {
                        cnaVar.h = null;
                        j5 = cjcVar.e;
                    } else {
                        cnaVar.h = cklVar.b;
                    }
                } else {
                    if (!(ckmVar instanceof ckk)) {
                        throw new aezs();
                    }
                    cnaVar.h = null;
                }
                cnaVar.d = j5;
            }
            if (cjwVar3 != null) {
                cjwVar = cjwVar3;
                j = 4294967295L;
            } else {
                cjw cjpVar = cnaVar.b;
                if (cjpVar != null) {
                    j = 4294967295L;
                    if (cnaVar.c != -72057594037927936L) {
                    }
                    cjwVar = cjpVar;
                } else {
                    j = 4294967295L;
                }
                cjpVar = new cjp(-72057594037927936L, 5);
                cnaVar.c = -72057594037927936L;
                cnaVar.b = cjpVar;
                cjwVar = cjpVar;
            }
            long j6 = cnaVar.e;
            if (j6 != 9205357640488583168L && j6 == jO2 && cnaVar.f == cmdVar.p() && cnaVar.g == cmdVar.a()) {
                cjwVar2 = cjwVar;
                c = ' ';
            } else {
                long j7 = cnaVar.d;
                cjm cjmVar = cnaVar.h;
                float fEA3 = cmdVar.eA(cmzVar2.a);
                float fEA4 = cmdVar.eA(cmzVar2.b);
                long j8 = jO2 & j;
                long j9 = jO2 >> 32;
                c = ' ';
                float f6 = fEA4 + fEA4;
                float f7 = fEA3 + fEA3 + f6;
                cjwVar2 = cjwVar;
                if (cjmVar != null) {
                    cjjVarY = czz.Y((int) Math.ceil(Float.intBitsToFloat((int) j9) + f7), (int) Math.ceil(Float.intBitsToFloat((int) j8) + f7), 1, 24);
                    cju cjuVarB = cjf.b(cjjVarY);
                    if (fEA4 > BitmapDescriptorFactory.HUE_RED) {
                        float f8 = fEA4 + fEA3;
                        cjuVarB.i(f8, f8);
                        cjk cjkVar = cnaVar.j;
                        czz.F(cjkVar, fEA3 > BitmapDescriptorFactory.HUE_RED ? new BlurMaskFilter(fEA3, BlurMaskFilter.Blur.NORMAL) : null, 0, 11);
                        cjuVarB.p(cjmVar, cjkVar);
                        czz.F(cjkVar, fEA3 > BitmapDescriptorFactory.HUE_RED ? new BlurMaskFilter(fEA3, BlurMaskFilter.Blur.NORMAL) : null, 1, 3);
                        cjkVar.q(f6);
                        cjuVarB.p(cjmVar, cjkVar);
                    } else {
                        cjk cjkVar2 = cnaVar.j;
                        czz.F(cjkVar2, fEA3 > BitmapDescriptorFactory.HUE_RED ? new BlurMaskFilter(fEA3, BlurMaskFilter.Blur.NORMAL) : null, 0, 11);
                        cjuVarB.i(fEA3, fEA3);
                        cjuVarB.p(cjmVar, cjkVar2);
                    }
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) j9) + f7;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) j8) + f7;
                    cjj cjjVarY2 = czz.Y((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), 1, 24);
                    cju cjuVarB2 = cjf.b(cjjVarY2);
                    float f9 = fIntBitsToFloat - fEA3;
                    float f10 = fIntBitsToFloat2 - fEA3;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j7 & j));
                    cjk cjkVar3 = cnaVar.j;
                    czz.F(cjkVar3, fEA3 > BitmapDescriptorFactory.HUE_RED ? new BlurMaskFilter(fEA3, BlurMaskFilter.Blur.NORMAL) : null, 0, 11);
                    cjuVarB2.m(fEA3, fEA3, f9, f10, fIntBitsToFloat3, fIntBitsToFloat4, cjkVar3);
                    cjjVarY = cjjVarY2;
                }
                cnaVar.k = cjjVarY;
                cnaVar.e = jO2;
                cnaVar.f = cmdVar.p();
                cnaVar.g = cmdVar.a();
            }
            cjj cjjVar = cnaVar.k;
            if (cjjVar != null) {
                float f11 = -(cmdVar.eA(cmzVar2.a) + cmdVar.eA(cmzVar2.b));
                czz.K(cmdVar, cjjVar, (Float.floatToRawIntBits(f11) << c) | (Float.floatToRawIntBits(f11) & j), fD, cjwVar2, 3, 8);
            }
        } finally {
            cmdVar.r().c.l(f4, f5);
        }
    }

    @Override // defpackage.cmw
    protected final boolean c(float f) {
        this.c = f;
        return true;
    }

    @Override // defpackage.cmw
    protected final boolean d(cjw cjwVar) {
        this.d = cjwVar;
        return true;
    }

    @Override // defpackage.cmw
    protected final void f(dlr dlrVar) {
    }
}
