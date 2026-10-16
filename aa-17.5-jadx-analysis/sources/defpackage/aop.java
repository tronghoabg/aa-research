package defpackage;

/* loaded from: classes.dex */
public final class aop extends afdd implements afeg {
    int a;
    final /* synthetic */ afco b;
    final /* synthetic */ afeg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aop(afco afcoVar, afeg afegVar, afck afckVar) {
        super(afckVar);
        this.b = afcoVar;
        this.c = afegVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aop aopVar = new aop(this.b, this.c, afckVar);
        aopVar.d = obj;
        return aopVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e A[PHI: r4
  0x002e: PHI (r4v5 crl) = (r4v1 crl), (r4v2 crl), (r4v4 crl), (r4v9 crl), (r4v9 crl) binds: [B:17:0x0026, B:28:0x0062, B:23:0x004c, B:8:0x0014, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: CancellationException -> 0x0018, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0018, blocks: (B:20:0x0036, B:22:0x0042, B:8:0x0014), top: B:34:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004c -> B:18:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0062 -> B:18:0x002e). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            java.lang.Object r4 = r5.d
            crl r4 = (defpackage.crl) r4
            if (r1 == r2) goto L14
            defpackage.woy.dF(r6)
            goto L2e
        L14:
            defpackage.woy.dF(r6)     // Catch: java.util.concurrent.CancellationException -> L18
            goto L2e
        L18:
            r6 = move-exception
            goto L4f
        L1a:
            java.lang.Object r1 = r5.d
            crl r1 = (defpackage.crl) r1
            defpackage.woy.dF(r6)     // Catch: java.util.concurrent.CancellationException -> L23
            r4 = r1
            goto L42
        L23:
            r6 = move-exception
            r4 = r1
            goto L4f
        L26:
            defpackage.woy.dF(r6)
            java.lang.Object r6 = r5.d
            r4 = r6
            crl r4 = (defpackage.crl) r4
        L2e:
            afco r6 = r5.b
            boolean r6 = defpackage.affx.h(r6)
            if (r6 == 0) goto L67
            afeg r6 = r5.c     // Catch: java.util.concurrent.CancellationException -> L18
            r5.d = r4     // Catch: java.util.concurrent.CancellationException -> L18
            r5.a = r3     // Catch: java.util.concurrent.CancellationException -> L18
            java.lang.Object r6 = r6.invoke(r4, r5)     // Catch: java.util.concurrent.CancellationException -> L18
            if (r6 == r0) goto L65
        L42:
            r5.d = r4     // Catch: java.util.concurrent.CancellationException -> L18
            r5.a = r2     // Catch: java.util.concurrent.CancellationException -> L18
            cqm r6 = defpackage.cqm.c     // Catch: java.util.concurrent.CancellationException -> L18
            java.lang.Object r6 = defpackage.ca.aL(r4, r6, r5)     // Catch: java.util.concurrent.CancellationException -> L18
            if (r6 != r0) goto L2e
            goto L65
        L4f:
            afco r1 = r5.b
            boolean r1 = defpackage.affx.h(r1)
            if (r1 == 0) goto L66
            r5.d = r4
            r6 = 3
            r5.a = r6
            cqm r6 = defpackage.cqm.c
            java.lang.Object r6 = defpackage.ca.aL(r4, r6, r5)
            if (r6 == r0) goto L65
            goto L2e
        L65:
            return r0
        L66:
            throw r6
        L67:
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aop.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aop) b((crl) obj, (afck) obj2)).hT(afak.a);
    }
}
