package defpackage;

/* loaded from: classes.dex */
public final class ctn implements cst {
    private final cxl a;

    public ctn(cxl cxlVar) {
        this.a = cxlVar;
    }

    private final long b() {
        cxl cxlVarY = tr.y(this.a);
        return aclh.y(u(cxlVarY.p, 0L), a().u(cxlVarY.g, 0L));
    }

    public final cyc a() {
        return this.a.g;
    }

    @Override // defpackage.cst
    public final void eD(cst cstVar, float[] fArr) {
        a().eD(cstVar, fArr);
    }

    @Override // defpackage.cst
    public final long h() {
        cxl cxlVar = this.a;
        return (cxlVar.a << 32) | (cxlVar.b & 4294967295L);
    }

    @Override // defpackage.cst
    public final long i(cst cstVar, long j) {
        return u(cstVar, j);
    }

    @Override // defpackage.cst
    public final long j(long j) {
        return a().j(a.ai(j, b()));
    }

    @Override // defpackage.cst
    public final long k(long j) {
        return a().k(a.ai(j, b()));
    }

    @Override // defpackage.cst
    public final long l(long j) {
        return a().l(a.ai(j, b()));
    }

    @Override // defpackage.cst
    public final long m(long j) {
        return a.ai(a().m(j), b());
    }

    @Override // defpackage.cst
    public final long n(long j) {
        return a.ai(a().n(j), b());
    }

    @Override // defpackage.cst
    public final cjb o(cst cstVar, boolean z) {
        return a().o(cstVar, z);
    }

    @Override // defpackage.cst
    public final cst q() {
        cxl cxlVarC;
        if (!t()) {
            crt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        cyc cycVar = a().t.q().x;
        if (cycVar == null || (cxlVarC = cycVar.C()) == null) {
            return null;
        }
        return cxlVarC.p;
    }

    @Override // defpackage.cst
    public final void s(float[] fArr) {
        a().s(fArr);
    }

    @Override // defpackage.cst
    public final boolean t() {
        return a().t();
    }

    @Override // defpackage.cst
    public final long u(cst cstVar, long j) {
        if (!(cstVar instanceof ctn)) {
            cxl cxlVarY = tr.y(this.a);
            long jU = u(cxlVarY.p, j);
            long j2 = cxlVarY.h;
            long jY = aclh.y(jU, (4294967295L & Float.floatToRawIntBits((int) (j2 & 4294967295L))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            cyc cycVar = cxlVarY.g;
            if (!cycVar.t()) {
                crt.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            cycVar.al();
            cyc cycVar2 = cycVar.x;
            if (cycVar2 != null) {
                cycVar = cycVar2;
            }
            return a.ai(jY, cycVar.u(cstVar, 0L));
        }
        cxl cxlVar = ((ctn) cstVar).a;
        cyc cycVar3 = cxlVar.g;
        cycVar3.al();
        cxl cxlVarC = a().af(cycVar3).C();
        if (cxlVarC != null) {
            long jC = dlo.c(dlo.d(cxlVar.D(cxlVarC), dlf.s(j)), this.a.D(cxlVarC));
            return (Float.floatToRawIntBits((int) (jC & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jC >> 32)) << 32);
        }
        cxl cxlVarY2 = tr.y(cxlVar);
        long jD = dlo.d(dlo.d(cxlVar.D(cxlVarY2), cxlVarY2.h), dlf.s(j));
        cxl cxlVar2 = this.a;
        cxl cxlVarY3 = tr.y(cxlVar2);
        long jC2 = dlo.c(jD, dlo.d(cxlVar2.D(cxlVarY3), cxlVarY3.h));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits((int) (jC2 & 4294967295L)) & 4294967295L;
        cyc cycVar4 = cxlVarY3.g.x;
        cycVar4.getClass();
        cyc cycVar5 = cxlVarY2.g.x;
        cycVar5.getClass();
        return cycVar4.u(cycVar5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }
}
