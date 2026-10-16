package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class egl implements eep {
    public final egp a;
    public final afdr b;
    public final AtomicBoolean c;
    private final File d;
    private final eha e;
    private final ajdz f;

    public egl(File file, eha ehaVar, egp egpVar, afdr afdrVar) {
        egpVar.getClass();
        this.d = file;
        this.e = ehaVar;
        this.a = egpVar;
        this.b = afdrVar;
        this.c = new AtomicBoolean(false);
        this.f = new ajdz();
    }

    private final void d() {
        if (this.c.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // defpackage.eep
    public final void a() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: all -> 0x006f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x006f, blocks: (B:30:0x006e, B:40:0x007f, B:39:0x007c, B:36:0x0077), top: B:56:0x001f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [afeh] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.afeh r8, defpackage.afck r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.egj
            if (r0 == 0) goto L13
            r0 = r9
            egj r0 = (defpackage.egj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            egj r0 = new egj
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r8 = r0.a
            egh r0 = r0.e
            defpackage.woy.dF(r9)     // Catch: java.lang.Throwable -> L2b
            goto L5e
        L2b:
            r9 = move-exception
            goto L77
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.woy.dF(r9)
            r7.d()
            ajdz r9 = r7.f
            boolean r9 = r9.c()
            egh r2 = new egh     // Catch: java.lang.Throwable -> L84
            java.io.File r4 = r7.d     // Catch: java.lang.Throwable -> L84
            eha r5 = r7.e     // Catch: java.lang.Throwable -> L84
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L72
            r0.e = r2     // Catch: java.lang.Throwable -> L72
            r0.a = r9     // Catch: java.lang.Throwable -> L72
            r0.d = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r8 = r8.invoke(r2, r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r8 == r1) goto L71
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r2
        L5e:
            r0.a()     // Catch: java.lang.Throwable -> L63
            r0 = 0
            goto L64
        L63:
            r0 = move-exception
        L64:
            if (r0 != 0) goto L6e
            if (r8 == 0) goto L6d
            ajdz r7 = r7.f
            r7.d()
        L6d:
            return r9
        L6e:
            throw r0     // Catch: java.lang.Throwable -> L6f
        L6f:
            r9 = move-exception
            goto L80
        L71:
            return r1
        L72:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r2
        L77:
            r0.a()     // Catch: java.lang.Throwable -> L7b
            goto L7f
        L7b:
            r0 = move-exception
            defpackage.adqs.y(r9, r0)     // Catch: java.lang.Throwable -> L6f
        L7f:
            throw r9     // Catch: java.lang.Throwable -> L6f
        L80:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L85
        L84:
            r8 = move-exception
        L85:
            if (r9 == 0) goto L8c
            ajdz r7 = r7.f
            r7.d()
        L8c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egl.b(afeh, afck):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[Catch: all -> 0x00ca, IOException -> 0x00cc, TRY_ENTER, TryCatch #8 {IOException -> 0x00cc, all -> 0x00ca, blocks: (B:31:0x00a1, B:33:0x00aa, B:36:0x00bb, B:43:0x00c9, B:42:0x00c6, B:39:0x00c1), top: B:62:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb A[Catch: all -> 0x00ca, IOException -> 0x00cc, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x00cc, all -> 0x00ca, blocks: (B:31:0x00a1, B:33:0x00aa, B:36:0x00bb, B:43:0x00c9, B:42:0x00c6, B:39:0x00c1), top: B:62:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd A[Catch: all -> 0x0104, TryCatch #1 {all -> 0x0104, blocks: (B:51:0x00d4, B:53:0x00dd, B:54:0x00e3, B:55:0x0103, B:22:0x0064, B:23:0x0080), top: B:62:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [ajdz] */
    /* JADX WARN: Type inference failed for: r10v6, types: [ajdz] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15, types: [ajdz] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [afck, egk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [afcr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.afeg r9, defpackage.afck r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egl.c(afeg, afck):java.lang.Object");
    }
}
