package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fae implements defpackage.aizk {
    final /* synthetic */ defpackage.aizk a;
    final /* synthetic */ defpackage.ezi b;
    final /* synthetic */ defpackage.affc c;

    public fae(defpackage.aizk aizkVar, defpackage.ezi eziVar, defpackage.affc affcVar) {
        this.a = aizkVar;
        this.b = eziVar;
        this.c = affcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r6.a(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [aizk] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.aizk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r7, defpackage.afdk r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fad
            if (r0 == 0) goto L13
            r0 = r8
            fad r0 = (defpackage.fad) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fad r0 = new fad
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            afdr r1 = defpackage.afdr.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.afga.cz(r8)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.c
            defpackage.afga.cz(r8)
            goto L50
        L38:
            defpackage.afga.cz(r8)
            aizk r8 = r6.a
            java.util.Set r7 = (java.util.Set) r7
            ezi r7 = r6.b
            affc r6 = r6.c
            r0.c = r8
            r0.b = r4
            java.lang.Object r6 = defpackage.ezj.e(r7, r4, r6, r0)
            if (r6 == r1) goto L5f
            r5 = r8
            r8 = r6
            r6 = r5
        L50:
            r7 = 0
            r0.c = r7
            r0.b = r3
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L5c
            goto L5f
        L5c:
            afbk r6 = defpackage.afbk.a
            return r6
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fae.a(java.lang.Object, afdk):java.lang.Object");
    }
}
