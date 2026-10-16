package defpackage;

/* loaded from: classes.dex */
public final class bhi extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ bhj c;
    final /* synthetic */ bhp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhi(bhj bhjVar, bhp bhpVar, afck afckVar) {
        super(2, afckVar);
        this.c = bhjVar;
        this.d = bhpVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new bhi(this.c, this.d, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r6.invoke(r5) != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        if (r1.invoke(r5) == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r5.b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L13
            defpackage.woy.dF(r6)
            goto L50
        L13:
            java.lang.Object r5 = r5.a
            defpackage.woy.dF(r6)
            goto L66
        L19:
            defpackage.woy.dF(r6)     // Catch: java.lang.Throwable -> L21
            goto L42
        L1d:
            defpackage.woy.dF(r6)     // Catch: java.lang.Throwable -> L21
            goto L35
        L21:
            r6 = move-exception
            goto L53
        L23:
            defpackage.woy.dF(r6)
            bhj r6 = r5.c     // Catch: java.lang.Throwable -> L21
            afec r6 = r6.a     // Catch: java.lang.Throwable -> L21
            if (r6 == 0) goto L35
            r5.b = r4     // Catch: java.lang.Throwable -> L21
            java.lang.Object r6 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L21
            if (r6 != r0) goto L35
            goto L64
        L35:
            bhp r6 = r5.d     // Catch: java.lang.Throwable -> L21
            bhj r1 = r5.c     // Catch: java.lang.Throwable -> L21
            r5.b = r3     // Catch: java.lang.Throwable -> L21
            java.lang.Object r6 = r6.b(r1, r5)     // Catch: java.lang.Throwable -> L21
            if (r6 != r0) goto L42
            goto L64
        L42:
            bhj r6 = r5.c
            afec r6 = r6.b
            if (r6 == 0) goto L50
            r5.b = r2
            java.lang.Object r5 = r6.invoke(r5)
            if (r5 == r0) goto L64
        L50:
            afak r5 = defpackage.afak.a
            return r5
        L53:
            bhj r1 = r5.c
            afec r1 = r1.b
            if (r1 == 0) goto L65
            r5.a = r6
            r2 = 4
            r5.b = r2
            java.lang.Object r5 = r1.invoke(r5)
            if (r5 != r0) goto L65
        L64:
            return r0
        L65:
            r5 = r6
        L66:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhi.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bhi) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
