package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cc implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f51641a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f51642b;

    cc(h.g.b.am amVar, l lVar) {
        this.f51641a = amVar;
        this.f51642b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.b.cb
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.b.cb r0 = (kotlinx.coroutines.b.cb) r0
            int r1 = r0.f51640c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51640c = r1
            goto L18
        L13:
            kotlinx.coroutines.b.cb r0 = new kotlinx.coroutines.b.cb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f51638a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51640c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            if (r5 <= 0) goto L49
            h.g.b.am r5 = r4.f51641a
            boolean r6 = r5.f48101a
            if (r6 != 0) goto L49
            r5.f48101a = r3
            kotlinx.coroutines.b.l r4 = r4.f51642b
            kotlinx.coroutines.b.bw r5 = kotlinx.coroutines.b.bw.f51619a
            r0.f51640c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.cc.a(int, h.c.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        return a(((Number) obj).intValue(), eVar);
    }
}
