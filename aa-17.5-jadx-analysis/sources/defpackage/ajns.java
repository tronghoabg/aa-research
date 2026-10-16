package defpackage;

/* loaded from: classes2.dex */
public final class ajns implements ajoc {
    private final ajna a;
    private final ajmy b;
    private ajnx c;
    private int d;
    private boolean e;
    private long f;

    public ajns(ajna ajnaVar) {
        this.a = ajnaVar;
        ajmy ajmyVar = ((ajnw) ajnaVar).b;
        this.b = ajmyVar;
        ajnx ajnxVar = ajmyVar.a;
        this.c = ajnxVar;
        this.d = ajnxVar != null ? ajnxVar.b : -1;
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r8 == r9.b) goto L13;
     */
    @Override // defpackage.ajoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long hU(defpackage.ajmy r7, long r8) {
        /*
            r6 = this;
            boolean r8 = r6.e
            if (r8 != 0) goto L59
            ajnx r8 = r6.c
            if (r8 == 0) goto L20
            ajmy r9 = r6.b
            ajnx r9 = r9.a
            if (r8 != r9) goto L18
            int r8 = r6.d
            r9.getClass()
            int r9 = r9.b
            if (r8 != r9) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Peek source is invalid because upstream source was used"
            r6.<init>(r7)
            throw r6
        L20:
            ajna r8 = r6.a
            long r0 = r6.f
            r2 = 1
            long r0 = r0 + r2
            boolean r8 = r8.C(r0)
            if (r8 != 0) goto L30
            r6 = -1
            return r6
        L30:
            ajnx r8 = r6.c
            if (r8 != 0) goto L40
            ajmy r8 = r6.b
            ajnx r8 = r8.a
            if (r8 == 0) goto L40
            r6.c = r8
            int r8 = r8.b
            r6.d = r8
        L40:
            ajmy r0 = r6.b
            long r8 = r0.b
            long r1 = r6.f
            long r8 = r8 - r1
            r1 = 8192(0x2000, double:4.0474E-320)
            long r4 = java.lang.Math.min(r1, r8)
            long r2 = r6.f
            r1 = r7
            r0.F(r1, r2, r4)
            long r7 = r6.f
            long r7 = r7 + r4
            r6.f = r7
            return r4
        L59:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajns.hU(ajmy, long):long");
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return this.a.hV();
    }
}
