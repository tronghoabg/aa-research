package com.waze.shared_infra.r;

import h.ab;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements a, org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final y f37976a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f37977b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f37978c;

    public l(y yVar) {
        h.g.b.x.f(yVar, "userState");
        this.f37976a = yVar;
        this.f37977b = yVar.a();
        this.f37978c = h.g.b(h.h.f48130a, new e(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r6 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.shared_infra.r.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.shared_infra.r.b
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.shared_infra.r.b r0 = (com.waze.shared_infra.r.b) r0
            int r1 = r0.f37955c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37955c = r1
            goto L18
        L13:
            com.waze.shared_infra.r.b r0 = new com.waze.shared_infra.r.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f37953a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f37955c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r6)
            goto L5c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r6)
            goto L4a
        L36:
            e.b.c.b(r6)
            h.f r6 = r5.f37978c
            java.lang.Object r6 = r6.getValue()
            com.waze.shared_infra.r.o r6 = (com.waze.shared_infra.r.o) r6
            r0.f37955c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L4a
            goto L6b
        L4a:
            com.waze.shared_infra.r.d r6 = new com.waze.shared_infra.r.d
            r2 = 0
            r6.<init>(r5, r2)
            h.g.a.p r6 = (h.g.a.p) r6
            r0.f37955c = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r6 = kotlinx.coroutines.aj.I(r2, r6, r0)
            if (r6 == r1) goto L6b
        L5c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L65
            boolean r5 = r6.booleanValue()
            goto L66
        L65:
            r5 = 0
        L66:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.shared_infra.r.l.a(h.c.e):java.lang.Object");
    }

    @Override // com.waze.shared_infra.r.a
    public final Object b(h.g.a.l lVar, h.c.e eVar) {
        Object objCollect = new h(new h(ai.y(new h(this.f37976a.a(), 0)), 2), 3).collect(new k(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }

    @Override // com.waze.shared_infra.r.a
    public final ch c() {
        return this.f37977b;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
