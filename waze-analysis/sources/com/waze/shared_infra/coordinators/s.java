package com.waze.shared_infra.coordinators;

import h.g.b.ar;
import h.g.b.x;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class s<Event> implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f37840a;

    /* renamed from: b, reason: collision with root package name */
    private final c f37841b;

    /* renamed from: c, reason: collision with root package name */
    private final af f37842c;

    /* renamed from: d, reason: collision with root package name */
    private final bm f37843d;

    /* renamed from: e, reason: collision with root package name */
    private final String f37844e;

    /* renamed from: f, reason: collision with root package name */
    private final bn f37845f;

    public /* synthetic */ s(Object obj, af afVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeCoordinatorController");
        x.e(eVarD, "create(...)");
        x.f(afVar, "lifecycleScope");
        x.f(eVarD, "logger");
        this.f37840a = eVarD;
        s<Event> sVar = this;
        if (sVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) sVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(c.class);
        } else {
            bVarC = sVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(c.class);
        }
        this.f37841b = (c) bVarC.a(mVar, null, null);
        af afVarE = aj.e(afVar.getCoroutineContext().plus(aj.Q()).plus(new r(CoroutineExceptionHandler.f51269c, this)));
        this.f37842c = afVarE;
        this.f37843d = bu.e(32, 32, null, 4);
        String string = UUID.randomUUID().toString();
        x.e(string, "toString(...)");
        this.f37844e = string;
        bn bnVarB = ck.b(false);
        this.f37845f = bnVarB;
        ai.U(bnVarB);
        H(obj);
        aj.z(afVarE, null, null, new m(this, (h.c.e) null, 2), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object E(com.waze.shared_infra.coordinators.s r4, kotlinx.coroutines.b.l r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.shared_infra.coordinators.q
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.shared_infra.coordinators.q r0 = (com.waze.shared_infra.coordinators.q) r0
            int r1 = r0.f37838c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37838c = r1
            goto L18
        L13:
            com.waze.shared_infra.coordinators.q r0 = new com.waze.shared_infra.coordinators.q
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f37836a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f37838c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r6)
            goto L3d
        L2f:
            e.b.c.b(r6)
            kotlinx.coroutines.b.bm r4 = r4.f37843d
            r0.f37838c = r3
            java.lang.Object r4 = r4.collect(r5, r0)
            if (r4 != r1) goto L3d
            return r1
        L3d:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.shared_infra.coordinators.s.E(com.waze.shared_infra.coordinators.s, kotlinx.coroutines.b.l, h.c.e):java.lang.Object");
    }

    public final String F() {
        return this.f37844e;
    }

    public final af G() {
        return this.f37842c;
    }

    public final void H(Object obj) {
        Objects.toString(obj);
        this.f37840a.a("sending event ".concat(obj.toString()));
        this.f37843d.c(obj);
    }

    public final void I(boolean z) {
        this.f37845f.e(Boolean.valueOf(z));
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
