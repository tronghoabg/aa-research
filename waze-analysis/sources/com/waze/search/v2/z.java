package com.waze.search.v2;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f36645a;

    /* renamed from: b, reason: collision with root package name */
    Object f36646b;

    /* renamed from: c, reason: collision with root package name */
    int f36647c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f36648d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ SearchV2Activity f36649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(SearchV2Activity searchV2Activity, h.c.e eVar) {
        super(2, eVar);
        this.f36649e = searchV2Activity;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        z zVar = new z(this.f36649e, eVar);
        zVar.f36648d = obj;
        return zVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((Set) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0049 -> B:11:0x004c). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f36647c
            if (r1 == 0) goto L16
            java.lang.Object r1 = r6.f36646b
            com.waze.search.v2.dj r1 = (com.waze.search.v2.dj) r1
            java.lang.Object r2 = r6.f36645a
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r6.f36648d
            java.util.Map r3 = (java.util.Map) r3
            e.b.c.b(r7)
            goto L4c
        L16:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.f36648d
            java.util.Set r7 = (java.util.Set) r7
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
            r3 = r1
        L2a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L54
            java.lang.Object r7 = r2.next()
            r1 = r7
            com.waze.search.v2.dj r1 = (com.waze.search.v2.dj) r1
            com.waze.search.v2.SearchV2Activity r7 = r6.f36649e
            r4 = r6
            h.c.e r4 = (h.c.e) r4
            r6.f36648d = r3
            r6.f36645a = r2
            r6.f36646b = r1
            r5 = 1
            r6.f36647c = r5
            java.lang.Object r7 = com.waze.search.v2.SearchV2Activity.o(r7, r1, r4)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            com.waze.search.v2.g r7 = (com.waze.search.v2.g) r7
            if (r7 == 0) goto L2a
            r3.put(r1, r7)
            goto L2a
        L54:
            com.waze.search.v2.SearchV2Activity r6 = r6.f36649e
            com.waze.search.v2.fi r6 = com.waze.search.v2.SearchV2Activity.n(r6)
            com.waze.search.v2.ar r7 = new com.waze.search.v2.ar
            r7.<init>(r3)
            com.waze.speech.k r7 = (com.waze.speech.k) r7
            r6.aa(r7)
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
