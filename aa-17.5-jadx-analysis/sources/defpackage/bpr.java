package defpackage;

/* loaded from: classes2.dex */
final class bpr extends afde implements afeg {
    int a;
    final /* synthetic */ adu b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ asd e;
    final /* synthetic */ bwq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpr(adu aduVar, float f, boolean z, asd asdVar, bwq bwqVar, afck afckVar) {
        super(2, afckVar);
        this.b = aduVar;
        this.c = f;
        this.d = z;
        this.e = asdVar;
        this.f = bwqVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new bpr(this.b, this.c, this.d, this.e, this.f, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r6.e(r1, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (defpackage.bsv.a(r6, r3, r1, r2, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
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
            if (r1 == 0) goto Lb
            goto L43
        Lb:
            adu r6 = r5.b
            java.lang.Object r1 = r6.c()
            dlj r1 = (defpackage.dlj) r1
            float r1 = r1.a
            float r3 = r5.c
            boolean r1 = defpackage.dlj.c(r1, r3)
            if (r1 != 0) goto L4a
            boolean r1 = r5.d
            if (r1 != 0) goto L2f
            dlj r1 = new dlj
            r1.<init>(r3)
            r5.a = r2
            java.lang.Object r6 = r6.e(r1, r5)
            if (r6 != r0) goto L43
            goto L42
        L2f:
            bwq r1 = r5.f
            java.lang.Object r1 = r1.a()
            asd r1 = (defpackage.asd) r1
            asd r2 = r5.e
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = defpackage.bsv.a(r6, r3, r1, r2, r5)
            if (r6 != r0) goto L43
        L42:
            return r0
        L43:
            bwq r6 = r5.f
            asd r5 = r5.e
            r6.b(r5)
        L4a:
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpr.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bpr) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
