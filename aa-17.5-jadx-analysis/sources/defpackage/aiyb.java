package defpackage;

/* loaded from: classes2.dex */
public final class aiyb implements aiyk, aiye {
    private final afeg a;

    public aiyb(afeg afegVar) {
        this.a = afegVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.aiyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hR(defpackage.aiyl r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aiya
            if (r0 == 0) goto L13
            r0 = r6
            aiya r0 = (defpackage.aiya) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aiya r0 = new aiya
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ajbc r4 = r0.d
            defpackage.woy.dF(r6)     // Catch: java.lang.Throwable -> L29
            goto L50
        L29:
            r5 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.woy.dF(r6)
            ajbc r6 = new ajbc
            afco r2 = r0.hH()
            r6.<init>(r5, r2)
            r0.d = r6     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            afeg r4 = r4.a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r4 = r4.invoke(r6, r0)     // Catch: java.lang.Throwable -> L57
            if (r4 == r1) goto L4d
            afak r4 = defpackage.afak.a     // Catch: java.lang.Throwable -> L57
        L4d:
            if (r4 == r1) goto L56
            r4 = r6
        L50:
            r4.e()
            afak r4 = defpackage.afak.a
            return r4
        L56:
            return r1
        L57:
            r4 = move-exception
            r5 = r4
            r4 = r6
        L5a:
            r4.e()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyb.hR(aiyl, afck):java.lang.Object");
    }
}
