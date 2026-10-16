package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bjs {
    public final djn a;
    public long b;
    public final deu c;
    public final ntn d;
    private final deu e;
    private final long f;
    private final dft g;
    private final djv h;
    private final bff i;

    public bjs(djv djvVar, djn djnVar, bff bffVar, ntn ntnVar) {
        deu deuVar = djvVar.a;
        long j = djvVar.b;
        dft dftVar = bffVar != null ? bffVar.a : null;
        this.e = deuVar;
        this.f = j;
        this.g = dftVar;
        this.a = djnVar;
        this.d = ntnVar;
        this.b = j;
        this.c = deuVar;
        this.h = djvVar;
        this.i = bffVar;
    }

    private final int B(int i) {
        return afpt.f(i, f().length() - 1);
    }

    private final int C(dft dftVar, int i) {
        int iD = D();
        ntn ntnVar = this.d;
        if (ntnVar.a == null) {
            ntnVar.a = Float.valueOf(dftVar.m(iD).b);
        }
        int iG = dftVar.g(iD) + i;
        if (iG < 0) {
            return 0;
        }
        if (iG >= dftVar.e()) {
            return f().length();
        }
        float fA = dftVar.a(iG) - 1.0f;
        Object obj = ntnVar.a;
        obj.getClass();
        float fFloatValue = ((Number) obj).floatValue();
        if ((h() && fFloatValue >= dftVar.c(iG)) || (!h() && fFloatValue <= dftVar.b(iG))) {
            return dftVar.f(iG, true);
        }
        return this.a.b(dftVar.j((Float.floatToRawIntBits(r1.floatValue()) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L)));
    }

    private final int D() {
        return this.a.a(dfv.a(this.b));
    }

    private final void E() {
        int iA;
        this.d.f();
        if (f().length() <= 0 || (iA = a()) == -1) {
            return;
        }
        g(iA, iA);
    }

    private final void F() {
        Integer numD;
        this.d.f();
        if (f().length() <= 0 || (numD = d()) == null) {
            return;
        }
        int iIntValue = numD.intValue();
        g(iIntValue, iIntValue);
    }

    private final void G() {
        this.d.f();
        if (f().length() > 0) {
            deu deuVar = this.c;
            int iZ = asl.Z(deuVar.b, dfv.a(this.b));
            if (iZ != -1) {
                g(iZ, iZ);
            }
        }
    }

    private final void H() {
        Integer numE;
        this.d.f();
        if (f().length() <= 0 || (numE = e()) == null) {
            return;
        }
        int iIntValue = numE.intValue();
        g(iIntValue, iIntValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int I(defpackage.bff r10, int r11) {
        /*
            r9 = this;
            cst r0 = r10.b
            if (r0 == 0) goto L11
            cst r1 = r10.c
            if (r1 == 0) goto Le
            r2 = 1
            cjb r0 = r1.o(r0, r2)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L13
        L11:
            cjb r0 = defpackage.cjb.a
        L13:
            djn r1 = r9.a
            djv r9 = r9.h
            long r2 = r9.b
            int r9 = defpackage.dfv.a(r2)
            dft r10 = r10.a
            int r9 = r1.a(r9)
            cjb r9 = r10.m(r9)
            float r2 = r9.b
            float r9 = r9.c
            long r3 = r0.b()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            float r11 = (float) r11
            int r0 = (int) r3
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 * r11
            int r11 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r11
            float r9 = r9 + r0
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r7 = (long) r9
            r9 = 32
            long r2 = r2 << r9
            long r5 = r5 & r7
            long r2 = r2 | r5
            int r9 = r10.j(r2)
            int r9 = r1.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjs.I(bff, int):int");
    }

    public final void A() {
        bff bffVar;
        if (f().length() <= 0 || (bffVar = this.i) == null) {
            return;
        }
        int I = I(bffVar, -1);
        g(I, I);
    }

    public final int a() {
        return asl.Y(this.c.b, dfv.a(this.b));
    }

    public final Integer b() {
        dft dftVar = this.g;
        if (dftVar == null) {
            return null;
        }
        djn djnVar = this.a;
        return Integer.valueOf(djnVar.b(dftVar.f(dftVar.g(djnVar.a(dfv.c(this.b))), true)));
    }

    public final Integer c() {
        dft dftVar = this.g;
        if (dftVar == null) {
            return null;
        }
        djn djnVar = this.a;
        return Integer.valueOf(djnVar.b(dftVar.i(dftVar.g(djnVar.a(dfv.d(this.b))))));
    }

    public final Integer d() {
        int iA;
        dft dftVar = this.g;
        if (dftVar == null) {
            return null;
        }
        int iD = D();
        while (true) {
            deu deuVar = this.e;
            if (iD < deuVar.a()) {
                long jK = dftVar.k(B(iD));
                if (dfv.a(jK) > iD) {
                    iA = this.a.b(dfv.a(jK));
                    break;
                }
                iD++;
            } else {
                iA = deuVar.a();
                break;
            }
        }
        return Integer.valueOf(iA);
    }

    public final Integer e() {
        int iB;
        dft dftVar = this.g;
        if (dftVar == null) {
            return null;
        }
        int iD = D();
        while (true) {
            if (iD > 0) {
                long jK = dftVar.k(B(iD));
                if (dfv.e(jK) < iD) {
                    iB = this.a.b(dfv.e(jK));
                    break;
                }
                iD--;
            } else {
                iB = 0;
                break;
            }
        }
        return Integer.valueOf(iB);
    }

    public final String f() {
        return this.c.b;
    }

    public final void g(int i, int i2) {
        long jT = czz.t(i, i2);
        long j = dfv.a;
        this.b = jT;
    }

    public final boolean h() {
        dft dftVar = this.g;
        return dftVar == null || dftVar.q(D()) != 2;
    }

    public final void i() {
        if (f().length() > 0) {
            long j = this.f;
            long j2 = dfv.a;
            this.b = czz.t(dfv.e(j), dfv.a(this.b));
        }
    }

    public final djv j() {
        return djv.b(this.h, this.c, this.b, 4);
    }

    public final List k(afec afecVar) {
        if (!dfv.i(this.b)) {
            return woy.bi(new diu("", 0), new dju(dfv.d(this.b), dfv.d(this.b)));
        }
        diz dizVar = (diz) afecVar.invoke(this);
        if (dizVar == null) {
            return null;
        }
        return woy.bg(dizVar);
    }

    public final void l() {
        dft dftVar;
        if (f().length() <= 0 || (dftVar = this.g) == null) {
            return;
        }
        int iC = C(dftVar, 1);
        g(iC, iC);
    }

    public final void m() {
        bff bffVar;
        if (f().length() <= 0 || (bffVar = this.i) == null) {
            return;
        }
        int I = I(bffVar, 1);
        g(I, I);
    }

    public final void n() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                G();
            } else {
                E();
            }
        }
    }

    public final void o() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                H();
            } else {
                F();
            }
        }
    }

    public final void p() {
        this.d.f();
        if (f().length() > 0) {
            int iAa = asl.aa(f(), dfv.c(this.b));
            if (iAa == dfv.c(this.b) && iAa != f().length()) {
                iAa = asl.aa(f(), iAa + 1);
            }
            g(iAa, iAa);
        }
    }

    public final void q() {
        this.d.f();
        if (f().length() > 0) {
            int iAb = asl.ab(f(), dfv.d(this.b));
            if (iAb == dfv.d(this.b) && iAb != 0) {
                iAb = asl.ab(f(), iAb - 1);
            }
            g(iAb, iAb);
        }
    }

    public final void r() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                E();
            } else {
                G();
            }
        }
    }

    public final void s() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                F();
            } else {
                H();
            }
        }
    }

    public final void t() {
        this.d.f();
        if (f().length() > 0) {
            int length = f().length();
            g(length, length);
        }
    }

    public final void u() {
        this.d.f();
        if (f().length() > 0) {
            g(0, 0);
        }
    }

    public final void v() {
        Integer numB;
        this.d.f();
        if (f().length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        g(iIntValue, iIntValue);
    }

    public final void w() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                y();
            } else {
                v();
            }
        }
    }

    public final void x() {
        this.d.f();
        if (f().length() > 0) {
            if (h()) {
                v();
            } else {
                y();
            }
        }
    }

    public final void y() {
        Integer numC;
        this.d.f();
        if (f().length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        g(iIntValue, iIntValue);
    }

    public final void z() {
        dft dftVar;
        if (f().length() <= 0 || (dftVar = this.g) == null) {
            return;
        }
        int iC = C(dftVar, -1);
        g(iC, iC);
    }
}
