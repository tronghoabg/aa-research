package defpackage;

/* loaded from: classes2.dex */
public final class aimi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:13:0x002e, B:23:0x0056, B:27:0x006b, B:29:0x0073, B:18:0x0044, B:22:0x0052), top: B:44:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0087 -> B:23:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.aiyl r6, defpackage.aixx r7, boolean r8, defpackage.afck r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.aiyn
            if (r0 == 0) goto L13
            r0 = r9
            aiyn r0 = (defpackage.aiyn) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aiyn r0 = new aiyn
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            afcr r1 = defpackage.afcr.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            boolean r8 = r0.c
            aiwz r6 = r0.f
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.woy.dF(r9)     // Catch: java.lang.Throwable -> L94
            r9 = r6
            r6 = r2
            goto L56
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            boolean r8 = r0.c
            aiwz r6 = r0.f
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.woy.dF(r9)     // Catch: java.lang.Throwable -> L94
            r5 = r0
            r0 = r6
            r6 = r2
        L4a:
            r2 = r5
            goto L6b
        L4c:
            defpackage.woy.dF(r9)
            defpackage.ainf.b(r6)
            aiwz r9 = r7.A()     // Catch: java.lang.Throwable -> L94
        L56:
            r0.a = r6     // Catch: java.lang.Throwable -> L94
            r0.b = r7     // Catch: java.lang.Throwable -> L94
            r0.f = r9     // Catch: java.lang.Throwable -> L94
            r0.c = r8     // Catch: java.lang.Throwable -> L94
            r0.e = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L94
            if (r2 != r1) goto L67
            goto L8a
        L67:
            r5 = r0
            r0 = r9
            r9 = r2
            goto L4a
        L6b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L94
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L94
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r0.b()     // Catch: java.lang.Throwable -> L94
            r2.a = r6     // Catch: java.lang.Throwable -> L94
            r2.b = r7     // Catch: java.lang.Throwable -> L94
            r2.f = r0     // Catch: java.lang.Throwable -> L94
            r2.c = r8     // Catch: java.lang.Throwable -> L94
            r2.e = r3     // Catch: java.lang.Throwable -> L94
            java.lang.Object r9 = r6.a(r9, r2)     // Catch: java.lang.Throwable -> L94
            if (r9 == r1) goto L8a
            r9 = r0
            r0 = r2
            goto L56
        L8a:
            return r1
        L8b:
            if (r8 == 0) goto L91
            r6 = 0
            r7.s(r6)
        L91:
            afak r6 = defpackage.afak.a
            return r6
        L94:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L96
        L96:
            r9 = move-exception
            if (r8 != 0) goto L9a
            goto L9d
        L9a:
            defpackage.aimb.a(r7, r6)
        L9d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aimi.a(aiyl, aixx, boolean, afck):java.lang.Object");
    }

    public static final aimm convertVariance(aijg aijgVar) {
        aijgVar.getClass();
        aijg aijgVar2 = aijg.INVARIANT;
        int iOrdinal = aijgVar.ordinal();
        if (iOrdinal == 0) {
            return aimm.INV;
        }
        if (iOrdinal == 1) {
            return aimm.IN;
        }
        if (iOrdinal == 2) {
            return aimm.OUT;
        }
        throw new aezs();
    }
}
