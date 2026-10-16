package defpackage;

/* loaded from: classes2.dex */
public final class efk extends afde implements afec {
    Object a;
    int b;
    final /* synthetic */ egd c;
    final /* synthetic */ wci d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efk(egd egdVar, wci wciVar, afck afckVar) {
        super(1, afckVar);
        this.c = egdVar;
        this.d = wciVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(5:5|24|6|20|21)(1:10))(1:11)|12|22|13|(3:15|20|21)(1:16)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r10 = r0;
        r9 = r10;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [afco, java.lang.Object] */
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
            if (r1 == 0) goto L16
            if (r1 == r2) goto L12
            java.lang.Object r9 = r9.a
            defpackage.woy.dF(r10)     // Catch: java.lang.Throwable -> Lf
            goto L4f
        Lf:
            r0 = move-exception
            r10 = r0
            goto L4b
        L12:
            defpackage.woy.dF(r10)
            goto L1c
        L16:
            defpackage.woy.dF(r10)
            r9.b = r2
            r10 = 0
        L1c:
            wci r3 = r9.d
            egd r2 = r9.c
            r4 = r10
            fdf r4 = (defpackage.fdf) r4
            java.lang.Object r10 = r3.b
            java.lang.Object r1 = r3.d     // Catch: java.lang.Throwable -> L46
            afco r5 = r9.hH()     // Catch: java.lang.Throwable -> L46
            afco r7 = r1.plus(r5)     // Catch: java.lang.Throwable -> L46
            bqi r1 = new bqi     // Catch: java.lang.Throwable -> L46
            r5 = 0
            r6 = 3
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L46
            r9.a = r10     // Catch: java.lang.Throwable -> L46
            r2 = 2
            r9.b = r2     // Catch: java.lang.Throwable -> L46
            java.lang.Object r9 = defpackage.ahnc.a(r7, r1, r9)     // Catch: java.lang.Throwable -> L46
            if (r9 == r0) goto L45
            r8 = r10
            r10 = r9
            r9 = r8
            goto L4f
        L45:
            return r0
        L46:
            r0 = move-exception
            r9 = r0
            r8 = r10
            r10 = r9
            r9 = r8
        L4b:
            java.lang.Object r10 = defpackage.woy.dE(r10)
        L4f:
            aitm r9 = (defpackage.aitm) r9
            boolean r9 = defpackage.aiir.b(r9, r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efk.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new efk(this.c, this.d, (afck) obj).hT(afak.a);
    }
}
