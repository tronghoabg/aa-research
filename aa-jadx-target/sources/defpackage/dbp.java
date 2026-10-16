package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dbp extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ aiyk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbp(aiyk aiykVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.d = aiykVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.dbp(this.d, afdkVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0031 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:5:0x000a, B:12:0x0029, B:14:0x0031, B:9:0x0018, B:8:0x0013), top: B:23:0x0004 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:12:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r5) {
        /*
            r4 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r4.c
            if (r1 == 0) goto Le
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            defpackage.afga.cz(r5)     // Catch: java.lang.Throwable -> L4b
            goto L29
        Le:
            defpackage.afga.cz(r5)
            aiyk r2 = r4.d
            aixy r5 = r2.A()     // Catch: java.lang.Throwable -> L4b
            r1 = r5
        L18:
            r4.a = r2     // Catch: java.lang.Throwable -> L4b
            r4.b = r1     // Catch: java.lang.Throwable -> L4b
            r5 = 1
            r4.c = r5     // Catch: java.lang.Throwable -> L4b
            r5 = r1
            aixy r5 = (aixy) r5     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r5.a(r4)     // Catch: java.lang.Throwable -> L4b
            if (r5 != r0) goto L29
            return r0
        L29:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L4b
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L44
            r5 = r1
            aixy r5 = (aixy) r5     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L4b
            afbk r5 = (defpackage.afbk) r5     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.atomic.AtomicBoolean r5 = defpackage.dbq.b     // Catch: java.lang.Throwable -> L4b
            r3 = 0
            r5.set(r3)     // Catch: java.lang.Throwable -> L4b
            defpackage.bzd.l()     // Catch: java.lang.Throwable -> L4b
            goto L18
        L44:
            r4 = 0
            r2.s(r4)
            afbk r4 = defpackage.afbk.a
            return r4
        L4b:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L4d
        L4d:
            r5 = move-exception
            aieb.a(r2, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbp.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.dbp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
