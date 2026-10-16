package kotlinx.coroutines.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r<T> implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.o f51438a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f51439b;

    r(kotlinx.coroutines.a.o oVar, int i2) {
        this.f51438a = oVar;
        this.f51439b = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (h.g.b.w.b(r0) != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r6, h.c.e<? super h.ab> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.b.a.q
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.b.a.q r0 = (kotlinx.coroutines.b.a.q) r0
            int r1 = r0.f51437c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51437c = r1
            goto L18
        L13:
            kotlinx.coroutines.b.a.q r0 = new kotlinx.coroutines.b.a.q
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f51435a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51437c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            goto L53
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r7)
            goto L4b
        L36:
            e.b.c.b(r7)
            kotlinx.coroutines.a.o r7 = r5.f51438a
            int r5 = r5.f51439b
            h.a.ag r2 = new h.a.ag
            r2.<init>(r5, r6)
            r0.f51437c = r4
            java.lang.Object r5 = r7.g(r2, r0)
            if (r5 != r1) goto L4b
            goto L56
        L4b:
            r0.f51437c = r3
            java.lang.Object r5 = h.g.b.w.b(r0)
            if (r5 == r1) goto L56
        L53:
            h.ab r5 = h.ab.f48028a
            return r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.a.r.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
