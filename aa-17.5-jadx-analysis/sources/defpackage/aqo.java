package defpackage;

/* loaded from: classes.dex */
final class aqo extends afdd implements afeg {
    Object a;
    int b;
    final /* synthetic */ aitx c;
    final /* synthetic */ afeh d;
    final /* synthetic */ afec e;
    final /* synthetic */ apl f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqo(aitx aitxVar, afeh afehVar, afec afecVar, apl aplVar, afck afckVar) {
        super(afckVar);
        this.c = aitxVar;
        this.d = afehVar;
        this.e = afecVar;
        this.f = aplVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aqo aqoVar = new aqo(this.c, this.d, this.e, this.f, afckVar);
        aqoVar.g = obj;
        return aqoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r17) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 2
            r4 = 0
            r5 = 4
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L25
            if (r2 == r6) goto L19
            java.lang.Object r1 = r0.g
            aivh r1 = (defpackage.aivh) r1
            defpackage.woy.dF(r17)
            r8 = r17
            goto L7a
        L19:
            java.lang.Object r2 = r0.a
            java.lang.Object r8 = r0.g
            crl r8 = (defpackage.crl) r8
            defpackage.woy.dF(r17)
            r9 = r17
            goto L4c
        L25:
            defpackage.woy.dF(r17)
            java.lang.Object r2 = r0.g
            r8 = r2
            crl r8 = (defpackage.crl) r8
            aitx r2 = r0.c
            apl r9 = r0.f
            ada r10 = new ada
            r11 = 10
            r10.<init>(r9, r7, r11)
            aivh r2 = defpackage.ahnc.d(r2, r7, r5, r10, r6)
            r0.g = r8
            r0.a = r2
            r0.b = r6
            afeh r9 = defpackage.aqx.a
            cqm r9 = defpackage.cqm.b
            java.lang.Object r9 = defpackage.aqx.a(r8, r6, r9, r0)
            if (r9 == r1) goto Lb8
        L4c:
            r13 = r9
            cqu r13 = (defpackage.cqu) r13
            r13.b()
            afeh r11 = r0.d
            afeh r9 = defpackage.aqx.a
            if (r11 == r9) goto L6b
            aitx r9 = r0.c
            apl r12 = r0.f
            aio r10 = new aio
            r14 = 0
            r15 = 7
            r10.<init>(r11, r12, r13, r14, r15)
            aqs r11 = new aqs
            r11.<init>(r2, r10, r7, r4)
            defpackage.ahnc.d(r9, r7, r5, r11, r6)
        L6b:
            r0.g = r2
            r0.a = r7
            r0.b = r3
            cqm r9 = defpackage.cqm.b
            java.lang.Object r8 = defpackage.aqx.d(r8, r9, r0)
            if (r8 == r1) goto Lb8
            r1 = r2
        L7a:
            cqu r8 = (defpackage.cqu) r8
            if (r8 != 0) goto L92
            aitx r2 = r0.c
            apl r0 = r0.f
            aiq r8 = new aiq
            r8.<init>(r0, r7, r3)
            afeh r0 = defpackage.aqx.a
            aqs r0 = new aqs
            r0.<init>(r1, r8, r7, r4)
            defpackage.ahnc.d(r2, r7, r5, r0, r6)
            goto Lb5
        L92:
            r8.b()
            aitx r2 = r0.c
            apl r3 = r0.f
            aiq r9 = new aiq
            r10 = 3
            r9.<init>(r3, r7, r10, r7)
            afeh r3 = defpackage.aqx.a
            aqs r3 = new aqs
            r3.<init>(r1, r9, r7, r4)
            defpackage.ahnc.d(r2, r7, r5, r3, r6)
            afec r0 = r0.e
            long r1 = r8.c
            cja r3 = new cja
            r3.<init>(r1)
            r0.invoke(r3)
        Lb5:
            afak r0 = defpackage.afak.a
            return r0
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqo.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aqo) b((crl) obj, (afck) obj2)).hT(afak.a);
    }
}
