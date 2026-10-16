package com.waze.an.c;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14779a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f14780b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f14781c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.an.a.a.j f14782d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.location.q f14783e;

    public j(com.waze.an.a.a.j jVar, com.waze.shared_infra.i.e eVar, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(jVar, "insightFTEInsightDescriptor");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(aVar, "stringProvider");
        this.f14782d = jVar;
        this.f14779a = eVar;
        this.f14780b = aVar;
        this.f14783e = jVar.a();
        this.f14781c = new i(jVar.d(), this);
    }

    public static final /* synthetic */ e a(j jVar, com.waze.an.a.h hVar) {
        if (hVar instanceof com.waze.an.a.e) {
            return new b(jVar.f14780b.c(R.string.INSIGHTS_FTE_FIRST_CARD, new Object[0]));
        }
        if (hVar instanceof com.waze.an.a.f) {
            com.waze.an.a.f fVar = (com.waze.an.a.f) hVar;
            return new c(fVar.a(), jVar.f14780b.c(fVar.b(), new Object[0]));
        }
        if (hVar instanceof com.waze.an.a.g) {
            return new d(jVar.f14780b.c(R.string.INSIGHTS_FTE_FOURTH_CARD, new Object[0]));
        }
        if (!(hVar instanceof com.waze.an.a.d)) {
            throw new h.i();
        }
        return new a(jVar.f14780b.c(R.string.INSIGHTS_FTE_FIFTH_CARD, new Object[0]));
    }

    public final kotlinx.coroutines.b.k c() {
        return this.f14781c;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    public final void d() {
        this.f14782d.e();
    }

    @Override // com.waze.an.c.k
    public final void e() {
        this.f14782d.k();
    }

    public final void f() {
        this.f14782d.g();
    }

    @Override // com.waze.an.c.k
    public final void g() {
        this.f14782d.l();
    }

    @Override // com.waze.an.c.k
    public final com.waze.location.q h() {
        return this.f14783e;
    }
}
