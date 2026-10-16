package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cqi extends defpackage.cge implements defpackage.czh, defpackage.cqc {
    public defpackage.cqc a;
    public defpackage.tu b;
    private defpackage.cqi c;
    private final java.lang.Object d;

    public cqi(defpackage.cqc cqcVar, defpackage.tu tuVar) {
        this.a = cqcVar;
        this.b = tuVar == null ? new defpackage.tu() : tuVar;
        this.d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    private final defpackage.cqc j() {
        if (this.A) {
            return f();
        }
        return null;
    }

    @Override // defpackage.cqc
    public final long a(long j, long j2, int i) {
        long jA = this.a.a(j, j2, i);
        defpackage.cqc cqcVarJ = j();
        return defpackage.a.ah(jA, cqcVarJ != null ? cqcVarJ.a(defpackage.a.ah(j, jA), defpackage.acmj.r(j2, jA), i) : 0L);
    }

    @Override // defpackage.cqc
    public final long b(long j, int i) {
        defpackage.cqc cqcVarJ = j();
        long jB = cqcVarJ != null ? cqcVarJ.b(j, i) : 0L;
        return defpackage.a.ah(jB, this.a.b(defpackage.acmj.r(j, jB), i));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.cqc
    public final java.lang.Object c(long j, long j2, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.cqg cqgVar;
        long j3;
        long j4;
        long j5;
        long j6;
        if (afdkVar instanceof defpackage.cqg) {
            cqgVar = (defpackage.cqg) afdkVar;
            int i = cqgVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cqgVar.e = i - Integer.MIN_VALUE;
            } else {
                cqgVar = new defpackage.cqg(this, afdkVar);
            }
        } else {
            cqgVar = new defpackage.cqg(this, afdkVar);
        }
        defpackage.cqg cqgVar2 = cqgVar;
        java.lang.Object objC = cqgVar2.c;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = cqgVar2.e;
        if (i2 == 0) {
            defpackage.afga.cz(objC);
            defpackage.cqc cqcVar = this.a;
            cqgVar2.a = j;
            cqgVar2.b = j2;
            cqgVar2.e = 1;
            objC = cqcVar.c(j, j2, cqgVar2);
            if (objC != afdrVar) {
                j3 = j2;
            }
            return afdrVar;
        }
        if (i2 == 1) {
            long j7 = cqgVar2.b;
            long j8 = cqgVar2.a;
            defpackage.afga.cz(objC);
            j3 = j7;
            j = j8;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j6 = cqgVar2.a;
            defpackage.afga.cz(objC);
        }
        j5 = ((defpackage.dmd) objC).a;
        j4 = j6;
        return new defpackage.dmd(defpackage.a.ah(j4, j5));
        j4 = ((defpackage.dmd) objC).a;
        defpackage.cqc cqcVarJ = this.A ? j() : this.c;
        if (cqcVarJ != null) {
            long jAh = defpackage.a.ah(j, j4);
            long jR = defpackage.acmj.r(j3, j4);
            cqgVar2.a = j4;
            cqgVar2.e = 2;
            objC = cqcVarJ.c(jAh, jR, cqgVar2);
            if (objC != afdrVar) {
                j6 = j4;
                j5 = ((defpackage.dmd) objC).a;
                j4 = j6;
            }
            return afdrVar;
        }
        j5 = 0;
        return new defpackage.dmd(defpackage.a.ah(j4, j5));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r9 != r1) goto L20;
     */
    @Override // defpackage.cqc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r7, defpackage.afdk r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cqh
            if (r0 == 0) goto L13
            r0 = r9
            cqh r0 = (defpackage.cqh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cqh r0 = new cqh
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            afdr r1 = defpackage.afdr.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r6 = r0.a
            defpackage.afga.cz(r9)
            goto L65
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            long r7 = r0.a
            defpackage.afga.cz(r9)
            goto L4d
        L3a:
            defpackage.afga.cz(r9)
            cqc r9 = r6.j()
            if (r9 == 0) goto L52
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 == r1) goto L73
        L4d:
            dmd r9 = (defpackage.dmd) r9
            long r4 = r9.a
            goto L54
        L52:
            r4 = 0
        L54:
            cqc r6 = r6.a
            long r7 = defpackage.acmj.r(r7, r4)
            r0.a = r4
            r0.d = r3
            java.lang.Object r9 = r6.d(r7, r0)
            if (r9 == r1) goto L73
            r6 = r4
        L65:
            dmd r9 = (defpackage.dmd) r9
            long r8 = r9.a
            long r6 = defpackage.a.ah(r6, r8)
            dmd r8 = new dmd
            r8.<init>(r6)
            return r8
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqi.d(long, afdk):java.lang.Object");
    }

    @Override // defpackage.czh
    public final java.lang.Object dx() {
        return this.d;
    }

    @Override // defpackage.cge
    public final void dz() {
        i();
    }

    public final defpackage.cqi f() {
        defpackage.cyg cygVar;
        defpackage.czh czhVar = null;
        if (!this.A) {
            return null;
        }
        if (!this.q.A) {
            defpackage.csc.c("visitAncestors called on an unattached node");
        }
        defpackage.cge cgeVar = this.q.t;
        defpackage.cxl cxlVarR = defpackage.cjv.r(this);
        loop0: while (cxlVarR != null) {
            if ((cxlVarR.v.f.s & 262144) != 0) {
                while (cgeVar != null) {
                    if ((cgeVar.r & 262144) != 0) {
                        defpackage.cge cgeVarO = cgeVar;
                        defpackage.bzc bzcVar = null;
                        while (cgeVarO != null) {
                            if (cgeVarO instanceof defpackage.czh) {
                                defpackage.czh czhVar2 = (defpackage.czh) cgeVarO;
                                if (defpackage.afga.f(this.d, czhVar2.dx()) && defpackage.bzd.e(this, czhVar2)) {
                                    czhVar = czhVar2;
                                    break loop0;
                                }
                            }
                            if ((cgeVarO.r & 262144) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                int i = 0;
                                for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                                    if ((cgeVar2.r & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cgeVarO = cgeVar2;
                                        } else {
                                            if (bzcVar == null) {
                                                bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (cgeVarO != null) {
                                                bzcVar.n(cgeVarO);
                                            }
                                            bzcVar.n(cgeVar2);
                                            cgeVarO = null;
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            cgeVarO = defpackage.cjv.o(bzcVar);
                        }
                    }
                    cgeVar = cgeVar.t;
                }
            }
            cxlVarR = cxlVarR.l();
            cgeVar = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
        }
        return (defpackage.cqi) czhVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aiuw, java.lang.Object] */
    public final aiuw g() {
        defpackage.cqi cqiVarF = f();
        aiuw aiuwVarG = cqiVarF != null ? cqiVarF.g() : null;
        return (aiuwVarG == null || !ahoi.g(aiuwVarG)) ? this.b.d : aiuwVarG;
    }

    public final void h() {
        defpackage.tu tuVar = this.b;
        if (tuVar.b == this) {
            tuVar.b = null;
            tuVar.d = null;
            tuVar.c = defpackage.cqj.a;
        }
    }

    public final void i() {
        defpackage.tu tuVar = this.b;
        tuVar.b = this;
        tuVar.a = null;
        this.c = null;
        tuVar.c = new defpackage.oe(this, 18);
        tuVar.d = N();
    }

    @Override // defpackage.cge
    public final void q() {
        defpackage.afer aferVar = defpackage.cqj.a;
        defpackage.afgv afgvVar = new defpackage.afgv();
        defpackage.dai.n(this, new defpackage.chs(afgvVar, 5));
        defpackage.cqi cqiVar = (defpackage.cqi) ((defpackage.czh) afgvVar.a);
        this.c = cqiVar;
        this.b.a = cqiVar;
        h();
    }
}
