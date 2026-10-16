package com.waze.bq.a;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f17227a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f17228b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f17229c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f17228b = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(this.f17228b, eVar);
        dVar.f17229c = obj;
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (r1.emit(h.m.d(new com.waze.t.a.a("dummy_conversation_id", new com.waze.t.a.t(com.waze.bq.a.e.a(r6.f17228b)))), r6) != r0) goto L17;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f17227a
            java.lang.String r2 = "dummy_conversation_id"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L12
            e.b.c.b(r7)
            goto L7e
        L12:
            java.lang.Object r1 = r6.f17229c
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r7)
            goto L58
        L1a:
            java.lang.Object r1 = r6.f17229c
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r7)
            goto L39
        L22:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.f17229c
            kotlinx.coroutines.b.l r7 = (kotlinx.coroutines.b.l) r7
            r1 = r6
            h.c.e r1 = (h.c.e) r1
            r6.f17229c = r7
            r6.f17227a = r4
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = kotlinx.coroutines.aj.q(r4, r1)
            if (r1 == r0) goto L81
            r1 = r7
        L39:
            com.waze.t.a.a r7 = new com.waze.t.a.a
            com.waze.t.a.p r4 = new com.waze.t.a.p
            java.lang.String r5 = "Hello"
            r4.<init>(r5)
            com.waze.t.a.u r4 = (com.waze.t.a.u) r4
            r7.<init>(r2, r4)
            h.m r7 = h.m.d(r7)
            r4 = r6
            h.c.e r4 = (h.c.e) r4
            r6.f17229c = r1
            r6.f17227a = r3
            java.lang.Object r7 = r1.emit(r7, r4)
            if (r7 == r0) goto L81
        L58:
            com.waze.bq.a.e r7 = r6.f17228b
            com.waze.t.a.a r3 = new com.waze.t.a.a
            com.waze.t.a.t r4 = new com.waze.t.a.t
            com.waze.shared_infra.e.a r7 = com.waze.bq.a.e.a(r7)
            r4.<init>(r7)
            com.waze.t.a.u r4 = (com.waze.t.a.u) r4
            r3.<init>(r2, r4)
            h.m r7 = h.m.d(r3)
            r2 = r6
            h.c.e r2 = (h.c.e) r2
            r3 = 0
            r6.f17229c = r3
            r3 = 3
            r6.f17227a = r3
            java.lang.Object r6 = r1.emit(r7, r2)
            if (r6 != r0) goto L7e
            goto L81
        L7e:
            h.ab r6 = h.ab.f48028a
            return r6
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bq.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
