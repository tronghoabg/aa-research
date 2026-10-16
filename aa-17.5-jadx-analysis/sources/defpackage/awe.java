package defpackage;

/* loaded from: classes.dex */
final class awe extends cfx implements cwu {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;

    public awe(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long d(defpackage.dlg r7) {
        /*
            r6 = this;
            float r0 = r6.c
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.c
            int r0 = r7.eF(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.d
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.d
            int r3 = r7.eF(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.a
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L40
            float r4 = r6.a
            int r4 = r7.eF(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 != r1) goto L41
        L40:
            r4 = r2
        L41:
            float r5 = r6.b
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.b
            int r6 = r7.eF(r6)
            if (r6 >= 0) goto L52
            r6 = r2
        L52:
            if (r6 <= r3) goto L55
            r6 = r3
        L55:
            if (r6 != r1) goto L58
            goto L59
        L58:
            r2 = r6
        L59:
            long r6 = defpackage.dlf.d(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awe.d(dlg):long");
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        int iD;
        int iB;
        int iC;
        int iA;
        long jD;
        long jD2 = d(ctsVar);
        if (this.e) {
            jD = dlf.f(j, jD2);
        } else {
            if (Float.isNaN(this.a)) {
                iD = dle.d(j);
                int iB2 = dle.b(jD2);
                if (iD > iB2) {
                    iD = iB2;
                }
            } else {
                iD = dle.d(jD2);
            }
            if (Float.isNaN(this.c)) {
                iB = dle.b(j);
                int iD2 = dle.d(jD2);
                if (iB < iD2) {
                    iB = iD2;
                }
            } else {
                iB = dle.b(jD2);
            }
            if (Float.isNaN(this.b)) {
                iC = dle.c(j);
                int iA2 = dle.a(jD2);
                if (iC > iA2) {
                    iC = iA2;
                }
            } else {
                iC = dle.c(jD2);
            }
            if (Float.isNaN(this.d)) {
                iA = dle.a(j);
                int iC2 = dle.c(jD2);
                if (iA < iC2) {
                    iA = iC2;
                }
            } else {
                iA = dle.a(jD2);
            }
            jD = dlf.d(iD, iB, iC, iA);
        }
        cuo cuoVarV = ctoVar.v(jD);
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new aui(cuoVarV, 8));
    }

    @Override // defpackage.cwu
    public final int h(csq csqVar, csp cspVar, int i) {
        long jD = d(csqVar);
        if (dle.i(jD)) {
            return dle.a(jD);
        }
        if (!this.e) {
            int iD = dle.d(jD);
            int iB = dle.b(jD);
            if (i < iD) {
                i = iD;
            }
            if (i > iB) {
                i = iB;
            }
        }
        int iC = cspVar.c(i);
        int iC2 = dle.c(jD);
        int iA = dle.a(jD);
        if (iC < iC2) {
            iC = iC2;
        }
        return iC > iA ? iA : iC;
    }

    @Override // defpackage.cwu
    public final int i(csq csqVar, csp cspVar, int i) {
        long jD = d(csqVar);
        if (dle.j(jD)) {
            return dle.b(jD);
        }
        if (!this.e) {
            int iC = dle.c(jD);
            int iA = dle.a(jD);
            if (i < iC) {
                i = iC;
            }
            if (i > iA) {
                i = iA;
            }
        }
        int iD = cspVar.d(i);
        int iD2 = dle.d(jD);
        int iB = dle.b(jD);
        if (iD < iD2) {
            iD = iD2;
        }
        return iD > iB ? iB : iD;
    }

    @Override // defpackage.cwu
    public final int j(csq csqVar, csp cspVar, int i) {
        long jD = d(csqVar);
        if (dle.i(jD)) {
            return dle.a(jD);
        }
        if (!this.e) {
            int iD = dle.d(jD);
            int iB = dle.b(jD);
            if (i < iD) {
                i = iD;
            }
            if (i > iB) {
                i = iB;
            }
        }
        int iE = cspVar.e(i);
        int iC = dle.c(jD);
        int iA = dle.a(jD);
        if (iE < iC) {
            iE = iC;
        }
        return iE > iA ? iA : iE;
    }

    @Override // defpackage.cwu
    public final int k(csq csqVar, csp cspVar, int i) {
        long jD = d(csqVar);
        if (dle.j(jD)) {
            return dle.b(jD);
        }
        if (!this.e) {
            int iC = dle.c(jD);
            int iA = dle.a(jD);
            if (i < iC) {
                i = iC;
            }
            if (i > iA) {
                i = iA;
            }
        }
        int iF = cspVar.f(i);
        int iD = dle.d(jD);
        int iB = dle.b(jD);
        if (iF < iD) {
            iF = iD;
        }
        return iF > iB ? iB : iF;
    }
}
