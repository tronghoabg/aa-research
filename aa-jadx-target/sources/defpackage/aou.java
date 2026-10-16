package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aou extends defpackage.afed implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.afdo b;
    final /* synthetic */ defpackage.affg c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aou(defpackage.afdo afdoVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = afdoVar;
        this.c = affgVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aou aouVar = new defpackage.aou(this.b, this.c, afdkVar);
        aouVar.d = obj;
        return aouVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e A[PHI: r4
  0x002e: PHI (r4v5 cru) = (r4v1 cru), (r4v2 cru), (r4v4 cru), (r4v9 cru), (r4v9 cru) binds: [B:17:0x0026, B:28:0x0062, B:23:0x004c, B:8:0x0014, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: CancellationException -> 0x0018, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0018, blocks: (B:20:0x0036, B:22:0x0042, B:8:0x0014), top: B:34:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[Catch: CancellationException -> 0x0018, PHI: r4
  0x0042: PHI (r4v4 cru) = (r4v5 cru), (r4v7 cru) binds: [B:21:0x0040, B:14:0x0021] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0018, blocks: (B:20:0x0036, B:22:0x0042, B:8:0x0014), top: B:34:0x0014 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004c -> B:18:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0062 -> B:18:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r6) {
        /*
            r5 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            java.lang.Object r4 = r5.d
            cru r4 = (defpackage.cru) r4
            if (r1 == r2) goto L14
            defpackage.afga.cz(r6)
            goto L2e
        L14:
            defpackage.afga.cz(r6)     // Catch: java.util.concurrent.CancellationException -> L18
            goto L2e
        L18:
            r6 = move-exception
            goto L4f
        L1a:
            java.lang.Object r1 = r5.d
            cru r1 = (defpackage.cru) r1
            defpackage.afga.cz(r6)     // Catch: java.util.concurrent.CancellationException -> L23
            r4 = r1
            goto L42
        L23:
            r6 = move-exception
            r4 = r1
            goto L4f
        L26:
            defpackage.afga.cz(r6)
            java.lang.Object r6 = r5.d
            r4 = r6
            cru r4 = (defpackage.cru) r4
        L2e:
            afdo r6 = r5.b
            boolean r6 = defpackage.afgz.u(r6)
            if (r6 == 0) goto L67
            affg r6 = r5.c     // Catch: java.util.concurrent.CancellationException -> L18
            r5.d = r4     // Catch: java.util.concurrent.CancellationException -> L18
            r5.a = r3     // Catch: java.util.concurrent.CancellationException -> L18
            java.lang.Object r6 = r6.invoke(r4, r5)     // Catch: java.util.concurrent.CancellationException -> L18
            if (r6 == r0) goto L65
        L42:
            r5.d = r4     // Catch: java.util.concurrent.CancellationException -> L18
            r5.a = r2     // Catch: java.util.concurrent.CancellationException -> L18
            cqv r6 = defpackage.cqv.c     // Catch: java.util.concurrent.CancellationException -> L18
            java.lang.Object r6 = defpackage.ca.aL(r4, r6, r5)     // Catch: java.util.concurrent.CancellationException -> L18
            if (r6 != r0) goto L2e
            goto L65
        L4f:
            afdo r1 = r5.b
            boolean r1 = defpackage.afgz.u(r1)
            if (r1 == 0) goto L66
            r5.d = r4
            r6 = 3
            r5.a = r6
            cqv r6 = defpackage.cqv.c
            java.lang.Object r6 = defpackage.ca.aL(r4, r6, r5)
            if (r6 == r0) goto L65
            goto L2e
        L65:
            return r0
        L66:
            throw r6
        L67:
            afbk r5 = defpackage.afbk.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aou.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aou) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
