package com.waze.ae;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.am;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f14039a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f14040b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f14041c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(am amVar, h.c.e eVar) {
        super(2, eVar);
        this.f14040b = amVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        b bVar = new b(this.f14040b, eVar);
        bVar.f14041c = obj;
        return bVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L14;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.f14039a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            e.b.c.b(r5)
            goto L3c
        Ld:
            java.lang.Object r1 = r4.f14041c
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r5)
            goto L2c
        L15:
            e.b.c.b(r5)
            java.lang.Object r5 = r4.f14041c
            r1 = r5
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            kotlinx.coroutines.am r5 = r4.f14040b
            r3 = r4
            h.c.e r3 = (h.c.e) r3
            r4.f14041c = r1
            r4.f14039a = r2
            java.lang.Object r5 = r5.c(r3)
            if (r5 == r0) goto L3f
        L2c:
            r2 = r4
            h.c.e r2 = (h.c.e) r2
            r3 = 0
            r4.f14041c = r3
            r3 = 2
            r4.f14039a = r3
            java.lang.Object r4 = r1.emit(r5, r2)
            if (r4 != r0) goto L3c
            goto L3f
        L3c:
            h.ab r4 = h.ab.f48028a
            return r4
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ae.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
