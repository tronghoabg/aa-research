package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class blm extends defpackage.afee implements defpackage.affc {
    int a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blm(defpackage.affc affcVar, defpackage.afdk afdkVar, int i) {
        super(1, afdkVar);
        this.c = i;
        this.b = affcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r7 == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [affc, java.lang.Object] */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.c
            r1 = 1
            if (r0 == 0) goto L23
            afdr r0 = defpackage.afdr.a
            int r2 = r6.a
            defpackage.afga.cz(r7)
            if (r2 == 0) goto Lf
            return r7
        Lf:
            java.lang.Object r7 = r6.b
            r6.a = r1
            afdo r1 = r6.gT()
            bwq r1 = defpackage.bxi.d(r1)
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L22
            return r0
        L22:
            return r6
        L23:
            afdr r0 = defpackage.afdr.a
            int r2 = r6.a
            if (r2 == 0) goto L33
            if (r2 == r1) goto L2f
            defpackage.afga.cz(r7)
            goto L69
        L2f:
            defpackage.afga.cz(r7)
            goto L43
        L33:
            defpackage.afga.cz(r7)
            java.lang.Object r7 = r6.b
            r6.a = r1
            blw r7 = (defpackage.blw) r7
            java.lang.Object r7 = r7.g(r6)
            if (r7 != r0) goto L43
            goto L68
        L43:
            java.lang.Object r7 = r6.b
            blw r7 = (defpackage.blw) r7
            afau r2 = r7.h()
            if (r2 == 0) goto L69
            java.lang.Object r3 = r2.a
            java.lang.Object r2 = r2.b
            java.lang.String r3 = (java.lang.String) r3
            dgc r2 = (defpackage.dgc) r2
            long r4 = r2.b
            bki r7 = r7.t
            if (r7 == 0) goto L69
            r2 = 2
            r6.a = r2
            java.lang.Object r7 = r7.e(r3, r4, r6)
            if (r7 == r0) goto L66
            afbk r7 = defpackage.afbk.a
        L66:
            if (r7 != r0) goto L69
        L68:
            return r0
        L69:
            java.lang.Object r6 = r6.b
            blw r6 = (defpackage.blw) r6
            r6.s = r1
            afbk r6 = defpackage.afbk.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blm.hf(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [affc, java.lang.Object] */
    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        if (this.c != 0) {
            return new defpackage.blm((defpackage.affc) this.b, (defpackage.afdk) obj, 1).hf(defpackage.afbk.a);
        }
        return new defpackage.blm((defpackage.blw) this.b, (defpackage.afdk) obj, 0).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blm(defpackage.blw blwVar, defpackage.afdk afdkVar, int i) {
        super(1, afdkVar);
        this.c = i;
        this.b = blwVar;
    }
}
