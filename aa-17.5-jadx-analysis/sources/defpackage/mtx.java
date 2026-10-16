package defpackage;

/* loaded from: classes.dex */
public final class mtx extends afde implements afeg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ eqj d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtx(boolean z, boolean z2, eqj eqjVar, afck afckVar) {
        super(2, afckVar);
        this.b = z;
        this.c = z2;
        this.d = eqjVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        mtx mtxVar = new mtx(this.b, this.c, this.d, afckVar);
        mtxVar.e = obj;
        return mtxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r1.t(r5, r4) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1.t(r5, r4) == r0) goto L21;
     */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 == r2) goto Ld
            goto L15
        Ld:
            java.lang.Object r1 = r4.e
            sx r1 = (defpackage.sx) r1
            defpackage.woy.dF(r5)
            goto L39
        L15:
            defpackage.woy.dF(r5)
            goto L61
        L19:
            defpackage.woy.dF(r5)
            java.lang.Object r5 = r4.e
            r1 = r5
            sx r1 = (defpackage.sx) r1
            boolean r5 = r4.b
            if (r5 != 0) goto L4f
            boolean r5 = r4.c
            if (r5 == 0) goto L2a
            goto L4f
        L2a:
            r5 = 5
            j$.time.Duration r5 = defpackage.wub.an(r5)
            r4.e = r1
            r4.a = r2
            java.lang.Object r5 = defpackage.wub.aq(r5, r4)
            if (r5 == r0) goto L60
        L39:
            eqj r5 = r4.d
            java.lang.Object r5 = r5.e()
            r5.getClass()
            r2 = 0
            r4.e = r2
            r2 = 3
            r4.a = r2
            java.lang.Object r4 = r1.t(r5, r4)
            if (r4 != r0) goto L61
            goto L60
        L4f:
            eqj r5 = r4.d
            java.lang.Object r5 = r5.e()
            r5.getClass()
            r4.a = r3
            java.lang.Object r4 = r1.t(r5, r4)
            if (r4 != r0) goto L61
        L60:
            return r0
        L61:
            afak r4 = defpackage.afak.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtx.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((mtx) b((sx) obj, (afck) obj2)).hT(afak.a);
    }
}
