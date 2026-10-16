package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class chr extends defpackage.cge implements defpackage.cxe, defpackage.cwu {
    public defpackage.cne a;
    public boolean b;
    public defpackage.cfu c;
    public defpackage.csr d;
    public float e;
    public defpackage.cke f;

    public chr(defpackage.cne cneVar, boolean z, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar) {
        this.a = cneVar;
        this.b = z;
        this.c = cfuVar;
        this.d = csrVar;
        this.e = f;
        this.f = ckeVar;
    }

    private final long d(long j) {
        boolean z = defpackage.dlm.h(j) && defpackage.dlm.g(j);
        boolean z2 = defpackage.dlm.j(j) && defpackage.dlm.i(j);
        if ((!f() && z) || z2) {
            return defpackage.dlm.m(j, defpackage.dlm.b(j), 0, defpackage.dlm.a(j), 0, 10);
        }
        long jA = this.a.a();
        int iRound = l(jA) ? java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jA >> 32))) : defpackage.dlm.d(j);
        int iRound2 = g(jA) ? java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jA & 4294967295L))) : defpackage.dlm.c(j);
        int iD = defpackage.dlm.d(j);
        int iB = defpackage.dlm.b(j);
        if (iRound < iD) {
            iRound = iD;
        }
        if (iRound <= iB) {
            iB = iRound;
        }
        int iC = defpackage.dlm.c(j);
        int iA = defpackage.dlm.a(j);
        if (iRound2 < iC) {
            iRound2 = iC;
        }
        if (iRound2 <= iA) {
            iA = iRound2;
        }
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(iB)) << 32) | (((long) java.lang.Float.floatToRawIntBits(iA)) & 4294967295L);
        if (f()) {
            int i = (int) (jFloatToRawIntBits >> 32);
            float fIntBitsToFloat = !l(this.a.a()) ? java.lang.Float.intBitsToFloat(i) : java.lang.Float.intBitsToFloat((int) (this.a.a() >> 32));
            float fIntBitsToFloat2 = !g(this.a.a()) ? java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (this.a.a() & 4294967295L));
            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
            long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat2);
            long j2 = jFloatToRawIntBits2 << 32;
            long j3 = jFloatToRawIntBits3 & 4294967295L;
            if (java.lang.Float.intBitsToFloat(i) == 0.0f || java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) {
                jFloatToRawIntBits = 0;
            } else {
                long j4 = j2 | j3;
                jFloatToRawIntBits = defpackage.cjv.z(j4, this.d.a(j4, jFloatToRawIntBits));
            }
        }
        int iRound3 = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        int iD2 = defpackage.dlm.d(j);
        int iB2 = defpackage.dlm.b(j);
        if (iRound3 < iD2) {
            iRound3 = iD2;
        }
        int i2 = iRound3 > iB2 ? iB2 : iRound3;
        int iRound4 = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
        int iC2 = defpackage.dlm.c(j);
        int iA2 = defpackage.dlm.a(j);
        if (iRound4 < iC2) {
            iRound4 = iC2;
        }
        return defpackage.dlm.m(j, i2, 0, iRound4 > iA2 ? iA2 : iRound4, 0, 10);
    }

    private final boolean f() {
        return this.b && this.a.a() != 9205357640488583168L;
    }

    private static final boolean g(long j) {
        return j != 9205357640488583168L && (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    private static final boolean l(long j) {
        return j != 9205357640488583168L && (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        long jZ;
        long jA = this.a.a();
        float fIntBitsToFloat = l(jA) ? java.lang.Float.intBitsToFloat((int) (jA >> 32)) : java.lang.Float.intBitsToFloat((int) (cxnVar.o() >> 32));
        float fIntBitsToFloat2 = g(jA) ? java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (cxnVar.o() & 4294967295L));
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat2);
        long j = jFloatToRawIntBits << 32;
        long j2 = jFloatToRawIntBits2 & 4294967295L;
        if (java.lang.Float.intBitsToFloat((int) (cxnVar.o() >> 32)) == 0.0f || java.lang.Float.intBitsToFloat((int) (cxnVar.o() & 4294967295L)) == 0.0f) {
            jZ = 0;
        } else {
            long j3 = j | j2;
            jZ = defpackage.cjv.z(j3, this.d.a(j3, cxnVar.o()));
        }
        long j4 = jZ;
        long jA2 = this.c.a((((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)))) & 4294967295L) | (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j4 >> 32)))) << 32), (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (cxnVar.o() >> 32)))) << 32) | (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (cxnVar.o() & 4294967295L)))) & 4294967295L), cxnVar.p());
        float f = (int) (jA2 >> 32);
        float f2 = (int) (jA2 & 4294967295L);
        cxnVar.r().c.l(f, f2);
        float f3 = -f;
        float f4 = -f2;
        try {
            this.a.e(cxnVar, j4, this.e, this.f);
            cxnVar.r().c.l(f3, f4);
            cxnVar.q();
        } catch (java.lang.Throwable th) {
            cxnVar.r().c.l(f3, f4);
            throw th;
        }
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.cux cuxVarV = ctxVar.v(d(j));
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.chq(cuxVarV, 0));
    }

    @Override // defpackage.cxe
    public final int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (!f()) {
            return csyVar.c(i);
        }
        long jD = d(defpackage.dln.d(0, i, 0, Integer.MAX_VALUE));
        return java.lang.Math.max(defpackage.dlm.c(jD), csyVar.c(i));
    }

    @Override // defpackage.cxe
    public final int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (!f()) {
            return csyVar.d(i);
        }
        long jD = d(defpackage.dln.d(0, Integer.MAX_VALUE, 0, i));
        return java.lang.Math.max(defpackage.dlm.d(jD), csyVar.d(i));
    }

    @Override // defpackage.cxe
    public final int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (!f()) {
            return csyVar.e(i);
        }
        long jD = d(defpackage.dln.d(0, i, 0, Integer.MAX_VALUE));
        return java.lang.Math.max(defpackage.dlm.c(jD), csyVar.e(i));
    }

    @Override // defpackage.cxe
    public final int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (!f()) {
            return csyVar.f(i);
        }
        long jD = d(defpackage.dln.d(0, Integer.MAX_VALUE, 0, i));
        return java.lang.Math.max(defpackage.dlm.d(jD), csyVar.f(i));
    }

    public final java.lang.String toString() {
        return "PainterModifier(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", alpha=" + this.e + ", colorFilter=" + this.f + ")";
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }
}
