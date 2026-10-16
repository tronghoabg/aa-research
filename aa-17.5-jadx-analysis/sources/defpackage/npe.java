package defpackage;

/* loaded from: classes2.dex */
public final class npe implements npa {
    public final afha a;
    public final afec b;
    public final eqj c;
    private final kjz d;
    private final afec e;

    public /* synthetic */ npe(kjz kjzVar, afha afhaVar, afec afecVar, int i) {
        this(kjzVar, (i & 2) != 0 ? new afha(jul.d(kjzVar), jul.c(kjzVar)) : afhaVar, (i & 4) != 0 ? new nox(14) : afecVar, new nox(15));
    }

    @Override // defpackage.npa
    public final eqj a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.npd
            if (r0 == 0) goto L13
            r0 = r7
            npd r0 = (defpackage.npd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            npd r0 = new npd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.woy.dF(r7)
            aezw r7 = (defpackage.aezw) r7
            java.lang.Object r6 = r7.a
            goto L55
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.woy.dF(r7)
            afha r7 = r5.a
            int r2 = r7.b
            if (r6 > r2) goto L72
            int r2 = r7.a
            if (r2 > r6) goto L72
            kjz r7 = r5.d
            afec r2 = r5.e
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r6)
            java.lang.Object r6 = r2.invoke(r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.jul.g(r7, r6, r0)
            if (r6 == r1) goto L71
        L55:
            java.lang.Throwable r6 = defpackage.aezw.a(r6)
            if (r6 == 0) goto L6e
            yph r7 = defpackage.npc.c
            yop r7 = r7.h()
            ype r7 = (defpackage.ype) r7
            kjz r5 = r5.d
            java.lang.String r6 = r6.getMessage()
            java.lang.String r0 = "Unable to change level of %s: %s"
            r7.M(r0, r5, r6)
        L6e:
            afak r5 = defpackage.afak.a
            return r5
        L71:
            return r1
        L72:
            kjz r5 = r5.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Requested value "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " for property "
            r0.append(r6)
            klq r5 = r5.a
            r0.append(r5)
            java.lang.String r5 = " was not in the range "
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npe.b(int, afck):java.lang.Object");
    }

    public npe(kjz kjzVar, afha afhaVar, afec afecVar, afec afecVar2) {
        afhaVar.getClass();
        afecVar.getClass();
        this.d = kjzVar;
        this.a = afhaVar;
        this.b = afecVar;
        this.e = afecVar2;
        this.c = jun.d(jul.f(kjzVar), new noo(this, 5));
    }
}
