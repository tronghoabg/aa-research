package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f21693a;

    /* renamed from: b, reason: collision with root package name */
    Object f21694b;

    /* renamed from: c, reason: collision with root package name */
    Object f21695c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f21696d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ s f21697e;

    /* renamed from: f, reason: collision with root package name */
    int f21698f;

    /* renamed from: g, reason: collision with root package name */
    u f21699g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(s sVar, h.c.e eVar) {
        super(eVar);
        this.f21697e = sVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21696d = obj;
        this.f21698f |= Integer.MIN_VALUE;
        return this.f21697e.emit(null, this);
    }
}
