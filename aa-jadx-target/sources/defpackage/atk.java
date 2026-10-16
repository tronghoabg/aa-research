package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class atk extends defpackage.cge implements defpackage.cxe {
    public float a = 1.0f;
    public boolean b;

    public atk(boolean z) {
        this.b = z;
    }

    private final long d(long j, boolean z) {
        int iA = defpackage.dlm.a(j);
        if (iA == Integer.MAX_VALUE) {
            return 0L;
        }
        int iRound = java.lang.Math.round(iA * this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || defpackage.ca.au(j, iRound, iA)) {
            return (((long) iRound) << 32) | ((long) iA);
        }
        return 0L;
    }

    private final long f(long j, boolean z) {
        int iB = defpackage.dlm.b(j);
        if (iB == Integer.MAX_VALUE) {
            return 0L;
        }
        int iRound = java.lang.Math.round(iB / this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (z && !defpackage.ca.au(j, iB, iRound)) {
            return 0L;
        }
        return (((long) iB) << 32) | (4294967295L & ((long) iRound));
    }

    private final long g(long j, boolean z) {
        int iC = defpackage.dlm.c(j);
        int iRound = java.lang.Math.round(iC * this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || defpackage.ca.au(j, iRound, iC)) {
            return (((long) iRound) << 32) | ((long) iC);
        }
        return 0L;
    }

    private final long l(long j, boolean z) {
        int iD = defpackage.dlm.d(j);
        int iRound = java.lang.Math.round(iD / this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (z && !defpackage.ca.au(j, iD, iRound)) {
            return 0L;
        }
        return (((long) iD) << 32) | (4294967295L & ((long) iRound));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        long jD;
        if (this.b) {
            jD = d(j, true);
            if (jD == 0) {
                jD = f(j, true);
                if (jD == 0) {
                    jD = g(j, true);
                    if (jD == 0) {
                        jD = l(j, true);
                        if (jD == 0) {
                            jD = d(j, false);
                            if (jD == 0) {
                                jD = f(j, false);
                                if (jD == 0) {
                                    jD = g(j, false);
                                    if (jD == 0) {
                                        jD = l(j, false);
                                        if (jD == 0) {
                                            jD = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jD = f(j, true);
            if (jD == 0) {
                jD = d(j, true);
                if (jD == 0) {
                    jD = l(j, true);
                    if (jD == 0) {
                        jD = g(j, true);
                        if (jD == 0) {
                            jD = f(j, false);
                            if (jD == 0) {
                                jD = d(j, false);
                                if (jD == 0) {
                                    jD = l(j, false);
                                    if (jD == 0) {
                                        jD = g(j, false);
                                        if (jD == 0) {
                                            jD = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (jD != 0) {
            j = defpackage.dln.m((int) (jD >> 32), (int) (4294967295L & jD));
        }
        defpackage.cux cuxVarV = ctxVar.v(j);
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.act(cuxVarV, 19));
    }

    @Override // defpackage.cxe
    public final int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return csyVar.c(Integer.MAX_VALUE);
        }
        return java.lang.Math.round(i / this.a);
    }

    @Override // defpackage.cxe
    public final int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return csyVar.d(Integer.MAX_VALUE);
        }
        return java.lang.Math.round(i * this.a);
    }

    @Override // defpackage.cxe
    public final int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return csyVar.e(Integer.MAX_VALUE);
        }
        return java.lang.Math.round(i / this.a);
    }

    @Override // defpackage.cxe
    public final int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return csyVar.f(Integer.MAX_VALUE);
        }
        return java.lang.Math.round(i * this.a);
    }
}
