package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ev extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f36468a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f36469b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f36470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ev(ck ckVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36470c = i2;
        this.f36469b = ckVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f36470c;
        if (i2 == 0) {
            return new ev((fi) this.f36469b, eVar, 0);
        }
        Object obj2 = this.f36469b;
        return i2 != 1 ? new ev((fi) obj2, eVar, 2, null) : new ev((ck) obj2, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f36470c;
        return i2 != 0 ? i2 != 1 ? ((ev) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ev) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ev) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (((com.waze.search.v2.ck) r5.f36469b).f36255g.scrollTo(0, r5) == r0) goto L23;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f36470c
            r1 = 1
            if (r0 == 0) goto L74
            if (r0 == r1) goto L34
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r5.f36468a
            if (r2 == 0) goto L11
            e.b.c.b(r6)
            goto L31
        L11:
            e.b.c.b(r6)
            java.lang.Object r6 = r5.f36469b
            com.waze.search.v2.am r2 = new com.waze.search.v2.am
            com.waze.ui.m.au r3 = com.waze.ui.m.au.f42798a
            com.waze.ui.m.cb r3 = (com.waze.ui.m.cb) r3
            com.waze.search.v2.fi r6 = (com.waze.search.v2.fi) r6
            kotlinx.coroutines.b.bm r4 = r6.x()
            r2.<init>(r3, r4)
            r3 = r5
            h.c.e r3 = (h.c.e) r3
            r5.f36468a = r1
            java.lang.Object r5 = com.waze.search.v2.fi.o(r6, r2, r3)
            if (r5 != r0) goto L31
            return r0
        L31:
            h.ab r5 = h.ab.f48028a
            return r5
        L34:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r5.f36468a
            r3 = 0
            if (r2 == 0) goto L45
            if (r2 == r1) goto L41
            e.b.c.b(r6)
            goto L71
        L41:
            e.b.c.b(r6)
            goto L5c
        L45:
            e.b.c.b(r6)
            java.lang.Object r6 = r5.f36469b
            com.waze.search.v2.ck r6 = (com.waze.search.v2.ck) r6
            androidx.compose.foundation.ScrollState r6 = com.waze.search.v2.ck.b(r6)
            r2 = r5
            h.c.e r2 = (h.c.e) r2
            r5.f36468a = r1
            java.lang.Object r6 = r6.scrollTo(r3, r2)
            if (r6 != r0) goto L5c
            goto L70
        L5c:
            java.lang.Object r6 = r5.f36469b
            com.waze.search.v2.ck r6 = (com.waze.search.v2.ck) r6
            androidx.compose.foundation.ScrollState r6 = com.waze.search.v2.ck.a(r6)
            r1 = r5
            h.c.e r1 = (h.c.e) r1
            r2 = 2
            r5.f36468a = r2
            java.lang.Object r5 = r6.scrollTo(r3, r1)
            if (r5 != r0) goto L71
        L70:
            return r0
        L71:
            h.ab r5 = h.ab.f48028a
            return r5
        L74:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r5.f36468a
            if (r2 == 0) goto L7e
            e.b.c.b(r6)
            goto L9e
        L7e:
            e.b.c.b(r6)
            java.lang.Object r6 = r5.f36469b
            com.waze.search.v2.am r2 = new com.waze.search.v2.am
            com.waze.ui.m.ao r3 = com.waze.ui.m.ao.f42792a
            com.waze.ui.m.cb r3 = (com.waze.ui.m.cb) r3
            com.waze.search.v2.fi r6 = (com.waze.search.v2.fi) r6
            kotlinx.coroutines.b.bm r4 = r6.x()
            r2.<init>(r3, r4)
            r3 = r5
            h.c.e r3 = (h.c.e) r3
            r5.f36468a = r1
            java.lang.Object r5 = com.waze.search.v2.fi.o(r6, r2, r3)
            if (r5 != r0) goto L9e
            return r0
        L9e:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.ev.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ev(fi fiVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36470c = i2;
        this.f36469b = fiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ev(fi fiVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f36470c = i2;
        this.f36469b = fiVar;
    }
}
