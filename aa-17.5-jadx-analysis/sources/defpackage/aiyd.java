package defpackage;

/* loaded from: classes2.dex */
public final class aiyd extends aiyh {
    private final afeg d;

    public /* synthetic */ aiyd(afeg afegVar) {
        this(afegVar, afcp.a, -2, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.aiyh, defpackage.ajal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aixv r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aiyc
            if (r0 == 0) goto L13
            r0 = r6
            aiyc r0 = (defpackage.aiyc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aiyc r0 = new aiyc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aixv r5 = r0.d
            defpackage.woy.dF(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.woy.dF(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r4 = defpackage.aiyh.g(r4, r5, r0)
            if (r4 == r1) goto L51
        L3e:
            aixl r4 = r5.b
            boolean r4 = r4.y()
            if (r4 == 0) goto L49
            afak r4 = defpackage.afak.a
            return r4
        L49:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r4.<init>(r5)
            throw r4
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyd.b(aixv, afck):java.lang.Object");
    }

    @Override // defpackage.aiyh, defpackage.ajal
    protected final ajal c(afco afcoVar, int i, int i2) {
        return new aiyd(this.d, afcoVar, i, i2);
    }

    public aiyd(afeg afegVar, afco afcoVar, int i, int i2) {
        super(afegVar, afcoVar, i, i2);
        this.d = afegVar;
    }
}
