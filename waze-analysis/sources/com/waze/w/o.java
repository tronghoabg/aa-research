package com.waze.w;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f45448a;

    /* renamed from: b, reason: collision with root package name */
    int f45449b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f45450c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f45451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(p pVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f45451d = i2;
        this.f45450c = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f45451d != 0 ? new o(this.f45450c, eVar, 1, null) : new o(this.f45450c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f45451d != 0 ? ((o) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((o) create((ab) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r3.emit(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r3.emit(r7, r6) == r0) goto L31;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f45451d
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L44
            h.c.a.a r0 = h.c.a.a.f48038a
            int r4 = r6.f45449b
            if (r4 == 0) goto L1b
            if (r4 == r3) goto L13
            e.b.c.b(r7)
            goto L40
        L13:
            java.lang.Object r3 = r6.f45448a
            kotlinx.coroutines.b.bm r3 = (kotlinx.coroutines.b.bm) r3
            e.b.c.b(r7)
            goto L32
        L1b:
            e.b.c.b(r7)
            com.waze.w.p r7 = r6.f45450c
            kotlinx.coroutines.b.bm r4 = com.waze.w.p.d(r7)
            r5 = r6
            h.c.e r5 = (h.c.e) r5
            r6.f45448a = r4
            r6.f45449b = r3
            java.lang.Object r7 = r7.a(r5)
            if (r7 == r0) goto L43
            r3 = r4
        L32:
            r4 = r6
            h.c.e r4 = (h.c.e) r4
            r6.f45448a = r2
            r6.f45449b = r1
            java.lang.Object r6 = r3.emit(r7, r4)
            if (r6 != r0) goto L40
            goto L43
        L40:
            h.ab r6 = h.ab.f48028a
            return r6
        L43:
            return r0
        L44:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r4 = r6.f45449b
            if (r4 == 0) goto L58
            if (r4 == r3) goto L50
            e.b.c.b(r7)
            goto L7d
        L50:
            java.lang.Object r3 = r6.f45448a
            kotlinx.coroutines.b.bm r3 = (kotlinx.coroutines.b.bm) r3
            e.b.c.b(r7)
            goto L6f
        L58:
            e.b.c.b(r7)
            com.waze.w.p r7 = r6.f45450c
            kotlinx.coroutines.b.bm r4 = com.waze.w.p.d(r7)
            r5 = r6
            h.c.e r5 = (h.c.e) r5
            r6.f45448a = r4
            r6.f45449b = r3
            java.lang.Object r7 = r7.a(r5)
            if (r7 == r0) goto L80
            r3 = r4
        L6f:
            r4 = r6
            h.c.e r4 = (h.c.e) r4
            r6.f45448a = r2
            r6.f45449b = r1
            java.lang.Object r6 = r3.emit(r7, r4)
            if (r6 != r0) goto L7d
            goto L80
        L7d:
            h.ab r6 = h.ab.f48028a
            return r6
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.w.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(p pVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f45451d = i2;
        this.f45450c = pVar;
    }
}
