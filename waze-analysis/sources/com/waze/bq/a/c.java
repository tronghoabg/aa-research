package com.waze.bq.a;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f17223a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.t.a.e f17224b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f17225c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f17226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(com.waze.t.a.e eVar, e eVar2, h.c.e eVar3) {
        super(2, eVar3);
        this.f17224b = eVar;
        this.f17225c = eVar2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        c cVar = new c(this.f17224b, this.f17225c, eVar);
        cVar.f17226d = obj;
        return cVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r1.emit(h.m.d(new com.waze.t.a.t(com.waze.bq.a.e.a(r8.f17225c))), r8) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r1.emit(h.m.d(com.waze.t.a.r.f40640a), r8) == r0) goto L28;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.f17223a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L13
            e.b.c.b(r9)
            goto L91
        L13:
            java.lang.Object r1 = r8.f17226d
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r9)
            goto L5b
        L1b:
            java.lang.Object r1 = r8.f17226d
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r9)
            goto L3a
        L23:
            e.b.c.b(r9)
            java.lang.Object r9 = r8.f17226d
            kotlinx.coroutines.b.l r9 = (kotlinx.coroutines.b.l) r9
            r1 = r8
            h.c.e r1 = (h.c.e) r1
            r8.f17226d = r9
            r8.f17223a = r4
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = kotlinx.coroutines.aj.q(r6, r1)
            if (r1 == r0) goto L9a
            r1 = r9
        L3a:
            com.waze.t.a.e r9 = r8.f17224b
            boolean r4 = r9 instanceof com.waze.t.a.d
            if (r4 == 0) goto L78
            com.waze.t.a.s r9 = new com.waze.t.a.s
            com.waze.bq.b.a r4 = new com.waze.bq.b.a
            r4.<init>(r5)
            r9.<init>(r4)
            h.m r9 = h.m.d(r9)
            r4 = r8
            h.c.e r4 = (h.c.e) r4
            r8.f17226d = r1
            r8.f17223a = r3
            java.lang.Object r9 = r1.emit(r9, r4)
            if (r9 == r0) goto L9a
        L5b:
            com.waze.bq.a.e r9 = r8.f17225c
            com.waze.t.a.t r3 = new com.waze.t.a.t
            com.waze.shared_infra.e.a r9 = com.waze.bq.a.e.a(r9)
            r3.<init>(r9)
            h.m r9 = h.m.d(r3)
            r3 = r8
            h.c.e r3 = (h.c.e) r3
            r8.f17226d = r5
            r8.f17223a = r2
            java.lang.Object r8 = r1.emit(r9, r3)
            if (r8 != r0) goto L91
            goto L9a
        L78:
            boolean r9 = r9 instanceof com.waze.t.a.c
            if (r9 == 0) goto L94
            com.waze.t.a.r r9 = com.waze.t.a.r.f40640a
            h.m r9 = h.m.d(r9)
            r2 = r8
            h.c.e r2 = (h.c.e) r2
            r8.f17226d = r5
            r3 = 4
            r8.f17223a = r3
            java.lang.Object r8 = r1.emit(r9, r2)
            if (r8 != r0) goto L91
            goto L9a
        L91:
            h.ab r8 = h.ab.f48028a
            return r8
        L94:
            h.i r8 = new h.i
            r8.<init>()
            throw r8
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bq.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
