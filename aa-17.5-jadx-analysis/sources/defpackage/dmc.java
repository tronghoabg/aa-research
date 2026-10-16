package defpackage;

/* loaded from: classes2.dex */
final class dmc extends afde implements afeg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dme c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmc(boolean z, dme dmeVar, long j, afck afckVar) {
        super(2, afckVar);
        this.b = z;
        this.c = dmeVar;
        this.d = j;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new dmc(this.b, this.c, this.d, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r10 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r10 != r0) goto L10;
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
            r2 = 1
            defpackage.woy.dF(r10)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L22
            goto L38
        Ld:
            boolean r10 = r9.b
            dme r1 = r9.c
            if (r10 != 0) goto L27
            long r6 = r9.d
            r9.a = r2
            tp r3 = r1.w
            r4 = 0
            r8 = r9
            java.lang.Object r10 = r3.d(r4, r6, r8)
            if (r10 == r0) goto L37
        L22:
            dlv r10 = (defpackage.dlv) r10
            long r9 = r10.a
            goto L3c
        L27:
            r6 = r9
            long r2 = r6.d
            r9 = 2
            r6.a = r9
            tp r1 = r1.w
            r4 = 0
            java.lang.Object r10 = r1.d(r2, r4, r6)
            if (r10 != r0) goto L38
        L37:
            return r0
        L38:
            dlv r10 = (defpackage.dlv) r10
            long r9 = r10.a
        L3c:
            afak r9 = defpackage.afak.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmc.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dmc) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
