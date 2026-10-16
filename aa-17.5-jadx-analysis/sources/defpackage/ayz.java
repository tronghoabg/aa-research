package defpackage;

/* loaded from: classes.dex */
final class ayz extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ aza c;
    final /* synthetic */ aew d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayz(aza azaVar, aew aewVar, long j, afck afckVar) {
        super(2, afckVar);
        this.c = azaVar;
        this.d = aewVar;
        this.e = j;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new ayz(this.c, this.d, this.e, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (defpackage.adu.k(r2, r3, r4, r5, r6, 4) != r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r9.b
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Le
            defpackage.woy.dF(r10)     // Catch: java.util.concurrent.CancellationException -> L75
            r6 = r9
            goto L6d
        Le:
            java.lang.Object r1 = r9.a
            defpackage.woy.dF(r10)     // Catch: java.util.concurrent.CancellationException -> L75
            goto L38
        L14:
            defpackage.woy.dF(r10)
            aza r10 = r9.c     // Catch: java.util.concurrent.CancellationException -> L75
            adu r10 = r10.l     // Catch: java.util.concurrent.CancellationException -> L75
            r10.j()     // Catch: java.util.concurrent.CancellationException -> L75
            aew r1 = r9.d
            boolean r3 = r10.j()     // Catch: java.util.concurrent.CancellationException -> L75
            if (r3 != 0) goto L3f
            long r3 = r9.e     // Catch: java.util.concurrent.CancellationException -> L75
            dlo r5 = new dlo     // Catch: java.util.concurrent.CancellationException -> L75
            r5.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L75
            r9.a = r1     // Catch: java.util.concurrent.CancellationException -> L75
            r9.b = r2     // Catch: java.util.concurrent.CancellationException -> L75
            java.lang.Object r10 = r10.e(r5, r9)     // Catch: java.util.concurrent.CancellationException -> L75
            if (r10 != r0) goto L38
            goto L6c
        L38:
            aza r10 = r9.c     // Catch: java.util.concurrent.CancellationException -> L75
            afdr r10 = r10.b     // Catch: java.util.concurrent.CancellationException -> L75
            r10.invoke()     // Catch: java.util.concurrent.CancellationException -> L75
        L3f:
            r4 = r1
            aza r10 = r9.c     // Catch: java.util.concurrent.CancellationException -> L75
            adu r2 = r10.l     // Catch: java.util.concurrent.CancellationException -> L75
            java.lang.Object r1 = r2.d()     // Catch: java.util.concurrent.CancellationException -> L75
            dlo r1 = (defpackage.dlo) r1     // Catch: java.util.concurrent.CancellationException -> L75
            long r5 = r1.a     // Catch: java.util.concurrent.CancellationException -> L75
            long r7 = r9.e     // Catch: java.util.concurrent.CancellationException -> L75
            long r5 = defpackage.dlo.c(r5, r7)     // Catch: java.util.concurrent.CancellationException -> L75
            dlo r3 = new dlo     // Catch: java.util.concurrent.CancellationException -> L75
            r3.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L75
            r6 = r5
            abl r5 = new abl     // Catch: java.util.concurrent.CancellationException -> L75
            r1 = 5
            r5.<init>(r10, r6, r1)     // Catch: java.util.concurrent.CancellationException -> L75
            r10 = 0
            r9.a = r10     // Catch: java.util.concurrent.CancellationException -> L75
            r10 = 2
            r9.b = r10     // Catch: java.util.concurrent.CancellationException -> L75
            r7 = 4
            r6 = r9
            java.lang.Object r9 = defpackage.adu.k(r2, r3, r4, r5, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L75
            if (r9 != r0) goto L6d
        L6c:
            return r0
        L6d:
            aza r9 = r6.c     // Catch: java.util.concurrent.CancellationException -> L75
            r10 = 0
            r9.f(r10)     // Catch: java.util.concurrent.CancellationException -> L75
            r9.f = r10     // Catch: java.util.concurrent.CancellationException -> L75
        L75:
            afak r9 = defpackage.afak.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayz.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ayz) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
