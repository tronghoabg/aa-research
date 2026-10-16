package defpackage;

/* loaded from: classes2.dex */
final class hxb implements hvw, hvv {
    public final hvx a;
    public final hvv b;
    public volatile Object c;
    public volatile hvu d;
    private volatile int e;
    private volatile hvt f;
    private volatile ncp g;

    public hxb(hvx hvxVar, hvv hvvVar) {
        this.a = hvxVar;
        this.b = hvvVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [huv, java.lang.Object] */
    @Override // defpackage.hvw
    public final void a() {
        ncp ncpVar = this.g;
        if (ncpVar != null) {
            ncpVar.a.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113 A[Catch: IOException -> 0x011b, TRY_ENTER, TryCatch #4 {IOException -> 0x011b, blocks: (B:17:0x00a9, B:36:0x0113, B:37:0x011a), top: B:66:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Type inference failed for: r0v11, types: [huv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [huv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [huv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [hui, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [huv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [huv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [huv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [hui, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [huv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [hui, java.lang.Object] */
    @Override // defpackage.hvw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxb.b():boolean");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [huv, java.lang.Object] */
    @Override // defpackage.hvv
    public final void c(hui huiVar, Exception exc, huv huvVar, int i) {
        this.b.c(huiVar, exc, huvVar, this.g.a.e());
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [huv, java.lang.Object] */
    @Override // defpackage.hvv
    public final void d(hui huiVar, Object obj, huv huvVar, int i, hui huiVar2) {
        this.b.d(huiVar, obj, huvVar, this.g.a.e(), huiVar);
    }

    final boolean e(ncp ncpVar) {
        ncp ncpVar2 = this.g;
        return ncpVar2 != null && ncpVar2 == ncpVar;
    }
}
