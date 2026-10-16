package defpackage;

import android.os.Build;
import android.view.ViewParent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class dbj implements cyk {
    public afeg a;
    private cmi b;
    private final czq c;
    private afdr d;
    private boolean f;
    private float[] h;
    private boolean i;
    private int m;
    private ckm o;
    private boolean p;
    private boolean q;
    private boolean s;
    private final cji u;
    private long e = 9223372034707292159L;
    private final float[] g = cki.e();
    private dlg j = new dlh(1.0f, 1.0f);
    private dlr k = dlr.a;
    private final cmb l = new cmb();
    private long n = roc.aA(0.5f, 0.5f);
    private boolean r = true;
    private final afec t = new daz(this, 7);

    public dbj(cmi cmiVar, cji cjiVar, czq czqVar, afeg afegVar, afdr afdrVar) {
        this.b = cmiVar;
        this.u = cjiVar;
        this.c = czqVar;
        this.a = afegVar;
        this.d = afdrVar;
    }

    private final void n(boolean z) {
        if (z != this.i) {
            this.i = z;
            czq czqVar = this.c;
            if (!z) {
                if (czqVar.s) {
                    return;
                }
                czqVar.N.o(this);
                aag aagVar = czqVar.O;
                if (aagVar != null) {
                    aagVar.o(this);
                    return;
                }
                return;
            }
            if (!czqVar.s) {
                czqVar.N.p(this);
                return;
            }
            aag aagVar2 = czqVar.O;
            if (aagVar2 == null) {
                aagVar2 = new aag(16);
                czqVar.O = aagVar2;
            }
            aagVar2.p(this);
        }
    }

    private final void o() {
        czq czqVar = this.c;
        ViewParent parent = czqVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(czqVar, czqVar);
        }
    }

    private final float[] p() {
        float[] fArrE = this.h;
        if (fArrE == null) {
            fArrE = cki.e();
            this.h = fArrE;
        }
        if (this.q) {
            this.q = false;
            float[] fArrQ = q();
            if (this.r) {
                return fArrQ;
            }
            if (!daq.b(fArrQ, fArrE)) {
                fArrE[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrE[0])) {
            return null;
        }
        return fArrE;
    }

    private final float[] q() {
        if (this.p) {
            cmi cmiVar = this.b;
            long jA = cmiVar.s;
            if ((9223372034707292159L & jA) == 9205357640488583168L) {
                jA = byx.A(dln.k(this.e));
            }
            float[] fArr = this.g;
            cml cmlVar = cmiVar.a;
            int i = (int) (4294967295L & jA);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat(i);
            float fI = cmlVar.i();
            float fJ = cmlVar.j();
            float fC = cmlVar.c();
            float fD = cmlVar.d();
            float fE = cmlVar.e();
            float f = cmlVar.f();
            float fG = cmlVar.g();
            double d = fC * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f2 = fJ * fCos;
            float f3 = fJ * fSin;
            double d2 = fD * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = fI * fCos2;
            float f5 = -fI;
            double d3 = fE * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f6 = fSin * fSin2;
            float f7 = ((fCos3 * fCos2) + (fSin3 * f6)) * f;
            float f8 = fSin3 * fCos * f;
            float f9 = fSin * fCos2;
            float f10 = -fSin2;
            float f11 = ((fCos3 * f10) + (fSin3 * f9)) * f;
            float f12 = -fSin3;
            float f13 = ((f12 * fCos2) + (f6 * fCos3)) * fG;
            float f14 = fCos * fCos3 * fG;
            float f15 = ((f12 * f10) + (fCos3 * f9)) * fG;
            fArr[0] = f7;
            fArr[1] = f8;
            fArr[2] = f11;
            fArr[3] = 0.0f;
            fArr[4] = f13;
            fArr[5] = f14;
            fArr[6] = f15;
            fArr[7] = 0.0f;
            fArr[8] = fCos * fSin2;
            fArr[9] = -fSin;
            fArr[10] = fCos * fCos2;
            fArr[11] = 0.0f;
            float f16 = -fIntBitsToFloat;
            float f17 = f3 + (fCos * BitmapDescriptorFactory.HUE_RED);
            fArr[12] = ((f7 * f16) - (f13 * fIntBitsToFloat2)) + f4 + (f17 * fSin2) + fIntBitsToFloat;
            fArr[13] = ((f8 * f16) - (fIntBitsToFloat2 * f14)) + (f2 - (fSin * BitmapDescriptorFactory.HUE_RED)) + fIntBitsToFloat2;
            fArr[14] = ((f16 * f11) - (fIntBitsToFloat2 * f15)) + (f5 * fSin2) + (f17 * fCos2);
            fArr[15] = 1.0f;
            this.p = false;
            this.r = czz.X(fArr);
        }
        return this.g;
    }

    @Override // defpackage.cyk
    public final long a(long j, boolean z) {
        float[] fArrQ;
        if (z) {
            fArrQ = p();
            if (fArrQ == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrQ = q();
        }
        return this.r ? j : cki.a(fArrQ, j);
    }

    @Override // defpackage.cyk
    public final void b() {
        this.a = null;
        this.d = null;
        this.f = true;
        n(false);
        cji cjiVar = this.u;
        if (cjiVar != null) {
            cjiVar.d(this.b);
            czq czqVar = this.c;
            bii biiVar = czqVar.U;
            biiVar.l();
            ((byw) biiVar.b).n(new WeakReference(this, (ReferenceQueue) biiVar.a));
            czqVar.N.o(this);
        }
    }

    @Override // defpackage.cyk
    public final void c(cju cjuVar, cmi cmiVar) {
        j();
        this.s = this.b.b() > BitmapDescriptorFactory.HUE_RED;
        cmb cmbVar = this.l;
        cma cmaVar = cmbVar.b;
        cmaVar.e(cjuVar);
        cmaVar.a = cmiVar;
        czz.G(cmbVar, this.b);
    }

    @Override // defpackage.cyk
    public final void d(float[] fArr) {
        float[] fArrP = p();
        if (fArrP != null) {
            cki.d(fArr, fArrP);
        }
    }

    @Override // defpackage.cyk
    public final void e(ciz cizVar, boolean z) {
        float[] fArrP = z ? p() : q();
        if (this.r) {
            return;
        }
        if (fArrP == null) {
            cizVar.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            cki.b(fArrP, cizVar);
        }
    }

    @Override // defpackage.cyk
    public final void f(long j) {
        if (a.P()) {
            this.c.E(-4.0f);
        }
        cmi cmiVar = this.b;
        if (cmiVar.m != j) {
            cmiVar.m = j;
            cmiVar.j(j, cmiVar.n);
        }
        o();
    }

    @Override // defpackage.cyk
    public final void g(long j) {
        if (j == this.e) {
            return;
        }
        if (a.P()) {
            this.c.E(-4.0f);
        }
        this.e = j;
        invalidate();
    }

    @Override // defpackage.cyk
    public final void h(afeg afegVar, afdr afdrVar) {
        cji cjiVar = this.u;
        if (cjiVar == null) {
            crt.a("currently reuse is only supported when we manage the layer lifecycle");
            throw new aezp();
        }
        if (!this.b.l) {
            crt.b("layer should have been released before reuse");
        }
        this.b = cjiVar.a();
        this.f = false;
        this.a = afegVar;
        this.d = afdrVar;
        this.p = false;
        this.q = false;
        this.r = true;
        cki.c(this.g);
        float[] fArr = this.h;
        if (fArr != null) {
            cki.c(fArr);
        }
        this.n = roc.aA(0.5f, 0.5f);
        this.s = false;
        this.e = 9223372034707292159L;
        this.o = null;
        this.m = 0;
    }

    @Override // defpackage.cyk
    public final void i(float[] fArr) {
        cki.d(fArr, q());
    }

    @Override // defpackage.cyk
    public final void invalidate() {
        if (this.i || this.f) {
            return;
        }
        this.c.invalidate();
        n(true);
    }

    @Override // defpackage.cyk
    public final void j() {
        if (this.i) {
            if (this.n != roc.aA(0.5f, 0.5f)) {
                cmi cmiVar = this.b;
                if (cmiVar.n != this.e) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (this.n >> 32)) * ((int) (this.e >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.n & 4294967295L)) * ((int) (this.e & 4294967295L));
                    cmiVar.i((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
                }
            }
            cmi cmiVar2 = this.b;
            dlg dlgVar = this.j;
            dlr dlrVar = this.k;
            long j = this.e;
            afec afecVar = this.t;
            if (cmiVar2.n != j) {
                cmiVar2.n = j;
                cmiVar2.j(cmiVar2.m, j);
                if (cmiVar2.g == 9205357640488583168L) {
                    cmiVar2.e = true;
                    cmiVar2.d();
                }
            }
            cmiVar2.b = dlgVar;
            cmiVar2.c = dlrVar;
            cmiVar2.d = afecVar;
            cmiVar2.g();
            n(false);
        }
    }

    @Override // defpackage.cyk
    public final void k(cks cksVar) {
        afdr afdrVar;
        afdr afdrVar2;
        int i = cksVar.a | this.m;
        this.k = cksVar.u;
        dlg dlgVar = cksVar.t;
        this.j = dlgVar;
        if ((1048576 & i) != 0) {
            cmi cmiVar = this.b;
            float f = cksVar.s.b;
            int iEF = dlgVar.eF(BitmapDescriptorFactory.HUE_RED);
            float f2 = cksVar.s.c;
            int iEF2 = dlgVar.eF(BitmapDescriptorFactory.HUE_RED);
            float f3 = cksVar.s.d;
            int iEF3 = dlgVar.eF(BitmapDescriptorFactory.HUE_RED);
            float f4 = cksVar.s.e;
            int iEF4 = dlgVar.eF(BitmapDescriptorFactory.HUE_RED);
            cmiVar.o = iEF;
            cmiVar.p = iEF2;
            cmiVar.q = iEF3;
            cmiVar.r = iEF4;
            cmiVar.a.A(iEF, iEF2, iEF3, iEF4);
            invalidate();
        }
        int i2 = i & 4096;
        if (i2 != 0) {
            this.n = cksVar.n;
        }
        if ((i & 1) != 0) {
            cmi cmiVar2 = this.b;
            float f5 = cksVar.b;
            cml cmlVar = cmiVar2.a;
            if (cmlVar.f() != f5) {
                cmlVar.H(f5);
            }
        }
        if ((i & 2) != 0) {
            cmi cmiVar3 = this.b;
            float f6 = cksVar.c;
            cml cmlVar2 = cmiVar3.a;
            if (cmlVar2.g() != f6) {
                cmlVar2.I(f6);
            }
        }
        if ((i & 4) != 0) {
            this.b.h(cksVar.d);
        }
        if ((i & 8) != 0) {
            cmi cmiVar4 = this.b;
            float f7 = cksVar.e;
            cml cmlVar3 = cmiVar4.a;
            if (cmlVar3.i() != f7) {
                cmlVar3.L(f7);
            }
        }
        if ((i & 16) != 0) {
            cmi cmiVar5 = this.b;
            float f8 = cksVar.f;
            cml cmlVar4 = cmiVar5.a;
            if (cmlVar4.j() != f8) {
                cmlVar4.M(f8);
            }
        }
        boolean z = true;
        if ((i & 32) != 0) {
            cmi cmiVar6 = this.b;
            float f9 = cksVar.g;
            cml cmlVar5 = cmiVar6.a;
            if (cmlVar5.h() != f9) {
                cmlVar5.J(f9);
                cmiVar6.e = true;
                cmiVar6.d();
            }
            if (cksVar.g > BitmapDescriptorFactory.HUE_RED && !this.s && (afdrVar2 = this.d) != null) {
                afdrVar2.invoke();
            }
        }
        if ((i & 64) != 0) {
            cmi cmiVar7 = this.b;
            long j = cksVar.h;
            cml cmlVar6 = cmiVar7.a;
            if (j != cmlVar6.m()) {
                cmlVar6.u(j);
            }
        }
        if ((i & 128) != 0) {
            cmi cmiVar8 = this.b;
            long j2 = cksVar.i;
            cml cmlVar7 = cmiVar8.a;
            if (j2 != cmlVar7.n()) {
                cmlVar7.K(j2);
            }
        }
        if ((i & 1024) != 0) {
            cmi cmiVar9 = this.b;
            float f10 = cksVar.l;
            cml cmlVar8 = cmiVar9.a;
            if (cmlVar8.e() != f10) {
                cmlVar8.G(f10);
            }
        }
        if ((i & 256) != 0) {
            cmi cmiVar10 = this.b;
            float f11 = cksVar.j;
            cml cmlVar9 = cmiVar10.a;
            if (cmlVar9.c() != f11) {
                cmlVar9.E(f11);
            }
        }
        if ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            cmi cmiVar11 = this.b;
            float f12 = cksVar.k;
            cml cmlVar10 = cmiVar11.a;
            if (cmlVar10.d() != f12) {
                cmlVar10.F(f12);
            }
        }
        if ((i & 2048) != 0) {
            cmi cmiVar12 = this.b;
            float f13 = cksVar.m;
            cml cmlVar11 = cmiVar12.a;
            if (cmlVar11.b() != f13) {
                cmlVar11.w(f13);
            }
        }
        if (i2 != 0) {
            long j3 = this.n;
            long jAA = roc.aA(0.5f, 0.5f);
            cmi cmiVar13 = this.b;
            if (j3 == jAA) {
                cmiVar13.i(9205357640488583168L);
            } else {
                cmiVar13.i((Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.n >> 32)) * ((int) (this.e >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.n & 4294967295L)) * ((int) (this.e & 4294967295L))) & 4294967295L));
            }
        }
        if ((i & 16384) != 0) {
            cmi cmiVar14 = this.b;
            boolean z2 = cksVar.p;
            if (cmiVar14.t != z2) {
                cmiVar14.t = z2;
                cmiVar14.e = true;
                cmiVar14.d();
            }
        }
        if ((131072 & i) != 0) {
            cmi cmiVar15 = this.b;
            ckr ckrVar = cksVar.v;
            cml cmlVar12 = cmiVar15.a;
            if (!affa.f(cmlVar12.p(), ckrVar)) {
                cmlVar12.D(ckrVar);
            }
        }
        if ((262144 & i) != 0) {
            cml cmlVar13 = this.b.a;
        }
        if ((524288 & i) != 0) {
            cmi cmiVar16 = this.b;
            int i3 = cksVar.w;
            cml cmlVar14 = cmiVar16.a;
            if (cmlVar14.k() != i3) {
                cmlVar14.v(i3);
            }
        }
        if ((32768 & i) != 0) {
            cmi cmiVar17 = this.b;
            int i4 = cksVar.q;
            cml cmlVar15 = cmiVar17.a;
            if (cmlVar15.l() != i4) {
                cmlVar15.y(i4);
            }
        }
        if ((i & 7963) != 0) {
            this.p = true;
            this.q = true;
        }
        if (affa.f(this.o, cksVar.x)) {
            z = false;
        } else {
            ckm ckmVar = cksVar.x;
            this.o = ckmVar;
            if (ckmVar != null) {
                cmi cmiVar18 = this.b;
                if (ckmVar instanceof ckk) {
                    cjb cjbVar = ((ckk) ckmVar).a;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(cjbVar.b);
                    float f14 = cjbVar.c;
                    cmiVar18.k((jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), (Float.floatToRawIntBits(cjbVar.d - r11) << 32) | (Float.floatToRawIntBits(cjbVar.e - f14) & 4294967295L), BitmapDescriptorFactory.HUE_RED);
                } else if (ckmVar instanceof ckj) {
                    cmiVar18.l(((ckj) ckmVar).a);
                } else {
                    if (!(ckmVar instanceof ckl)) {
                        throw new aezs();
                    }
                    ckl cklVar = (ckl) ckmVar;
                    cjm cjmVar = cklVar.b;
                    if (cjmVar != null) {
                        cmiVar18.l(cjmVar);
                    } else {
                        cjc cjcVar = cklVar.a;
                        long jFloatToRawIntBits2 = Float.floatToRawIntBits(cjcVar.a);
                        float fB = cjcVar.b();
                        float fA = cjcVar.a();
                        cmiVar18.k((jFloatToRawIntBits2 << 32) | (Float.floatToRawIntBits(cjcVar.b) & 4294967295L), (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L), Float.intBitsToFloat((int) (cjcVar.h >> 32)));
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((ckmVar instanceof ckj) || ((ckmVar instanceof ckl) && !byx.D(((ckl) ckmVar).a))) && (afdrVar = this.d) != null)) {
                    afdrVar.invoke();
                }
                z = true;
            }
        }
        this.m = cksVar.a;
        if (i != 0 || z) {
            o();
            if (a.P()) {
                this.c.E(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    @Override // defpackage.cyk
    public final boolean l(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        cmi cmiVar = this.b;
        if (!cmiVar.t) {
            return true;
        }
        ckm ckmVarC = cmiVar.c();
        if (ckmVarC instanceof ckk) {
            cjb cjbVar = ((ckk) ckmVarC).a;
            return cjbVar.b <= fIntBitsToFloat && fIntBitsToFloat < cjbVar.d && cjbVar.c <= fIntBitsToFloat2 && fIntBitsToFloat2 < cjbVar.e;
        }
        if (!(ckmVarC instanceof ckl)) {
            if (ckmVarC instanceof ckj) {
                return vh.j(((ckj) ckmVarC).a, fIntBitsToFloat, fIntBitsToFloat2);
            }
            throw new aezs();
        }
        cjc cjcVar = ((ckl) ckmVarC).a;
        float f = cjcVar.a;
        if (fIntBitsToFloat >= f) {
            float f2 = cjcVar.c;
            if (fIntBitsToFloat < f2) {
                float f3 = cjcVar.b;
                if (fIntBitsToFloat2 >= f3) {
                    float f4 = cjcVar.d;
                    if (fIntBitsToFloat2 >= f4) {
                        return false;
                    }
                    long j2 = cjcVar.e;
                    long j3 = cjcVar.f;
                    int i = (int) (j3 >> 32);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= cjcVar.b()) {
                        long j4 = cjcVar.h;
                        long j5 = cjcVar.g;
                        int i3 = (int) (j5 >> 32);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= cjcVar.b()) {
                            int i5 = (int) (j4 & 4294967295L);
                            int i6 = (int) (j2 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= cjcVar.a()) {
                                long j6 = j3 & 4294967295L;
                                int i7 = (int) (j5 & 4294967295L);
                                int i8 = (int) j6;
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= cjcVar.a()) {
                                    float fIntBitsToFloat3 = f + Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i6) + f3;
                                    float fIntBitsToFloat5 = f2 - Float.intBitsToFloat(i);
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i8) + f3;
                                    float fIntBitsToFloat7 = f2 - Float.intBitsToFloat(i3);
                                    float fIntBitsToFloat8 = f4 - Float.intBitsToFloat(i7);
                                    float fIntBitsToFloat9 = f4 - Float.intBitsToFloat(i5);
                                    float fIntBitsToFloat10 = f + Float.intBitsToFloat(i4);
                                    if (fIntBitsToFloat < fIntBitsToFloat3 && fIntBitsToFloat2 < fIntBitsToFloat4) {
                                        return vh.i(fIntBitsToFloat, fIntBitsToFloat2, j2, fIntBitsToFloat3, fIntBitsToFloat4);
                                    }
                                    if (fIntBitsToFloat < fIntBitsToFloat10 && fIntBitsToFloat2 > fIntBitsToFloat9) {
                                        return vh.i(fIntBitsToFloat, fIntBitsToFloat2, j4, fIntBitsToFloat10, fIntBitsToFloat9);
                                    }
                                    if (fIntBitsToFloat > fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        return vh.i(fIntBitsToFloat, fIntBitsToFloat2, j3, fIntBitsToFloat5, fIntBitsToFloat6);
                                    }
                                    if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) {
                                        return true;
                                    }
                                    return vh.i(fIntBitsToFloat, fIntBitsToFloat2, j5, fIntBitsToFloat7, fIntBitsToFloat8);
                                }
                            }
                        }
                    }
                    cjm cjmVar = new cjm((byte[]) null);
                    cjmVar.q(cjcVar);
                    return vh.j(cjmVar, fIntBitsToFloat, fIntBitsToFloat2);
                }
            }
        }
        return false;
    }

    @Override // defpackage.cyk
    public final float[] m() {
        return q();
    }
}
