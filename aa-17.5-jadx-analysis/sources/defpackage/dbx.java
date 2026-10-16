package defpackage;

/* loaded from: classes2.dex */
public final class dbx {
    private static final bvf a = new byo(new blz(10));

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.bik r4, defpackage.afeg r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.dbv
            if (r0 == 0) goto L13
            r0 = r6
            dbv r0 = (defpackage.dbv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dbv r0 = new dbv
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            defpackage.woy.dF(r6)
            goto L53
        L2f:
            defpackage.woy.dF(r6)
            cfx r6 = r4.q
            boolean r6 = r6.A
            if (r6 == 0) goto L59
            cym r6 = defpackage.bzi.s(r4)
            cxb r4 = defpackage.bzi.q(r4)
            ccx r4 = r4.F
            bvf r2 = defpackage.dbx.a
            java.lang.Object r4 = r4.f(r2)
            dan r4 = (defpackage.dan) r4
            r0.b = r3
            java.lang.Object r4 = b(r6, r4, r5, r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            aezp r4 = new aezp
            r4.<init>()
            throw r4
        L59:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbx.a(bik, afeg, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.cym r5, defpackage.dan r6, defpackage.afeg r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.dbw
            if (r0 == 0) goto L13
            r0 = r8
            dbw r0 = (defpackage.dbw) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dbw r0 = new dbw
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2e:
            defpackage.woy.dF(r8)
            aezp r5 = new aezp
            r5.<init>()
            throw r5
        L37:
            defpackage.woy.dF(r8)
            goto L49
        L3b:
            defpackage.woy.dF(r8)
            if (r6 != 0) goto L4f
            r0.b = r4
            java.lang.Object r5 = r5.t(r7, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            aezp r5 = new aezp
            r5.<init>()
            throw r5
        L4f:
            r0.b = r3
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbx.b(cym, dan, afeg, afck):java.lang.Object");
    }
}
