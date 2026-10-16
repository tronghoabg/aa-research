package defpackage;

/* loaded from: classes.dex */
final class bhf extends afde implements afeg {
    int a;
    final /* synthetic */ bhg b;
    final /* synthetic */ long c;
    final /* synthetic */ bhp d;
    final /* synthetic */ bhe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhf(bhg bhgVar, long j, bhp bhpVar, bhe bheVar, afck afckVar) {
        super(2, afckVar);
        this.b = bhgVar;
        this.c = j;
        this.d = bhpVar;
        this.e = bheVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new bhf(this.b, this.c, this.d, this.e, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r6.b(r1, r5) == r0) goto L13;
     */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r5.a
            r2 = 1
            defpackage.woy.dF(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L23
            goto L31
        Ld:
            bhg r6 = r5.b
            afeg r6 = r6.a
            if (r6 == 0) goto L23
            long r3 = r5.c
            cja r1 = new cja
            r1.<init>(r3)
            r5.a = r2
            java.lang.Object r6 = r6.invoke(r1, r5)
            if (r6 != r0) goto L23
            goto L30
        L23:
            bhp r6 = r5.d
            bhe r1 = r5.e
            r2 = 2
            r5.a = r2
            java.lang.Object r5 = r6.b(r1, r5)
            if (r5 != r0) goto L31
        L30:
            return r0
        L31:
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhf.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bhf) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
