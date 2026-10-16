package defpackage;

/* loaded from: classes.dex */
final class ayy extends afde implements afeg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aza c;
    final /* synthetic */ aew d;
    final /* synthetic */ cmi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayy(boolean z, aza azaVar, aew aewVar, cmi cmiVar, afck afckVar) {
        super(2, afckVar);
        this.b = z;
        this.c = azaVar;
        this.d = aewVar;
        this.e = cmiVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new ayy(this.b, this.c, this.d, this.e, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r10 == r0) goto L20;
     */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r9.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 == r3) goto Lf
            defpackage.woy.dF(r10)     // Catch: java.lang.Throwable -> L13
            r7 = r9
            goto L53
        Lf:
            defpackage.woy.dF(r10)     // Catch: java.lang.Throwable -> L13
            goto L31
        L13:
            r0 = move-exception
            r10 = r0
            r7 = r9
            goto L62
        L17:
            defpackage.woy.dF(r10)
            boolean r10 = r9.b     // Catch: java.lang.Throwable -> L5f
            if (r10 == 0) goto L31
            aza r10 = r9.c     // Catch: java.lang.Throwable -> L13
            adu r10 = r10.m     // Catch: java.lang.Throwable -> L13
            java.lang.Float r1 = new java.lang.Float     // Catch: java.lang.Throwable -> L13
            r4 = 0
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L13
            r9.a = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r10 = r10.e(r1, r9)     // Catch: java.lang.Throwable -> L13
            if (r10 != r0) goto L31
            goto L52
        L31:
            aza r10 = r9.c     // Catch: java.lang.Throwable -> L5f
            adu r3 = r10.m     // Catch: java.lang.Throwable -> L5f
            java.lang.Float r4 = new java.lang.Float     // Catch: java.lang.Throwable -> L5f
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L5f
            aew r5 = r9.d     // Catch: java.lang.Throwable -> L5f
            cmi r1 = r9.e     // Catch: java.lang.Throwable -> L5f
            aju r6 = new aju     // Catch: java.lang.Throwable -> L5f
            r7 = 13
            r6.<init>(r1, r10, r7)     // Catch: java.lang.Throwable -> L5f
            r10 = 2
            r9.a = r10     // Catch: java.lang.Throwable -> L5f
            r8 = 4
            r7 = r9
            java.lang.Object r10 = defpackage.adu.k(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5d
            if (r10 != r0) goto L53
        L52:
            return r0
        L53:
            aea r10 = (defpackage.aea) r10     // Catch: java.lang.Throwable -> L5d
            aza r9 = r7.c
            r9.d(r2)
            afak r9 = defpackage.afak.a
            return r9
        L5d:
            r0 = move-exception
            goto L61
        L5f:
            r0 = move-exception
            r7 = r9
        L61:
            r10 = r0
        L62:
            aza r9 = r7.c
            r9.d(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayy.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ayy) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
