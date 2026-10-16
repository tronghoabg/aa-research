package com.waze.location.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f25219a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25220b;

    v(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        v vVar = new v(eVar);
        vVar.f25220b = obj;
        return vVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[PHI: r3
  0x002e: PHI (r3v2 kotlinx.coroutines.b.l) = (r3v3 kotlinx.coroutines.b.l), (r3v5 kotlinx.coroutines.b.l) binds: [B:10:0x002c, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003c -> B:9:0x001f). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f25219a
            r2 = 1
            if (r1 == 0) goto L17
            java.lang.Object r3 = r6.f25220b
            if (r1 == r2) goto L11
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
            e.b.c.b(r7)
            goto L1f
        L11:
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
            e.b.c.b(r7)
            goto L2e
        L17:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.f25220b
            r3 = r7
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
        L1f:
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r6.f25220b = r3
            r6.f25219a = r2
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r7 = kotlinx.coroutines.aj.q(r4, r7)
            if (r7 == r0) goto L3e
        L2e:
            com.waze.location.a.r r7 = com.waze.location.a.r.f25214a
            r1 = r6
            h.c.e r1 = (h.c.e) r1
            r6.f25220b = r3
            r4 = 2
            r6.f25219a = r4
            java.lang.Object r7 = r3.emit(r7, r1)
            if (r7 != r0) goto L1f
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.location.a.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
