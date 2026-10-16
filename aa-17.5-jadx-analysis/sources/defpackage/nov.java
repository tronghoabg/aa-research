package defpackage;

/* loaded from: classes2.dex */
public final class nov implements npa {
    public final eqj a;
    private final kjz b;
    private final kjz c;

    public nov(kjz kjzVar, kjz kjzVar2) {
        this.b = kjzVar;
        this.c = kjzVar2;
        this.a = tby.v(jul.f(kjzVar2), new nle(15));
    }

    @Override // defpackage.npa
    public final eqj a() {
        return jun.d(jul.f(this.b), new nle(16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.not r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.nou
            if (r0 == 0) goto L13
            r0 = r7
            nou r0 = (defpackage.nou) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            nou r0 = new nou
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            not r6 = r0.d
            defpackage.woy.dF(r7)
            aezw r7 = (defpackage.aezw) r7
            java.lang.Object r7 = r7.a
            goto L5c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.woy.dF(r7)
            eqj r7 = r5.a
            java.lang.Object r7 = r7.e()
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L76
            boolean r2 = r7.contains(r6)
            if (r2 == 0) goto L76
            kjz r7 = r5.b
            int r2 = r6.j
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = defpackage.jul.g(r7, r4, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            boolean r7 = r7 instanceof defpackage.aezv
            if (r7 == 0) goto L73
            yph r7 = defpackage.npc.c
            yop r7 = r7.h()
            ype r7 = (defpackage.ype) r7
            kjz r5 = r5.b
            klq r5 = r5.a
            kll r5 = r5.b
            java.lang.String r0 = "Setting fan direction value to %s for area id %s failed."
            r7.M(r0, r6, r5)
        L73:
            afak r5 = defpackage.afak.a
            return r5
        L76:
            java.lang.String r5 = "` is not one of allowed values: `"
            java.lang.String r0 = "`"
            java.lang.String r1 = "Requested fan direction value: `"
            java.lang.String r5 = defpackage.a.bw(r7, r6, r1, r5, r0)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nov.b(not, afck):java.lang.Object");
    }
}
