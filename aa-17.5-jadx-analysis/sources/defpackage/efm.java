package defpackage;

/* loaded from: classes2.dex */
final class efm extends afde implements afec {
    int a;
    int b;
    final /* synthetic */ egd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efm(egd egdVar, afck afckVar) {
        super(1, afckVar);
        this.c = egdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r8 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r8 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r1.a(r7) != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        return r0;
     */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r7.b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 == r4) goto L1c
            if (r1 == r3) goto L18
            int r0 = r7.a
            defpackage.woy.dF(r8)     // Catch: java.lang.Throwable -> L16
            goto L74
        L16:
            r8 = move-exception
            goto L7b
        L18:
            defpackage.woy.dF(r8)
            goto L5e
        L1c:
            defpackage.woy.dF(r8)
            goto L47
        L20:
            defpackage.woy.dF(r8)
            goto L3d
        L24:
            defpackage.woy.dF(r8)
            egd r8 = r7.c
            aezr r1 = r8.e
            boolean r1 = r1.b()
            if (r1 == 0) goto L44
            egp r8 = r8.c()
            r7.b = r5
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto L88
        L3d:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            goto L64
        L44:
            r7.b = r4
            r8 = r2
        L47:
            egd r1 = r7.c
            fdf r8 = (defpackage.fdf) r8
            ehs r4 = new ehs
            r4.<init>(r1, r8, r2, r5)
            r7.b = r3
            aitx r8 = r1.c
            ajbw r8 = (defpackage.ajbw) r8
            afco r8 = r8.a
            java.lang.Object r8 = defpackage.ahnc.a(r8, r4, r7)
            if (r8 == r0) goto L88
        L5e:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
        L64:
            egd r1 = r7.c     // Catch: java.lang.Throwable -> L77
            egz r1 = r1.f     // Catch: java.lang.Throwable -> L77
            r7.a = r8     // Catch: java.lang.Throwable -> L77
            r2 = 4
            r7.b = r2     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r1.a(r7)     // Catch: java.lang.Throwable -> L77
            if (r7 != r0) goto L74
            goto L88
        L74:
            afak r7 = defpackage.afak.a
            return r7
        L77:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7b:
            egd r7 = r7.c
            egx r1 = new egx
            r1.<init>(r8, r0)
            kwp r7 = r7.g
            r7.i(r1)
            throw r8
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efm.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new efm(this.c, (afck) obj).hT(afak.a);
    }
}
