package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class au extends h.c.b.a.g implements h.g.a.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ av f18999a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(av avVar, h.c.e eVar) {
        super(6, eVar);
        this.f18999a = avVar;
    }

    @Override // h.g.a.t
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return new au(this.f18999a, (h.c.e) obj6).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(this.f18999a.h());
    }
}
