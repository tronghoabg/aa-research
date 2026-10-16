package defpackage;

/* loaded from: classes.dex */
public final class cpz extends cfx implements cyz, cpt {
    public cpt a;
    public tp b;
    private cpz c;
    private final Object d;

    public cpz(cpt cptVar, tp tpVar) {
        this.a = cptVar;
        this.b = tpVar == null ? new tp() : tpVar;
        this.d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    private final cpt j() {
        if (this.A) {
            return f();
        }
        return null;
    }

    @Override // defpackage.cpt
    public final long a(long j, long j2, int i) {
        long jA = this.a.a(j, j2, i);
        cpt cptVarJ = j();
        return a.ai(jA, cptVarJ != null ? cptVarJ.a(a.ai(j, jA), aclh.y(j2, jA), i) : 0L);
    }

    @Override // defpackage.cpt
    public final long b(long j, int i) {
        cpt cptVarJ = j();
        long jB = cptVarJ != null ? cptVarJ.b(j, i) : 0L;
        return a.ai(jB, this.a.b(aclh.y(j, jB), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.cpt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r12, long r14, defpackage.afck r16) {
        /*
            r11 = this;
            r0 = r16
            boolean r1 = r0 instanceof defpackage.cpx
            if (r1 == 0) goto L15
            r1 = r0
            cpx r1 = (defpackage.cpx) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            cpx r1 = new cpx
            r1.<init>(r11, r0)
        L1a:
            r7 = r1
            java.lang.Object r0 = r7.c
            afcr r1 = defpackage.afcr.a
            int r2 = r7.e
            r8 = 2
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 == r3) goto L37
            if (r2 != r8) goto L2f
            long r11 = r7.a
            defpackage.woy.dF(r0)
            goto L7d
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            long r12 = r7.b
            long r2 = r7.a
            defpackage.woy.dF(r0)
            r9 = r2
            r2 = r12
            r12 = r9
            goto L56
        L42:
            defpackage.woy.dF(r0)
            cpt r2 = r11.a
            r7.a = r12
            r7.b = r14
            r7.e = r3
            r3 = r12
            r5 = r14
            java.lang.Object r0 = r2.c(r3, r5, r7)
            if (r0 == r1) goto L8f
            r2 = r14
        L56:
            dlv r0 = (defpackage.dlv) r0
            long r4 = r0.a
            boolean r0 = r11.A
            if (r0 == 0) goto L63
            cpt r11 = r11.j()
            goto L65
        L63:
            cpz r11 = r11.c
        L65:
            if (r11 == 0) goto L83
            long r12 = defpackage.a.ai(r12, r4)
            long r2 = defpackage.aclh.y(r2, r4)
            r7.a = r4
            r7.e = r8
            r14 = r2
            r16 = r7
            java.lang.Object r0 = r11.c(r12, r14, r16)
            if (r0 == r1) goto L8f
            r11 = r4
        L7d:
            dlv r0 = (defpackage.dlv) r0
            long r0 = r0.a
            r4 = r11
            goto L85
        L83:
            r0 = 0
        L85:
            long r11 = defpackage.a.ai(r4, r0)
            dlv r13 = new dlv
            r13.<init>(r11)
            return r13
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpz.c(long, long, afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cpt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r7, defpackage.afck r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cpy
            if (r0 == 0) goto L13
            r0 = r9
            cpy r0 = (defpackage.cpy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cpy r0 = new cpy
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r6 = r0.a
            defpackage.woy.dF(r9)
            goto L65
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            long r7 = r0.a
            defpackage.woy.dF(r9)
            goto L4d
        L3a:
            defpackage.woy.dF(r9)
            cpt r9 = r6.j()
            if (r9 == 0) goto L52
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 == r1) goto L73
        L4d:
            dlv r9 = (defpackage.dlv) r9
            long r4 = r9.a
            goto L54
        L52:
            r4 = 0
        L54:
            cpt r6 = r6.a
            long r7 = defpackage.aclh.y(r7, r4)
            r0.a = r4
            r0.d = r3
            java.lang.Object r9 = r6.d(r7, r0)
            if (r9 == r1) goto L73
            r6 = r4
        L65:
            dlv r9 = (defpackage.dlv) r9
            long r8 = r9.a
            long r6 = defpackage.a.ai(r6, r8)
            dlv r8 = new dlv
            r8.<init>(r6)
            return r8
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpz.d(long, afck):java.lang.Object");
    }

    @Override // defpackage.cyz
    public final Object ep() {
        return this.d;
    }

    @Override // defpackage.cfx
    public final void er() {
        i();
    }

    public final cpz f() {
        cxx cxxVar;
        cyz cyzVar = null;
        if (!this.A) {
            return null;
        }
        if (!this.q.A) {
            crt.c("visitAncestors called on an unattached node");
        }
        cfx cfxVar = this.q.t;
        cxb cxbVarQ = bzi.q(this);
        loop0: while (true) {
            if (cxbVarQ == null) {
                break;
            }
            if ((cxbVarQ.v.f.s & 262144) != 0) {
                while (cfxVar != null) {
                    if ((cfxVar.r & 262144) != 0) {
                        cfx cfxVarN = cfxVar;
                        byw bywVar = null;
                        while (cfxVarN != null) {
                            if (cfxVarN instanceof cyz) {
                                cyz cyzVar2 = (cyz) cfxVarN;
                                if (affa.f(this.d, cyzVar2.ep()) && bzi.l(this, cyzVar2)) {
                                    cyzVar = cyzVar2;
                                    break loop0;
                                }
                            }
                            if ((cfxVarN.r & 262144) != 0 && (cfxVarN instanceof cwe)) {
                                int i = 0;
                                for (cfx cfxVar2 = ((cwe) cfxVarN).C; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
                                    if ((cfxVar2.r & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cfxVarN = cfxVar2;
                                        } else {
                                            if (bywVar == null) {
                                                bywVar = new byw(new cfx[16]);
                                            }
                                            if (cfxVarN != null) {
                                                bywVar.n(cfxVarN);
                                            }
                                            bywVar.n(cfxVar2);
                                            cfxVarN = null;
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            cfxVarN = bzi.n(bywVar);
                        }
                    }
                    cfxVar = cfxVar.t;
                }
            }
            cxbVarQ = cxbVarQ.l();
            cfxVar = (cxbVarQ == null || (cxxVar = cxbVarQ.v) == null) ? null : cxxVar.e;
        }
        return (cpz) cyzVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aitx, java.lang.Object] */
    public final aitx g() {
        cpz cpzVarF = f();
        aitx aitxVarG = cpzVarF != null ? cpzVarF.g() : null;
        return (aitxVarG == null || !ahni.g(aitxVarG)) ? this.b.d : aitxVarG;
    }

    public final void h() {
        tp tpVar = this.b;
        if (tpVar.b == this) {
            tpVar.b = null;
            tpVar.d = null;
            tpVar.c = cqa.a;
        }
    }

    public final void i() {
        tp tpVar = this.b;
        tpVar.b = this;
        tpVar.a = null;
        this.c = null;
        tpVar.c = new ahp(this, 16);
        tpVar.d = N();
    }

    @Override // defpackage.cfx
    public final void q() {
        afdr afdrVar = cqa.a;
        affv affvVar = new affv();
        czz.n(this, new chk(affvVar, 5));
        cpz cpzVar = (cpz) ((cyz) affvVar.a);
        this.c = cpzVar;
        this.b.a = cpzVar;
        h();
    }
}
