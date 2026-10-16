package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f33971a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.ch f33972b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z f33973c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f33974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(kotlinx.coroutines.b.ch chVar, z zVar, h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f33972b = chVar;
        this.f33973c = zVar;
        this.f33974d = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new v(this.f33972b, this.f33973c, this.f33974d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f33971a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.ch chVar = this.f33972b;
            this.f33971a = 1;
            if (kotlinx.coroutines.b.ai.y(new u(chVar, this.f33973c)).collect(new r(this.f33974d, 0), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
