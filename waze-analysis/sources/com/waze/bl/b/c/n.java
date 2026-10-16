package com.waze.bl.b.c;

import com.waze.t.b.ar;
import com.waze.t.b.bb;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends com.waze.bl.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16964a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bl.c.c.c f16965b;

    /* renamed from: c, reason: collision with root package name */
    private final i f16966c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.bl.c.c.k f16967d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.bl.c.c.p f16968e;

    public /* synthetic */ n(com.waze.shared_infra.i.e eVar, com.waze.bl.c.c.c cVar, i iVar, com.waze.bl.c.c.k kVar, com.waze.bl.c.c.p pVar) {
        this.f16964a = eVar;
        this.f16965b = cVar;
        this.f16966c = iVar;
        this.f16967d = kVar;
        this.f16968e = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.bl.b.c.j
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.bl.b.c.j r0 = (com.waze.bl.b.c.j) r0
            int r1 = r0.f16951d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16951d = r1
            goto L18
        L13:
            com.waze.bl.b.c.j r0 = new com.waze.bl.b.c.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f16949b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16951d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r4 = r0.f16948a
            e.b.c.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            e.b.c.b(r5)
            com.waze.bl.b.c.i r4 = r4.f16966c
            r0.f16948a = r3
            r0.f16951d = r3
            java.lang.Object r5 = com.waze.bl.b.c.i.a(r4, r0)
            if (r5 == r1) goto L4c
            r4 = r3
        L41:
            if (r3 == r4) goto L44
            r3 = 0
        L44:
            java.util.List r5 = (java.util.List) r5
            com.waze.bl.c.b.f r4 = new com.waze.bl.c.b.f
            r4.<init>(r3, r5)
            return r4
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bl.b.c.n.g(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.waze.bl.c.b.c r5, com.waze.reports_v2.b.i r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.bl.b.c.k
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.bl.b.c.k r0 = (com.waze.bl.b.c.k) r0
            int r1 = r0.f16954c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16954c = r1
            goto L18
        L13:
            com.waze.bl.b.c.k r0 = new com.waze.bl.b.c.k
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f16952a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16954c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.bl.c.b.c r5 = r0.f16955d
            r4 = r5
            com.waze.bl.c.b.c r4 = (com.waze.bl.c.b.c) r4
            e.b.c.b(r7)
            goto L47
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r7)
            com.waze.bl.c.c.k r4 = r4.f16967d
            com.waze.reports_v2.b.at r7 = r5.b()
            r0.f16955d = r5
            r0.f16954c = r3
            java.lang.Object r7 = r4.b(r7, r6, r0)
            if (r7 == r1) goto L76
        L47:
            com.waze.bl.c.c.j r7 = (com.waze.bl.c.c.j) r7
            com.waze.bl.c.c.h r4 = com.waze.bl.c.c.h.f17029a
            boolean r4 = h.g.b.x.n(r7, r4)
            if (r4 == 0) goto L5c
            com.waze.bl.c.b.g r4 = new com.waze.bl.c.b.g
            com.waze.reports_v2.b.at r5 = r5.b()
            r6 = 0
            r4.<init>(r6, r5, r6)
            return r4
        L5c:
            boolean r4 = r7 instanceof com.waze.bl.c.c.i
            if (r4 == 0) goto L70
            com.waze.bl.c.b.g r4 = new com.waze.bl.c.b.g
            com.waze.reports_v2.b.at r5 = r5.b()
            com.waze.bl.c.c.i r7 = (com.waze.bl.c.c.i) r7
            int r6 = r7.a()
            r4.<init>(r3, r5, r6)
            return r4
        L70:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bl.b.c.n.h(com.waze.bl.c.b.c, com.waze.reports_v2.b.i, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.waze.bl.c.b.d r8, h.c.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.waze.bl.b.c.l
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.bl.b.c.l r0 = (com.waze.bl.b.c.l) r0
            int r1 = r0.f16958c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16958c = r1
            goto L18
        L13:
            com.waze.bl.b.c.l r0 = new com.waze.bl.b.c.l
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f16956a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16958c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r9)
            goto Lb0
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            com.waze.bl.c.b.d r8 = r0.f16959d
            r2 = r8
            com.waze.bl.c.b.d r2 = (com.waze.bl.c.b.d) r2
            e.b.c.b(r9)
            goto L4b
        L3c:
            e.b.c.b(r9)
            com.waze.bl.b.c.i r9 = r7.f16966c
            r0.f16959d = r8
            r0.f16958c = r4
            java.lang.Object r9 = com.waze.bl.b.c.i.a(r9, r0)
            if (r9 == r1) goto Lc0
        L4b:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L51:
            boolean r2 = r9.hasNext()
            r4 = 0
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r9.next()
            r5 = r2
            com.waze.bl.c.c.b r5 = (com.waze.bl.c.c.b) r5
            java.lang.String r5 = r5.b()
            java.lang.String r6 = r8.b()
            boolean r5 = h.g.b.x.n(r5, r6)
            if (r5 == 0) goto L51
            goto L6f
        L6e:
            r2 = r4
        L6f:
            com.waze.bl.c.c.b r2 = (com.waze.bl.c.c.b) r2
            if (r2 != 0) goto L98
            com.waze.shared_infra.i.e r7 = r7.f16964a
            java.lang.String r8 = r8.b()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "closure candidate #"
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = " was not found!"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r7.b(r8)
            com.waze.bl.c.b.h r7 = new com.waze.bl.c.b.h
            r8 = 0
            r7.<init>(r8, r8)
            return r7
        L98:
            com.waze.bl.c.b.c r8 = new com.waze.bl.c.b.c
            com.waze.reports_v2.b.at r9 = com.waze.reports_v2.b.at.I
            r8.<init>(r9)
            com.waze.reports_v2.b.g r9 = com.waze.bl.b.c.r.a(r2)
            com.waze.reports_v2.b.i r9 = (com.waze.reports_v2.b.i) r9
            r0.f16959d = r4
            r0.f16958c = r3
            java.lang.Object r9 = r7.h(r8, r9, r0)
            if (r9 != r1) goto Lb0
            goto Lc0
        Lb0:
            com.waze.bl.c.b.g r9 = (com.waze.bl.c.b.g) r9
            com.waze.bl.c.b.h r7 = new com.waze.bl.c.b.h
            boolean r8 = r9.e()
            int r9 = r9.a()
            r7.<init>(r8, r9)
            return r7
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bl.b.c.n.i(com.waze.bl.c.b.d, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.waze.bl.c.b.e r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.bl.b.c.m
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.bl.b.c.m r0 = (com.waze.bl.b.c.m) r0
            int r1 = r0.f16962c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16962c = r1
            goto L18
        L13:
            com.waze.bl.b.c.m r0 = new com.waze.bl.b.c.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f16960a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16962c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.bl.c.b.e r5 = r0.f16963d
            r4 = r5
            com.waze.bl.c.b.e r4 = (com.waze.bl.c.b.e) r4
            e.b.c.b(r6)
            goto L4c
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r6)
            com.waze.bl.c.c.p r4 = r4.f16968e
            com.waze.reports_v2.b.af r6 = r5.b()
            java.lang.String r2 = r5.c()
            r0.f16963d = r5
            r0.f16962c = r3
            java.lang.Object r6 = r4.b(r6, r2, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            com.waze.bl.c.c.o r6 = (com.waze.bl.c.c.o) r6
            boolean r4 = r6 instanceof com.waze.bl.c.c.n
            com.waze.bl.c.b.i r6 = new com.waze.bl.c.b.i
            com.waze.reports_v2.b.af r5 = r5.b()
            r6.<init>(r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bl.b.c.n.j(com.waze.bl.c.b.e, h.c.e):java.lang.Object");
    }

    @Override // com.waze.t.b.aj
    public final /* bridge */ /* synthetic */ bb a(Object obj) {
        b bVar = (b) obj;
        h.g.b.x.f(bVar, "action");
        if (bVar instanceof com.waze.bl.c.b.c) {
            return bb.f40717e;
        }
        if (bVar instanceof com.waze.bl.c.b.e) {
            return bb.f40716d;
        }
        if (bVar instanceof com.waze.bl.c.b.d) {
            return bb.m;
        }
        if (h.g.b.x.n(bVar, com.waze.bl.c.b.b.f17005a)) {
            return bb.n;
        }
        throw new h.i();
    }

    @Override // com.waze.t.b.aj
    public final /* bridge */ /* synthetic */ Object b(Object obj, ar arVar, h.c.e eVar) {
        b bVar = (b) obj;
        boolean zD = this.f16965b.d();
        com.waze.shared_infra.i.e eVar2 = this.f16964a;
        if (!zD) {
            Objects.toString(bVar);
            eVar2.a("handle (dry-run): ".concat(bVar.toString()));
            if (bVar instanceof com.waze.bl.c.b.c) {
                return new com.waze.bl.c.b.g(true, ((com.waze.bl.c.b.c) bVar).b(), 6);
            }
            if (bVar instanceof com.waze.bl.c.b.e) {
                return new com.waze.bl.c.b.i(true, ((com.waze.bl.c.b.e) bVar).b());
            }
            if (h.g.b.x.n(bVar, com.waze.bl.c.b.b.f17005a)) {
                Object objG = g(eVar);
                return objG != h.c.a.a.f48038a ? (com.waze.bl.c.b.j) objG : objG;
            }
            if (bVar instanceof com.waze.bl.c.b.d) {
                return new com.waze.bl.c.b.h(true, 6);
            }
            throw new h.i();
        }
        Objects.toString(bVar);
        eVar2.a("handle: ".concat(bVar.toString()));
        if (bVar instanceof com.waze.bl.c.b.c) {
            Object objH = h((com.waze.bl.c.b.c) bVar, null, eVar);
            return objH != h.c.a.a.f48038a ? (com.waze.bl.c.b.j) objH : objH;
        }
        if (bVar instanceof com.waze.bl.c.b.e) {
            Object objJ = j((com.waze.bl.c.b.e) bVar, eVar);
            return objJ != h.c.a.a.f48038a ? (com.waze.bl.c.b.j) objJ : objJ;
        }
        if (bVar instanceof com.waze.bl.c.b.d) {
            Object objI = i((com.waze.bl.c.b.d) bVar, eVar);
            return objI != h.c.a.a.f48038a ? (com.waze.bl.c.b.j) objI : objI;
        }
        if (!h.g.b.x.n(bVar, com.waze.bl.c.b.b.f17005a)) {
            throw new h.i();
        }
        Object objG2 = g(eVar);
        return objG2 != h.c.a.a.f48038a ? (com.waze.bl.c.b.j) objG2 : objG2;
    }
}
