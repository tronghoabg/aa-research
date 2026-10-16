package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bcf {
    public final defpackage.bzc a = new defpackage.bzc(new defpackage.bcg[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:18:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.cjj r9, defpackage.afdk r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bce
            if (r0 == 0) goto L13
            r0 = r10
            bce r0 = (defpackage.bce) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            bce r0 = new bce
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            afdr r1 = defpackage.afdr.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r8 = r0.b
            int r9 = r0.a
            java.lang.Object[] r2 = r0.g
            cjj r4 = r0.f
            defpackage.afga.cz(r10)
            r10 = r4
            goto L62
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            defpackage.afga.cz(r10)
            bzc r8 = r8.a
            java.lang.Object[] r10 = r8.a
            int r8 = r8.b
            r2 = 0
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
        L46:
            if (r9 >= r8) goto L65
            r4 = r2[r9]
            bcg r4 = (defpackage.bcg) r4
            bav r5 = new bav
            r6 = 6
            r5.<init>(r10, r6)
            r0.f = r10
            r0.g = r2
            r0.a = r9
            r0.b = r8
            r0.e = r3
            java.lang.Object r4 = defpackage.vm.i(r4, r5, r0)
            if (r4 == r1) goto L64
        L62:
            int r9 = r9 + r3
            goto L46
        L64:
            return r1
        L65:
            afbk r8 = defpackage.afbk.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcf.a(cjj, afdk):java.lang.Object");
    }
}
