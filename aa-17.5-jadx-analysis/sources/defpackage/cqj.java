package defpackage;

/* loaded from: classes.dex */
public final class cqj extends cqk {
    public final cfx a;
    private cst g;
    private cql h;
    private boolean i;
    public final ajnt c = new ajnt((char[]) null, (char[]) null);
    private final zs f = new zs(2);
    public boolean b = true;
    private boolean j = true;

    public cqj(cfx cfxVar) {
        this.a = cfxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [byw] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [byw] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [cfx] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [cfx] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void a() {
        byw bywVar = this.d;
        Object[] objArr = bywVar.a;
        int i = bywVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((cqj) objArr[i2]).a();
        }
        cwe cweVarN = this.a;
        ?? bywVar2 = 0;
        while (cweVarN != 0) {
            if (cweVarN instanceof cys) {
                ((cys) cweVarN).o();
            } else if ((cweVarN.r & 16) != 0 && (cweVarN instanceof cwe)) {
                cfx cfxVar = cweVarN.C;
                int i3 = 0;
                bywVar2 = bywVar2;
                cweVarN = cweVarN;
                while (cfxVar != null) {
                    if ((cfxVar.r & 16) != 0) {
                        i3++;
                        bywVar2 = bywVar2;
                        if (i3 == 1) {
                            cweVarN = cfxVar;
                        } else {
                            if (bywVar2 == 0) {
                                bywVar2 = new byw(new cfx[16]);
                            }
                            if (cweVarN != 0) {
                                bywVar2.n(cweVarN);
                            }
                            bywVar2.n(cfxVar);
                            cweVarN = 0;
                        }
                    }
                    cfxVar = cfxVar.u;
                    bywVar2 = bywVar2;
                    cweVarN = cweVarN;
                }
                if (i3 != 1) {
                }
            }
            cweVarN = bzi.n(bywVar2);
        }
    }

    public final void b(long j, aag aagVar) {
        ajnt ajntVar = this.c;
        if (ajntVar.q(j) && !aagVar.e(this)) {
            ajntVar.s(j);
            this.f.h(j);
        }
        byw bywVar = this.d;
        Object[] objArr = bywVar.a;
        int i = bywVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((cqj) objArr[i2]).b(j, aagVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a8, code lost:
    
        r2.e = 3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ec  */
    /* JADX WARN: Type inference failed for: r5v0, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [byw] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [byw] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    @Override // defpackage.cqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.zs r54, defpackage.cst r55, defpackage.xa r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqj.c(zs, cst, xa, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [cfx] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [byw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.xa r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqj.d(xa):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [byw] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [byw] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v10, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byw] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [byw] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(xa xaVar, boolean z) {
        cyc cycVar;
        cxb cxbVar;
        if (this.f.j()) {
            return false;
        }
        cwe cweVarN = this.a;
        if (!cweVarN.A || (cycVar = cweVarN.w) == null || (cxbVar = cycVar.t) == null || !cxbVar.an()) {
            return false;
        }
        cql cqlVar = this.h;
        cqlVar.getClass();
        cst cstVar = this.g;
        cstVar.getClass();
        long jH = cstVar.h();
        cwe cweVarN2 = cweVarN;
        ?? bywVar = 0;
        while (cweVarN2 != 0) {
            if (cweVarN2 instanceof cys) {
                ((cys) cweVarN2).s(cqlVar, cqm.a, jH);
            } else if ((cweVarN2.r & 16) != 0 && (cweVarN2 instanceof cwe)) {
                cfx cfxVar = cweVarN2.C;
                int i = 0;
                cweVarN2 = cweVarN2;
                bywVar = bywVar;
                while (cfxVar != null) {
                    if ((cfxVar.r & 16) != 0) {
                        i++;
                        bywVar = bywVar;
                        if (i == 1) {
                            cweVarN2 = cfxVar;
                        } else {
                            if (bywVar == 0) {
                                bywVar = new byw(new cfx[16]);
                            }
                            if (cweVarN2 != 0) {
                                bywVar.n(cweVarN2);
                            }
                            bywVar.n(cfxVar);
                            cweVarN2 = 0;
                        }
                    }
                    cfxVar = cfxVar.u;
                    cweVarN2 = cweVarN2;
                    bywVar = bywVar;
                }
                if (i != 1) {
                }
            }
            cweVarN2 = bzi.n(bywVar);
        }
        if (cweVarN.A) {
            byw bywVar2 = this.d;
            Object[] objArr = bywVar2.a;
            int i2 = bywVar2.b;
            for (int i3 = 0; i3 < i2; i3++) {
                cqj cqjVar = (cqj) objArr[i3];
                this.g.getClass();
                cqjVar.e(xaVar, z);
            }
        }
        if (cweVarN.A) {
            ?? bywVar3 = 0;
            while (cweVarN != 0) {
                if (cweVarN instanceof cys) {
                    ((cys) cweVarN).s(cqlVar, cqm.b, jH);
                } else if ((cweVarN.r & 16) != 0 && (cweVarN instanceof cwe)) {
                    cfx cfxVar2 = cweVarN.C;
                    int i4 = 0;
                    cweVarN = cweVarN;
                    bywVar3 = bywVar3;
                    while (cfxVar2 != null) {
                        if ((cfxVar2.r & 16) != 0) {
                            i4++;
                            bywVar3 = bywVar3;
                            if (i4 == 1) {
                                cweVarN = cfxVar2;
                            } else {
                                if (bywVar3 == 0) {
                                    bywVar3 = new byw(new cfx[16]);
                                }
                                if (cweVarN != 0) {
                                    bywVar3.n(cweVarN);
                                }
                                bywVar3.n(cfxVar2);
                                cweVarN = 0;
                            }
                        }
                        cfxVar2 = cfxVar2.u;
                        cweVarN = cweVarN;
                        bywVar3 = bywVar3;
                    }
                    if (i4 != 1) {
                    }
                }
                cweVarN = bzi.n(bywVar3);
            }
        }
        return true;
    }

    public final String toString() {
        return "Node(modifierNode=" + this.a + ", children=" + this.d + ", pointerIds=" + this.c + ")";
    }
}
