package com.waze.network;

import i.b.l.cb;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bd extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f32125a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f32126b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ WazeNetworkGateway f32127c;

    /* renamed from: d, reason: collision with root package name */
    int f32128d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.network.g.a f32129e;

    /* renamed from: f, reason: collision with root package name */
    bg f32130f;

    /* renamed from: g, reason: collision with root package name */
    cb f32131g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bd(WazeNetworkGateway wazeNetworkGateway, h.c.e eVar) {
        super(eVar);
        this.f32127c = wazeNetworkGateway;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32126b = obj;
        this.f32128d |= Integer.MIN_VALUE;
        return WazeNetworkGateway.d(this.f32127c, null, null, null, null, this);
    }
}
