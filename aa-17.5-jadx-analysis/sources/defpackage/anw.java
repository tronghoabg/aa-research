package defpackage;

/* loaded from: classes.dex */
public final class anw extends afdd implements afeg {
    int a;
    final /* synthetic */ afdr b;
    final /* synthetic */ afeh c;
    final /* synthetic */ afeg d;
    final /* synthetic */ afdr e;
    final /* synthetic */ afec f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anw(afdr afdrVar, afeh afehVar, afeg afegVar, afdr afdrVar2, afec afecVar, afck afckVar) {
        super(afckVar);
        this.b = afdrVar;
        this.c = afehVar;
        this.d = afegVar;
        this.e = afdrVar2;
        this.f = afecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        anw anwVar = new anw(this.b, this.c, this.d, this.e, this.f, afckVar);
        anwVar.g = obj;
        return anwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (defpackage.ca.aU(r1, (defpackage.cqu) r9, r3, r4, r5, r6, r8) == r0) goto L14;
     */
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.woy.dF(r9)
            goto L43
        Ld:
            java.lang.Object r1 = r8.g
            crl r1 = (defpackage.crl) r1
            defpackage.woy.dF(r9)
            goto L2a
        L15:
            defpackage.woy.dF(r9)
            java.lang.Object r9 = r8.g
            r1 = r9
            crl r1 = (defpackage.crl) r1
            cqm r9 = defpackage.cqm.a
            r8.g = r1
            r8.a = r2
            r2 = 0
            java.lang.Object r9 = defpackage.aqx.a(r1, r2, r9, r8)
            if (r9 == r0) goto L46
        L2a:
            afeh r3 = r8.c
            afeg r4 = r8.d
            afdr r5 = r8.e
            afec r6 = r8.f
            r2 = r9
            cqu r2 = (defpackage.cqu) r2
            r9 = 0
            r8.g = r9
            r9 = 2
            r8.a = r9
            r7 = r8
            java.lang.Object r8 = defpackage.ca.aU(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L43
            goto L46
        L43:
            afak r8 = defpackage.afak.a
            return r8
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anw.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((anw) b((crl) obj, (afck) obj2)).hT(afak.a);
    }
}
