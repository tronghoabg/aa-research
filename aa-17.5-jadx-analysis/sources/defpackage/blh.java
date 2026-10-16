package defpackage;

/* loaded from: classes.dex */
public final class blh extends afde implements afec {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blh(afec afecVar, afck afckVar, int i) {
        super(1, afckVar);
        this.c = i;
        this.b = afecVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r7 == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [afec, java.lang.Object] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.c
            r1 = 1
            if (r0 == 0) goto L23
            afcr r0 = defpackage.afcr.a
            int r2 = r6.a
            defpackage.woy.dF(r7)
            if (r2 == 0) goto Lf
            return r7
        Lf:
            java.lang.Object r7 = r6.b
            r6.a = r1
            afco r1 = r6.hH()
            bwj r1 = defpackage.czz.ah(r1)
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L22
            return r0
        L22:
            return r6
        L23:
            afcr r0 = defpackage.afcr.a
            int r2 = r6.a
            if (r2 == 0) goto L33
            if (r2 == r1) goto L2f
            defpackage.woy.dF(r7)
            goto L69
        L2f:
            defpackage.woy.dF(r7)
            goto L43
        L33:
            defpackage.woy.dF(r7)
            java.lang.Object r7 = r6.b
            r6.a = r1
            blr r7 = (defpackage.blr) r7
            java.lang.Object r7 = r7.g(r6)
            if (r7 != r0) goto L43
            goto L68
        L43:
            java.lang.Object r7 = r6.b
            blr r7 = (defpackage.blr) r7
            aezu r2 = r7.h()
            if (r2 == 0) goto L69
            java.lang.Object r3 = r2.a
            java.lang.Object r2 = r2.b
            java.lang.String r3 = (java.lang.String) r3
            dfv r2 = (defpackage.dfv) r2
            long r4 = r2.b
            bke r7 = r7.t
            if (r7 == 0) goto L69
            r2 = 2
            r6.a = r2
            java.lang.Object r7 = r7.e(r3, r4, r6)
            if (r7 == r0) goto L66
            afak r7 = defpackage.afak.a
        L66:
            if (r7 != r0) goto L69
        L68:
            return r0
        L69:
            java.lang.Object r6 = r6.b
            blr r6 = (defpackage.blr) r6
            r6.s = r1
            afak r6 = defpackage.afak.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blh.hT(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.c != 0) {
            return new blh((afec) this.b, (afck) obj, 1).hT(afak.a);
        }
        return new blh((blr) this.b, (afck) obj, 0).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blh(blr blrVar, afck afckVar, int i) {
        super(1, afckVar);
        this.c = i;
        this.b = blrVar;
    }
}
