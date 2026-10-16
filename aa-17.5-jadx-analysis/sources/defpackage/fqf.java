package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes2.dex */
public final class fqf extends czz implements csy, chd {
    private final cmw a;
    private final cfn b;
    private final csi c;
    private final float d;
    private final cjw f;

    public fqf(cmw cmwVar, cfn cfnVar, csi csiVar, float f, cjw cjwVar) {
        super(null);
        this.a = cmwVar;
        this.b = cfnVar;
        this.c = csiVar;
        this.d = f;
        this.f = cjwVar;
    }

    private final long aM(long j) {
        if (cjd.d(j)) {
            return 0L;
        }
        long jA = this.a.a();
        if (jA == 9205357640488583168L) {
            return j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        return bzi.y(jFloatToRawIntBits, this.c.a(jFloatToRawIntBits, j));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long aN(long r14) {
        /*
            r13 = this;
            boolean r0 = defpackage.dle.i(r14)
            boolean r1 = defpackage.dle.j(r14)
            r2 = 0
            if (r1 == 0) goto L11
            if (r0 != 0) goto Lf
            r0 = r2
            goto L11
        Lf:
            r6 = r14
            goto L41
        L11:
            boolean r3 = defpackage.dle.h(r14)
            if (r3 == 0) goto L1e
            boolean r3 = defpackage.dle.g(r14)
            if (r3 == 0) goto L1e
            r2 = 1
        L1e:
            cmw r3 = r13.a
            long r3 = r3.a()
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L42
            if (r2 == 0) goto Lf
            int r8 = defpackage.dle.b(r14)
            int r10 = defpackage.dle.a(r14)
            r11 = 0
            r12 = 10
            r9 = 0
            r6 = r14
            long r13 = defpackage.dle.m(r6, r8, r9, r10, r11, r12)
            return r13
        L41:
            return r6
        L42:
            r6 = r14
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 32
            if (r2 == 0) goto L5b
            if (r1 != 0) goto L50
            if (r0 == 0) goto L5b
        L50:
            int r0 = defpackage.dle.b(r6)
            int r1 = defpackage.dle.a(r6)
            float r1 = (float) r1
            float r0 = (float) r0
            goto La7
        L5b:
            long r0 = r3 >> r5
            long r3 = r3 & r14
            int r2 = (int) r3
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r1 = java.lang.Float.intBitsToFloat(r2)
            float r2 = java.lang.Math.abs(r0)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L84
            long r8 = defpackage.fqh.a
            int r2 = defpackage.dle.d(r6)
            int r4 = defpackage.dle.b(r6)
            float r2 = (float) r2
            float r4 = (float) r4
            float r0 = defpackage.afpt.d(r0, r2, r4)
            goto L89
        L84:
            int r0 = defpackage.dle.d(r6)
            float r0 = (float) r0
        L89:
            float r2 = java.lang.Math.abs(r1)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto La2
            long r2 = defpackage.fqh.a
            int r2 = defpackage.dle.c(r6)
            int r3 = defpackage.dle.a(r6)
            float r2 = (float) r2
            float r3 = (float) r3
            float r1 = defpackage.afpt.d(r1, r2, r3)
            goto La7
        La2:
            int r1 = defpackage.dle.c(r6)
            float r1 = (float) r1
        La7:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r2 << r5
            long r0 = r0 & r14
            long r0 = r0 | r2
            long r0 = r13.aM(r0)
            long r2 = r0 >> r5
            long r14 = r14 & r0
            int r13 = (int) r14
            int r14 = (int) r2
            float r14 = java.lang.Float.intBitsToFloat(r14)
            float r13 = java.lang.Float.intBitsToFloat(r13)
            int r14 = defpackage.afgi.k(r14)
            int r2 = defpackage.dlf.c(r6, r14)
            int r13 = defpackage.afgi.k(r13)
            int r4 = defpackage.dlf.b(r6, r13)
            r5 = 0
            r0 = r6
            r6 = 10
            r3 = 0
            long r13 = defpackage.dle.m(r0, r2, r3, r4, r5, r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqf.aN(long):long");
    }

    @Override // defpackage.cfy
    public final /* synthetic */ cfy a(cfy cfyVar) {
        return czz.ac(this, cfyVar);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ Object b(Object obj, afeg afegVar) {
        return afegVar.invoke(obj, this);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ boolean c(afec afecVar) {
        return czz.ab(this, afecVar);
    }

    @Override // defpackage.csy
    public final int d(csq csqVar, csp cspVar, int i) {
        if (this.a.a() == 9205357640488583168L) {
            return cspVar.c(i);
        }
        return Math.max(afgi.k(Float.intBitsToFloat((int) (aM((Float.floatToRawIntBits(r5) & 4294967295L) | (Float.floatToRawIntBits(i) << 32)) & 4294967295L))), cspVar.c(dle.b(aN(dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY)))));
    }

    @Override // defpackage.csy
    public final int e(csq csqVar, csp cspVar, int i) {
        if (this.a.a() == 9205357640488583168L) {
            return cspVar.d(i);
        }
        int iD = cspVar.d(dle.a(aN(dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i))));
        return Math.max(afgi.k(Float.intBitsToFloat((int) (aM((Float.floatToRawIntBits(i) & 4294967295L) | (Float.floatToRawIntBits(iD) << 32)) >> 32))), iD);
    }

    @Override // defpackage.chd
    public final void eZ(cxd cxdVar) throws Throwable {
        cxd cxdVar2;
        long jAM = aM(cxdVar.o());
        long jA = this.b.a(fqh.a(jAM), fqh.a(cxdVar.o()), cxdVar.p());
        float fA = dlo.a(jA);
        float fB = dlo.b(jA);
        cxdVar.r().c.l(fA, fB);
        float f = -fA;
        float f2 = -fB;
        try {
            cxdVar2 = cxdVar;
            try {
                this.a.e(cxdVar2, jAM, this.d, this.f);
                cxdVar2.r().c.l(f, f2);
                cxdVar2.q();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                cxdVar2.r().c.l(f, f2);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            cxdVar2 = cxdVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqf)) {
            return false;
        }
        fqf fqfVar = (fqf) obj;
        return affa.f(this.a, fqfVar.a) && affa.f(this.b, fqfVar.b) && affa.f(this.c, fqfVar.c) && Float.compare(this.d, fqfVar.d) == 0 && affa.f(this.f, fqfVar.f);
    }

    @Override // defpackage.csy
    public final int f(csq csqVar, csp cspVar, int i) {
        if (this.a.a() == 9205357640488583168L) {
            return cspVar.e(i);
        }
        return Math.max(afgi.k(Float.intBitsToFloat((int) (aM((Float.floatToRawIntBits(r5) & 4294967295L) | (Float.floatToRawIntBits(i) << 32)) & 4294967295L))), cspVar.e(dle.b(aN(dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY)))));
    }

    @Override // defpackage.csy
    public final int g(csq csqVar, csp cspVar, int i) {
        if (this.a.a() == 9205357640488583168L) {
            return cspVar.f(i);
        }
        int iF = cspVar.f(dle.a(aN(dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i))));
        return Math.max(afgi.k(Float.intBitsToFloat((int) (aM((Float.floatToRawIntBits(i) & 4294967295L) | (Float.floatToRawIntBits(iF) << 32)) >> 32))), iF);
    }

    @Override // defpackage.csy
    public final ctq h(cts ctsVar, cto ctoVar, long j) {
        cuo cuoVarV = ctoVar.v(aN(j));
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new ewm(cuoVarV, 18));
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Float.floatToIntBits(this.d);
        cjw cjwVar = this.f;
        return (iHashCode * 31) + (cjwVar == null ? 0 : cjwVar.hashCode());
    }

    public final String toString() {
        return "ContentPainterModifier(painter=" + this.a + ", alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.f + ")";
    }
}
