package defpackage;

/* loaded from: classes.dex */
final class bmq extends afde implements afeg {
    int a;
    final /* synthetic */ adu b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ bmr e;
    final /* synthetic */ asd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmq(adu aduVar, float f, boolean z, bmr bmrVar, asd asdVar, afck afckVar) {
        super(2, afckVar);
        this.b = aduVar;
        this.c = f;
        this.d = z;
        this.e = bmrVar;
        this.f = asdVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new bmq(this.b, this.c, this.d, this.e, this.f, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r7.e(r1, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (defpackage.bsv.a(r7, r3, r1, r2, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        return r0;
     */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r6.a
            r2 = 1
            defpackage.woy.dF(r7)
            if (r1 == 0) goto Lb
            goto L72
        Lb:
            adu r7 = r6.b
            java.lang.Object r1 = r7.c()
            dlj r1 = (defpackage.dlj) r1
            float r1 = r1.a
            float r3 = r6.c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L72
            boolean r1 = r6.d
            if (r1 != 0) goto L2f
            dlj r1 = new dlj
            r1.<init>(r3)
            r6.a = r2
            java.lang.Object r6 = r7.e(r1, r6)
            if (r6 != r0) goto L72
            goto L71
        L2f:
            java.lang.Object r1 = r7.c()
            dlj r1 = (defpackage.dlj) r1
            float r1 = r1.a
            bmr r2 = r6.e
            float r4 = r2.a
            int r4 = java.lang.Float.compare(r1, r4)
            if (r4 != 0) goto L49
            asi r1 = new asi
            r4 = 0
            r1.<init>(r4)
            goto L66
        L49:
            float r4 = r2.c
            int r4 = java.lang.Float.compare(r1, r4)
            if (r4 != 0) goto L57
            asa r1 = new asa
            r1.<init>()
            goto L66
        L57:
            float r2 = r2.b
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 != 0) goto L65
            ary r1 = new ary
            r1.<init>()
            goto L66
        L65:
            r1 = 0
        L66:
            asd r2 = r6.f
            r4 = 2
            r6.a = r4
            java.lang.Object r6 = defpackage.bsv.a(r7, r3, r1, r2, r6)
            if (r6 != r0) goto L72
        L71:
            return r0
        L72:
            afak r6 = defpackage.afak.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmq.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bmq) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
