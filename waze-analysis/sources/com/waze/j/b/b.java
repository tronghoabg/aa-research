package com.waze.j.b;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f24869a;

    /* renamed from: b, reason: collision with root package name */
    int f24870b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f24871c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f24872d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f24873e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f24874f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, String str, boolean z, boolean z2, h.c.e eVar2) {
        super(2, eVar2);
        this.f24871c = eVar;
        this.f24872d = str;
        this.f24873e = z;
        this.f24874f = z2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new b(this.f24871c, this.f24872d, this.f24873e, this.f24874f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.f24870b
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto L11
            java.lang.Object r7 = r7.f24869a
            com.waze.z.a.b.n r7 = (com.waze.z.a.b.n) r7
            e.b.c.b(r8)
            goto L44
        L11:
            e.b.c.b(r8)
            goto L2f
        L15:
            e.b.c.b(r8)
            com.waze.j.b.e r8 = r7.f24871c
            java.lang.String r1 = r7.f24872d
            boolean r3 = r7.f24873e
            boolean r4 = r7.f24874f
            com.waze.w.c r8 = com.waze.j.b.e.c(r8)
            r5 = r7
            h.c.e r5 = (h.c.e) r5
            r7.f24870b = r2
            java.lang.Object r8 = r8.a(r1, r3, r4)
            if (r8 == r0) goto L8d
        L2f:
            com.waze.j.b.e r1 = r7.f24871c
            com.waze.z.a.b.n r8 = (com.waze.z.a.b.n) r8
            r2 = r7
            h.c.e r2 = (h.c.e) r2
            r7.f24869a = r8
            r3 = 2
            r7.f24870b = r3
            java.lang.Object r7 = com.waze.j.b.e.d(r1, r2)
            if (r7 == r0) goto L8d
            r6 = r8
            r8 = r7
            r7 = r6
        L44:
            java.util.List r8 = (java.util.List) r8
            boolean r0 = r7 instanceof com.waze.w.b
            if (r0 == 0) goto L8c
            java.util.Collection r8 = (java.util.Collection) r8
            com.waze.w.b r7 = (com.waze.w.b) r7
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = h.a.i.af(r8, r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L68:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r7.next()
            r2 = r1
            com.waze.w.i r2 = (com.waze.w.i) r2
            java.lang.String r2 = r2.f()
            boolean r2 = r8.add(r2)
            if (r2 == 0) goto L68
            r0.add(r1)
            goto L68
        L83:
            java.util.List r0 = (java.util.List) r0
            com.waze.w.b r7 = new com.waze.w.b
            r7.<init>(r0)
            com.waze.z.a.b.n r7 = (com.waze.z.a.b.n) r7
        L8c:
            return r7
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.j.b.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
