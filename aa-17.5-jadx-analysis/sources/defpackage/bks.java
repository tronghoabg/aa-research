package defpackage;

/* loaded from: classes.dex */
public final class bks extends afdd implements afeg {
    int a;
    final /* synthetic */ bjx b;
    final /* synthetic */ ben c;
    final /* synthetic */ bwd d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bks(bwd bwdVar, bjx bjxVar, ben benVar, afck afckVar) {
        super(afckVar);
        this.d = bwdVar;
        this.b = bjxVar;
        this.c = benVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        bks bksVar = new bks(this.d, this.b, this.c, afckVar);
        bksVar.e = obj;
        return bksVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (defpackage.awx.A(r2, r3, r7, r6, r17) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (defpackage.awx.u(r2, r4, r6, r17) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (defpackage.awx.v(r2, r4, r6, r7, r17) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Type inference failed for: r14v1, types: [dcc, java.lang.Object] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            afcr r1 = defpackage.afcr.a
            int r2 = r0.a
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1c
            if (r2 == r5) goto L12
            defpackage.woy.dF(r18)
            goto Lad
        L12:
            java.lang.Object r2 = r0.e
            crl r2 = (defpackage.crl) r2
            defpackage.woy.dF(r18)
            r6 = r18
            goto L2d
        L1c:
            defpackage.woy.dF(r18)
            java.lang.Object r2 = r0.e
            crl r2 = (defpackage.crl) r2
            r0.e = r2
            r0.a = r5
            java.lang.Object r6 = defpackage.awx.t(r2, r0)
            if (r6 == r1) goto Lb0
        L2d:
            bwd r7 = r0.d
            cql r6 = (defpackage.cql) r6
            java.util.List r8 = r6.a
            java.lang.Object r9 = r7.b
            r10 = 0
            java.lang.Object r11 = r8.get(r10)
            cqu r11 = (defpackage.cqu) r11
            if (r9 == 0) goto L5b
            long r12 = r11.b
            cqu r9 = (defpackage.cqu) r9
            long r14 = r9.b
            long r12 = r12 - r14
            java.lang.Object r14 = r7.c
            long r15 = r14.e()
            int r12 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r12 >= 0) goto L5b
            boolean r9 = defpackage.awx.s(r14, r9, r11)
            if (r9 == 0) goto L5b
            int r9 = r7.a
            int r9 = r9 + r5
            r7.a = r9
            goto L5d
        L5b:
            r7.a = r5
        L5d:
            r7.b = r11
            boolean r9 = defpackage.bky.a(r6)
            r11 = 0
            if (r9 == 0) goto L8e
            int r3 = r6.c
            r3 = r3 & 33
            if (r3 == 0) goto Lad
            int r3 = r8.size()
        L70:
            if (r10 >= r3) goto L81
            java.lang.Object r5 = r8.get(r10)
            cqu r5 = (defpackage.cqu) r5
            boolean r5 = r5.c()
            if (r5 != 0) goto Lad
            int r10 = r10 + 1
            goto L70
        L81:
            bjx r3 = r0.b
            r0.e = r11
            r0.a = r4
            java.lang.Object r0 = defpackage.awx.A(r2, r3, r7, r6, r0)
            if (r0 != r1) goto Lad
            goto Lb0
        L8e:
            ben r4 = r0.c
            if (r4 == 0) goto Lad
            int r7 = r7.a
            if (r7 != r5) goto La1
            r0.e = r11
            r0.a = r3
            java.lang.Object r0 = defpackage.awx.u(r2, r4, r6, r0)
            if (r0 != r1) goto Lad
            goto Lb0
        La1:
            r0.e = r11
            r3 = 4
            r0.a = r3
            java.lang.Object r0 = defpackage.awx.v(r2, r4, r6, r7, r0)
            if (r0 != r1) goto Lad
            goto Lb0
        Lad:
            afak r0 = defpackage.afak.a
            return r0
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bks.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bks) b((crl) obj, (afck) obj2)).hT(afak.a);
    }
}
