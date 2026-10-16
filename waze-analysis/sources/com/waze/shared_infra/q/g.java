package com.waze.shared_infra.q;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f37934a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final org.a.d.g.a f37935b = com.waze.web.r.p(new com.waze.perf.p(14));

    public static final e a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = f37934a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(e.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(e.class);
        }
        return (e) bVarC.a(mVar, null, null);
    }

    public static final org.a.d.g.a b() {
        return f37935b;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
