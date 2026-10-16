package com.waze.navigate;

import android.graphics.Bitmap;
import com.waze.NativeManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    private final DriveToNativeManager f30977a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f30978b;

    /* renamed from: c, reason: collision with root package name */
    private final bz f30979c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.ab f30980d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.l f30981e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f30982f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.search.b.a f30983g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.search.b.d f30984h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f30985i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.shared_infra.q.r f30986j;

    public /* synthetic */ af(NativeManager nativeManager, DriveToNativeManager driveToNativeManager, com.waze.shared_infra.o.a aVar, bz bzVar, com.waze.search.b.a aVar2, com.waze.search.b.d dVar, com.waze.shared_infra.i.e eVar, com.waze.shared_infra.q.r rVar) {
        kotlinx.coroutines.ab abVarB = kotlinx.coroutines.av.b();
        l lVar = new l(nativeManager);
        m mVar = new m(nativeManager);
        h.g.b.x.f(nativeManager, "nativeManager");
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(bzVar, "etaCalculator");
        h.g.b.x.f(abVarB, "dispatcher");
        h.g.b.x.f(lVar, "postOnNativeThread");
        h.g.b.x.f(mVar, "venueProviderGetServices");
        h.g.b.x.f(aVar2, "venueDataSource");
        h.g.b.x.f(dVar, "venueProductsDataSource");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(rVar, "timeUtil");
        this.f30977a = driveToNativeManager;
        this.f30978b = aVar;
        this.f30979c = bzVar;
        this.f30980d = abVarB;
        this.f30981e = lVar;
        this.f30982f = mVar;
        this.f30983g = aVar2;
        this.f30984h = dVar;
        this.f30985i = eVar;
        this.f30986j = rVar;
    }

    public static final /* synthetic */ r a(af afVar, com.waze.av.d.k kVar) {
        ArrayList arrayListH;
        com.waze.av.d.a aVarB;
        List listAl;
        if (kVar == null || (aVarB = kVar.b()) == null || (listAl = h.a.i.al(aVarB.b(), new com.google.firebase.crashlytics.a.c.h(18))) == null) {
            arrayListH = h.a.i.h();
        } else {
            List<com.waze.av.d.c> list = listAl;
            ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
            for (com.waze.av.d.c cVar : list) {
                String strV = com.waze.shared_infra.i.h.v(afVar.f30978b, TimeUnit.SECONDS.toMillis(cVar.a()));
                h.g.b.x.e(strV, "getTimeInterval(...)");
                arrayList.add(new t(strV, com.waze.ad.c.b.k(cVar.c())));
            }
            arrayListH = arrayList;
        }
        return new p(arrayListH);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object f(com.waze.navigate.af r12, com.waze.av.d.k r13, h.c.e r14) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.af.f(com.waze.navigate.af, com.waze.av.d.k, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ Object g(af afVar, com.waze.av.b.n nVar, h.c.e eVar) {
        String strD;
        if (nVar instanceof com.waze.av.b.j) {
            strD = ((com.waze.av.b.j) nVar).h();
        } else if (nVar instanceof com.waze.av.b.l) {
            strD = ((com.waze.av.b.l) nVar).d();
        } else {
            if (!(nVar instanceof com.waze.av.b.k) && !(nVar instanceof com.waze.av.b.m)) {
                throw new h.i();
            }
            strD = null;
        }
        if (strD == null) {
            return null;
        }
        Object objN = afVar.n(strD, eVar);
        return objN != h.c.a.a.f48038a ? (Bitmap) objN : objN;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object h(com.waze.navigate.af r6, com.waze.av.d.k r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.navigate.x
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.navigate.x r0 = (com.waze.navigate.x) r0
            int r1 = r0.f31830c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31830c = r1
            goto L18
        L13:
            com.waze.navigate.x r0 = new com.waze.navigate.x
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f31828a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f31830c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            com.waze.av.d.k r7 = r0.f31831d
            r6 = r7
            com.waze.av.d.k r6 = (com.waze.av.d.k) r6
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L53
        L2d:
            r6 = move-exception
            goto L56
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            e.b.c.b(r8)
            h.g.a.l r8 = r6.f30981e
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.bo.j()
            com.waze.navigate.ba r5 = new com.waze.navigate.ba
            r5.<init>(r2, r6, r4, r3)
            r8.invoke(r5)
            r0.f31831d = r7     // Catch: java.lang.Throwable -> L2d
            r0.f31830c = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r2.c(r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L53
            return r1
        L53:
            com.waze.VenueServices r8 = (com.waze.VenueServices) r8     // Catch: java.lang.Throwable -> L2d
            goto L5a
        L56:
            java.lang.Object r8 = e.b.c.a(r6)
        L5a:
            boolean r6 = r8 instanceof h.l
            if (r4 != r6) goto L5f
            r8 = r3
        L5f:
            com.waze.VenueServices r8 = (com.waze.VenueServices) r8
            if (r8 != 0) goto L68
            java.util.List r6 = h.a.i.h()
            goto Lcb
        L68:
            java.util.List r6 = r7.I()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r6 = r6.iterator()
        L79:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r1 = r8.ids
            java.lang.String r2 = "ids"
            h.g.b.x.e(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r0 = h.a.c.C(r1, r0)
            r1 = -1
            if (r0 == r1) goto L9a
            java.lang.String[] r1 = r8.names
            r0 = r1[r0]
            goto L9b
        L9a:
            r0 = r3
        L9b:
            if (r0 == 0) goto L79
            r7.add(r0)
            goto L79
        La1:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r7 = r7.iterator()
        Lb0:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc9
            java.lang.Object r8 = r7.next()
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto Lb0
            r6.add(r8)
            goto Lb0
        Lc9:
            java.util.List r6 = (java.util.List) r6
        Lcb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.af.h(com.waze.navigate.af, com.waze.av.d.k, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ String i(af afVar, com.waze.av.b.n nVar) {
        String strS = com.waze.ac.e.s(nVar, afVar.f30978b);
        return strS == null ? nVar.e().d().toString() : strS;
    }

    static final void l(CompletableDeferred completableDeferred, af afVar) {
        completableDeferred.a(afVar.f30982f.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r9, h.c.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.waze.navigate.w
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.navigate.w r0 = (com.waze.navigate.w) r0
            int r1 = r0.f31827c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31827c = r1
            goto L18
        L13:
            com.waze.navigate.w r0 = new com.waze.navigate.w
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f31825a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f31827c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> L5d
            goto L59
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            e.b.c.b(r10)
            kotlinx.coroutines.CompletableDeferred r10 = kotlinx.coroutines.bo.j()
            com.waze.lx r2 = com.waze.mg.f29780a
            android.content.Context r2 = r2.a()
            android.content.res.Resources r2 = r2.getResources()
            com.waze.resources.ResourcesNativeManager r4 = com.waze.resources.ResourcesNativeManager.getInstance()
            com.waze.ResourceDownloadType r5 = com.waze.ResourceDownloadType.RES_DOWNLOAD_IMAGE
            com.waze.destination_cell.b.b r6 = new com.waze.destination_cell.b.b
            r7 = 4
            r6.<init>(r10, r7)
            r4.getOrDownloadSkinDrawable(r2, r9, r5, r6)
            com.waze.navigate.af r8 = (com.waze.navigate.af) r8     // Catch: java.lang.Throwable -> L5d
            r0.f31827c = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r10 = r10.c(r0)     // Catch: java.lang.Throwable -> L5d
            if (r10 == r1) goto L5c
        L59:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10     // Catch: java.lang.Throwable -> L5d
            goto L62
        L5c:
            return r1
        L5d:
            r8 = move-exception
            java.lang.Object r10 = e.b.c.a(r8)
        L62:
            boolean r8 = r10 instanceof h.l
            if (r8 == 0) goto L68
            r8 = 0
            return r8
        L68:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.af.n(java.lang.String, h.c.e):java.lang.Object");
    }

    public final kotlinx.coroutines.b.k k(com.waze.av.b.n nVar, com.waze.av.d.k kVar, long j2) {
        h.g.b.x.f(nVar, "place");
        return kotlinx.coroutines.b.ai.E(new ae(this, nVar, kVar, j2, null));
    }
}
