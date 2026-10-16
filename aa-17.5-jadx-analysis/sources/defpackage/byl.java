package defpackage;

/* loaded from: classes.dex */
public final class byl extends afde implements afeg {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ afdr e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byl(afdr afdrVar, afck afckVar) {
        super(2, afckVar);
        this.e = afdrVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        byl bylVar = new byl(this.e, afckVar);
        bylVar.f = obj;
        return bylVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0069, code lost:
    
        r4 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:25:0x0069, B:29:0x0088], limit reached: 42 */
    /* JADX WARN: Path cross not found for [B:29:0x0088, B:25:0x0069], limit reached: 42 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[Catch: all -> 0x0027, PHI: r1 r4 r5 r6
  0x0079: PHI (r1v5 ??) = (r1v12 ??), (r1v13 ??) binds: [B:26:0x0077, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r4v3 java.lang.Object) = (r4v7 java.lang.Object), (r4v10 java.lang.Object) binds: [B:26:0x0077, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r5v4 java.lang.Object) = (r5v9 ??), (r5v10 ??) binds: [B:26:0x0077, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r6v2 aiyl) = (r6v3 aiyl), (r6v7 aiyl) binds: [B:26:0x0077, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0017, B:25:0x0069, B:27:0x0079, B:29:0x0088, B:11:0x0023, B:21:0x0051), top: B:41:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0017, B:25:0x0069, B:27:0x0079, B:29:0x0088, B:11:0x0023, B:21:0x0051), top: B:41:0x0007 }] */
    /* JADX WARN: Type inference failed for: r10v4, types: [bxz] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [aixy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aixl, aixy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aixy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [aixl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, ntn] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [ntn] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            afcr r0 = defpackage.afcr.a
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
            aiyl r6 = (defpackage.aiyl) r6
            defpackage.woy.dF(r10)     // Catch: java.lang.Throwable -> L27
            goto L69
        L1b:
            java.lang.Object r1 = r9.b
            java.lang.Object r5 = r9.a
            java.lang.Object r6 = r9.f
            aiyl r6 = (defpackage.aiyl) r6
            defpackage.woy.dF(r10)     // Catch: java.lang.Throwable -> L27
            goto L79
        L27:
            r9 = move-exception
            goto L9b
        L2a:
            java.lang.Object r1 = r9.c
            java.lang.Object r4 = r9.b
            java.lang.Object r5 = r9.a
            java.lang.Object r6 = r9.f
            aiyl r6 = (defpackage.aiyl) r6
            defpackage.woy.dF(r10)     // Catch: java.lang.Throwable -> L3b
            r8 = r4
            r4 = r1
            r1 = r8
            goto L69
        L3b:
            r9 = move-exception
            r1 = r4
            goto L9b
        L3e:
            defpackage.woy.dF(r10)
            java.lang.Object r10 = r9.f
            r6 = r10
            aiyl r6 = (defpackage.aiyl) r6
            ntn r5 = new ntn
            r5.<init>(r2)
            r10 = 0
            r1 = 6
            aixl r1 = defpackage.afpt.r(r4, r10, r1)
            afdr r10 = r9.e     // Catch: java.lang.Throwable -> L27
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
            afdr r10 = r9.e     // Catch: java.lang.Throwable -> L27
            r7 = r5
            ntn r7 = (defpackage.ntn) r7     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = r7.e(r1, r10)     // Catch: java.lang.Throwable -> L27
            boolean r7 = defpackage.affa.f(r10, r4)     // Catch: java.lang.Throwable -> L27
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
            ntn r5 = (defpackage.ntn) r5
            java.lang.Object r10 = r5.a
            if (r10 == 0) goto La6
            bxz r10 = (defpackage.bxz) r10
            r10.e(r1)
        La6:
            java.lang.Object r10 = r5.a
            if (r10 != 0) goto Laf
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.bxc.b(r0)
        Laf:
            bxz r10 = (defpackage.bxz) r10
            r10.d()
            r5.a = r2
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byl.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((byl) b((aiyl) obj, (afck) obj2)).hT(afak.a);
    }
}
