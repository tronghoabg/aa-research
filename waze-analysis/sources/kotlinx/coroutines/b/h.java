package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h<T> implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f51683a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f51684b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f51685c;

    h(i iVar, h.g.b.aq aqVar, l lVar) {
        this.f51683a = iVar;
        this.f51684b = aqVar;
        this.f51685c = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r8, h.c.e<? super h.ab> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.b.g
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.b.g r0 = (kotlinx.coroutines.b.g) r0
            int r1 = r0.f51682c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51682c = r1
            goto L18
        L13:
            kotlinx.coroutines.b.g r0 = new kotlinx.coroutines.b.g
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f51680a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51682c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r9)
            goto L5d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            e.b.c.b(r9)
            kotlinx.coroutines.b.i r9 = r7.f51683a
            h.g.a.l r2 = r9.f51686a
            java.lang.Object r2 = r2.invoke(r8)
            h.g.b.aq r4 = r7.f51684b
            java.lang.Object r5 = r4.f48105a
            kotlinx.coroutines.e.ak r6 = kotlinx.coroutines.b.a.ab.f51383a
            if (r5 == r6) goto L50
            h.g.a.p r9 = r9.f51687b
            java.lang.Object r9 = r9.invoke(r5, r2)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5d
        L50:
            r4.f48105a = r2
            kotlinx.coroutines.b.l r7 = r7.f51685c
            r0.f51682c = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.h.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
