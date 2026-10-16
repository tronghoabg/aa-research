package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32119a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WazeNetworkGateway f32120b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.f.d f32121c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.network.g.a f32122d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.network.b.bf f32123e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.f.l f32124f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(WazeNetworkGateway wazeNetworkGateway, com.waze.sharedui.f.d dVar, com.waze.network.g.a aVar, com.waze.network.b.bf bfVar, com.waze.sharedui.f.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f32120b = wazeNetworkGateway;
        this.f32121c = dVar;
        this.f32122d = aVar;
        this.f32123e = bfVar;
        this.f32124f = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bc(this.f32120b, this.f32121c, this.f32122d, this.f32123e, this.f32124f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32119a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f32119a = 1;
            if (WazeNetworkGateway.d(this.f32120b, this.f32121c, this.f32122d, ((com.waze.network.b.be) this.f32123e).b(), this.f32124f, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
