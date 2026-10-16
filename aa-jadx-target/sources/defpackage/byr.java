package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class byr extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.afer e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byr(defpackage.afer aferVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.e = aferVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.byr byrVar = new defpackage.byr(this.e, afdkVar);
        byrVar.f = obj;
        return byrVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[Catch: all -> 0x0027, PHI: r1 r4 r5 r6
  0x0079: PHI (r1v5 ??) = (r1v12 ??), (r1v13 ??) binds: [B:26:0x0077, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r4v3 java.lang.Object) = (r4v7 java.lang.Object), (r4v10 java.lang.Object) binds: [B:26:0x0077, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r5v4 ??) = (r5v9 ??), (r5v10 ??) binds: [B:26:0x0077, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r6v2 aizk) = (r6v3 aizk), (r6v7 aizk) binds: [B:26:0x0077, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0017, B:25:0x0069, B:27:0x0079, B:29:0x0088, B:11:0x0023, B:21:0x0051), top: B:41:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0017, B:25:0x0069, B:27:0x0079, B:29:0x0088, B:11:0x0023, B:21:0x0051), top: B:41:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [byf] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [aiyx] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aiyk, aiyx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aiyx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, nub] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [nub] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r10) {
        /*
            r9 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r9.d
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L2a
            java.lang.Object r4 = r9.c
            if (r1 == r3) goto L1b
            java.lang.Object r1 = r9.b
            java.lang.Object r5 = r9.a
            java.lang.Object r6 = r9.f
            aizk r6 = (aizk) r6
            defpackage.afga.cz(r10)     // Catch: java.lang.Throwable -> L27
            goto L69
        L1b:
            java.lang.Object r1 = r9.b
            java.lang.Object r5 = r9.a
            java.lang.Object r6 = r9.f
            aizk r6 = (aizk) r6
            defpackage.afga.cz(r10)     // Catch: java.lang.Throwable -> L27
            goto L79
        L27:
            r9 = move-exception
            goto L9b
        L2a:
            java.lang.Object r1 = r9.c
            java.lang.Object r4 = r9.b
            java.lang.Object r5 = r9.a
            java.lang.Object r6 = r9.f
            aizk r6 = (aizk) r6
            defpackage.afga.cz(r10)     // Catch: java.lang.Throwable -> L3b
            r8 = r4
            r4 = r1
            r1 = r8
            goto L69
        L3b:
            r9 = move-exception
            r1 = r4
            goto L9b
        L3e:
            defpackage.afga.cz(r10)
            java.lang.Object r10 = r9.f
            r6 = r10
            aizk r6 = (aizk) r6
            nub r5 = new nub
            r5.<init>(r2)
            r10 = 0
            r1 = 6
            aiyk r1 = defpackage.afqt.q(r4, r10, r1)
            afer r10 = r9.e     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = r5.e(r1, r10)     // Catch: java.lang.Throwable -> L27
            r9.f = r6     // Catch: java.lang.Throwable -> L27
            r9.a = r5     // Catch: java.lang.Throwable -> L27
            r9.b = r1     // Catch: java.lang.Throwable -> L27
            r9.c = r10     // Catch: java.lang.Throwable -> L27
            r9.d = r4     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r6.a(r10, r9)     // Catch: java.lang.Throwable -> L27
            if (r4 != r0) goto L68
            goto L9a
        L68:
            r4 = r10
        L69:
            r9.f = r6     // Catch: java.lang.Throwable -> L27
            r9.a = r5     // Catch: java.lang.Throwable -> L27
            r9.b = r1     // Catch: java.lang.Throwable -> L27
            r9.c = r4     // Catch: java.lang.Throwable -> L27
            r9.d = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = r1.d(r9)     // Catch: java.lang.Throwable -> L27
            if (r10 == r0) goto L9a
        L79:
            afer r10 = r9.e     // Catch: java.lang.Throwable -> L27
            r7 = r5
            nub r7 = (defpackage.nub) r7     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = r7.e(r1, r10)     // Catch: java.lang.Throwable -> L27
            boolean r7 = defpackage.afga.f(r10, r4)     // Catch: java.lang.Throwable -> L27
            if (r7 != 0) goto L69
            r9.f = r6     // Catch: java.lang.Throwable -> L27
            r9.a = r5     // Catch: java.lang.Throwable -> L27
            r9.b = r1     // Catch: java.lang.Throwable -> L27
            r9.c = r10     // Catch: java.lang.Throwable -> L27
            r4 = 3
            r9.d = r4     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r6.a(r10, r9)     // Catch: java.lang.Throwable -> L27
            if (r4 == r0) goto L9a
            goto L68
        L9a:
            return r0
        L9b:
            nub r5 = (defpackage.nub) r5
            java.lang.Object r10 = r5.a
            if (r10 == 0) goto La6
            byf r10 = (defpackage.byf) r10
            r10.e(r1)
        La6:
            java.lang.Object r10 = r5.a
            if (r10 != 0) goto Laf
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.bxi.b(r0)
        Laf:
            byf r10 = (defpackage.byf) r10
            r10.d()
            r5.a = r2
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byr.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.byr) b((aizk) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
