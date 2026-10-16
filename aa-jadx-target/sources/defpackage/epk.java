package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class epk extends defpackage.eqr {
    public defpackage.epf a;
    private epn h;

    public epk(defpackage.afdo afdoVar, long j, defpackage.affg affgVar) {
        defpackage.afdo aixgVar = new aixg((aiwg) null);
        aiut aiutVar = aivl.a;
        this.a = new defpackage.epf(this, affgVar, j, ahoi.b(ajdt.a.i().plus(afdoVar).plus(aixgVar)), new defpackage.eig(this, 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.epi epiVar;
        if (afdkVar instanceof defpackage.epi) {
            epiVar = (defpackage.epi) afdkVar;
            int i = epiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                epiVar.c = i - Integer.MIN_VALUE;
            } else {
                epiVar = new defpackage.epi(this, afdkVar);
            }
        } else {
            epiVar = new defpackage.epi(this, afdkVar);
        }
        java.lang.Object obj = epiVar.a;
        java.lang.Object obj2 = defpackage.afdr.a;
        int i2 = epiVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            epn epnVar = this.h;
            if (epnVar != null) {
                epiVar.c = 1;
                aiut aiutVar = aivl.a;
                java.lang.Object objA = ahoc.a(ajdt.a.i(), new defpackage.dxp(epnVar, (defpackage.afdk) null, 6, (byte[]) null), epiVar);
                if (objA != obj2) {
                    objA = defpackage.afbk.a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
        }
        this.h = null;
        return defpackage.afbk.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r7 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.eqp r6, defpackage.afdk r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof epj
            if (r0 == 0) goto L13
            r0 = r7
            epj r0 = (epj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            epj r0 = new epj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            afdr r1 = defpackage.afdr.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.afga.cz(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r6 = r0.a
            defpackage.afga.cz(r7)
            goto L45
        L38:
            defpackage.afga.cz(r7)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 == r1) goto L66
        L45:
            r7 = 0
            r0.a = r7
            r0.d = r3
            aiut r2 = aivl.a
            aiwq r2 = ajdt.a
            aiwq r2 = r2.i()
            dxh r3 = new dxh
            eqp r6 = (defpackage.eqp) r6
            r4 = 3
            r3.<init>(r5, r6, r7, r4)
            java.lang.Object r7 = ahoc.a(r2, r3, r0)
            if (r7 != r1) goto L61
            goto L66
        L61:
            epn r7 = (epn) r7
            r5.h = r7
            return r7
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epk.b(eqp, afdk):java.lang.Object");
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void c() {
        super.c();
        defpackage.epf epfVar = this.a;
        if (epfVar != null) {
            aiwg aiwgVar = epfVar.g;
            if (aiwgVar != null) {
                aiwgVar.s((java.util.concurrent.CancellationException) null);
            }
            epfVar.g = null;
            if (epfVar.f != null) {
                return;
            }
            epfVar.f = ahoc.d(epfVar.d, (defpackage.afdo) null, 0, new defpackage.dnf(epfVar, (defpackage.afdk) null, 3), 3);
        }
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void d() {
        super.d();
        defpackage.epf epfVar = this.a;
        if (epfVar != null) {
            if (epfVar.g != null) {
                throw new java.lang.IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            aiuw aiuwVar = epfVar.d;
            aiut aiutVar = aivl.a;
            epfVar.g = ahoc.d(aiuwVar, ajdt.a.i(), 0, new defpackage.btt(epfVar, (defpackage.afdk) null, 11), 2);
        }
    }
}
