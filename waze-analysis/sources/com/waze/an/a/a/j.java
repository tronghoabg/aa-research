package com.waze.an.a.a;

import com.waze.R;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j implements com.waze.an.a.r {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f14481a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f14482b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.an.a.t f14483c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.an.a.x f14484d;

    /* renamed from: e, reason: collision with root package name */
    private final List f14485e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f14486f;

    public j(h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(aVar, "requestEnd");
        h.g.b.x.f(aVar2, "onFteStarted");
        this.f14481a = aVar;
        this.f14482b = aVar2;
        this.f14483c = com.waze.an.a.t.f14606a;
        this.f14484d = com.waze.an.a.x.f14613b;
        this.f14485e = h.a.i.i(new com.waze.an.a.e(), new com.waze.an.a.f(R.raw.whats_ahead, R.string.INSIGHTS_FTE_SECOND_CARD), new com.waze.an.a.f(R.raw.how_long, R.string.INSIGHTS_FTE_THIRD_CARD), new com.waze.an.a.g(), new com.waze.an.a.d());
        this.f14486f = kotlinx.coroutines.b.ai.J(kotlinx.coroutines.b.ai.E(new h(this, null)), new i(this, null));
    }

    public final com.waze.an.a.t a() {
        return this.f14483c;
    }

    public final kotlinx.coroutines.b.k d() {
        return this.f14486f;
    }

    public final void e() {
        this.f14481a.invoke();
    }

    public final void f() {
        this.f14481a.invoke();
    }

    public final void g() {
        this.f14481a.invoke();
    }

    @Override // com.waze.an.a.r
    public final com.waze.an.a.x j() {
        return this.f14484d;
    }

    @Override // com.waze.an.a.r
    public final void k() {
        this.f14481a.invoke();
    }

    @Override // com.waze.an.a.r
    public final void l() {
        this.f14482b.invoke();
    }

    @Override // com.waze.an.a.r
    public final /* synthetic */ com.waze.location.q m() {
        return this.f14483c;
    }
}
