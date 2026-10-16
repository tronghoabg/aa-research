package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ari extends defpackage.apj implements defpackage.apy {
    public final aiyk a;
    public aiwg b;
    private final /* synthetic */ defpackage.apy h;
    private final defpackage.affc i;

    public ari(defpackage.apy apyVar, defpackage.aqp aqpVar, defpackage.affg affgVar, defpackage.dlo dloVar, defpackage.affc affcVar) {
        super(aqpVar, affgVar, dloVar);
        this.h = apyVar;
        this.i = affcVar;
        this.a = defpackage.afqt.q(Integer.MAX_VALUE, 0, 6);
    }

    public static final defpackage.arf e(aiyk aiykVar) {
        defpackage.arf arfVarA = null;
        java.util.Iterator itA = new defpackage.afcb(new defpackage.apl(new defpackage.aln(aiykVar, 11), null), 3).a();
        while (itA.hasNext()) {
            defpackage.arf arfVar = (defpackage.arf) itA.next();
            arfVarA = arfVarA == null ? arfVar : arfVarA.a(arfVar);
        }
        return arfVarA;
    }

    private static final boolean h(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32)) == 0.0f && java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f;
    }

    @Override // defpackage.apy
    public final long a(long j) {
        throw null;
    }

    @Override // defpackage.apy
    public final long b(long j) {
        return this.h.b(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r7.invoke(r6, r0) != r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.arf r7, defpackage.afdk r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.arg
            if (r0 == 0) goto L13
            r0 = r8
            arg r0 = (defpackage.arg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            arg r0 = new arg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            afdr r1 = defpackage.afdr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.afga.cz(r8)
            goto L7d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.afga.cz(r8)
            goto L68
        L36:
            defpackage.afga.cz(r8)
            afgv r8 = new afgv
            r8.<init>()
            r8.a = r7
            r6.d(r7)
            aiyk r7 = r6.a
            arf r7 = e(r7)
            if (r7 == 0) goto L58
            r6.d(r7)
            java.lang.Object r2 = r8.a
            arf r2 = (defpackage.arf) r2
            arf r7 = r2.a(r7)
            r8.a = r7
        L58:
            arh r7 = new arh
            r2 = 0
            r5 = 0
            r7.<init>(r6, r8, r2, r5)
            r0.c = r4
            java.lang.Object r7 = r6.m(r7, r0)
            if (r7 != r1) goto L68
            goto L80
        L68:
            affg r7 = r6.c
            bil r6 = r6.g
            long r4 = r6.o()
            dmd r6 = new dmd
            r6.<init>(r4)
            r0.c = r3
            java.lang.Object r6 = r7.invoke(r6, r0)
            if (r6 == r1) goto L80
        L7d:
            afbk r6 = defpackage.afbk.a
            return r6
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ari.c(arf, afdk):java.lang.Object");
    }

    public final void d(defpackage.arf arfVar) {
        this.g.p(arfVar.b, arfVar.a);
    }

    @Override // defpackage.apj
    protected final boolean f(defpackage.cqu cquVar) {
        int i = cquVar.e;
        return i == 10 || i == 11 || i == 12;
    }

    public final void g(defpackage.izq izqVar, long j) {
        b(izqVar.o(this.h.a(j), 1));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094 A[SYNTHETIC] */
    @Override // defpackage.apj
    protected final boolean j(defpackage.cqu cquVar) {
        java.util.List listA;
        int size;
        int i;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        defpackage.cqm cqmVar;
        long j2;
        boolean z4;
        defpackage.afgq afgqVar = new defpackage.afgq();
        defpackage.crd crdVar = (defpackage.crd) defpackage.afga.aB(cquVar.a);
        if (crdVar != null) {
            if (cquVar.e == 10 && h(crdVar.l)) {
                java.util.List listA2 = crdVar.a();
                int size2 = listA2.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (h(((defpackage.cqm) listA2.get(i2)).d)) {
                            i2++;
                        } else {
                            listA = crdVar.a();
                            size = listA.size();
                            for (i = 0; i < size; i++) {
                                cqmVar = (defpackage.cqm) listA.get(i);
                                j2 = (-9223372034707292160L) ^ cqmVar.d;
                                if (!((java.lang.Boolean) this.i.invoke(new defpackage.apx(b(j2)))).booleanValue()) {
                                    if (aiyo.c(this.a.j(new defpackage.arf(j2, cqmVar.a, false)))) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    afgqVar.a = z4;
                                }
                            }
                            j = crdVar.l ^ (-9223372034707292160L);
                            if (cquVar.e == 12) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!((java.lang.Boolean) this.i.invoke(new defpackage.apx(b(j)))).booleanValue()) {
                                z2 = z;
                            } else if (z) {
                                z2 = true;
                            }
                            if (aiyo.c(this.a.j(new defpackage.arf(j, crdVar.b, z2)))) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            afgqVar.a = z3;
                        }
                    }
                }
            } else {
                listA = crdVar.a();
                size = listA.size();
                while (i < size) {
                    cqmVar = (defpackage.cqm) listA.get(i);
                    j2 = (-9223372034707292160L) ^ cqmVar.d;
                    if (!((java.lang.Boolean) this.i.invoke(new defpackage.apx(b(j2)))).booleanValue()) {
                        if (aiyo.c(this.a.j(new defpackage.arf(j2, cqmVar.a, false))) || afgqVar.a) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        afgqVar.a = z4;
                    }
                }
                j = crdVar.l ^ (-9223372034707292160L);
                if (cquVar.e == 12) {
                    z = true;
                } else {
                    z = false;
                }
                if (!((java.lang.Boolean) this.i.invoke(new defpackage.apx(b(j)))).booleanValue()) {
                    z2 = z;
                } else if (z) {
                    z2 = true;
                }
                if (aiyo.c(this.a.j(new defpackage.arf(j, crdVar.b, z2))) || afgqVar.a) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                afgqVar.a = z3;
            }
        }
        return afgqVar.a || this.e;
    }
}
