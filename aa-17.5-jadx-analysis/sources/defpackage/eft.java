package defpackage;

/* loaded from: classes2.dex */
final class eft extends afde implements afec {
    Object a;
    Object b;
    int c;
    final /* synthetic */ affv d;
    final /* synthetic */ egd e;
    final /* synthetic */ afft f;
    final /* synthetic */ afeg g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eft(affv affvVar, egd egdVar, afft afftVar, afeg afegVar, boolean z, afck afckVar) {
        super(1, afckVar);
        this.d = affvVar;
        this.e = egdVar;
        this.f = afftVar;
        this.g = afegVar;
        this.h = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r6 != r0) goto L19;
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
            int r1 = r5.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L16
            java.lang.Object r0 = r5.b
            java.lang.Object r5 = r5.a
            eeq r5 = (defpackage.eeq) r5
            defpackage.woy.dF(r6)
            goto L6f
        L16:
            java.lang.Object r1 = r5.a
            afft r1 = (defpackage.afft) r1
            defpackage.woy.dF(r6)     // Catch: defpackage.eeq -> L57
            goto L4e
        L1e:
            java.lang.Object r1 = r5.a
            affv r1 = (defpackage.affv) r1
            defpackage.woy.dF(r6)     // Catch: defpackage.eeq -> L57
            goto L38
        L26:
            defpackage.woy.dF(r6)
            affv r1 = r5.d     // Catch: defpackage.eeq -> L57
            egd r6 = r5.e     // Catch: defpackage.eeq -> L57
            r5.a = r1     // Catch: defpackage.eeq -> L57
            r5.c = r3     // Catch: defpackage.eeq -> L57
            java.lang.Object r6 = r6.h(r5)     // Catch: defpackage.eeq -> L57
            if (r6 != r0) goto L38
            goto L7c
        L38:
            r1.a = r6     // Catch: defpackage.eeq -> L57
            afft r1 = r5.f     // Catch: defpackage.eeq -> L57
            afeg r6 = r5.g     // Catch: defpackage.eeq -> L57
            boolean r4 = r5.h     // Catch: defpackage.eeq -> L57
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: defpackage.eeq -> L57
            r5.a = r1     // Catch: defpackage.eeq -> L57
            r5.c = r2     // Catch: defpackage.eeq -> L57
            java.lang.Object r6 = r6.invoke(r4, r5)     // Catch: defpackage.eeq -> L57
            if (r6 == r0) goto L7c
        L4e:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: defpackage.eeq -> L57
            int r6 = r6.intValue()     // Catch: defpackage.eeq -> L57
            r1.a = r6     // Catch: defpackage.eeq -> L57
            goto L79
        L57:
            afft r6 = r5.f
            egd r1 = r5.e
            affv r2 = r5.d
            java.lang.Object r2 = r2.a
            r4 = 0
            r5.a = r4
            r5.b = r6
            r4 = 3
            r5.c = r4
            java.lang.Object r5 = r1.j(r2, r3, r5)
            if (r5 == r0) goto L7c
            r0 = r6
            r6 = r5
        L6f:
            java.lang.Number r6 = (java.lang.Number) r6
            int r5 = r6.intValue()
            afft r0 = (defpackage.afft) r0
            r0.a = r5
        L79:
            afak r5 = defpackage.afak.a
            return r5
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eft.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eft(this.d, this.e, this.f, this.g, this.h, (afck) obj).hT(afak.a);
    }
}
