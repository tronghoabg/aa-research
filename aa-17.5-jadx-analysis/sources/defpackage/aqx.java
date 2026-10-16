package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class aqx {
    public static final afeh a = new aoh((afck) null, 2, (char[]) null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.crl r5, boolean r6, defpackage.cqm r7, defpackage.afck r8) {
        /*
            boolean r0 = r8 instanceof defpackage.aql
            if (r0 == 0) goto L13
            r0 = r8
            aql r0 = (defpackage.aql) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aql r0 = new aql
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r5 = r0.a
            cqm r6 = r0.d
            crl r7 = r0.e
            defpackage.woy.dF(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            defpackage.woy.dF(r8)
        L3c:
            r0.e = r5
            r0.d = r7
            r0.a = r6
            r0.c = r3
            java.lang.Object r8 = r5.r(r7, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            cql r8 = (defpackage.cql) r8
            boolean r2 = f(r8, r6)
            if (r2 != 0) goto L54
            goto L3c
        L54:
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqx.a(crl, boolean, cqm, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:19:0x004b->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.crl r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.aqn
            if (r0 == 0) goto L13
            r0 = r8
            aqn r0 = (defpackage.aqn) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aqn r0 = new aqn
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            crl r7 = r0.c
            defpackage.woy.dF(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.woy.dF(r8)
        L34:
            r0.c = r7
            r0.b = r3
            cqm r8 = defpackage.cqm.b
            java.lang.Object r8 = r7.r(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            cql r8 = (defpackage.cql) r8
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L4b:
            if (r5 >= r2) goto L59
            java.lang.Object r6 = r8.get(r5)
            cqu r6 = (defpackage.cqu) r6
            r6.b()
            int r5 = r5 + 1
            goto L4b
        L59:
            int r2 = r8.size()
        L5d:
            if (r4 >= r2) goto L6d
            java.lang.Object r5 = r8.get(r4)
            cqu r5 = (defpackage.cqu) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L6a
            goto L34
        L6a:
            int r4 = r4 + 1
            goto L5d
        L6d:
            afak r7 = defpackage.afak.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqx.b(crl, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.crl r7, defpackage.cqm r8, defpackage.afck r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.aqu
            if (r0 == 0) goto L13
            r0 = r9
            aqu r0 = (defpackage.aqu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aqu r0 = new aqu
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            affv r7 = r0.c
            defpackage.woy.dF(r9)     // Catch: defpackage.cqn -> L5a
            goto L56
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.woy.dF(r9)
            affv r9 = new affv
            r9.<init>()
            aov r2 = defpackage.aov.c
            r9.a = r2
            dcc r2 = r7.q()     // Catch: defpackage.cqn -> L5a
            long r4 = r2.f()     // Catch: defpackage.cqn -> L5a
            aqv r2 = new aqv     // Catch: defpackage.cqn -> L5a
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: defpackage.cqn -> L5a
            r0.c = r9     // Catch: defpackage.cqn -> L5a
            r0.b = r3     // Catch: defpackage.cqn -> L5a
            java.lang.Object r7 = r7.s(r4, r2, r0)     // Catch: defpackage.cqn -> L5a
            if (r7 == r1) goto L59
            r7 = r9
        L56:
            java.lang.Object r7 = r7.a
            return r7
        L59:
            return r1
        L5a:
            aox r7 = defpackage.aox.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqx.c(crl, cqm, afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b1 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.crl r17, defpackage.cqm r18, defpackage.afck r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqx.d(crl, cqm, afck):java.lang.Object");
    }

    public static /* synthetic */ Object e(cqz cqzVar, afeh afehVar, afec afecVar, afck afckVar, int i) {
        if ((i & 4) != 0) {
            afehVar = a;
        }
        Object objA = ahni.a(new aqr(cqzVar, afehVar, afecVar, null), afckVar);
        return objA == afcr.a ? objA : afak.a;
    }

    public static final boolean f(cql cqlVar, boolean z) {
        List list = cqlVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cqu cquVar = (cqu) list.get(i);
            if (!(z ? tl.j(cquVar) : tl.k(cquVar))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c5  */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [afec] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.crl r26, defpackage.aitx r27, defpackage.apl r28, defpackage.afeh r29, defpackage.afec r30, defpackage.afck r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqx.g(crl, aitx, apl, afeh, afec, afck):java.lang.Object");
    }
}
