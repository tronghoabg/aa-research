package defpackage;

/* loaded from: classes2.dex */
public final class fan extends afde implements afeg {
    final /* synthetic */ Object a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fan(afck afckVar, afec afecVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = afecVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [afdr, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.c;
        if (i == 0) {
            fan fanVar = new fan(afckVar, (afec) this.a, 0);
            fanVar.b = obj;
            return fanVar;
        }
        if (i == 1) {
            fan fanVar2 = new fan((afeg) this.a, afckVar, 1);
            fanVar2.b = obj;
            return fanVar2;
        }
        if (i != 2) {
            fan fanVar3 = new fan((afdr) this.a, afckVar, 3);
            fanVar3.b = obj;
            return fanVar3;
        }
        fan fanVar4 = new fan(afckVar, this.a, 2, null);
        fanVar4.b = obj;
        return fanVar4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        return r5.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        throw r5;
     */
    /* JADX WARN: Type inference failed for: r5v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.c
            if (r0 == 0) goto Lca
            r1 = 1
            if (r0 == r1) goto L71
            r2 = 2
            if (r0 == r2) goto L5c
            defpackage.woy.dF(r6)
            java.lang.Object r6 = r5.b
            aitx r6 = (defpackage.aitx) r6
            afco r6 = r6.c()
            java.lang.Object r5 = r5.a
            aiwk r0 = new aiwk     // Catch: java.lang.InterruptedException -> L4f
            r0.<init>()     // Catch: java.lang.InterruptedException -> L4f
            aivh r6 = defpackage.affx.d(r6)     // Catch: java.lang.InterruptedException -> L4f
            aiuo r6 = defpackage.affx.c(r6, r1, r0)     // Catch: java.lang.InterruptedException -> L4f
            r0.c = r6     // Catch: java.lang.InterruptedException -> L4f
            aisv r6 = r0.a     // Catch: java.lang.InterruptedException -> L4f
        L28:
            int r1 = r6.b     // Catch: java.lang.InterruptedException -> L4f
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L42
            r6 = 3
            if (r1 != r6) goto L32
            goto L42
        L32:
            defpackage.aiwk.e(r1)     // Catch: java.lang.InterruptedException -> L4f
            aezp r5 = new aezp     // Catch: java.lang.InterruptedException -> L4f
            r5.<init>()     // Catch: java.lang.InterruptedException -> L4f
            throw r5     // Catch: java.lang.InterruptedException -> L4f
        L3b:
            r3 = 0
            boolean r1 = r6.b(r1, r3)     // Catch: java.lang.InterruptedException -> L4f
            if (r1 == 0) goto L28
        L42:
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L4a
            r0.d()     // Catch: java.lang.InterruptedException -> L4f
            return r5
        L4a:
            r5 = move-exception
            r0.d()     // Catch: java.lang.InterruptedException -> L4f
            throw r5     // Catch: java.lang.InterruptedException -> L4f
        L4f:
            r5 = move-exception
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Blocking call was interrupted due to parent cancellation"
            r6.<init>(r0)
            java.lang.Throwable r5 = r6.initCause(r5)
            throw r5
        L5c:
            defpackage.woy.dF(r6)
            java.lang.Object r6 = r5.b
            faa r6 = (defpackage.faa) r6
            r6.getClass()
            java.lang.Object r5 = r5.a
            fca r6 = r6.b()
            java.lang.Object r5 = r5.invoke(r6)
            return r5
        L71:
            defpackage.woy.dF(r6)
            java.lang.Object r6 = r5.b
            aitx r6 = (defpackage.aitx) r6
            afco r6 = r6.c()
            bwi r0 = defpackage.afcl.k
            afcm r6 = r6.get(r0)
            r6.getClass()
            afcl r6 = (defpackage.afcl) r6
            aitm r0 = new aitm
            r0.<init>()
            java.lang.Object r5 = r5.a
            aivb r2 = defpackage.aivb.a
            ajak r3 = new ajak
            r4 = 0
            r3.<init>(r0, r5, r4, r1)
            r5 = 4
            defpackage.ahnc.c(r2, r6, r5, r3)
        L9a:
            boolean r5 = r0.x()
            if (r5 != 0) goto Lac
            btm r5 = new btm     // Catch: java.lang.InterruptedException -> L9a
            r1 = 14
            r5.<init>(r0, r4, r1)     // Catch: java.lang.InterruptedException -> L9a
            java.lang.Object r5 = defpackage.aiik.a(r6, r5)     // Catch: java.lang.InterruptedException -> L9a
            goto Lbc
        Lac:
            java.lang.Object r5 = r0.hN()
            boolean r6 = r5 instanceof defpackage.aivd
            if (r6 != 0) goto Lc2
            boolean r6 = r5 instanceof defpackage.aito
            if (r6 != 0) goto Lbd
            java.lang.Object r5 = defpackage.aivp.b(r5)
        Lbc:
            return r5
        Lbd:
            aito r5 = (defpackage.aito) r5
            java.lang.Throwable r5 = r5.b
            throw r5
        Lc2:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This job has not completed yet"
            r5.<init>(r6)
            throw r5
        Lca:
            defpackage.woy.dF(r6)
            java.lang.Object r6 = r5.b
            faa r6 = (defpackage.faa) r6
            r6.getClass()
            java.lang.Object r5 = r5.a
            fca r6 = r6.b()
            java.lang.Object r5 = r5.invoke(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fan.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((fan) b((faa) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((fan) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 2) {
            return ((fan) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((fan) b((faa) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fan(afck afckVar, afec afecVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.c = i;
        this.a = afecVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fan(afdr afdrVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = afdrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fan(afeg afegVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = afegVar;
    }
}
