package com.waze.sharedrive.e;

import android.content.Context;
import android.graphics.Bitmap;
import com.waze.R;
import com.waze.map.b.dn;
import com.waze.map.b.ed;
import com.waze.map.b.fi;
import com.waze.map.b.fj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ah implements z {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.ai f38315a;

    /* renamed from: b, reason: collision with root package name */
    private final ed f38316b;

    /* renamed from: c, reason: collision with root package name */
    private final av f38317c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38318d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f38319e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f38320f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f38321g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f38322h;

    /* renamed from: i, reason: collision with root package name */
    private Map f38323i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.map.b.bi f38324j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.sharedrive.d.aq f38325k;

    /* renamed from: l, reason: collision with root package name */
    private com.waze.shared_infra.n.c f38326l;

    public ah(com.waze.map.b.ai aiVar, com.waze.sharedrive.d.aq aqVar, ed edVar, av avVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aiVar, "mainMapController");
        h.g.b.x.f(aqVar, "sharedDriveController");
        h.g.b.x.f(edVar, "mapViewController");
        h.g.b.x.f(avVar, "participantPinRenderer");
        h.g.b.x.f(eVar, "logger");
        this.f38315a = aiVar;
        this.f38325k = aqVar;
        this.f38316b = edVar;
        this.f38317c = avVar;
        this.f38318d = eVar;
        this.f38319e = com.waze.ui.a.l.p(this, null);
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new y(null, null));
        this.f38321g = bnVarB;
        this.f38322h = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f38323i = h.a.r.j();
        boolean z = false;
        this.f38324j = new com.waze.map.b.bi((List) null, (List) null, (List) null, (List) null, (List) null, new com.waze.map.b.ca(true, null, true, null, null, 1018), new dn(new com.waze.map.b.bz(z, z, z, 15)), 159);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x019c, code lost:
    
        if (r13.k(r2, r7, r1, r5, r6) == r0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object e(com.waze.sharedrive.e.ah r13, com.waze.sharedrive.c.a.m r14, h.c.e r15) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.e.ah.e(com.waze.sharedrive.e.ah, com.waze.sharedrive.c.a.m, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void f(ah ahVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        ahVar.f38323i = h.a.r.j();
        do {
            bnVar = ahVar.f38321g;
            objD = bnVar.d();
        } while (!bnVar.f(objD, new y(null, ahVar.f38324j)));
    }

    private final com.waze.map.b.bi i(List list, com.waze.shared_infra.h.c cVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (cVar != null) {
            arrayList.add(com.waze.map.c.b(new com.waze.map.bc(cVar, new com.waze.map.az(R.drawable.map_pin_destination), null, null, null, 0.0f, null, 1020)));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final bd bdVar = (bd) it.next();
            com.waze.shared_infra.h.c cVarB = bdVar.b();
            com.waze.shared_infra.i.e eVar = this.f38318d;
            eVar.a("adding marker for participant " + bdVar.c() + " at coordinate=" + cVarB);
            arrayList.add(com.waze.map.c.b(new com.waze.map.bc(cVarB, new com.waze.map.ax(new h.g.a.l() { // from class: com.waze.sharedrive.e.aa
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    h.g.b.x.f((Context) obj, "it");
                    return bdVar.a();
                }
            }), com.waze.map.as.f27963e, com.waze.map.aw.f27972b, null, 0.0f, null, 1008)));
            List listD = bdVar.d();
            if (listD == null || listD.isEmpty()) {
                eVar.a("participant " + bdVar.c() + " has no/empty route geometry");
            } else {
                eVar.a("Adding route geometry for participant " + bdVar.c() + ", size=" + bdVar.d().size());
                arrayList2.add(com.waze.map.c.d(new fi(bdVar.d(), fj.n)));
            }
        }
        boolean z = false;
        return new com.waze.map.b.bi((List) null, (List) null, arrayList, arrayList2, (List) null, new com.waze.map.b.ca(true, null, true, null, null, 1018), new dn(new com.waze.map.b.bz(z, z, z, 15)), 147);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.sharedrive.e.ab
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.sharedrive.e.ab r0 = (com.waze.sharedrive.e.ab) r0
            int r1 = r0.f38295c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38295c = r1
            goto L18
        L13:
            com.waze.sharedrive.e.ab r0 = new com.waze.sharedrive.e.ab
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f38293a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38295c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            android.graphics.Bitmap r5 = r4.f38320f
            if (r5 == 0) goto L37
            return r5
        L37:
            com.waze.sharedrive.e.av r5 = r4.f38317c
            r0.f38295c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L53
        L41:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L48
            r4.f38320f = r5
            return r5
        L48:
            com.waze.shared_infra.i.e r4 = r4.f38318d
            java.lang.String r5 = "Failed to generate placeholder bitmap from renderer"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.g(r5)
            r4 = 0
            return r4
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.e.ah.j(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.List r5, java.util.List r6, android.graphics.Bitmap r7, com.waze.shared_infra.h.c r8, h.c.e r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.waze.sharedrive.e.ad
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.sharedrive.e.ad r0 = (com.waze.sharedrive.e.ad) r0
            int r1 = r0.f38304d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38304d = r1
            goto L18
        L13:
            com.waze.sharedrive.e.ad r0 = new com.waze.sharedrive.e.ad
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f38302b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38304d
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            com.waze.shared_infra.h.c r8 = r0.f38306f
            r5 = r8
            com.waze.shared_infra.h.c r5 = (com.waze.shared_infra.h.c) r5
            android.graphics.Bitmap r7 = r0.f38305e
            r5 = r7
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.Object r5 = r0.f38301a
            java.util.List r5 = (java.util.List) r5
            e.b.c.b(r9)
            goto L50
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            e.b.c.b(r9)
            com.waze.sharedrive.e.av r9 = r4.f38317c
            r0.f38301a = r5
            r0.f38305e = r7
            r0.f38306f = r8
            r0.f38304d = r3
            java.lang.Object r9 = r9.b(r6, r0)
            if (r9 == r1) goto Lae
        L50:
            java.util.Map r9 = (java.util.Map) r9
            boolean r6 = r9.isEmpty()
            if (r6 == 0) goto L59
            goto Lab
        L59:
            java.util.Map r6 = r4.f38323i
            java.util.List r5 = r4.l(r5, r6, r7, r9)
            r6 = r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = 10
            int r7 = h.a.i.q(r6, r7)
            int r7 = h.a.r.a(r7)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r0 = 16
            int r7 = h.k.n.h(r7, r0)
            r9.<init>(r7)
            java.util.Map r9 = (java.util.Map) r9
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L92
            java.lang.Object r7 = r6.next()
            r0 = r7
            com.waze.sharedrive.e.bd r0 = (com.waze.sharedrive.e.bd) r0
            java.lang.String r0 = r0.c()
            r9.put(r0, r7)
            goto L7d
        L92:
            r4.f38323i = r9
            com.waze.map.b.bi r5 = r4.i(r5, r8)
            kotlinx.coroutines.b.bn r4 = r4.f38321g
        L9a:
            java.lang.Object r6 = r4.d()
            r7 = r6
            com.waze.sharedrive.e.y r7 = (com.waze.sharedrive.e.y) r7
            com.waze.sharedrive.e.y r7 = com.waze.sharedrive.e.y.c(r7, r5)
            boolean r6 = r4.f(r6, r7)
            if (r6 == 0) goto L9a
        Lab:
            h.ab r4 = h.ab.f48028a
            return r4
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.e.ah.k(java.util.List, java.util.List, android.graphics.Bitmap, com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }

    private final List l(List list, Map map, Bitmap bitmap, Map map2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.waze.sharedrive.c.a.l lVar = (com.waze.sharedrive.c.a.l) it.next();
            if (!lVar.f()) {
                com.waze.shared_infra.h.c cVarA = lVar.a();
                if (cVarA == null) {
                    this.f38318d.g("Filtered out participant " + lVar.d() + " (name: " + lVar.e() + ") because they have no location coordinates");
                } else {
                    Bitmap bitmapA = (Bitmap) map2.get(lVar.d());
                    com.google.d.d.bn bnVarF = null;
                    if (bitmapA == null) {
                        bd bdVar = (bd) map.get(lVar.d());
                        bitmapA = bdVar != null ? bdVar.a() : null;
                        if (bitmapA == null) {
                            if (bitmap == null) {
                                this.f38318d.g("Placeholder bitmap is null, skipping rendering for participant ".concat(String.valueOf(lVar.d())));
                            } else {
                                bitmapA = bitmap;
                            }
                        }
                    }
                    Object objB = lVar.c().b();
                    com.waze.sharedrive.c.a.f fVar = objB instanceof com.waze.sharedrive.c.a.f ? (com.waze.sharedrive.c.a.f) objB : null;
                    if (fVar != null) {
                        List listB = fVar.b();
                        int i2 = com.google.d.d.bn.f7456d;
                        com.google.d.d.bi biVar = new com.google.d.d.bi();
                        biVar.i(listB);
                        bnVarF = biVar.f();
                    }
                    arrayList.add(new bd(lVar.d(), cVarA, bitmapA, bnVarF));
                }
            }
        }
        return arrayList;
    }

    @Override // com.waze.sharedrive.e.z
    public final ed a() {
        return this.f38316b;
    }

    @Override // com.waze.sharedrive.e.z
    public final kotlinx.coroutines.b.ch b() {
        return this.f38322h;
    }

    @Override // com.waze.sharedrive.e.z
    public final void c() {
        if (this.f38326l != null) {
            this.f38318d.g("already started");
        } else {
            this.f38326l = this.f38315a.p(this.f38316b);
            kotlinx.coroutines.aj.z(this.f38319e, null, null, new ag(this, null), 3);
        }
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        com.waze.shared_infra.n.c cVar = this.f38326l;
        if (cVar != null) {
            cVar.f();
        }
        kotlinx.coroutines.aj.h(this.f38319e, null);
    }
}
