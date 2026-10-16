package com.waze.network;

import i.b.l.cd;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bi extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32146a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WazeNetworkGateway f32147b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.f.d f32148c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ cd f32149d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.f.o f32150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(WazeNetworkGateway wazeNetworkGateway, com.waze.sharedui.f.d dVar, cd cdVar, com.waze.sharedui.f.o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f32147b = wazeNetworkGateway;
        this.f32148c = dVar;
        this.f32149d = cdVar;
        this.f32150e = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bi(this.f32147b, this.f32148c, this.f32149d, this.f32150e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bi) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32146a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            final WazeNetworkGateway wazeNetworkGateway = this.f32147b;
            final com.waze.sharedui.f.d dVar = this.f32148c;
            cd cdVar = this.f32149d;
            final com.waze.sharedui.f.o oVar = this.f32150e;
            com.waze.sharedui.f.l lVar = new com.waze.sharedui.f.l() { // from class: com.waze.network.bg
                @Override // com.waze.sharedui.f.l
                public final void a(com.waze.sharedui.b bVar, cd cdVar2) {
                    WazeNetworkGateway wazeNetworkGateway2 = wazeNetworkGateway;
                    kotlinx.coroutines.aj.z(wazeNetworkGateway2.f31851f, null, null, new bh(oVar, bVar, cdVar2, wazeNetworkGateway2, dVar, null), 3);
                }
            };
            this.f32146a = 1;
            if (WazeNetworkGateway.i(wazeNetworkGateway, dVar, cdVar, lVar) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
