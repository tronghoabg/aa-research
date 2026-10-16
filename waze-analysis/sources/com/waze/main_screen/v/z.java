package com.waze.main_screen.v;

import com.waze.ao;
import com.waze.cf;
import com.waze.cs;
import com.waze.navigate.ei;
import com.waze.navigate.en;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class z implements o {

    /* renamed from: a, reason: collision with root package name */
    private final j f27838a;

    /* renamed from: b, reason: collision with root package name */
    private final en f27839b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bn.b f27840c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.web.j f27841d;

    /* renamed from: e, reason: collision with root package name */
    private final ao f27842e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f27843f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f27844g;

    /* renamed from: h, reason: collision with root package name */
    private final ad f27845h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.main_screen.i f27846i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f27847j;

    /* renamed from: k, reason: collision with root package name */
    private final ch f27848k;

    public z(j jVar, en enVar, com.waze.bn.b bVar, com.waze.sharedui.web.j jVar2, ao aoVar, ch chVar, com.waze.shared_infra.i.e eVar, ad adVar, com.waze.main_screen.i iVar) {
        h.g.b.x.f(jVar, "promotionalChipRepository");
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(bVar, "roamingProvider");
        h.g.b.x.f(jVar2, "deeplinkHandler");
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(chVar, "userProfileFlow");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(adVar, "promotionalChipStatsReporter");
        h.g.b.x.f(iVar, "mainMenuStatsSender");
        this.f27838a = jVar;
        this.f27839b = enVar;
        this.f27840c = bVar;
        this.f27841d = jVar2;
        this.f27842e = aoVar;
        this.f27843f = chVar;
        this.f27844g = eVar;
        this.f27845h = adVar;
        this.f27846i = iVar;
        bn bnVarB = ck.b(null);
        this.f27847j = bnVarB;
        this.f27848k = ai.U(bnVarB);
    }

    public static final /* synthetic */ void l(z zVar, com.waze.ui.q.c cVar, i iVar) {
        if (h.g.b.x.n(cVar, com.waze.ui.q.a.f43232a)) {
            zVar.f27845h.a(a.f27772b, iVar.c(), iVar.f(), iVar.d(), iVar.a());
            zVar.n();
        } else {
            if (!h.g.b.x.n(cVar, com.waze.ui.q.b.f43233a)) {
                throw new h.i();
            }
            String strA = iVar.a();
            if (strA != null) {
                zVar.f27841d.a(strA);
            }
            zVar.f27845h.a(a.f27771a, iVar.c(), iVar.f(), iVar.d(), iVar.a());
            zVar.n();
        }
    }

    public static final /* synthetic */ boolean m(z zVar) {
        if (zVar.f27839b.ah().d() == ei.f31311b) {
            zVar.f27844g.g("skip NavigationState.Navigating");
            zVar.n();
            return false;
        }
        if (h.g.b.x.n(zVar.f27840c.a().d(), com.waze.bn.e.f17151a)) {
            zVar.f27844g.g("skip RoamingState.Roaming");
            zVar.n();
            return false;
        }
        if (!cs.g((cf) zVar.f27842e.a().d())) {
            return true;
        }
        zVar.f27844g.g("skip CarManager.isConnected()");
        zVar.n();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f27847j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, null));
    }

    @Override // com.waze.main_screen.v.o
    public final Object a(h.c.e eVar) {
        Object objCollect = ai.y(new r(this.f27843f)).collect(new s(this), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.main_screen.v.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.main_screen.v.y
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.main_screen.v.y r0 = (com.waze.main_screen.v.y) r0
            int r1 = r0.f27837c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27837c = r1
            goto L18
        L13:
            com.waze.main_screen.v.y r0 = new com.waze.main_screen.v.y
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f27835a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f27837c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            com.waze.main_screen.v.j r6 = r4.f27838a
            r0.f27837c = r3
            java.lang.Object r5 = r6.c(r5, r0)
            if (r5 == r1) goto L62
        L3c:
            kotlinx.coroutines.b.ch r5 = r4.f27848k
            java.lang.Object r5 = r5.d()
            com.waze.main_screen.v.n r5 = (com.waze.main_screen.v.n) r5
            if (r5 == 0) goto L5f
            com.waze.main_screen.i r4 = r4.f27846i
            java.lang.String r6 = r5.c()
            java.lang.String r0 = r5.d()
            com.waze.ui.ac.g r5 = r5.a()
            if (r5 == 0) goto L5b
            java.lang.String r5 = r5.a()
            goto L5c
        L5b:
            r5 = 0
        L5c:
            r4.j(r6, r0, r5)
        L5f:
            h.ab r4 = h.ab.f48028a
            return r4
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.v.z.b(java.lang.String, h.c.e):java.lang.Object");
    }

    @Override // com.waze.main_screen.v.o
    public final ch c() {
        return this.f27848k;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
