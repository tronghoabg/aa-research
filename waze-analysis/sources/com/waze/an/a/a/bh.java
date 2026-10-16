package com.waze.an.a.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bh implements com.waze.an.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f14440a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.an.a.u f14441b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f14442c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f14443d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.l f14444e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.l f14445f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.a f14446g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.a f14447h;

    /* renamed from: i, reason: collision with root package name */
    private final bn f14448i;

    /* renamed from: j, reason: collision with root package name */
    private final ch f14449j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.an.a.x f14450k;

    public bh(h.g.a.l lVar, com.waze.an.a.u uVar, h.g.a.l lVar2, h.g.a.a aVar, h.g.a.l lVar3, h.g.a.l lVar4, h.g.a.a aVar2, h.g.a.a aVar3, com.waze.an.a.k kVar) {
        h.g.b.x.f(lVar, "shouldFilterOutBeforePolicy");
        h.g.b.x.f(uVar, TtmlNode.ATTR_ID);
        h.g.b.x.f(lVar2, "shouldIgnoreId");
        h.g.b.x.f(aVar, "onShown");
        h.g.b.x.f(lVar3, "onDismissed");
        h.g.b.x.f(lVar4, "onIgnored");
        h.g.b.x.f(aVar2, "onSkip");
        h.g.b.x.f(aVar3, "shouldSkip");
        h.g.b.x.f(kVar, "initialState");
        this.f14440a = lVar;
        this.f14441b = uVar;
        this.f14442c = lVar2;
        this.f14443d = aVar;
        this.f14444e = lVar3;
        this.f14445f = lVar4;
        this.f14446g = aVar2;
        this.f14447h = aVar3;
        bn bnVarB = ck.b(kVar);
        this.f14448i = bnVarB;
        this.f14449j = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f14450k = com.waze.an.a.x.f14612a;
    }

    @Override // com.waze.an.a.l
    /* renamed from: a */
    public final com.waze.an.a.u m() {
        return this.f14441b;
    }

    @Override // com.waze.an.a.l
    public final ch b() {
        return this.f14449j;
    }

    @Override // com.waze.an.a.l
    public final void c() {
        this.f14444e.invoke(this.f14441b);
    }

    @Override // com.waze.an.a.l
    public final void d() {
        this.f14444e.invoke(this.f14441b);
    }

    @Override // com.waze.an.a.l
    public final void e() {
        this.f14445f.invoke(this.f14441b);
    }

    @Override // com.waze.an.a.l
    public final void f() {
        this.f14444e.invoke(this.f14441b);
    }

    @Override // com.waze.an.a.l
    public final void g() {
        this.f14446g.invoke();
    }

    @Override // com.waze.an.a.l
    public final boolean h() {
        return ((Boolean) this.f14447h.invoke()).booleanValue();
    }

    @Override // com.waze.an.a.l
    public final boolean i(com.waze.location.q qVar) {
        return ((Boolean) this.f14442c.invoke(qVar)).booleanValue();
    }

    @Override // com.waze.an.a.r
    public final com.waze.an.a.x j() {
        return this.f14450k;
    }

    @Override // com.waze.an.a.r
    public final /* synthetic */ void k() {
    }

    @Override // com.waze.an.a.r
    public final void l() {
        this.f14443d.invoke();
    }

    @Override // com.waze.an.a.r
    public final /* synthetic */ com.waze.location.q m() {
        return this.f14441b;
    }

    public final boolean n(String str) {
        return ((Boolean) this.f14440a.invoke(str)).booleanValue();
    }

    public /* synthetic */ bh(com.waze.an.a.u uVar, h.g.a.l lVar, h.g.a.a aVar, h.g.a.l lVar2, h.g.a.l lVar3, h.g.a.a aVar2, h.g.a.a aVar3, com.waze.an.a.k kVar) {
        this(new com.waze.z.a.d.d(18), uVar, lVar, aVar, lVar2, lVar3, aVar2, aVar3, kVar);
    }
}
