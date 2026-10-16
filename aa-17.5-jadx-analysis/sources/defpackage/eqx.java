package defpackage;

/* loaded from: classes.dex */
public final class eqx extends afde implements afeg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ept d;
    final /* synthetic */ eps e;
    final /* synthetic */ aitx f;
    final /* synthetic */ afeg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqx(ept eptVar, eps epsVar, aitx aitxVar, afeg afegVar, afck afckVar) {
        super(2, afckVar);
        this.d = eptVar;
        this.e = epsVar;
        this.f = aitxVar;
        this.g = afegVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new eqx(this.d, this.e, this.f, this.g, afckVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[SYNTHETIC] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r12.c
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r1 = r12.b
            java.lang.Object r3 = r12.a
            defpackage.woy.dF(r13)     // Catch: java.lang.Throwable -> L10
            goto L89
        L10:
            r0 = move-exception
            r13 = r0
            goto La6
        L14:
            defpackage.woy.dF(r13)
            ept r13 = r12.d
            eps r1 = r13.a()
            eps r3 = defpackage.eps.a
            if (r1 == r3) goto Lbf
            affv r6 = new affv
            r6.<init>()
            affv r1 = new affv
            r1.<init>()
            eps r3 = r12.e     // Catch: java.lang.Throwable -> La3
            aitx r7 = r12.f     // Catch: java.lang.Throwable -> La3
            afeg r11 = r12.g     // Catch: java.lang.Throwable -> La3
            r12.a = r6     // Catch: java.lang.Throwable -> La3
            r12.b = r1     // Catch: java.lang.Throwable -> La3
            r4 = 1
            r12.c = r4     // Catch: java.lang.Throwable -> La3
            aitg r9 = new aitg     // Catch: java.lang.Throwable -> La3
            afck r5 = defpackage.affa.s(r12)     // Catch: java.lang.Throwable -> La3
            r9.<init>(r5, r4)     // Catch: java.lang.Throwable -> La3
            r9.z()     // Catch: java.lang.Throwable -> La3
            epq r5 = defpackage.epr.Companion     // Catch: java.lang.Throwable -> La3
            int r5 = r3.ordinal()     // Catch: java.lang.Throwable -> La3
            if (r5 == 0) goto L67
            if (r5 == r4) goto L67
            r4 = 2
            if (r5 == r4) goto L63
            r4 = 3
            if (r5 == r4) goto L60
            r4 = 4
            if (r5 != r4) goto L5a
            epr r4 = defpackage.epr.ON_RESUME     // Catch: java.lang.Throwable -> La3
            goto L65
        L5a:
            aezs r13 = new aezs     // Catch: java.lang.Throwable -> La3
            r13.<init>()     // Catch: java.lang.Throwable -> La3
            throw r13     // Catch: java.lang.Throwable -> La3
        L60:
            epr r4 = defpackage.epr.ON_START     // Catch: java.lang.Throwable -> La3
            goto L65
        L63:
            epr r4 = defpackage.epr.ON_CREATE     // Catch: java.lang.Throwable -> La3
        L65:
            r5 = r4
            goto L68
        L67:
            r5 = r2
        L68:
            epr r8 = defpackage.epq.a(r3)     // Catch: java.lang.Throwable -> La3
            ajdz r10 = new ajdz     // Catch: java.lang.Throwable -> La3
            r10.<init>()     // Catch: java.lang.Throwable -> La3
            eqw r4 = new eqw     // Catch: java.lang.Throwable -> La3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La3
            r1.a = r4     // Catch: java.lang.Throwable -> La3
            java.lang.Object r3 = r1.a     // Catch: java.lang.Throwable -> La3
            r3.getClass()     // Catch: java.lang.Throwable -> La3
            epy r3 = (defpackage.epy) r3     // Catch: java.lang.Throwable -> La3
            r13.c(r3)     // Catch: java.lang.Throwable -> La3
            java.lang.Object r13 = r9.k()     // Catch: java.lang.Throwable -> La3
            if (r13 == r0) goto La2
            r3 = r6
        L89:
            affv r3 = (defpackage.affv) r3
            java.lang.Object r13 = r3.a
            aivh r13 = (defpackage.aivh) r13
            if (r13 == 0) goto L94
            r13.s(r2)
        L94:
            affv r1 = (defpackage.affv) r1
            java.lang.Object r13 = r1.a
            epy r13 = (defpackage.epy) r13
            if (r13 == 0) goto Lbf
            ept r12 = r12.d
            r12.d(r13)
            goto Lbf
        La2:
            return r0
        La3:
            r0 = move-exception
            r13 = r0
            r3 = r6
        La6:
            affv r3 = (defpackage.affv) r3
            java.lang.Object r0 = r3.a
            aivh r0 = (defpackage.aivh) r0
            if (r0 == 0) goto Lb1
            r0.s(r2)
        Lb1:
            affv r1 = (defpackage.affv) r1
            java.lang.Object r0 = r1.a
            epy r0 = (defpackage.epy) r0
            if (r0 == 0) goto Lbe
            ept r12 = r12.d
            r12.d(r0)
        Lbe:
            throw r13
        Lbf:
            afak r12 = defpackage.afak.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqx.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((eqx) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
