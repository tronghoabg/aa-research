package com.waze.map.e;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f28788a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f28789b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f28790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f28789b = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        b bVar = new b(this.f28789b, eVar);
        bVar.f28790c = obj;
        return bVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[PHI: r3
  0x003a: PHI (r3v2 kotlinx.coroutines.b.l) = (r3v3 kotlinx.coroutines.b.l), (r3v5 kotlinx.coroutines.b.l) binds: [B:10:0x0038, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:9:0x001f). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f28788a
            r2 = 1
            if (r1 == 0) goto L17
            java.lang.Object r3 = r6.f28790c
            if (r1 == r2) goto L11
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
            e.b.c.b(r7)
            goto L1f
        L11:
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
            e.b.c.b(r7)
            goto L3a
        L17:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.f28790c
            r3 = r7
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
        L1f:
            com.waze.map.e.i r7 = r6.f28789b
            com.waze.map.main.v r7 = com.waze.map.e.i.e(r7)
            boolean r7 = r7.b()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r1 = r6
            h.c.e r1 = (h.c.e) r1
            r6.f28790c = r3
            r6.f28788a = r2
            java.lang.Object r7 = r3.emit(r7, r1)
            if (r7 == r0) goto L52
        L3a:
            h.o.c r7 = h.o.a.f48264a
            r7 = 500(0x1f4, float:7.0E-43)
            h.o.d r1 = h.o.d.f48272c
            long r4 = h.o.c.i(r7, r1)
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r6.f28790c = r3
            r1 = 2
            r6.f28788a = r1
            java.lang.Object r7 = kotlinx.coroutines.aj.r(r4, r7)
            if (r7 != r0) goto L1f
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
