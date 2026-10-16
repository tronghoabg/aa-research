package defpackage;

/* loaded from: classes2.dex */
public final class dmd extends afde implements afeg {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmd(long j, crl crlVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = j;
        this.c = crlVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.d;
        if (i == 0) {
            return new dmd((dme) this.c, this.b, afckVar, 0);
        }
        if (i == 1) {
            return new dmd(this.b, (crl) this.c, afckVar, 1);
        }
        return new dmd((grb) this.c, this.b, afckVar, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (defpackage.aiow.c(8, r6) == r0) goto L22;
     */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.d
            r1 = 1
            if (r0 == 0) goto L77
            if (r0 == r1) goto L31
            afcr r0 = defpackage.afcr.a
            int r2 = r6.a
            defpackage.woy.dF(r7)
            if (r2 == 0) goto L11
            return r7
        L11:
            java.lang.Object r7 = r6.c
            grb r7 = (defpackage.grb) r7
            usw r7 = r7.m
            eqj r7 = r7.c()
            aiyk r7 = defpackage.dtx.m(r7)
            long r2 = r6.b
            gqy r4 = new gqy
            r5 = 0
            r4.<init>(r2, r5)
            r6.a = r1
            java.lang.Object r6 = defpackage.afpt.q(r7, r4, r6)
            if (r6 != r0) goto L30
            return r0
        L30:
            return r6
        L31:
            afcr r0 = defpackage.afcr.a
            int r2 = r6.a
            if (r2 == 0) goto L41
            if (r2 == r1) goto L3d
            defpackage.woy.dF(r7)
            goto L5e
        L3d:
            defpackage.woy.dF(r7)
            goto L52
        L41:
            defpackage.woy.dF(r7)
            long r2 = r6.b
            r6.a = r1
            r4 = -8
            long r2 = r2 + r4
            java.lang.Object r7 = defpackage.aiow.c(r2, r6)
            if (r7 != r0) goto L52
            goto L5d
        L52:
            r7 = 2
            r6.a = r7
            r1 = 8
            java.lang.Object r7 = defpackage.aiow.c(r1, r6)
            if (r7 != r0) goto L5e
        L5d:
            return r0
        L5e:
            java.lang.Object r7 = r6.c
            crl r7 = (defpackage.crl) r7
            aitf r7 = r7.a
            if (r7 == 0) goto L74
            long r0 = r6.b
            cqn r6 = new cqn
            r6.<init>(r0)
            java.lang.Object r6 = defpackage.woy.dE(r6)
            r7.w(r6)
        L74:
            afak r6 = defpackage.afak.a
            return r6
        L77:
            afcr r0 = defpackage.afcr.a
            int r2 = r6.a
            if (r2 == 0) goto L81
            defpackage.woy.dF(r7)
            goto L95
        L81:
            defpackage.woy.dF(r7)
            java.lang.Object r7 = r6.c
            long r2 = r6.b
            r6.a = r1
            dme r7 = (defpackage.dme) r7
            tp r7 = r7.w
            java.lang.Object r6 = r7.e(r2, r6)
            if (r6 != r0) goto L95
            return r0
        L95:
            afak r6 = defpackage.afak.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmd.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((dmd) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 1) {
            return ((dmd) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((dmd) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmd(dme dmeVar, long j, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = dmeVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmd(grb grbVar, long j, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = grbVar;
        this.b = j;
    }
}
