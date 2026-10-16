package defpackage;

/* loaded from: classes2.dex */
public final class npy implements npa {
    public final eqj a;
    private final kjz b;

    public npy(kjz kjzVar) {
        this.b = kjzVar;
        this.a = jul.f(kjzVar);
    }

    @Override // defpackage.npa
    public final eqj a() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.npx
            if (r0 == 0) goto L13
            r0 = r6
            npx r0 = (defpackage.npx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            npx r0 = new npx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.woy.dF(r6)
            aezw r6 = (defpackage.aezw) r6
            java.lang.Object r5 = r6.a
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.woy.dF(r6)
            kjz r6 = r4.b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.c = r3
            java.lang.Object r5 = defpackage.jul.g(r6, r5, r0)
            if (r5 == r1) goto L60
        L44:
            java.lang.Throwable r5 = defpackage.aezw.a(r5)
            if (r5 == 0) goto L5d
            yph r6 = defpackage.npc.c
            yop r6 = r6.h()
            ype r6 = (defpackage.ype) r6
            kjz r4 = r4.b
            java.lang.String r5 = r5.getMessage()
            java.lang.String r0 = "Unable to change toggle value of %s: %s"
            r6.M(r0, r4, r5)
        L5d:
            afak r4 = defpackage.afak.a
            return r4
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npy.b(boolean, afck):java.lang.Object");
    }
}
