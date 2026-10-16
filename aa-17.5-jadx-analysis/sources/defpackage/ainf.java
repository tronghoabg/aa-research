package defpackage;

/* loaded from: classes2.dex */
public final class ainf {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.aiyl r4, defpackage.afeh r5, java.lang.Throwable r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.aiys
            if (r0 == 0) goto L13
            r0 = r7
            aiys r0 = (defpackage.aiys) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aiys r0 = new aiys
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.a
            defpackage.woy.dF(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.woy.dF(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            afak r4 = defpackage.afak.a
            return r4
        L44:
            if (r6 == 0) goto L4d
            if (r6 == r4) goto L4d
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            defpackage.adqs.y(r4, r6)
        L4d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ainf.a(aiyl, afeh, java.lang.Throwable, afck):java.lang.Object");
    }

    public static final void b(aiyl aiylVar) throws Throwable {
        if (aiylVar instanceof ajaf) {
            throw ((ajaf) aiylVar).a;
        }
    }

    public static String invoke(aing aingVar, agcj agcjVar) {
        agcjVar.getClass();
        if (aingVar.check(agcjVar)) {
            return null;
        }
        return aingVar.getDescription();
    }
}
