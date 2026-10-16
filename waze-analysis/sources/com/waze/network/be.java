package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class be extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32132a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WazeNetworkGateway f32133b;

    /* renamed from: c, reason: collision with root package name */
    int f32134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(WazeNetworkGateway wazeNetworkGateway, h.c.e eVar) {
        super(eVar);
        this.f32133b = wazeNetworkGateway;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32132a = obj;
        this.f32134c |= Integer.MIN_VALUE;
        return this.f32133b.k(null, null, this);
    }
}
