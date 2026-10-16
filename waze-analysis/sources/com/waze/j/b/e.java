package com.waze.j.b;

import com.waze.beacons.g;
import com.waze.w.i;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.w.c f24882a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.a.b f24883b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.coroutines.a f24884c;

    /* renamed from: d, reason: collision with root package name */
    private final g f24885d;

    public e(com.waze.w.c cVar, g gVar, com.waze.av.a.b bVar, com.waze.coroutines.a aVar) {
        x.f(cVar, "autoCompleteDataSource");
        x.f(gVar, "genericAutocompletePlaceFetcher");
        x.f(bVar, "genericPlaceRepository");
        x.f(aVar, "coroutineDispatcherProvider");
        this.f24882a = cVar;
        this.f24885d = gVar;
        this.f24883b = bVar;
        this.f24884c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(com.waze.j.b.e r12, h.c.e r13) {
        /*
            boolean r0 = r13 instanceof com.waze.j.b.d
            if (r0 == 0) goto L13
            r0 = r13
            com.waze.j.b.d r0 = (com.waze.j.b.d) r0
            int r1 = r0.f24881c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24881c = r1
            goto L18
        L13:
            com.waze.j.b.d r0 = new com.waze.j.b.d
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f24879a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f24881c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r13)
            goto L43
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            e.b.c.b(r13)
            com.waze.av.a.b r12 = r12.f24883b
            com.waze.av.a.n r13 = com.waze.av.a.n.f15819a
            kotlinx.coroutines.b.k r12 = r12.b(r13)
            r0.f24881c = r3
            java.lang.Object r13 = kotlinx.coroutines.b.ai.j(r12, r0)
            if (r13 != r1) goto L43
            return r1
        L43:
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L4b
            java.util.List r13 = h.a.i.h()
        L4b:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.Iterator r13 = r13.iterator()
        L58:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r13.next()
            r1 = r0
            com.waze.av.b.n r1 = (com.waze.av.b.n) r1
            boolean r1 = r1 instanceof com.waze.av.b.j
            if (r1 != 0) goto L58
            r12.add(r0)
            goto L58
        L6d:
            java.util.List r12 = (java.util.List) r12
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r0 = 10
            int r0 = h.a.i.q(r12, r0)
            r13.<init>(r0)
            java.util.Collection r13 = (java.util.Collection) r13
            java.util.Iterator r12 = r12.iterator()
        L82:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r12.next()
            r8 = r0
            com.waze.av.b.n r8 = (com.waze.av.b.n) r8
            boolean r0 = r8 instanceof com.waze.av.b.l
            r1 = 0
            if (r0 == 0) goto La1
            r0 = r8
            com.waze.av.b.l r0 = (com.waze.av.b.l) r0
            com.waze.av.b.z r0 = r0.c()
            com.waze.av.b.z r2 = com.waze.av.b.z.f16014b
            if (r0 != r2) goto La1
            r10 = r3
            goto La2
        La1:
            r10 = r1
        La2:
            java.lang.String r7 = com.waze.ac.e.u(r8)
            com.waze.w.g r9 = com.waze.w.g.f45429b
            com.waze.w.h r4 = new com.waze.w.h
            java.lang.String r6 = ""
            r11 = 0
            java.lang.String r5 = ""
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r13.add(r4)
            goto L82
        Lb6:
            java.util.List r13 = (java.util.List) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.j.b.e.d(com.waze.j.b.e, h.c.e):java.lang.Object");
    }

    @Override // com.waze.j.b.a
    public final Object a(i iVar, String str, h.c.e eVar) {
        return aj.v(this.f24884c.a(), new c(iVar, this, str, null), eVar);
    }

    @Override // com.waze.j.b.a
    public final Object b(String str, boolean z, boolean z2, h.c.e eVar) {
        return aj.v(this.f24884c.a(), new b(this, str, z, z2, null), eVar);
    }
}
