package defpackage;

/* loaded from: classes.dex */
public final class amq<T> extends aoe {
    public amv a;
    public aom b;
    public aom c;
    private dlg i;

    public amq(amv amvVar, api apiVar, boolean z, aom aomVar) {
        super(amm.a, z, null, apiVar);
        this.a = amvVar;
        this.b = aomVar;
    }

    @Override // defpackage.aoe
    public final Object ee(afeg afegVar, afck afckVar) {
        Object objE = this.a.e(akq.a, new amn(afegVar, this, null), afckVar);
        return objE == afcr.a ? objE : afak.a;
    }

    @Override // defpackage.aoe
    public final void ef(anr anrVar) {
        if (this.A) {
            ahnc.d(N(), null, 0, new ain(this, anrVar, (afck) null, 9), 3);
        }
    }

    @Override // defpackage.cfx
    public final void er() {
        i(this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(float r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.amo
            if (r0 == 0) goto L13
            r0 = r8
            amo r0 = (defpackage.amo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amo r0 = new amo
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 2
            if (r2 == 0) goto L38
            r6 = 1
            if (r2 == r6) goto L34
            if (r2 != r3) goto L2c
            affs r6 = r0.d
            defpackage.woy.dF(r8)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.woy.dF(r8)
            return r8
        L38:
            defpackage.woy.dF(r8)
            affs r8 = new affs
            r8.<init>()
            r8.a = r7
            amv r2 = r6.a
            amp r4 = new amp
            r5 = 0
            r4.<init>(r6, r8, r7, r5)
            r0.d = r8
            r0.c = r3
            akq r6 = defpackage.akq.a
            java.lang.Object r6 = r2.e(r6, r4, r0)
            if (r6 == r1) goto L5f
            r6 = r8
        L57:
            float r6 = r6.a
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r6)
            return r7
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amq.g(float, afck):java.lang.Object");
    }

    public final void i(aom aomVar) {
        if (aomVar == null) {
            aec aecVar = ame.a;
            aec aecVar2 = ame.a;
            afec afecVar = ame.b;
            dlg dlgVar = bzi.q(this).r;
            this.i = dlgVar;
            amv amvVar = this.a;
            aomVar = new arn(new amg(amvVar, afecVar, new alg(dlgVar, 3)), amm.c, aecVar2);
        }
        this.c = aomVar;
    }

    @Override // defpackage.aoe
    public final boolean k() {
        return this.a.h() != null;
    }

    public final boolean l() {
        return bzi.q(this).s == dlr.b && this.d == api.b;
    }

    @Override // defpackage.aoe, defpackage.cfx
    /* renamed from: p */
    public final void t() {
        o();
        if (this.A) {
            dlg dlgVar = bzi.q(this).r;
            dlg dlgVar2 = this.i;
            if (dlgVar2 == null || !affa.f(dlgVar2, dlgVar)) {
                this.i = dlgVar;
                i(this.b);
            }
        }
    }

    @Override // defpackage.aoe
    public final void j(long j) {
    }
}
