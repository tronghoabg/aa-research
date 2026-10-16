package defpackage;

/* loaded from: classes2.dex */
public final class gje implements aiyl {
    final /* synthetic */ aqf a;

    public gje(aqf aqfVar) {
        this.a = aqfVar;
    }

    @Override // defpackage.aiyl
    public final /* bridge */ /* synthetic */ Object a(Object obj, afck afckVar) {
        return b(((Number) obj).floatValue(), afckVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(float r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gjd
            if (r0 == 0) goto L13
            r0 = r6
            gjd r0 = (defpackage.gjd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gjd r0 = new gjd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.woy.dF(r6)
            aqf r4 = r4.a
            r0.c = r3
            java.lang.Object r4 = defpackage.ca.aD(r4, r5, r0)
            if (r4 != r1) goto L3d
            return r1
        L3d:
            afak r4 = defpackage.afak.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gje.b(float, afck):java.lang.Object");
    }
}
