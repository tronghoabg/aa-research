package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aze extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.azf c;
    final /* synthetic */ defpackage.afd d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aze(defpackage.azf azfVar, defpackage.afd afdVar, long j, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.c = azfVar;
        this.d = afdVar;
        this.e = j;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.aze(this.c, this.d, this.e, afdkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (defpackage.aeb.k(r2, r3, r4, r5, r6, 4) == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [aej] */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r9.b
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Le
            defpackage.afga.cz(r10)     // Catch: java.util.concurrent.CancellationException -> L75
            r6 = r9
            goto L6d
        Le:
            java.lang.Object r1 = r9.a
            defpackage.afga.cz(r10)     // Catch: java.util.concurrent.CancellationException -> L75
            goto L38
        L14:
            defpackage.afga.cz(r10)
            azf r10 = r9.c     // Catch: java.util.concurrent.CancellationException -> L75
            aeb r10 = r10.l     // Catch: java.util.concurrent.CancellationException -> L75
            r10.j()     // Catch: java.util.concurrent.CancellationException -> L75
            afd r1 = r9.d
            boolean r3 = r10.j()     // Catch: java.util.concurrent.CancellationException -> L75
            if (r3 != 0) goto L3f
            long r3 = r9.e     // Catch: java.util.concurrent.CancellationException -> L75
            dlw r5 = new dlw     // Catch: java.util.concurrent.CancellationException -> L75
            r5.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L75
            r9.a = r1     // Catch: java.util.concurrent.CancellationException -> L75
            r9.b = r2     // Catch: java.util.concurrent.CancellationException -> L75
            java.lang.Object r10 = r10.e(r5, r9)     // Catch: java.util.concurrent.CancellationException -> L75
            if (r10 != r0) goto L38
            goto L6c
        L38:
            azf r10 = r9.c     // Catch: java.util.concurrent.CancellationException -> L75
            afer r10 = r10.b     // Catch: java.util.concurrent.CancellationException -> L75
            r10.invoke()     // Catch: java.util.concurrent.CancellationException -> L75
        L3f:
            r4 = r1
            azf r10 = r9.c     // Catch: java.util.concurrent.CancellationException -> L75
            aeb r2 = r10.l     // Catch: java.util.concurrent.CancellationException -> L75
            java.lang.Object r1 = r2.d()     // Catch: java.util.concurrent.CancellationException -> L75
            dlw r1 = (defpackage.dlw) r1     // Catch: java.util.concurrent.CancellationException -> L75
            long r5 = r1.a     // Catch: java.util.concurrent.CancellationException -> L75
            long r7 = r9.e     // Catch: java.util.concurrent.CancellationException -> L75
            long r5 = defpackage.dlw.c(r5, r7)     // Catch: java.util.concurrent.CancellationException -> L75
            dlw r3 = new dlw     // Catch: java.util.concurrent.CancellationException -> L75
            r3.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L75
            r6 = r5
            abs r5 = new abs     // Catch: java.util.concurrent.CancellationException -> L75
            r1 = 5
            r5.<init>(r10, r6, r1)     // Catch: java.util.concurrent.CancellationException -> L75
            r10 = 0
            r9.a = r10     // Catch: java.util.concurrent.CancellationException -> L75
            r10 = 2
            r9.b = r10     // Catch: java.util.concurrent.CancellationException -> L75
            r7 = 4
            r6 = r9
            java.lang.Object r9 = defpackage.aeb.k(r2, r3, r4, r5, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L75
            if (r9 != r0) goto L6d
        L6c:
            return r0
        L6d:
            azf r9 = r6.c     // Catch: java.util.concurrent.CancellationException -> L75
            r10 = 0
            r9.f(r10)     // Catch: java.util.concurrent.CancellationException -> L75
            r9.f = r10     // Catch: java.util.concurrent.CancellationException -> L75
        L75:
            afbk r9 = defpackage.afbk.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aze.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aze) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
