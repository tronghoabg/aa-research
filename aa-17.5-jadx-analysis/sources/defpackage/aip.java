package defpackage;

/* loaded from: classes.dex */
final class aip extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ aivh c;
    final /* synthetic */ long d;
    final /* synthetic */ asf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aip(aivh aivhVar, long j, asf asfVar, afck afckVar) {
        super(2, afckVar);
        this.c = aivhVar;
        this.d = j;
        this.e = asfVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new aip(this.c, this.d, this.e, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r6.b(r1, r5) != r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L10
            defpackage.woy.dF(r6)
            goto L4f
        L10:
            java.lang.Object r1 = r5.a
            defpackage.woy.dF(r6)
            goto L40
        L16:
            defpackage.woy.dF(r6)
            goto L28
        L1a:
            defpackage.woy.dF(r6)
            aivh r6 = r5.c
            r5.b = r3
            java.lang.Object r6 = r6.n(r5)
            if (r6 != r0) goto L28
            goto L52
        L28:
            long r3 = r5.d
            asi r6 = new asi
            r6.<init>(r3)
            asj r1 = new asj
            r1.<init>(r6)
            asf r3 = r5.e
            r5.a = r1
            r5.b = r2
            java.lang.Object r6 = r3.b(r6, r5)
            if (r6 == r0) goto L52
        L40:
            asf r6 = r5.e
            r2 = 0
            r5.a = r2
            r2 = 3
            r5.b = r2
            java.lang.Object r5 = r6.b(r1, r5)
            if (r5 != r0) goto L4f
            goto L52
        L4f:
            afak r5 = defpackage.afak.a
            return r5
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aip.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aip) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
