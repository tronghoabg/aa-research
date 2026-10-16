package defpackage;

/* loaded from: classes.dex */
public final class anx extends afdd implements afeg {
    int a;
    final /* synthetic */ afec b;
    final /* synthetic */ afdr c;
    final /* synthetic */ afdr d;
    final /* synthetic */ afeg e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anx(afec afecVar, afdr afdrVar, afdr afdrVar2, afeg afegVar, afck afckVar) {
        super(afckVar);
        this.b = afecVar;
        this.c = afdrVar;
        this.d = afdrVar2;
        this.e = afegVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        anx anxVar = new anx(this.b, this.c, this.d, this.e, afckVar);
        anxVar.f = obj;
        return anxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: CancellationException -> 0x00a2, TryCatch #0 {CancellationException -> 0x00a2, blocks: (B:7:0x0011, B:24:0x006d, B:26:0x0075, B:28:0x0081, B:30:0x008d, B:31:0x0090, B:32:0x0093, B:33:0x0099, B:8:0x0015, B:19:0x0046, B:21:0x004a, B:11:0x001d, B:16:0x0037, B:14:0x0029), top: B:40:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075 A[Catch: CancellationException -> 0x00a2, TryCatch #0 {CancellationException -> 0x00a2, blocks: (B:7:0x0011, B:24:0x006d, B:26:0x0075, B:28:0x0081, B:30:0x008d, B:31:0x0090, B:32:0x0093, B:33:0x0099, B:8:0x0015, B:19:0x0046, B:21:0x004a, B:11:0x001d, B:16:0x0037, B:14:0x0029), top: B:40:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[Catch: CancellationException -> 0x00a2, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00a2, blocks: (B:7:0x0011, B:24:0x006d, B:26:0x0075, B:28:0x0081, B:30:0x008d, B:31:0x0090, B:32:0x0093, B:33:0x0099, B:8:0x0015, B:19:0x0046, B:21:0x004a, B:11:0x001d, B:16:0x0037, B:14:0x0029), top: B:40:0x0007 }] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r7.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            java.lang.Object r4 = r7.f
            crl r4 = (defpackage.crl) r4
            if (r1 == r3) goto L15
            defpackage.woy.dF(r8)     // Catch: java.util.concurrent.CancellationException -> La2
            goto L6d
        L15:
            defpackage.woy.dF(r8)     // Catch: java.util.concurrent.CancellationException -> La2
            goto L46
        L19:
            java.lang.Object r1 = r7.f
            crl r1 = (defpackage.crl) r1
            defpackage.woy.dF(r8)     // Catch: java.util.concurrent.CancellationException -> La2
            goto L37
        L21:
            defpackage.woy.dF(r8)
            java.lang.Object r8 = r7.f
            r1 = r8
            crl r1 = (defpackage.crl) r1
            r7.f = r1     // Catch: java.util.concurrent.CancellationException -> La2
            r7.a = r4     // Catch: java.util.concurrent.CancellationException -> La2
            afeh r8 = defpackage.aqx.a     // Catch: java.util.concurrent.CancellationException -> La2
            cqm r8 = defpackage.cqm.b     // Catch: java.util.concurrent.CancellationException -> La2
            java.lang.Object r8 = defpackage.aqx.a(r1, r2, r8, r7)     // Catch: java.util.concurrent.CancellationException -> La2
            if (r8 == r0) goto La1
        L37:
            cqu r8 = (defpackage.cqu) r8     // Catch: java.util.concurrent.CancellationException -> La2
            long r4 = r8.a     // Catch: java.util.concurrent.CancellationException -> La2
            r7.f = r1     // Catch: java.util.concurrent.CancellationException -> La2
            r7.a = r3     // Catch: java.util.concurrent.CancellationException -> La2
            java.lang.Object r8 = defpackage.ca.aP(r1, r4, r7)     // Catch: java.util.concurrent.CancellationException -> La2
            if (r8 == r0) goto La1
            r4 = r1
        L46:
            cqu r8 = (defpackage.cqu) r8     // Catch: java.util.concurrent.CancellationException -> La2
            if (r8 == 0) goto L9e
            afec r1 = r7.b     // Catch: java.util.concurrent.CancellationException -> La2
            long r5 = r8.c     // Catch: java.util.concurrent.CancellationException -> La2
            cja r3 = new cja     // Catch: java.util.concurrent.CancellationException -> La2
            r3.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> La2
            r1.invoke(r3)     // Catch: java.util.concurrent.CancellationException -> La2
            long r5 = r8.a     // Catch: java.util.concurrent.CancellationException -> La2
            afeg r8 = r7.e     // Catch: java.util.concurrent.CancellationException -> La2
            acm r1 = new acm     // Catch: java.util.concurrent.CancellationException -> La2
            r3 = 13
            r1.<init>(r8, r3)     // Catch: java.util.concurrent.CancellationException -> La2
            r7.f = r4     // Catch: java.util.concurrent.CancellationException -> La2
            r8 = 3
            r7.a = r8     // Catch: java.util.concurrent.CancellationException -> La2
            java.lang.Object r8 = defpackage.ca.aS(r4, r5, r1, r7)     // Catch: java.util.concurrent.CancellationException -> La2
            if (r8 != r0) goto L6d
            goto La1
        L6d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.util.concurrent.CancellationException -> La2
            boolean r8 = r8.booleanValue()     // Catch: java.util.concurrent.CancellationException -> La2
            if (r8 == 0) goto L99
            cql r8 = r4.p()     // Catch: java.util.concurrent.CancellationException -> La2
            java.util.List r8 = r8.a     // Catch: java.util.concurrent.CancellationException -> La2
            int r0 = r8.size()     // Catch: java.util.concurrent.CancellationException -> La2
        L7f:
            if (r2 >= r0) goto L93
            java.lang.Object r1 = r8.get(r2)     // Catch: java.util.concurrent.CancellationException -> La2
            cqu r1 = (defpackage.cqu) r1     // Catch: java.util.concurrent.CancellationException -> La2
            boolean r3 = defpackage.tl.l(r1)     // Catch: java.util.concurrent.CancellationException -> La2
            if (r3 == 0) goto L90
            r1.b()     // Catch: java.util.concurrent.CancellationException -> La2
        L90:
            int r2 = r2 + 1
            goto L7f
        L93:
            afdr r8 = r7.c     // Catch: java.util.concurrent.CancellationException -> La2
            r8.invoke()     // Catch: java.util.concurrent.CancellationException -> La2
            goto L9e
        L99:
            afdr r8 = r7.d     // Catch: java.util.concurrent.CancellationException -> La2
            r8.invoke()     // Catch: java.util.concurrent.CancellationException -> La2
        L9e:
            afak r7 = defpackage.afak.a
            return r7
        La1:
            return r0
        La2:
            r8 = move-exception
            afdr r7 = r7.d
            r7.invoke()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anx.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((anx) b((crl) obj, (afck) obj2)).hT(afak.a);
    }
}
