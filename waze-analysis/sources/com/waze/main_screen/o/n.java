package com.waze.main_screen.o;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f26710a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f26711b;

    public n(kotlinx.coroutines.b.l lVar, r rVar) {
        this.f26710a = lVar;
        this.f26711b = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r6 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r6.emit(r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.main_screen.o.m
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.main_screen.o.m r0 = (com.waze.main_screen.o.m) r0
            int r1 = r0.f26707b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26707b = r1
            goto L18
        L13:
            com.waze.main_screen.o.m r0 = new com.waze.main_screen.o.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f26706a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f26707b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            goto L75
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f26708c
            kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6
            e.b.c.b(r8)
            goto L69
        L3a:
            e.b.c.b(r8)
            kotlinx.coroutines.b.l r8 = r6.f26710a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            com.waze.main_screen.o.c r7 = (com.waze.main_screen.o.c) r7
            com.waze.main_screen.o.c r2 = com.waze.main_screen.o.c.f26687a
            int r7 = r7.ordinal()
            if (r7 == 0) goto L5c
            if (r7 != r4) goto L56
            java.util.List r6 = h.a.i.h()
        L52:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L69
        L56:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        L5c:
            com.waze.main_screen.o.r r6 = r6.f26711b
            r0.f26708c = r8
            r0.f26707b = r4
            java.lang.Object r6 = com.waze.main_screen.o.r.d(r6, r0)
            if (r6 == r1) goto L78
            goto L52
        L69:
            r7 = 0
            r0.f26708c = r7
            r0.f26707b = r3
            java.lang.Object r6 = r6.emit(r8, r0)
            if (r6 != r1) goto L75
            goto L78
        L75:
            h.ab r6 = h.ab.f48028a
            return r6
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.o.n.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
