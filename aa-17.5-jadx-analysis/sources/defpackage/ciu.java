package defpackage;

/* loaded from: classes.dex */
public final class ciu extends cfx implements cwc, cyg, cvs, czb, cwd {
    public final boolean a;
    public boolean b;
    public boolean c;
    public Integer d;
    public dek e;
    public rpp f;
    private final afeg g;
    private final int h;

    public /* synthetic */ ciu(int i, boolean z, afeg afegVar, int i2) {
        this.a = z & ((i2 & 2) == 0);
        this.g = (i2 & 4) != 0 ? null : afegVar;
        this.h = 1 == (i2 & 1) ? 1 : i;
    }

    private final void m() {
        if (bzi.a && this.e == null) {
            this.e = bzi.z(this, new cep(this, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byw] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [byw] */
    public final cie b() {
        boolean z;
        cxx cxxVar;
        cig cigVar = new cig();
        int i = this.h;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((kwp) bzi.x(this, dbc.h)).o() == 1);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        cigVar.a = z;
        cfx cfxVar = this.q;
        if (!cfxVar.A) {
            crt.c("visitAncestors called on an unattached node");
        }
        cfx cfxVar2 = this.q;
        cxb cxbVarQ = bzi.q(this);
        loop0: while (cxbVarQ != null) {
            if ((cxbVarQ.v.f.s & 3072) != 0) {
                while (cfxVar2 != null) {
                    int i2 = cfxVar2.r;
                    if ((i2 & 3072) != 0) {
                        if (cfxVar2 != cfxVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            cwe cweVarN = cfxVar2;
                            ?? bywVar = 0;
                            while (cweVarN != 0) {
                                if (cweVarN instanceof cii) {
                                    ((cii) cweVarN).c(cigVar);
                                } else if ((cweVarN.r & 2048) != 0 && (cweVarN instanceof cwe)) {
                                    cfx cfxVar3 = cweVarN.C;
                                    int i3 = 0;
                                    cweVarN = cweVarN;
                                    bywVar = bywVar;
                                    while (cfxVar3 != null) {
                                        if ((cfxVar3.r & 2048) != 0) {
                                            i3++;
                                            bywVar = bywVar;
                                            if (i3 == 1) {
                                                cweVarN = cfxVar3;
                                            } else {
                                                if (bywVar == 0) {
                                                    bywVar = new byw(new cfx[16]);
                                                }
                                                if (cweVarN != 0) {
                                                    bywVar.n(cweVarN);
                                                }
                                                bywVar.n(cfxVar3);
                                                cweVarN = 0;
                                            }
                                        }
                                        cfxVar3 = cfxVar3.u;
                                        cweVarN = cweVarN;
                                        bywVar = bywVar;
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                cweVarN = bzi.n(bywVar);
                            }
                        }
                    }
                    cfxVar2 = cfxVar2.t;
                }
            }
            cxbVarQ = cxbVarQ.l();
            cfxVar2 = (cxbVarQ == null || (cxxVar = cxbVarQ.v) == null) ? null : cxxVar.e;
        }
        return cigVar;
    }

    @Override // defpackage.cvs
    public final /* synthetic */ cvr d() {
        return cvo.a;
    }

    @Override // defpackage.cfx
    public final void em() {
        if (g().b()) {
            ((czq) bzi.s(this)).J.k(true, true, 8);
        }
    }

    @Override // defpackage.czb
    public final void en() {
        m();
    }

    @Override // defpackage.cfx
    public final void er() {
        m();
    }

    public final cis g() {
        ciu ciuVarB;
        cxx cxxVar;
        if (!this.A || (ciuVarB = ((czq) bzi.s(this)).J.b()) == null) {
            return cis.d;
        }
        if (this == ciuVarB) {
            return cis.a;
        }
        if (ciuVarB.A) {
            if (!ciuVarB.q.A) {
                crt.c("visitAncestors called on an unattached node");
            }
            cfx cfxVar = ciuVarB.q.t;
            cxb cxbVarQ = bzi.q(ciuVarB);
            while (cxbVarQ != null) {
                if ((cxbVarQ.v.f.s & 1024) != 0) {
                    while (cfxVar != null) {
                        if ((cfxVar.r & 1024) != 0) {
                            cfx cfxVarN = cfxVar;
                            byw bywVar = null;
                            while (cfxVarN != null) {
                                if (cfxVarN instanceof ciu) {
                                    if (this == ((ciu) cfxVarN)) {
                                        return cis.b;
                                    }
                                } else if ((cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                                    int i = 0;
                                    for (cfx cfxVar2 = ((cwe) cfxVarN).C; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
                                        if ((cfxVar2.r & 1024) != 0) {
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
        }
        return cis.d;
    }

    public final cjb h(cst cstVar) {
        cjb cjbVar = ((cig) b()).l;
        return cjbVar != cid.a ? cstVar == null ? cjbVar : cjbVar.f(cstVar.u(bzi.o(this), 0L)) : cstVar != null ? cstVar.o(bzi.o(this), false) : byx.E(0L, dln.k(bzi.o(this).h()));
    }

    public final void i() {
        cie cieVar;
        int iOrdinal = g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new aezs();
                }
                return;
            }
        }
        affv affvVar = new affv();
        cjn.p(this, new bsh(affvVar, this, 4));
        Object obj = affvVar.a;
        if (obj == null) {
            affa.d("focusProperties");
            cieVar = null;
        } else {
            cieVar = (cie) obj;
        }
        if (cieVar.l()) {
            return;
        }
        ((czq) bzi.s(this)).J.k(true, true, 8);
    }

    public final boolean j(int i) {
        int iV = mt.v(this, i);
        int i2 = iV - 1;
        if (iV == 0) {
            throw null;
        }
        if (i2 == 0) {
            return mt.s(this);
        }
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return true;
        }
        throw new aezs();
    }

    public final boolean k(int i) {
        return ((cig) b()).a ? j(i) : re.l(this, i, new cia(i, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [cfx] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [cfx] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [byw] */
    public final void l(cis cisVar, cis cisVar2) {
        cxx cxxVar;
        afeg afegVar;
        cic cicVar = ((czq) bzi.s(this)).J;
        ciu ciuVarB = cicVar.b();
        if (!affa.f(cisVar, cisVar2) && (afegVar = this.g) != null) {
            afegVar.invoke(cisVar, cisVar2);
        }
        cfx cfxVar = this.q;
        if (!cfxVar.A) {
            crt.c("visitAncestors called on an unattached node");
        }
        cfx cfxVar2 = this.q;
        cxb cxbVarQ = bzi.q(this);
        while (cxbVarQ != null) {
            if ((cxbVarQ.v.f.s & 5120) != 0) {
                while (cfxVar2 != null) {
                    int i = cfxVar2.r;
                    if ((i & 5120) != 0) {
                        if (cfxVar2 != cfxVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            cwe cweVarN = cfxVar2;
                            ?? bywVar = 0;
                            while (cweVarN != 0) {
                                if (cweVarN instanceof chu) {
                                    chu chuVar = (chu) cweVarN;
                                    if (ciuVarB == cicVar.b()) {
                                        chuVar.eu(cisVar2);
                                    }
                                } else if ((cweVarN.r & 4096) != 0 && (cweVarN instanceof cwe)) {
                                    cfx cfxVar3 = cweVarN.C;
                                    int i2 = 0;
                                    cweVarN = cweVarN;
                                    bywVar = bywVar;
                                    while (cfxVar3 != null) {
                                        if ((cfxVar3.r & 4096) != 0) {
                                            i2++;
                                            bywVar = bywVar;
                                            if (i2 == 1) {
                                                cweVarN = cfxVar3;
                                            } else {
                                                if (bywVar == 0) {
                                                    bywVar = new byw(new cfx[16]);
                                                }
                                                if (cweVarN != 0) {
                                                    bywVar.n(cweVarN);
                                                }
                                                bywVar.n(cfxVar3);
                                                cweVarN = 0;
                                            }
                                        }
                                        cfxVar3 = cfxVar3.u;
                                        cweVarN = cweVarN;
                                        bywVar = bywVar;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                cweVarN = bzi.n(bywVar);
                            }
                        }
                    }
                    cfxVar2 = cfxVar2.t;
                }
            }
            cxbVarQ = cxbVarQ.l();
            cfxVar2 = (cxbVarQ == null || (cxxVar = cxbVarQ.v) == null) ? null : cxxVar.e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @Override // defpackage.cfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            r4 = this;
            cis r0 = r4.g()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 == r1) goto L1a
            r2 = 2
            if (r0 == r2) goto L33
            r1 = 3
            if (r0 != r1) goto L14
            goto L4b
        L14:
            aezs r4 = new aezs
            r4.<init>()
            throw r4
        L1a:
            cym r0 = defpackage.bzi.s(r4)
            czq r0 = (defpackage.czq) r0
            cic r0 = r0.J
            ciu r2 = defpackage.mt.o(r4)
            if (r2 == 0) goto L4b
            boolean r2 = r2.a
            if (r2 != r1) goto L4b
            r0.m()
            r0.f()
            goto L4b
        L33:
            cym r0 = defpackage.bzi.s(r4)
            czq r0 = (defpackage.czq) r0
            cic r0 = r0.J
            r2 = 0
            r3 = 8
            r0.k(r1, r2, r3)
            boolean r1 = r4.a
            if (r1 == 0) goto L48
            r0.m()
        L48:
            r0.f()
        L4b:
            r0 = 0
            r4.d = r0
            dek r1 = r4.e
            if (r1 == 0) goto L55
            r1.b()
        L55:
            rpp r1 = r4.f
            if (r1 == 0) goto L5c
            r1.b()
        L5c:
            r4.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciu.q():void");
    }

    @Override // defpackage.cyg
    public final void r() {
        i();
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }
}
