package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ctw implements defpackage.ctc {
    private final defpackage.cxv a;

    public ctw(defpackage.cxv cxvVar) {
        this.a = cxvVar;
    }

    private final long b() {
        defpackage.cxv cxvVarU = defpackage.tw.u(this.a);
        return defpackage.acmj.r(u(cxvVarU.p, 0L), a().u(cxvVarU.g, 0L));
    }

    public final defpackage.cyl a() {
        return this.a.g;
    }

    @Override // defpackage.ctc
    public final void dL(defpackage.ctc ctcVar, float[] fArr) {
        a().dL(ctcVar, fArr);
    }

    @Override // defpackage.ctc
    public final long h() {
        defpackage.cxv cxvVar = this.a;
        return (((long) cxvVar.a) << 32) | (((long) cxvVar.b) & 4294967295L);
    }

    @Override // defpackage.ctc
    public final long i(defpackage.ctc ctcVar, long j) {
        return u(ctcVar, j);
    }

    @Override // defpackage.ctc
    public final long j(long j) {
        return a().j(defpackage.a.ah(j, b()));
    }

    @Override // defpackage.ctc
    public final long k(long j) {
        return a().k(defpackage.a.ah(j, b()));
    }

    @Override // defpackage.ctc
    public final long l(long j) {
        return a().l(defpackage.a.ah(j, b()));
    }

    @Override // defpackage.ctc
    public final long m(long j) {
        return defpackage.a.ah(a().m(j), b());
    }

    @Override // defpackage.ctc
    public final long n(long j) {
        return defpackage.a.ah(a().n(j), b());
    }

    @Override // defpackage.ctc
    public final defpackage.cjj o(defpackage.ctc ctcVar, boolean z) {
        return a().o(ctcVar, z);
    }

    @Override // defpackage.ctc
    public final defpackage.ctc q() {
        defpackage.cxv cxvVarC;
        if (!t()) {
            defpackage.csc.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        defpackage.cyl cylVar = a().t.q().x;
        if (cylVar == null || (cxvVarC = cylVar.C()) == null) {
            return null;
        }
        return cxvVarC.p;
    }

    @Override // defpackage.ctc
    public final void s(float[] fArr) {
        a().s(fArr);
    }

    @Override // defpackage.ctc
    public final boolean t() {
        return a().t();
    }

    @Override // defpackage.ctc
    public final long u(defpackage.ctc ctcVar, long j) {
        if (!(ctcVar instanceof defpackage.ctw)) {
            defpackage.cxv cxvVarU = defpackage.tw.u(this.a);
            long jU = u(cxvVarU.p, j);
            long j2 = cxvVarU.h;
            long jR = defpackage.acmj.r(jU, (4294967295L & ((long) java.lang.Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (java.lang.Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            defpackage.cyl cylVar = cxvVarU.g;
            if (!cylVar.t()) {
                defpackage.csc.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            cylVar.al();
            defpackage.cyl cylVar2 = cylVar.x;
            if (cylVar2 != null) {
                cylVar = cylVar2;
            }
            return defpackage.a.ah(jR, cylVar.u(ctcVar, 0L));
        }
        defpackage.cxv cxvVar = ((defpackage.ctw) ctcVar).a;
        defpackage.cyl cylVar3 = cxvVar.g;
        cylVar3.al();
        defpackage.cxv cxvVarC = a().af(cylVar3).C();
        if (cxvVarC != null) {
            long jC = defpackage.dlw.c(defpackage.dlw.d(cxvVar.D(cxvVarC), defpackage.dlv.d(j)), this.a.D(cxvVarC));
            return (((long) java.lang.Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (jC >> 32)) << 32);
        }
        defpackage.cxv cxvVarU2 = defpackage.tw.u(cxvVar);
        long jD = defpackage.dlw.d(defpackage.dlw.d(cxvVar.D(cxvVarU2), cxvVarU2.h), defpackage.dlv.d(j));
        defpackage.cxv cxvVar2 = this.a;
        defpackage.cxv cxvVarU3 = defpackage.tw.u(cxvVar2);
        long jC2 = defpackage.dlw.c(jD, defpackage.dlw.d(cxvVar2.D(cxvVarU3), cxvVarU3.h));
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        defpackage.cyl cylVar4 = cxvVarU3.g.x;
        cylVar4.getClass();
        defpackage.cyl cylVar5 = cxvVarU2.g.x;
        cylVar5.getClass();
        return cylVar4.u(cylVar5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }
}
