package defpackage;

/* loaded from: classes.dex */
final class dbh extends afde implements afeg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ aixl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbh(aixl aixlVar, afck afckVar) {
        super(2, afckVar);
        this.d = aixlVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new dbh(this.d, afckVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:5:0x000a, B:12:0x0029, B:14:0x0031, B:9:0x0018, B:8:0x0013), top: B:23:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:12:0x0029). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r4.c
            if (r1 == 0) goto Le
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            defpackage.woy.dF(r5)     // Catch: java.lang.Throwable -> L4b
            goto L29
        Le:
            defpackage.woy.dF(r5)
            aixl r2 = r4.d
            aiwz r5 = r2.A()     // Catch: java.lang.Throwable -> L4b
            r1 = r5
        L18:
            r4.a = r2     // Catch: java.lang.Throwable -> L4b
            r4.b = r1     // Catch: java.lang.Throwable -> L4b
            r5 = 1
            r4.c = r5     // Catch: java.lang.Throwable -> L4b
            r5 = r1
            aiwz r5 = (defpackage.aiwz) r5     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r5.a(r4)     // Catch: java.lang.Throwable -> L4b
            if (r5 != r0) goto L29
            return r0
        L29:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L4b
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L44
            r5 = r1
            aiwz r5 = (defpackage.aiwz) r5     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L4b
            afak r5 = (defpackage.afak) r5     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.atomic.AtomicBoolean r5 = defpackage.dbi.b     // Catch: java.lang.Throwable -> L4b
            r3 = 0
            r5.set(r3)     // Catch: java.lang.Throwable -> L4b
            defpackage.byx.m()     // Catch: java.lang.Throwable -> L4b
            goto L18
        L44:
            r4 = 0
            r2.s(r4)
            afak r4 = defpackage.afak.a
            return r4
        L4b:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L4d
        L4d:
            r5 = move-exception
            defpackage.aimb.a(r2, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbh.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dbh) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
