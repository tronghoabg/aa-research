package defpackage;

/* loaded from: classes2.dex */
final class bqg extends afde implements afeh {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ asf c;
    final /* synthetic */ bqj d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqg(asf asfVar, bqj bqjVar, afck afckVar) {
        super(3, afckVar);
        this.c = asfVar;
        this.d = bqjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r9 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (r2.b(r3, r8) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [asi] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r8.a
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 == r2) goto L1a
            r0 = 2
            if (r1 != r0) goto L11
            defpackage.woy.dF(r9)
            goto L8f
        L11:
            java.lang.Object r8 = r8.e
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            defpackage.woy.dF(r9)
            goto Laa
        L1a:
            java.lang.Object r1 = r8.e
            asi r1 = (defpackage.asi) r1
            defpackage.woy.dF(r9)     // Catch: java.lang.Throwable -> L22
            goto L77
        L22:
            r9 = move-exception
            goto L94
        L24:
            defpackage.woy.dF(r9)
            java.lang.Object r9 = r8.e
            apl r9 = (defpackage.apl) r9
            long r3 = r8.b
            asi r1 = new asi     // Catch: java.lang.Throwable -> L92
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L92
            asf r5 = r8.c     // Catch: java.lang.Throwable -> L22
            r5.c(r1)     // Catch: java.lang.Throwable -> L22
            bqj r5 = r8.d     // Catch: java.lang.Throwable -> L22
            api r6 = r5.f     // Catch: java.lang.Throwable -> L22
            api r7 = defpackage.api.a     // Catch: java.lang.Throwable -> L22
            if (r6 != r7) goto L4b
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L22
            float r3 = java.lang.Float.intBitsToFloat(r3)     // Catch: java.lang.Throwable -> L22
            goto L65
        L4b:
            boolean r6 = r5.d     // Catch: java.lang.Throwable -> L22
            r7 = 32
            if (r6 == 0) goto L5f
            int r6 = r5.f()     // Catch: java.lang.Throwable -> L22
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L22
            long r3 = r3 >> r7
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L22
            float r3 = java.lang.Float.intBitsToFloat(r3)     // Catch: java.lang.Throwable -> L22
            float r3 = r6 - r3
            goto L65
        L5f:
            long r3 = r3 >> r7
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L22
            float r3 = java.lang.Float.intBitsToFloat(r3)     // Catch: java.lang.Throwable -> L22
        L65:
            float r4 = r5.b()     // Catch: java.lang.Throwable -> L22
            float r3 = r3 - r4
            r5.i(r3)     // Catch: java.lang.Throwable -> L22
            r8.e = r1     // Catch: java.lang.Throwable -> L22
            r8.a = r2     // Catch: java.lang.Throwable -> L22
            java.lang.Object r9 = r9.o(r8)     // Catch: java.lang.Throwable -> L22
            if (r9 == r0) goto La8
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L22
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L22
            if (r9 == 0) goto L85
            asj r9 = new asj     // Catch: java.lang.Throwable -> L22
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L22
            goto L8a
        L85:
            ash r9 = new ash     // Catch: java.lang.Throwable -> L22
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L22
        L8a:
            asf r2 = r8.c     // Catch: java.lang.Throwable -> L22
            r2.c(r9)     // Catch: java.lang.Throwable -> L22
        L8f:
            afak r8 = defpackage.afak.a
            return r8
        L92:
            r9 = move-exception
            r1 = 0
        L94:
            if (r1 == 0) goto La9
            asf r2 = r8.c
            ash r3 = new ash
            r3.<init>(r1)
            r8.e = r9
            r1 = 3
            r8.a = r1
            java.lang.Object r8 = r2.b(r3, r8)
            if (r8 != r0) goto La9
        La8:
            return r0
        La9:
            r8 = r9
        Laa:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqg.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((cja) obj2).a;
        bqg bqgVar = new bqg(this.c, this.d, (afck) obj3);
        bqgVar.e = (apl) obj;
        bqgVar.b = j;
        return bqgVar.hT(afak.a);
    }
}
