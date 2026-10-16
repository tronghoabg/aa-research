package defpackage;

/* loaded from: classes.dex */
public final class ake extends cfx implements cys, czb {
    public asf a;
    private asa b;

    public ake(asf asfVar) {
        this.a = asfVar;
    }

    @Override // defpackage.cys
    public final /* synthetic */ boolean C() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.akc
            if (r0 == 0) goto L13
            r0 = r5
            akc r0 = (defpackage.akc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akc r0 = new akc
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            asa r0 = r0.d
            defpackage.woy.dF(r5)
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.woy.dF(r5)
            asa r5 = r4.b
            if (r5 != 0) goto L4e
            asa r5 = new asa
            r5.<init>()
            asf r2 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 == r1) goto L4d
            r0 = r5
        L4a:
            r4.b = r0
            goto L4e
        L4d:
            return r1
        L4e:
            afak r4 = defpackage.afak.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ake.a(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.akd
            if (r0 == 0) goto L13
            r0 = r5
            akd r0 = (defpackage.akd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akd r0 = new akd
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.woy.dF(r5)
            asa r5 = r4.b
            if (r5 == 0) goto L49
            asb r2 = new asb
            r2.<init>(r5)
            asf r5 = r4.a
            r0.c = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            r5 = 0
            r4.b = r5
        L49:
            afak r4 = defpackage.afak.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ake.d(afck):java.lang.Object");
    }

    @Override // defpackage.czb
    public final void en() {
        p();
    }

    @Override // defpackage.cys
    public final /* synthetic */ long eq() {
        return ty.c(0, 0, 0, 0);
    }

    @Override // defpackage.cys
    /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void t() {
        asa asaVar = this.b;
        if (asaVar != null) {
            this.a.c(new asb(asaVar));
            this.b = null;
        }
    }

    @Override // defpackage.cys
    public final void o() {
        p();
    }

    @Override // defpackage.cfx
    public final void q() {
        p();
    }

    @Override // defpackage.cys
    public final void s(cql cqlVar, cqm cqmVar, long j) {
        if (cqmVar == cqm.b) {
            int i = cqlVar.e;
            if (i == 4) {
                ahnc.d(N(), null, 0, new ada(this, (afck) null, 6), 3);
            } else if (i == 5) {
                ahnc.d(N(), null, 0, new ada(this, (afck) null, 7, (byte[]) null), 3);
            }
        }
    }

    @Override // defpackage.cys
    public final /* synthetic */ void E() {
    }
}
